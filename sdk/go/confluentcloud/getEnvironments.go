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
// `getEnvironments` describes a data source for Environments.
//
// ## Example Usage
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
//			main, err := confluentcloud.GetEnvironments(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("environments", main.Ids)
//			return nil
//		})
//	}
//
// ```
func GetEnvironments(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetEnvironmentsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEnvironmentsResult
	err := ctx.Invoke("confluentcloud:index/getEnvironments:getEnvironments", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getEnvironments.
type GetEnvironmentsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Required List of Strings) The list of Environment IDs, for example: `["env-abc123", "env-abc124"]`.
	Ids []string `pulumi:"ids"`
}

func GetEnvironmentsOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetEnvironmentsResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetEnvironmentsResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("confluentcloud:index/getEnvironments:getEnvironments", nil, GetEnvironmentsResultOutput{}, options).(GetEnvironmentsResultOutput), nil
	}).(GetEnvironmentsResultOutput)
}

// A collection of values returned by getEnvironments.
type GetEnvironmentsResultOutput struct{ *pulumi.OutputState }

func (GetEnvironmentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEnvironmentsResult)(nil)).Elem()
}

func (o GetEnvironmentsResultOutput) ToGetEnvironmentsResultOutput() GetEnvironmentsResultOutput {
	return o
}

func (o GetEnvironmentsResultOutput) ToGetEnvironmentsResultOutputWithContext(ctx context.Context) GetEnvironmentsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetEnvironmentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEnvironmentsResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required List of Strings) The list of Environment IDs, for example: `["env-abc123", "env-abc124"]`.
func (o GetEnvironmentsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEnvironmentsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEnvironmentsResultOutput{})
}
