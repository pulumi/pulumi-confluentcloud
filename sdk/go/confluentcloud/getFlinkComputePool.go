// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![Preview](https://img.shields.io/badge/Lifecycle%20Stage-Preview-%2300afba)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// > **Note:** `FlinkComputePool` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Preview releases of the Preview features at any time in Confluent’s sole discretion.
//
// `FlinkComputePool` describes a Flink Compute Pool data source.
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
//			exampleUsingIdFlinkComputePool, err := confluentcloud.LookupFlinkComputePool(ctx, &confluentcloud.LookupFlinkComputePoolArgs{
//				Id: pulumi.StringRef("lfcp-abc123"),
//				Environment: confluentcloud.GetFlinkComputePoolEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingIdFlinkComputePool)
//			exampleUsingNameFlinkComputePool, err := confluentcloud.LookupFlinkComputePool(ctx, &confluentcloud.LookupFlinkComputePoolArgs{
//				DisplayName: pulumi.StringRef("my_compute_pool"),
//				Environment: confluentcloud.GetFlinkComputePoolEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingName", exampleUsingNameFlinkComputePool)
//			return nil
//		})
//	}
//
// ```
func LookupFlinkComputePool(ctx *pulumi.Context, args *LookupFlinkComputePoolArgs, opts ...pulumi.InvokeOption) (*LookupFlinkComputePoolResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFlinkComputePoolResult
	err := ctx.Invoke("confluentcloud:index/getFlinkComputePool:getFlinkComputePool", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlinkComputePool.
type LookupFlinkComputePoolArgs struct {
	// A human-readable name for the Flink Compute Pool.
	DisplayName *string `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetFlinkComputePoolEnvironment `pulumi:"environment"`
	// The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-xyz456`.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getFlinkComputePool.
type LookupFlinkComputePoolResult struct {
	// (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
	ApiVersion string `pulumi:"apiVersion"`
	// (Required String) The cloud service provider that runs the Flink Compute Pool.
	Cloud string `pulumi:"cloud"`
	// (Required String) The name of the Flink Compute Pool.
	DisplayName string `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetFlinkComputePoolEnvironment `pulumi:"environment"`
	// (Required String) The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-abc123`.
	Id string `pulumi:"id"`
	// (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
	Kind string `pulumi:"kind"`
	// (Required Integer) Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to.
	MaxCfu int `pulumi:"maxCfu"`
	// (Required String) The cloud service provider region that hosts the Flink Compute Pool.
	Region string `pulumi:"region"`
	// (Required String) The Confluent Resource Name of the Flink Compute Pool.
	ResourceName string `pulumi:"resourceName"`
}

func LookupFlinkComputePoolOutput(ctx *pulumi.Context, args LookupFlinkComputePoolOutputArgs, opts ...pulumi.InvokeOption) LookupFlinkComputePoolResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFlinkComputePoolResult, error) {
			args := v.(LookupFlinkComputePoolArgs)
			r, err := LookupFlinkComputePool(ctx, &args, opts...)
			var s LookupFlinkComputePoolResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupFlinkComputePoolResultOutput)
}

// A collection of arguments for invoking getFlinkComputePool.
type LookupFlinkComputePoolOutputArgs struct {
	// A human-readable name for the Flink Compute Pool.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetFlinkComputePoolEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-xyz456`.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupFlinkComputePoolOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlinkComputePoolArgs)(nil)).Elem()
}

// A collection of values returned by getFlinkComputePool.
type LookupFlinkComputePoolResultOutput struct{ *pulumi.OutputState }

func (LookupFlinkComputePoolResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlinkComputePoolResult)(nil)).Elem()
}

func (o LookupFlinkComputePoolResultOutput) ToLookupFlinkComputePoolResultOutput() LookupFlinkComputePoolResultOutput {
	return o
}

func (o LookupFlinkComputePoolResultOutput) ToLookupFlinkComputePoolResultOutputWithContext(ctx context.Context) LookupFlinkComputePoolResultOutput {
	return o
}

// (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
func (o LookupFlinkComputePoolResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// (Required String) The cloud service provider that runs the Flink Compute Pool.
func (o LookupFlinkComputePoolResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Required String) The name of the Flink Compute Pool.
func (o LookupFlinkComputePoolResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupFlinkComputePoolResultOutput) Environment() GetFlinkComputePoolEnvironmentOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) GetFlinkComputePoolEnvironment { return v.Environment }).(GetFlinkComputePoolEnvironmentOutput)
}

// (Required String) The ID of the Environment that the Flink Compute Pool belongs to, for example, `env-abc123`.
func (o LookupFlinkComputePoolResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
func (o LookupFlinkComputePoolResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Required Integer) Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to.
func (o LookupFlinkComputePoolResultOutput) MaxCfu() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) int { return v.MaxCfu }).(pulumi.IntOutput)
}

// (Required String) The cloud service provider region that hosts the Flink Compute Pool.
func (o LookupFlinkComputePoolResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Flink Compute Pool.
func (o LookupFlinkComputePoolResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkComputePoolResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFlinkComputePoolResultOutput{})
}
