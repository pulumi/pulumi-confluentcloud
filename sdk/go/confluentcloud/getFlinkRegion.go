// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
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
// `getFlinkRegion` describes a Flink cluster data source.
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
//			example, err := confluentcloud.GetFlinkRegion(ctx, &confluentcloud.GetFlinkRegionArgs{
//				Cloud:  "AWS",
//				Region: "us-east-1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("example", example)
//			return nil
//		})
//	}
//
// ```
func GetFlinkRegion(ctx *pulumi.Context, args *GetFlinkRegionArgs, opts ...pulumi.InvokeOption) (*GetFlinkRegionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFlinkRegionResult
	err := ctx.Invoke("confluentcloud:index/getFlinkRegion:getFlinkRegion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlinkRegion.
type GetFlinkRegionArgs struct {
	// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud string `pulumi:"cloud"`
	// The cloud service provider region, for example, `us-east-1`.
	Region string `pulumi:"region"`
}

// A collection of values returned by getFlinkRegion.
type GetFlinkRegionResult struct {
	// (Required String) An API Version of the Flink region, for example, `fcpm/v2`.
	ApiVersion string `pulumi:"apiVersion"`
	Cloud      string `pulumi:"cloud"`
	// (Required String) The ID of the Flink region, for example, `aws.us-east-1`.
	Id string `pulumi:"id"`
	// (Required String) A kind of the Flink region, for example, `Region`.
	Kind string `pulumi:"kind"`
	// (Required String) The private HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.private.confluent.cloud`.
	PrivateRestEndpoint string `pulumi:"privateRestEndpoint"`
	Region              string `pulumi:"region"`
	// (Required String) The HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`.
	RestEndpoint string `pulumi:"restEndpoint"`
}

func GetFlinkRegionOutput(ctx *pulumi.Context, args GetFlinkRegionOutputArgs, opts ...pulumi.InvokeOption) GetFlinkRegionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFlinkRegionResult, error) {
			args := v.(GetFlinkRegionArgs)
			r, err := GetFlinkRegion(ctx, &args, opts...)
			var s GetFlinkRegionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFlinkRegionResultOutput)
}

// A collection of arguments for invoking getFlinkRegion.
type GetFlinkRegionOutputArgs struct {
	// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringInput `pulumi:"cloud"`
	// The cloud service provider region, for example, `us-east-1`.
	Region pulumi.StringInput `pulumi:"region"`
}

func (GetFlinkRegionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFlinkRegionArgs)(nil)).Elem()
}

// A collection of values returned by getFlinkRegion.
type GetFlinkRegionResultOutput struct{ *pulumi.OutputState }

func (GetFlinkRegionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFlinkRegionResult)(nil)).Elem()
}

func (o GetFlinkRegionResultOutput) ToGetFlinkRegionResultOutput() GetFlinkRegionResultOutput {
	return o
}

func (o GetFlinkRegionResultOutput) ToGetFlinkRegionResultOutputWithContext(ctx context.Context) GetFlinkRegionResultOutput {
	return o
}

// (Required String) An API Version of the Flink region, for example, `fcpm/v2`.
func (o GetFlinkRegionResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlinkRegionResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

func (o GetFlinkRegionResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlinkRegionResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Required String) The ID of the Flink region, for example, `aws.us-east-1`.
func (o GetFlinkRegionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlinkRegionResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A kind of the Flink region, for example, `Region`.
func (o GetFlinkRegionResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlinkRegionResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Required String) The private HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.private.confluent.cloud`.
func (o GetFlinkRegionResultOutput) PrivateRestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlinkRegionResult) string { return v.PrivateRestEndpoint }).(pulumi.StringOutput)
}

func (o GetFlinkRegionResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlinkRegionResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The HTTP endpoint of the Flink region, for example, `https://flink.us-east-1.aws.confluent.cloud`.
func (o GetFlinkRegionResultOutput) RestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetFlinkRegionResult) string { return v.RestEndpoint }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFlinkRegionResultOutput{})
}
