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
// > **Note:** `getIpAddresses` data source is available in **Preview** for early adopters. Preview features are introduced to gather customer feedback. This feature should be used only for evaluation and non-production testing purposes or to provide feedback to Confluent, particularly as it becomes more widely available in follow-on editions.\
// **Preview** features are intended for evaluation use in development and testing environments only, and not for production use. The warranty, SLA, and Support Services provisions of your agreement with Confluent do not apply to Preview features. Preview features are considered to be a Proof of Concept as defined in the Confluent Cloud Terms of Service. Confluent may discontinue providing preview releases of the Preview features at any time in Confluent’s sole discretion.
//
// `getIpAddresses` describes IP Addresses data source.
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
//			main, err := confluentcloud.GetIpAddresses(ctx, &confluentcloud.GetIpAddressesArgs{
//				Filter: confluentcloud.GetIpAddressesFilter{
//					Clouds: []string{
//						"AWS",
//					},
//					Regions: []string{
//						"us-east-1",
//						"us-east-2",
//					},
//					Services: []string{
//						"KAFKA",
//					},
//					AddressTypes: []string{
//						"EGRESS",
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("ipAddresses", main.IpAddresses)
//			return nil
//		})
//	}
//
// ```
func GetIpAddresses(ctx *pulumi.Context, args *GetIpAddressesArgs, opts ...pulumi.InvokeOption) (*GetIpAddressesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetIpAddressesResult
	err := ctx.Invoke("confluentcloud:index/getIpAddresses:getIpAddresses", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpAddresses.
type GetIpAddressesArgs struct {
	Filter *GetIpAddressesFilter `pulumi:"filter"`
}

// A collection of values returned by getIpAddresses.
type GetIpAddressesResult struct {
	Filter *GetIpAddressesFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (List of Object) List of schemas. Each schema object exports the following attributes:
	IpAddresses []GetIpAddressesIpAddress `pulumi:"ipAddresses"`
}

func GetIpAddressesOutput(ctx *pulumi.Context, args GetIpAddressesOutputArgs, opts ...pulumi.InvokeOption) GetIpAddressesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetIpAddressesResult, error) {
			args := v.(GetIpAddressesArgs)
			r, err := GetIpAddresses(ctx, &args, opts...)
			var s GetIpAddressesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetIpAddressesResultOutput)
}

// A collection of arguments for invoking getIpAddresses.
type GetIpAddressesOutputArgs struct {
	Filter GetIpAddressesFilterPtrInput `pulumi:"filter"`
}

func (GetIpAddressesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpAddressesArgs)(nil)).Elem()
}

// A collection of values returned by getIpAddresses.
type GetIpAddressesResultOutput struct{ *pulumi.OutputState }

func (GetIpAddressesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetIpAddressesResult)(nil)).Elem()
}

func (o GetIpAddressesResultOutput) ToGetIpAddressesResultOutput() GetIpAddressesResultOutput {
	return o
}

func (o GetIpAddressesResultOutput) ToGetIpAddressesResultOutputWithContext(ctx context.Context) GetIpAddressesResultOutput {
	return o
}

func (o GetIpAddressesResultOutput) Filter() GetIpAddressesFilterPtrOutput {
	return o.ApplyT(func(v GetIpAddressesResult) *GetIpAddressesFilter { return v.Filter }).(GetIpAddressesFilterPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetIpAddressesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetIpAddressesResult) string { return v.Id }).(pulumi.StringOutput)
}

// (List of Object) List of schemas. Each schema object exports the following attributes:
func (o GetIpAddressesResultOutput) IpAddresses() GetIpAddressesIpAddressArrayOutput {
	return o.ApplyT(func(v GetIpAddressesResult) []GetIpAddressesIpAddress { return v.IpAddresses }).(GetIpAddressesIpAddressArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetIpAddressesResultOutput{})
}
