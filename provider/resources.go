// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package confluentcloud

import (
	"bytes"
	"context"
	"fmt"
	"os"
	"path/filepath"
	"regexp"
	"slices"

	_ "embed" // embed is used to store bridge-metadata.json in the compiled binary

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/confluentinc/terraform-provider-confluent/shim"
	"github.com/pulumi/pulumi-confluentcloud/provider/v2/pkg/version"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "confluentcloud"
	// modules:
	mainMod = "index" // the confluentcloud module
)

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(
		shim.NewProvider(version.Version, fmt.Sprintf("pulumi-%s/%s", mainPkg, version.Version)),
		shimv2.WithPlanResourceChange(func(tfResourceType string) bool {
			return tfResourceType == "confluent_kafka_cluster"
		}),
	)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "confluent",
		DisplayName: "Confluent",
		Publisher:   "Pulumi",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL:          "",
		Description:      "A Pulumi package for creating and managing Confluent cloud resources.",
		Keywords:         []string{"pulumi", "confluentcloud", "category/cloud"},
		License:          "Apache-2.0",
		Homepage:         "https://www.pulumi.com",
		Repository:       "https://github.com/pulumi/pulumi-confluentcloud",
		GitHubOrg:        "confluentinc",
		Config:           map[string]*tfbridge.SchemaInfo{},
		DocRules:         &tfbridge.DocRuleInfo{EditRules: docEditRules},
		UpstreamRepoPath: "./upstream",
		SchemaPostProcessor: func(spec *schema.PackageSpec) {
			const token = "confluentcloud:index/kafkaTopic:KafkaTopic"
			const prop = "httpEndpoint"
			const deprecationMessage = `This property has been deprecated. Please use "restEndpoint" instead.`
			topic := spec.Resources[token]
			httpEndpoint := schema.PropertySpec{
				TypeSpec:           schema.TypeSpec{Type: "string"},
				DeprecationMessage: deprecationMessage,
			}
			topic.Required = append(topic.Required, prop)
			slices.Sort(topic.Required)
			topic.Properties[prop] = httpEndpoint
			topic.InputProperties[prop] = httpEndpoint
			topic.StateInputs.Properties[prop] = httpEndpoint
			spec.Resources[token] = topic
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"confluent_api_key": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ApiKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				},
			},
			"confluent_cluster_link": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ClusterLink"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"link_name": tfbridge.AutoName("link", 255, "-"),
				},
			},
			"confluent_connector": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Connector")},
			"confluent_environment": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Environment"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				},
			},
			"confluent_kafka_acl":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaAcl")},
			"confluent_kafka_client_quota": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaClientQuota")},
			"confluent_kafka_cluster": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
					"standard":     {Name: "standard", MaxItemsOne: tfbridge.True()},
					"basic":        {Name: "basic", MaxItemsOne: tfbridge.True()},
					"dedicated":    {Name: "dedicated", MaxItemsOne: tfbridge.True()},
				},
			},
			"confluent_kafka_cluster_config": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaClusterConfig")},
			"confluent_kafka_mirror_topic":   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaMirrorTopic")},
			"confluent_kafka_topic": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaTopic"),
				PreCheckCallback: func(
					ctx context.Context, config resource.PropertyMap, _ resource.PropertyMap,
				) (resource.PropertyMap, error) {
					const (
						httpEndpoint = "httpEndpoint"
						restEndpoint = "restEndpoint"
					)
					endpoint, ok := config[httpEndpoint]
					if !ok {
						// The optional key is not present, so we can return the config as is.
						return config, nil
					}

					// The user has set both httpEndpoint and restEndpoint. These are semantically
					// the same, so it is forbidden to set both.
					if _, ok := config[restEndpoint]; ok {
						return config, fmt.Errorf(`Cannot specify both "%s" and "%s"`+
							`, please set only "%[2]s"`, httpEndpoint, restEndpoint)
					}

					tfbridge.GetLogger(ctx).
						Warn(`"` + httpEndpoint + `" is deprecated, use "` + restEndpoint + `" instead.`)

					delete(config, httpEndpoint)
					config[restEndpoint] = endpoint

					return config, nil
				},
			},
			"confluent_network":             {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Network")},
			"confluent_peering":             {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Peering")},
			"confluent_private_link_access": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "PrivateLinkAccess")},
			"confluent_role_binding":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RoleBinding")},
			"confluent_service_account": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ServiceAccount"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				},
			},
			"confluent_identity_pool":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IdentityPool")},
			"confluent_identity_provider": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IdentityProvider")},
			"confluent_ksql_cluster":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KsqlCluster")},
			"confluent_schema": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Schema"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"schema": {
						CSharpName: "SchemaDetails",
					},
				},
			},

			// Manually verified that upstream docs are missing
			"confluent_schema_registry_kek": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"confluent_schema_registry_dek": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Manually verified that upstream docs are missing
			"confluent_schema_registry_kek": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
			"confluent_schema_registry_dek": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,

			PyProject: struct{ Enabled bool }{true},
		},

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				"confluentcloud": "ConfluentCloud",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tokens.SingleModule("confluent_", mainMod,
		tokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	edits := []tfbridge.DocsEdit{
		cleanUpExampleUsage,
		removeGuideText,
	}
	edits = append(edits,
		defaults...,
	)
	return append(
		edits,
		replaceWorkspaceWithStack,
		stripVideo,
		removeHelpfulLinksSection,
		removeStaticCredentialsSection,
	)
}

// Regexp for asciicast video link
var videoRegexp = regexp.MustCompile(`\[!\[asciicast\]\(http.*`)

// Removes an asciinema video link
var stripVideo = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = videoRegexp.ReplaceAll(content, nil)
		return content, nil
	},
}

// Removes a section with upstream provider related links
var removeHelpfulLinksSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Helpful Links/Information"
		})
	},
}

// Removes a section with upstream provider related links
var removeStaticCredentialsSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Static Credentials"
		})
	},
}

var removeGuideText = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		inputs := [][]byte{
			[]byte("The navigation menu provides details about the resources that you can interact with " +
				"(_Resources_), and a guide (_Guides_) for how you can get started."),
			[]byte("# See https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/" +
				"configurations/managing-single-kafka-cluster for more details\n"),
			[]byte("# See https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/" +
				"configurations/managing-single-schema-registry-cluster for more details\n"),
		}
		for _, input := range inputs {

			if bytes.Contains(content, input) {
				content = bytes.ReplaceAll(
					content,
					input,
					nil)
			} else {
				// Hard error to ensure we keep this content up to date
				return nil, fmt.Errorf("could not find text in upstream index.md, "+
					"please verify input at removeGuideText \n*****\n%s\n*****\n", string(input))
			}
		}
		return content, nil
	},
}

var cleanUpExampleUsage = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		replacesDir := "docs/index-md-replaces/"
		changes := []string{
			"example-usage-subtitle",
			"example-usage",
		}
		for _, file := range changes {

			input, err := os.ReadFile(replacesDir + file + "-input.md")
			if err != nil {
				return nil, err
			}
			desired, err := os.ReadFile(replacesDir + file + "-desired.md")
			if err != nil {
				return nil, err
			}
			if bytes.Contains(content, input) {
				content = bytes.ReplaceAll(
					content,
					input,
					desired)
			} else {
				// Hard error to ensure we keep this content up to date
				return nil, fmt.Errorf("could not find text in upstream index.md, "+
					"please verify file content at %s\n*****\n%s\n*****\n", replacesDir+file+"-input.md", string(input))
			}
		}

		return content, nil
	},
}

// Regexp for Terraform W/workspace
var workspaceRegexp = regexp.MustCompile(`Terraform [Ww]orkspace`)

// Replaces "Terraform Workspace" with "Pulumi Stack"
var replaceWorkspaceWithStack = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = workspaceRegexp.ReplaceAll(content, []byte("Pulumi Stack"))
		return content, nil
	},
}

//go:embed cmd/pulumi-resource-confluentcloud/bridge-metadata.json
var metadata []byte
