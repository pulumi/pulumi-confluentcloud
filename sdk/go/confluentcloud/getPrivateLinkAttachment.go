// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `PrivateLinkAttachment` describes a Private Link Attachment data source.
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
//			main, err := confluentcloud.LookupPrivateLinkAttachment(ctx, &confluentcloud.LookupPrivateLinkAttachmentArgs{
//				Id: "platt-abcde",
//				Environment: confluentcloud.GetPrivateLinkAttachmentEnvironment{
//					Id: "env-1234",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("platt", main)
//			return nil
//		})
//	}
//
// ```
func LookupPrivateLinkAttachment(ctx *pulumi.Context, args *LookupPrivateLinkAttachmentArgs, opts ...pulumi.InvokeOption) (*LookupPrivateLinkAttachmentResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivateLinkAttachmentResult
	err := ctx.Invoke("confluentcloud:index/getPrivateLinkAttachment:getPrivateLinkAttachment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivateLinkAttachment.
type LookupPrivateLinkAttachmentArgs struct {
	Environment GetPrivateLinkAttachmentEnvironment `pulumi:"environment"`
	// The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getPrivateLinkAttachment.
type LookupPrivateLinkAttachmentResult struct {
	// (Optional Configuration Block) supports the following:
	Aws    []GetPrivateLinkAttachmentAw    `pulumi:"aws"`
	Azures []GetPrivateLinkAttachmentAzure `pulumi:"azures"`
	// (Optional String) The cloud service provider that hosts the resources to access with the Private Link Attachment.
	Cloud string `pulumi:"cloud"`
	// (Optional String) The name of the Private Link Attachment.
	DisplayName string `pulumi:"displayName"`
	// (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.
	DnsDomain   string                              `pulumi:"dnsDomain"`
	Environment GetPrivateLinkAttachmentEnvironment `pulumi:"environment"`
	Gcps        []GetPrivateLinkAttachmentGcp       `pulumi:"gcps"`
	Id          string                              `pulumi:"id"`
	// (Optional String) The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
	Region string `pulumi:"region"`
	// (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
	ResourceName string `pulumi:"resourceName"`
}

func LookupPrivateLinkAttachmentOutput(ctx *pulumi.Context, args LookupPrivateLinkAttachmentOutputArgs, opts ...pulumi.InvokeOption) LookupPrivateLinkAttachmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivateLinkAttachmentResult, error) {
			args := v.(LookupPrivateLinkAttachmentArgs)
			r, err := LookupPrivateLinkAttachment(ctx, &args, opts...)
			var s LookupPrivateLinkAttachmentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivateLinkAttachmentResultOutput)
}

// A collection of arguments for invoking getPrivateLinkAttachment.
type LookupPrivateLinkAttachmentOutputArgs struct {
	Environment GetPrivateLinkAttachmentEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the Private Link Attachment belongs to, for example `env-xyz456`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupPrivateLinkAttachmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkAttachmentArgs)(nil)).Elem()
}

// A collection of values returned by getPrivateLinkAttachment.
type LookupPrivateLinkAttachmentResultOutput struct{ *pulumi.OutputState }

func (LookupPrivateLinkAttachmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkAttachmentResult)(nil)).Elem()
}

func (o LookupPrivateLinkAttachmentResultOutput) ToLookupPrivateLinkAttachmentResultOutput() LookupPrivateLinkAttachmentResultOutput {
	return o
}

func (o LookupPrivateLinkAttachmentResultOutput) ToLookupPrivateLinkAttachmentResultOutputWithContext(ctx context.Context) LookupPrivateLinkAttachmentResultOutput {
	return o
}

func (o LookupPrivateLinkAttachmentResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupPrivateLinkAttachmentResult] {
	return pulumix.Output[LookupPrivateLinkAttachmentResult]{
		OutputState: o.OutputState,
	}
}

// (Optional Configuration Block) supports the following:
func (o LookupPrivateLinkAttachmentResultOutput) Aws() GetPrivateLinkAttachmentAwArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) []GetPrivateLinkAttachmentAw { return v.Aws }).(GetPrivateLinkAttachmentAwArrayOutput)
}

func (o LookupPrivateLinkAttachmentResultOutput) Azures() GetPrivateLinkAttachmentAzureArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) []GetPrivateLinkAttachmentAzure { return v.Azures }).(GetPrivateLinkAttachmentAzureArrayOutput)
}

// (Optional String) The cloud service provider that hosts the resources to access with the Private Link Attachment.
func (o LookupPrivateLinkAttachmentResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Optional String) The name of the Private Link Attachment.
func (o LookupPrivateLinkAttachmentResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required String) The root DNS domain for the Private Link Attachment, for example, `pr123a.us-east-2.aws.confluent.
func (o LookupPrivateLinkAttachmentResultOutput) DnsDomain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) string { return v.DnsDomain }).(pulumi.StringOutput)
}

func (o LookupPrivateLinkAttachmentResultOutput) Environment() GetPrivateLinkAttachmentEnvironmentOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) GetPrivateLinkAttachmentEnvironment { return v.Environment }).(GetPrivateLinkAttachmentEnvironmentOutput)
}

func (o LookupPrivateLinkAttachmentResultOutput) Gcps() GetPrivateLinkAttachmentGcpArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) []GetPrivateLinkAttachmentGcp { return v.Gcps }).(GetPrivateLinkAttachmentGcpArrayOutput)
}

func (o LookupPrivateLinkAttachmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Optional String) The cloud service provider region where the resources to be accessed using the Private Link Attachment are located.
func (o LookupPrivateLinkAttachmentResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Private Link Attachment, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0`.
func (o LookupPrivateLinkAttachmentResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivateLinkAttachmentResultOutput{})
}
