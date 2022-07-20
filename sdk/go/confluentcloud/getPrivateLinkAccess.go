// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// <img src="https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8" alt="">
//
// `PrivateLinkAccess` describes a Network data source.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleUsingIdPrivateLinkAccess, err := confluentcloud.LookupPrivateLinkAccess(ctx, &GetPrivateLinkAccessArgs{
// 			Id: pulumi.StringRef("pla-abc123"),
// 			Environment: GetPrivateLinkAccessEnvironment{
// 				Id: "env-xyz456",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("exampleUsingId", exampleUsingIdPrivateLinkAccess)
// 		exampleUsingNamePrivateLinkAccess, err := confluentcloud.LookupPrivateLinkAccess(ctx, &GetPrivateLinkAccessArgs{
// 			DisplayName: pulumi.StringRef("my_pla"),
// 			Environment: GetPrivateLinkAccessEnvironment{
// 				Id: "env-xyz456",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("exampleUsingName", exampleUsingNamePrivateLinkAccess)
// 		return nil
// 	})
// }
// ```
func LookupPrivateLinkAccess(ctx *pulumi.Context, args *LookupPrivateLinkAccessArgs, opts ...pulumi.InvokeOption) (*LookupPrivateLinkAccessResult, error) {
	var rv LookupPrivateLinkAccessResult
	err := ctx.Invoke("confluentcloud:index/getPrivateLinkAccess:getPrivateLinkAccess", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivateLinkAccess.
type LookupPrivateLinkAccessArgs struct {
	// A human-readable name for the Private Link Access.
	DisplayName *string                         `pulumi:"displayName"`
	Environment GetPrivateLinkAccessEnvironment `pulumi:"environment"`
	// The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getPrivateLinkAccess.
type LookupPrivateLinkAccessResult struct {
	// (Optional Configuration Block) The AWS-specific Private Link Access details if available. It supports the following:
	Aws []GetPrivateLinkAccessAw `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific Private Link Access details if available. It supports the following:
	Azures []GetPrivateLinkAccessAzure `pulumi:"azures"`
	// (Optional String) The name of the Private Link Access.
	// - `environment` (Required Configuration Block) supports the following:
	DisplayName string                          `pulumi:"displayName"`
	Environment GetPrivateLinkAccessEnvironment `pulumi:"environment"`
	// (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
	Id       string                        `pulumi:"id"`
	Networks []GetPrivateLinkAccessNetwork `pulumi:"networks"`
}

func LookupPrivateLinkAccessOutput(ctx *pulumi.Context, args LookupPrivateLinkAccessOutputArgs, opts ...pulumi.InvokeOption) LookupPrivateLinkAccessResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivateLinkAccessResult, error) {
			args := v.(LookupPrivateLinkAccessArgs)
			r, err := LookupPrivateLinkAccess(ctx, &args, opts...)
			var s LookupPrivateLinkAccessResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivateLinkAccessResultOutput)
}

// A collection of arguments for invoking getPrivateLinkAccess.
type LookupPrivateLinkAccessOutputArgs struct {
	// A human-readable name for the Private Link Access.
	DisplayName pulumi.StringPtrInput                `pulumi:"displayName"`
	Environment GetPrivateLinkAccessEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the Private Link Access belongs to, for example, `env-xyz456`.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupPrivateLinkAccessOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkAccessArgs)(nil)).Elem()
}

// A collection of values returned by getPrivateLinkAccess.
type LookupPrivateLinkAccessResultOutput struct{ *pulumi.OutputState }

func (LookupPrivateLinkAccessResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkAccessResult)(nil)).Elem()
}

func (o LookupPrivateLinkAccessResultOutput) ToLookupPrivateLinkAccessResultOutput() LookupPrivateLinkAccessResultOutput {
	return o
}

func (o LookupPrivateLinkAccessResultOutput) ToLookupPrivateLinkAccessResultOutputWithContext(ctx context.Context) LookupPrivateLinkAccessResultOutput {
	return o
}

// (Optional Configuration Block) The AWS-specific Private Link Access details if available. It supports the following:
func (o LookupPrivateLinkAccessResultOutput) Aws() GetPrivateLinkAccessAwArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAccessResult) []GetPrivateLinkAccessAw { return v.Aws }).(GetPrivateLinkAccessAwArrayOutput)
}

// (Optional Configuration Block) The Azure-specific Private Link Access details if available. It supports the following:
func (o LookupPrivateLinkAccessResultOutput) Azures() GetPrivateLinkAccessAzureArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAccessResult) []GetPrivateLinkAccessAzure { return v.Azures }).(GetPrivateLinkAccessAzureArrayOutput)
}

// (Optional String) The name of the Private Link Access.
// - `environment` (Required Configuration Block) supports the following:
func (o LookupPrivateLinkAccessResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAccessResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupPrivateLinkAccessResultOutput) Environment() GetPrivateLinkAccessEnvironmentOutput {
	return o.ApplyT(func(v LookupPrivateLinkAccessResult) GetPrivateLinkAccessEnvironment { return v.Environment }).(GetPrivateLinkAccessEnvironmentOutput)
}

// (Required String) The ID of the Network that the Private Link Access belongs to, for example, `n-abc123`.
func (o LookupPrivateLinkAccessResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAccessResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupPrivateLinkAccessResultOutput) Networks() GetPrivateLinkAccessNetworkArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAccessResult) []GetPrivateLinkAccessNetwork { return v.Networks }).(GetPrivateLinkAccessNetworkArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivateLinkAccessResultOutput{})
}
