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
	"path/filepath"

	"github.com/confluentinc/terraform-provider-confluent/shim"
	"github.com/pulumi/pulumi-confluentcloud/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
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
	p := shimv2.NewProvider(shim.NewProvider())

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
		LogoURL:     "",
		Description: "A Pulumi package for creating and managing Confluent cloud resources.",
		Keywords:    []string{"pulumi", "confluentcloud", "category/cloud"},
		License:     "Apache-2.0",
		Homepage:    "https://www.pulumi.com",
		Repository:  "https://github.com/pulumi/pulumi-confluentcloud",
		GitHubOrg:   "confluentinc",
		Config:      map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"confluent_api_key": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ApiKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				}},
			"confluent_connector": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Connector")},
			"confluent_environment": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Environment"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				}},
			"confluent_kafka_acl": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaAcl")},
			"confluent_kafka_cluster": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaCluster"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"display_name": tfbridge.AutoName("displayName", 255, "-"),
				}},
			"confluent_kafka_topic":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "KafkaTopic")},
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
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"confluent_environment":         {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getEnvironment")},
			"confluent_kafka_cluster":       {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getKafkaCluster")},
			"confluent_kafka_topic":         {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getKafkaTopic")},
			"confluent_network":             {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getNetwork")},
			"confluent_organization":        {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getOrganization")},
			"confluent_service_account":     {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getServiceAccount")},
			"confluent_user":                {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getUser")},
			"confluent_peering":             {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getPeering")},
			"confluent_private_link_access": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getPrivateLinkAccess")},
			"confluent_role_binding":        {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getRoleBinding")},
			"confluent_identity_pool":       {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getIdentityPool")},
			"confluent_identity_provider":   {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getIdentityProvider")},
			"confluent_ksql_cluster":        {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getKsqlCluster")},
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
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
