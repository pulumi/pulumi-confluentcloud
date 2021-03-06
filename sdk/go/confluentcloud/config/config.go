// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

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

// The Kafka Cluster API Key.
func GetKafkaApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:kafkaApiKey")
}

// The Kafka Cluster API Secret.
func GetKafkaApiSecret(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:kafkaApiSecret")
}

// The Kafka Cluster REST Endpoint.
func GetKafkaRestEndpoint(ctx *pulumi.Context) string {
	return config.Get(ctx, "confluentcloud:kafkaRestEndpoint")
}
