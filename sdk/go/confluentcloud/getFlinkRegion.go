// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![Preview](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-Preview-%!a(MISSING)fba>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// > **Note:** `getFlinkRegion` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing Preview releases of the Preview features at any time in Confluent’s sole discretion.
//
// `getFlinkRegion` describes a Flink cluster data source.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			exampleFlinkRegion, err := confluentcloud.GetFlinkRegion(ctx, &confluentcloud.GetFlinkRegionArgs{
//				Cloud:  "AWS",
//				Region: "us-east-1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("example", exampleFlinkRegion)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
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
	Kind   string `pulumi:"kind"`
	Region string `pulumi:"region"`
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
