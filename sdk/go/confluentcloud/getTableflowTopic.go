// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `TableflowTopic` describes a Tableflow Topic data source.
//
// ## Example Usage
//
// ### Option #1: Manage multiple Tableflow Topics in the same Pulumi Stack
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := confluentcloud.LookupTableflowTopic(ctx, &confluentcloud.LookupTableflowTopicArgs{
//				Environment: confluentcloud.GetTableflowTopicEnvironment{
//					Id: staging.Id,
//				},
//				KafkaCluster: confluentcloud.GetTableflowTopicKafkaCluster{
//					Id: stagingConfluentKafkaCluster.Id,
//				},
//				DisplayName: "tableflow-example",
//				Credentials: confluentcloud.GetTableflowTopicCredentials{
//					Key:    env_admin_tableflow_api_key.Id,
//					Secret: env_admin_tableflow_api_key.Secret,
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("retention-ms", example.RetentionMs)
//			return nil
//		})
//	}
//
// ```
//
// ### Option #2: Manage a single Tableflow Topic in the same Pulumi Stack
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := confluentcloud.LookupTableflowTopic(ctx, &confluentcloud.LookupTableflowTopicArgs{
//				DisplayName: "tableflow-example",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("retention-ms", example.RetentionMs)
//			return nil
//		})
//	}
//
// ```
func LookupTableflowTopic(ctx *pulumi.Context, args *LookupTableflowTopicArgs, opts ...pulumi.InvokeOption) (*LookupTableflowTopicResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTableflowTopicResult
	err := ctx.Invoke("confluentcloud:index/getTableflowTopic:getTableflowTopic", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTableflowTopic.
type LookupTableflowTopicArgs struct {
	Credentials *GetTableflowTopicCredentials `pulumi:"credentials"`
	// The name of the Tableflow Topic.
	DisplayName  string                        `pulumi:"displayName"`
	Environment  GetTableflowTopicEnvironment  `pulumi:"environment"`
	KafkaCluster GetTableflowTopicKafkaCluster `pulumi:"kafkaCluster"`
}

// A collection of values returned by getTableflowTopic.
type LookupTableflowTopicResult struct {
	// (Optional Configuration Block) supports the following:
	ByobAws     []GetTableflowTopicByobAw     `pulumi:"byobAws"`
	Credentials *GetTableflowTopicCredentials `pulumi:"credentials"`
	DisplayName string                        `pulumi:"displayName"`
	// (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
	EnableCompaction bool `pulumi:"enableCompaction"`
	// (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
	EnablePartitioning bool                         `pulumi:"enablePartitioning"`
	Environment        GetTableflowTopicEnvironment `pulumi:"environment"`
	// The provider-assigned unique ID for this managed resource.
	Id           string                        `pulumi:"id"`
	KafkaCluster GetTableflowTopicKafkaCluster `pulumi:"kafkaCluster"`
	// (Optional Configuration Block) The configuration of the Confluent managed bucket.
	ManagedStorages []GetTableflowTopicManagedStorage `pulumi:"managedStorages"`
	// (Optional String) The strategy to handle record failures in the Tableflow enabled topic during materialization. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
	RecordFailureStrategy string `pulumi:"recordFailureStrategy"`
	// (Optional String) The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
	RetentionMs string `pulumi:"retentionMs"`
	// (Optional Boolean) Indicates whether the Tableflow should be suspended.
	Suspended bool `pulumi:"suspended"`
	// (Optional List) The supported table formats for the Tableflow-enabled topic.
	TableFormats []string `pulumi:"tableFormats"`
}

func LookupTableflowTopicOutput(ctx *pulumi.Context, args LookupTableflowTopicOutputArgs, opts ...pulumi.InvokeOption) LookupTableflowTopicResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTableflowTopicResultOutput, error) {
			args := v.(LookupTableflowTopicArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("confluentcloud:index/getTableflowTopic:getTableflowTopic", args, LookupTableflowTopicResultOutput{}, options).(LookupTableflowTopicResultOutput), nil
		}).(LookupTableflowTopicResultOutput)
}

// A collection of arguments for invoking getTableflowTopic.
type LookupTableflowTopicOutputArgs struct {
	Credentials GetTableflowTopicCredentialsPtrInput `pulumi:"credentials"`
	// The name of the Tableflow Topic.
	DisplayName  pulumi.StringInput                 `pulumi:"displayName"`
	Environment  GetTableflowTopicEnvironmentInput  `pulumi:"environment"`
	KafkaCluster GetTableflowTopicKafkaClusterInput `pulumi:"kafkaCluster"`
}

func (LookupTableflowTopicOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTableflowTopicArgs)(nil)).Elem()
}

// A collection of values returned by getTableflowTopic.
type LookupTableflowTopicResultOutput struct{ *pulumi.OutputState }

func (LookupTableflowTopicResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTableflowTopicResult)(nil)).Elem()
}

func (o LookupTableflowTopicResultOutput) ToLookupTableflowTopicResultOutput() LookupTableflowTopicResultOutput {
	return o
}

func (o LookupTableflowTopicResultOutput) ToLookupTableflowTopicResultOutputWithContext(ctx context.Context) LookupTableflowTopicResultOutput {
	return o
}

// (Optional Configuration Block) supports the following:
func (o LookupTableflowTopicResultOutput) ByobAws() GetTableflowTopicByobAwArrayOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) []GetTableflowTopicByobAw { return v.ByobAws }).(GetTableflowTopicByobAwArrayOutput)
}

func (o LookupTableflowTopicResultOutput) Credentials() GetTableflowTopicCredentialsPtrOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) *GetTableflowTopicCredentials { return v.Credentials }).(GetTableflowTopicCredentialsPtrOutput)
}

func (o LookupTableflowTopicResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Optional Boolean) This flag determines whether to enable compaction for the Tableflow enabled topic.
func (o LookupTableflowTopicResultOutput) EnableCompaction() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) bool { return v.EnableCompaction }).(pulumi.BoolOutput)
}

// (Optional Boolean) This flag determines whether to enable partitioning for the Tableflow enabled topic.
func (o LookupTableflowTopicResultOutput) EnablePartitioning() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) bool { return v.EnablePartitioning }).(pulumi.BoolOutput)
}

func (o LookupTableflowTopicResultOutput) Environment() GetTableflowTopicEnvironmentOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) GetTableflowTopicEnvironment { return v.Environment }).(GetTableflowTopicEnvironmentOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTableflowTopicResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupTableflowTopicResultOutput) KafkaCluster() GetTableflowTopicKafkaClusterOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) GetTableflowTopicKafkaCluster { return v.KafkaCluster }).(GetTableflowTopicKafkaClusterOutput)
}

// (Optional Configuration Block) The configuration of the Confluent managed bucket.
func (o LookupTableflowTopicResultOutput) ManagedStorages() GetTableflowTopicManagedStorageArrayOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) []GetTableflowTopicManagedStorage { return v.ManagedStorages }).(GetTableflowTopicManagedStorageArrayOutput)
}

// (Optional String) The strategy to handle record failures in the Tableflow enabled topic during materialization. For `SKIP`, we skip the bad records and move to the next record. For `SUSPEND`, we suspend the materialization of the topic.
func (o LookupTableflowTopicResultOutput) RecordFailureStrategy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) string { return v.RecordFailureStrategy }).(pulumi.StringOutput)
}

// (Optional String) The max age of snapshots (Iceberg) or versions (Delta) (snapshot/version expiration) to keep on the table in milliseconds for the Tableflow enabled topic.
func (o LookupTableflowTopicResultOutput) RetentionMs() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) string { return v.RetentionMs }).(pulumi.StringOutput)
}

// (Optional Boolean) Indicates whether the Tableflow should be suspended.
func (o LookupTableflowTopicResultOutput) Suspended() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) bool { return v.Suspended }).(pulumi.BoolOutput)
}

// (Optional List) The supported table formats for the Tableflow-enabled topic.
func (o LookupTableflowTopicResultOutput) TableFormats() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTableflowTopicResult) []string { return v.TableFormats }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTableflowTopicResultOutput{})
}
