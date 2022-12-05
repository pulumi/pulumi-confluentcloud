// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # KsqlCluster Data Source
//
// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `KsqlCluster` describes a ksqlDB cluster data source.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleUsingIdKsqlCluster, err := confluentcloud.LookupKsqlCluster(ctx, &GetKsqlClusterArgs{
//				Id: pulumi.StringRef("lksqlc-abc123"),
//				Environment: GetKsqlClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingIdKsqlCluster)
//			exampleUsingNameKsqlCluster, err := confluentcloud.LookupKsqlCluster(ctx, &GetKsqlClusterArgs{
//				DisplayName: pulumi.StringRef("ksqldb_cluster"),
//				Environment: GetKsqlClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingName", exampleUsingNameKsqlCluster)
//			return nil
//		})
//	}
//
// ```
func LookupKsqlCluster(ctx *pulumi.Context, args *LookupKsqlClusterArgs, opts ...pulumi.InvokeOption) (*LookupKsqlClusterResult, error) {
	var rv LookupKsqlClusterResult
	err := ctx.Invoke("confluentcloud:index/getKsqlCluster:getKsqlCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKsqlCluster.
type LookupKsqlClusterArgs struct {
	// The name of the ksqlDB cluster.
	DisplayName *string                   `pulumi:"displayName"`
	Environment GetKsqlClusterEnvironment `pulumi:"environment"`
	// The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getKsqlCluster.
type LookupKsqlClusterResult struct {
	// (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
	ApiVersion           string                             `pulumi:"apiVersion"`
	CredentialIdentities []GetKsqlClusterCredentialIdentity `pulumi:"credentialIdentities"`
	// (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
	// - `useDetailedProcessingLog` (Optional Boolean) Controls whether the row data should be included in the processing log topic.
	Csu         int                       `pulumi:"csu"`
	DisplayName string                    `pulumi:"displayName"`
	Environment GetKsqlClusterEnvironment `pulumi:"environment"`
	// (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
	Id            string                       `pulumi:"id"`
	KafkaClusters []GetKsqlClusterKafkaCluster `pulumi:"kafkaClusters"`
	// (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
	Kind string `pulumi:"kind"`
	// (Required String) The Confluent Resource Name of the ksqlDB cluster.
	ResourceName string `pulumi:"resourceName"`
	// (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
	// - `kafkaCluster` (Optional Configuration Block) supports the following:
	//
	// Deprecated: use rest_endpoint instead
	RestEndpoint string `pulumi:"restEndpoint"`
	// (Required Integer) The amount of storage (in GB) provisioned to this cluster.
	Storage int `pulumi:"storage"`
	// (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
	TopicPrefix              string `pulumi:"topicPrefix"`
	UseDetailedProcessingLog bool   `pulumi:"useDetailedProcessingLog"`
}

func LookupKsqlClusterOutput(ctx *pulumi.Context, args LookupKsqlClusterOutputArgs, opts ...pulumi.InvokeOption) LookupKsqlClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKsqlClusterResult, error) {
			args := v.(LookupKsqlClusterArgs)
			r, err := LookupKsqlCluster(ctx, &args, opts...)
			var s LookupKsqlClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupKsqlClusterResultOutput)
}

// A collection of arguments for invoking getKsqlCluster.
type LookupKsqlClusterOutputArgs struct {
	// The name of the ksqlDB cluster.
	DisplayName pulumi.StringPtrInput          `pulumi:"displayName"`
	Environment GetKsqlClusterEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupKsqlClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKsqlClusterArgs)(nil)).Elem()
}

// A collection of values returned by getKsqlCluster.
type LookupKsqlClusterResultOutput struct{ *pulumi.OutputState }

func (LookupKsqlClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKsqlClusterResult)(nil)).Elem()
}

func (o LookupKsqlClusterResultOutput) ToLookupKsqlClusterResultOutput() LookupKsqlClusterResultOutput {
	return o
}

func (o LookupKsqlClusterResultOutput) ToLookupKsqlClusterResultOutputWithContext(ctx context.Context) LookupKsqlClusterResultOutput {
	return o
}

// (Required String) An API Version of the schema version of the ksqlDB cluster, for example, `ksqldbcm/v2`.
func (o LookupKsqlClusterResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

func (o LookupKsqlClusterResultOutput) CredentialIdentities() GetKsqlClusterCredentialIdentityArrayOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) []GetKsqlClusterCredentialIdentity { return v.CredentialIdentities }).(GetKsqlClusterCredentialIdentityArrayOutput)
}

// (Required Number) The number of CSUs (Confluent Streaming Units) in the ksqlDB cluster.
// - `useDetailedProcessingLog` (Optional Boolean) Controls whether the row data should be included in the processing log topic.
func (o LookupKsqlClusterResultOutput) Csu() pulumi.IntOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) int { return v.Csu }).(pulumi.IntOutput)
}

func (o LookupKsqlClusterResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupKsqlClusterResultOutput) Environment() GetKsqlClusterEnvironmentOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) GetKsqlClusterEnvironment { return v.Environment }).(GetKsqlClusterEnvironmentOutput)
}

// (Required String) The ID of the service or user account that the ksqlDB cluster belongs to, for example, `sa-abc123`.
func (o LookupKsqlClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupKsqlClusterResultOutput) KafkaClusters() GetKsqlClusterKafkaClusterArrayOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) []GetKsqlClusterKafkaCluster { return v.KafkaClusters }).(GetKsqlClusterKafkaClusterArrayOutput)
}

// (Required String) A kind of the ksqlDB cluster, for example, `Cluster`.
func (o LookupKsqlClusterResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the ksqlDB cluster.
func (o LookupKsqlClusterResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

// (Required String) The API endpoint of the ksqlDB cluster, for example, `https://pksqlc-00000.us-central1.gcp.glb.confluent.cloud`.
// - `kafkaCluster` (Optional Configuration Block) supports the following:
//
// Deprecated: use rest_endpoint instead
func (o LookupKsqlClusterResultOutput) RestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) string { return v.RestEndpoint }).(pulumi.StringOutput)
}

// (Required Integer) The amount of storage (in GB) provisioned to this cluster.
func (o LookupKsqlClusterResultOutput) Storage() pulumi.IntOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) int { return v.Storage }).(pulumi.IntOutput)
}

// (Required String) Topic name prefix used by this ksqlDB cluster. Used to assign ACLs for this ksqlDB cluster to use, for example, `pksqlc-00000`.
func (o LookupKsqlClusterResultOutput) TopicPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) string { return v.TopicPrefix }).(pulumi.StringOutput)
}

func (o LookupKsqlClusterResultOutput) UseDetailedProcessingLog() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupKsqlClusterResult) bool { return v.UseDetailedProcessingLog }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKsqlClusterResultOutput{})
}
