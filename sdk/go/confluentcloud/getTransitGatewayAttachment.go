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
// `TransitGatewayAttachment` describes a Transit Gateway Attachment data source.
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
//			exampleUsingId, err := confluentcloud.LookupTransitGatewayAttachment(ctx, &confluentcloud.LookupTransitGatewayAttachmentArgs{
//				Id: pulumi.StringRef("tgwa-abc123"),
//				Environment: confluentcloud.GetTransitGatewayAttachmentEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingId)
//			exampleUsingName, err := confluentcloud.LookupTransitGatewayAttachment(ctx, &confluentcloud.LookupTransitGatewayAttachmentArgs{
//				DisplayName: pulumi.StringRef("my_tgwa"),
//				Environment: confluentcloud.GetTransitGatewayAttachmentEnvironment{
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
func LookupTransitGatewayAttachment(ctx *pulumi.Context, args *LookupTransitGatewayAttachmentArgs, opts ...pulumi.InvokeOption) (*LookupTransitGatewayAttachmentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTransitGatewayAttachmentResult
	err := ctx.Invoke("confluentcloud:index/getTransitGatewayAttachment:getTransitGatewayAttachment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitGatewayAttachment.
type LookupTransitGatewayAttachmentArgs struct {
	// A human-readable name for the Transit Gateway Attachment.
	DisplayName *string `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetTransitGatewayAttachmentEnvironment `pulumi:"environment"`
	// The ID of the Peering, for example, `tgwa-abc123`.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getTransitGatewayAttachment.
type LookupTransitGatewayAttachmentResult struct {
	// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
	Aws []GetTransitGatewayAttachmentAw `pulumi:"aws"`
	// (Required String) The name of the Transit Gateway Attachment.
	DisplayName string `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetTransitGatewayAttachmentEnvironment `pulumi:"environment"`
	// (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
	Id string `pulumi:"id"`
	// (Required Configuration Block) supports the following:
	Networks []GetTransitGatewayAttachmentNetwork `pulumi:"networks"`
}

func LookupTransitGatewayAttachmentOutput(ctx *pulumi.Context, args LookupTransitGatewayAttachmentOutputArgs, opts ...pulumi.InvokeOption) LookupTransitGatewayAttachmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTransitGatewayAttachmentResultOutput, error) {
			args := v.(LookupTransitGatewayAttachmentArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupTransitGatewayAttachmentResult
			secret, err := ctx.InvokePackageRaw("confluentcloud:index/getTransitGatewayAttachment:getTransitGatewayAttachment", args, &rv, "", opts...)
			if err != nil {
				return LookupTransitGatewayAttachmentResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupTransitGatewayAttachmentResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupTransitGatewayAttachmentResultOutput), nil
			}
			return output, nil
		}).(LookupTransitGatewayAttachmentResultOutput)
}

// A collection of arguments for invoking getTransitGatewayAttachment.
type LookupTransitGatewayAttachmentOutputArgs struct {
	// A human-readable name for the Transit Gateway Attachment.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environment GetTransitGatewayAttachmentEnvironmentInput `pulumi:"environment"`
	// The ID of the Peering, for example, `tgwa-abc123`.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupTransitGatewayAttachmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransitGatewayAttachmentArgs)(nil)).Elem()
}

// A collection of values returned by getTransitGatewayAttachment.
type LookupTransitGatewayAttachmentResultOutput struct{ *pulumi.OutputState }

func (LookupTransitGatewayAttachmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTransitGatewayAttachmentResult)(nil)).Elem()
}

func (o LookupTransitGatewayAttachmentResultOutput) ToLookupTransitGatewayAttachmentResultOutput() LookupTransitGatewayAttachmentResultOutput {
	return o
}

func (o LookupTransitGatewayAttachmentResultOutput) ToLookupTransitGatewayAttachmentResultOutputWithContext(ctx context.Context) LookupTransitGatewayAttachmentResultOutput {
	return o
}

// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
func (o LookupTransitGatewayAttachmentResultOutput) Aws() GetTransitGatewayAttachmentAwArrayOutput {
	return o.ApplyT(func(v LookupTransitGatewayAttachmentResult) []GetTransitGatewayAttachmentAw { return v.Aws }).(GetTransitGatewayAttachmentAwArrayOutput)
}

// (Required String) The name of the Transit Gateway Attachment.
func (o LookupTransitGatewayAttachmentResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransitGatewayAttachmentResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupTransitGatewayAttachmentResultOutput) Environment() GetTransitGatewayAttachmentEnvironmentOutput {
	return o.ApplyT(func(v LookupTransitGatewayAttachmentResult) GetTransitGatewayAttachmentEnvironment {
		return v.Environment
	}).(GetTransitGatewayAttachmentEnvironmentOutput)
}

// (Required String) The ID of the Network that the Transit Gateway Attachment belongs to, for example, `n-abc123`.
func (o LookupTransitGatewayAttachmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTransitGatewayAttachmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupTransitGatewayAttachmentResultOutput) Networks() GetTransitGatewayAttachmentNetworkArrayOutput {
	return o.ApplyT(func(v LookupTransitGatewayAttachmentResult) []GetTransitGatewayAttachmentNetwork { return v.Networks }).(GetTransitGatewayAttachmentNetworkArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTransitGatewayAttachmentResultOutput{})
}
