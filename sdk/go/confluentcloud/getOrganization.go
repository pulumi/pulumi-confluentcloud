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
// `getOrganization` describes an Organization data source.
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
//			example, err := confluentcloud.GetOrganization(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("example", example)
//			return nil
//		})
//	}
//
// ```
func GetOrganization(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetOrganizationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOrganizationResult
	err := ctx.Invoke("confluentcloud:index/getOrganization:getOrganization", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getOrganization.
type GetOrganizationResult struct {
	// (Required String) The ID of the Organization, for example, `1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
	Id string `pulumi:"id"`
	// (Required String) The Confluent Resource Name of the Organization, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
	ResourceName string `pulumi:"resourceName"`
}

func GetOrganizationOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetOrganizationResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetOrganizationResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("confluentcloud:index/getOrganization:getOrganization", nil, GetOrganizationResultOutput{}, options).(GetOrganizationResultOutput), nil
	}).(GetOrganizationResultOutput)
}

// A collection of values returned by getOrganization.
type GetOrganizationResultOutput struct{ *pulumi.OutputState }

func (GetOrganizationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOrganizationResult)(nil)).Elem()
}

func (o GetOrganizationResultOutput) ToGetOrganizationResultOutput() GetOrganizationResultOutput {
	return o
}

func (o GetOrganizationResultOutput) ToGetOrganizationResultOutputWithContext(ctx context.Context) GetOrganizationResultOutput {
	return o
}

// (Required String) The ID of the Organization, for example, `1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
func (o GetOrganizationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrganizationResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Organization, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
func (o GetOrganizationResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrganizationResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOrganizationResultOutput{})
}
