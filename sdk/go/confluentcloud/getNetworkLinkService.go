// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `NetworkLinkService` describes a Network Link Service data source.
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
//			nls, err := confluentcloud.LookupNetworkLinkService(ctx, &confluentcloud.LookupNetworkLinkServiceArgs{
//				Id: "nls-zyw30",
//				Environment: confluentcloud.GetNetworkLinkServiceEnvironment{
//					Id: "env-1234",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("networkLinkService", nls)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupNetworkLinkService(ctx *pulumi.Context, args *LookupNetworkLinkServiceArgs, opts ...pulumi.InvokeOption) (*LookupNetworkLinkServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkLinkServiceResult
	err := ctx.Invoke("confluentcloud:index/getNetworkLinkService:getNetworkLinkService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkLinkService.
type LookupNetworkLinkServiceArgs struct {
	// (Optional Configuration Block) supports the following:
	Accept      *GetNetworkLinkServiceAccept     `pulumi:"accept"`
	Environment GetNetworkLinkServiceEnvironment `pulumi:"environment"`
	// The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getNetworkLinkService.
type LookupNetworkLinkServiceResult struct {
	// (Optional Configuration Block) supports the following:
	Accept GetNetworkLinkServiceAccept `pulumi:"accept"`
	// (Optional String) The description of the Network Link Service.
	Description string `pulumi:"description"`
	// (Optional String) The name of the Network Link Service.
	DisplayName string                           `pulumi:"displayName"`
	Environment GetNetworkLinkServiceEnvironment `pulumi:"environment"`
	// (Required String) The ID of the Network that the Network Link Service belongs to, for example, `n-abc123`.
	Id string `pulumi:"id"`
	// (Required Configuration Block) supports the following:
	Networks []GetNetworkLinkServiceNetwork `pulumi:"networks"`
	// (Required String) The Confluent Resource Name of the Network Link Service.
	ResourceName string `pulumi:"resourceName"`
}

func LookupNetworkLinkServiceOutput(ctx *pulumi.Context, args LookupNetworkLinkServiceOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkLinkServiceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkLinkServiceResult, error) {
			args := v.(LookupNetworkLinkServiceArgs)
			r, err := LookupNetworkLinkService(ctx, &args, opts...)
			var s LookupNetworkLinkServiceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNetworkLinkServiceResultOutput)
}

// A collection of arguments for invoking getNetworkLinkService.
type LookupNetworkLinkServiceOutputArgs struct {
	// (Optional Configuration Block) supports the following:
	Accept      GetNetworkLinkServiceAcceptPtrInput   `pulumi:"accept"`
	Environment GetNetworkLinkServiceEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the Network Link Service belongs to, for example, `env-1234`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupNetworkLinkServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkLinkServiceArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkLinkService.
type LookupNetworkLinkServiceResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkLinkServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkLinkServiceResult)(nil)).Elem()
}

func (o LookupNetworkLinkServiceResultOutput) ToLookupNetworkLinkServiceResultOutput() LookupNetworkLinkServiceResultOutput {
	return o
}

func (o LookupNetworkLinkServiceResultOutput) ToLookupNetworkLinkServiceResultOutputWithContext(ctx context.Context) LookupNetworkLinkServiceResultOutput {
	return o
}

// (Optional Configuration Block) supports the following:
func (o LookupNetworkLinkServiceResultOutput) Accept() GetNetworkLinkServiceAcceptOutput {
	return o.ApplyT(func(v LookupNetworkLinkServiceResult) GetNetworkLinkServiceAccept { return v.Accept }).(GetNetworkLinkServiceAcceptOutput)
}

// (Optional String) The description of the Network Link Service.
func (o LookupNetworkLinkServiceResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkLinkServiceResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Optional String) The name of the Network Link Service.
func (o LookupNetworkLinkServiceResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkLinkServiceResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupNetworkLinkServiceResultOutput) Environment() GetNetworkLinkServiceEnvironmentOutput {
	return o.ApplyT(func(v LookupNetworkLinkServiceResult) GetNetworkLinkServiceEnvironment { return v.Environment }).(GetNetworkLinkServiceEnvironmentOutput)
}

// (Required String) The ID of the Network that the Network Link Service belongs to, for example, `n-abc123`.
func (o LookupNetworkLinkServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkLinkServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupNetworkLinkServiceResultOutput) Networks() GetNetworkLinkServiceNetworkArrayOutput {
	return o.ApplyT(func(v LookupNetworkLinkServiceResult) []GetNetworkLinkServiceNetwork { return v.Networks }).(GetNetworkLinkServiceNetworkArrayOutput)
}

// (Required String) The Confluent Resource Name of the Network Link Service.
func (o LookupNetworkLinkServiceResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkLinkServiceResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkLinkServiceResultOutput{})
}
