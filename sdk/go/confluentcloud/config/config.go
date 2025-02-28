// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

var _ = internal.GetEnvOrDefault

// The Stream Catalog REST Endpoint.
func GetCatalogRestEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:catalogRestEndpoint")
}

// The Confluent Cloud API Key.
func GetCloudApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:cloudApiKey")
}

// The Confluent Cloud API Secret.
func GetCloudApiSecret(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:cloudApiSecret")
}

// The base endpoint of Confluent Cloud API.
func GetEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:endpoint")
}

// The Flink Environment ID.
func GetEnvironmentId(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:environmentId")
}

// The Flink API Key.
func GetFlinkApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:flinkApiKey")
}

// The Flink API Secret.
func GetFlinkApiSecret(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:flinkApiSecret")
}

// The Flink Compute Pool ID.
func GetFlinkComputePoolId(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:flinkComputePoolId")
}

// The Flink Principal ID.
func GetFlinkPrincipalId(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:flinkPrincipalId")
}

// The Flink REST Endpoint.
func GetFlinkRestEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:flinkRestEndpoint")
}

// The Kafka Cluster API Key.
func GetKafkaApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:kafkaApiKey")
}

// The Kafka Cluster API Secret.
func GetKafkaApiSecret(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:kafkaApiSecret")
}

// The Kafka Cluster ID.
func GetKafkaId(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:kafkaId")
}

// The Kafka Cluster REST Endpoint.
func GetKafkaRestEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:kafkaRestEndpoint")
}

// Maximum number of retries of HTTP client. Defaults to 4.
func GetMaxRetries(ctx *pulumi.Context) int {
	return config.GetInt(ctx, "confluentcloud:maxRetries")
}

// The Flink Organization ID.
func GetOrganizationId(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:organizationId")
}

// The Schema Registry Cluster API Key.
func GetSchemaRegistryApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:schemaRegistryApiKey")
}

// The Schema Registry Cluster API Secret.
func GetSchemaRegistryApiSecret(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:schemaRegistryApiSecret")
}

// The Schema Registry Cluster ID.
func GetSchemaRegistryId(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:schemaRegistryId")
}

// The Schema Registry Cluster REST Endpoint.
func GetSchemaRegistryRestEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:schemaRegistryRestEndpoint")
}
