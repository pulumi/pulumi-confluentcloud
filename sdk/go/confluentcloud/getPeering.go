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
// `Peering` describes a Peering data source.
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
//			exampleUsingId, err := confluentcloud.LookupPeering(ctx, &confluentcloud.LookupPeeringArgs{
//				Id: pulumi.StringRef("peer-abc123"),
//				Environment: confluentcloud.GetPeeringEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingId)
//			exampleUsingName, err := confluentcloud.LookupPeering(ctx, &confluentcloud.LookupPeeringArgs{
//				DisplayName: pulumi.StringRef("my_peering"),
//				Environment: confluentcloud.GetPeeringEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingName", exampleUsingName)
//			return nil
//		})
//	}
//
// ```
func LookupPeering(ctx *pulumi.Context, args *LookupPeeringArgs, opts ...pulumi.InvokeOption) (*LookupPeeringResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPeeringResult
	err := ctx.Invoke("confluentcloud:index/getPeering:getPeering", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPeering.
type LookupPeeringArgs struct {
	// A human-readable name for the Peering.
	DisplayName *string `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetPeeringEnvironment `pulumi:"environment"`
	// The ID of the Peering, for example, `peer-abc123`.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getPeering.
type LookupPeeringResult struct {
	// (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
	Aws []GetPeeringAw `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
	Azures []GetPeeringAzure `pulumi:"azures"`
	// (Optional String) The name of the Peering.
	DisplayName string `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetPeeringEnvironment `pulumi:"environment"`
	// (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
	Gcps []GetPeeringGcp `pulumi:"gcps"`
	// (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
	Id string `pulumi:"id"`
	// (Required Configuration Block) supports the following:
	Networks []GetPeeringNetwork `pulumi:"networks"`
}

func LookupPeeringOutput(ctx *pulumi.Context, args LookupPeeringOutputArgs, opts ...pulumi.InvokeOption) LookupPeeringResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPeeringResult, error) {
			args := v.(LookupPeeringArgs)
			r, err := LookupPeering(ctx, &args, opts...)
			var s LookupPeeringResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPeeringResultOutput)
}

// A collection of arguments for invoking getPeering.
type LookupPeeringOutputArgs struct {
	// A human-readable name for the Peering.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetPeeringEnvironmentInput `pulumi:"environment"`
	// The ID of the Peering, for example, `peer-abc123`.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupPeeringOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPeeringArgs)(nil)).Elem()
}

// A collection of values returned by getPeering.
type LookupPeeringResultOutput struct{ *pulumi.OutputState }

func (LookupPeeringResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPeeringResult)(nil)).Elem()
}

func (o LookupPeeringResultOutput) ToLookupPeeringResultOutput() LookupPeeringResultOutput {
	return o
}

func (o LookupPeeringResultOutput) ToLookupPeeringResultOutputWithContext(ctx context.Context) LookupPeeringResultOutput {
	return o
}

// (Optional Configuration Block) The AWS-specific Peering details if available. It supports the following:
func (o LookupPeeringResultOutput) Aws() GetPeeringAwArrayOutput {
	return o.ApplyT(func(v LookupPeeringResult) []GetPeeringAw { return v.Aws }).(GetPeeringAwArrayOutput)
}

// (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
func (o LookupPeeringResultOutput) Azures() GetPeeringAzureArrayOutput {
	return o.ApplyT(func(v LookupPeeringResult) []GetPeeringAzure { return v.Azures }).(GetPeeringAzureArrayOutput)
}

// (Optional String) The name of the Peering.
func (o LookupPeeringResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPeeringResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupPeeringResultOutput) Environment() GetPeeringEnvironmentOutput {
	return o.ApplyT(func(v LookupPeeringResult) GetPeeringEnvironment { return v.Environment }).(GetPeeringEnvironmentOutput)
}

// (Optional Configuration Block) The Azure-specific Peering details if available. It supports the following:
func (o LookupPeeringResultOutput) Gcps() GetPeeringGcpArrayOutput {
	return o.ApplyT(func(v LookupPeeringResult) []GetPeeringGcp { return v.Gcps }).(GetPeeringGcpArrayOutput)
}

// (Required String) The ID of the Network that the Peering belongs to, for example, `n-abc123`.
func (o LookupPeeringResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPeeringResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupPeeringResultOutput) Networks() GetPeeringNetworkArrayOutput {
	return o.ApplyT(func(v LookupPeeringResult) []GetPeeringNetwork { return v.Networks }).(GetPeeringNetworkArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPeeringResultOutput{})
}
