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
	"fmt"
	// embed is used to store bridge-metadata.json in the compiled binary
	"context"
	_ "embed"
	"path/filepath"

	tfschema "github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/confluentinc/terraform-provider-confluent/shim"
	"github.com/pulumi/pulumi-confluentcloud/provider/pkg/version"
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
	p := shimv2.NewProvider(shim.NewProvider(version.Version, fmt.Sprintf("pulumi-%s/%s", mainPkg, version.Version)))

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
		UpstreamRepoPath: "./upstream",
		Resources: map[string]*tfbridge.ResourceInfo{
			"confluent_api_key": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ApiKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				}},
			"confluent_cluster_link": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ClusterLink"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"link_name": tfbridge.AutoName("link", 255, "-"),
				},
			},
			"confluent_connector": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Connector")},
			"confluent_environment": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Environment"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				}},
			"confluent_kafka_acl":          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaAcl")},
			"confluent_kafka_client_quota": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaClientQuota")},
			"confluent_kafka_cluster": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
					"standard":     {Name: "standard", MaxItemsOne: tfbridge.True()},
					"basic":        {Name: "basic", MaxItemsOne: tfbridge.True()},
					"dedicated":    {Name: "dedicated", MaxItemsOne: tfbridge.True()},
				}},
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"http_endpoint": func() *tfbridge.SchemaInfo {
						p.ResourcesMap().Get("confluent_kafka_topic").Schema().
							Set("http_endpoint", shimv2.NewSchema(&tfschema.Schema{
								Type:     tfschema.TypeString,
								Optional: true,
								Computed: true,
							}))
						return &tfbridge.SchemaInfo{
							Name: "httpEndpoint",
							DeprecationMessage: "This property has been deprecated. " +
								`Please use "restEndpoint" instead.`,
						}
					}(),
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
				}},
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
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
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
		},
		CSharp: &tfbridge.CSharpInfo{
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

//go:embed cmd/pulumi-resource-confluentcloud/bridge-metadata.json
var metadata []byte
