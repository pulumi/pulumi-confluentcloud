// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `PrivateLinkAttachmentConnection` describes a Private Link Attachment Connection data source.
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
//			main, err := confluentcloud.LookupPrivateLinkAttachmentConnection(ctx, &confluentcloud.LookupPrivateLinkAttachmentConnectionArgs{
//				Id: "plattc-p5j3ov",
//				Environment: confluentcloud.GetPrivateLinkAttachmentConnectionEnvironment{
//					Id: "env-8gv0v5",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("plattc", main)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupPrivateLinkAttachmentConnection(ctx *pulumi.Context, args *LookupPrivateLinkAttachmentConnectionArgs, opts ...pulumi.InvokeOption) (*LookupPrivateLinkAttachmentConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPrivateLinkAttachmentConnectionResult
	err := ctx.Invoke("confluentcloud:index/getPrivateLinkAttachmentConnection:getPrivateLinkAttachmentConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivateLinkAttachmentConnection.
type LookupPrivateLinkAttachmentConnectionArgs struct {
	Environment GetPrivateLinkAttachmentConnectionEnvironment `pulumi:"environment"`
	// The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getPrivateLinkAttachmentConnection.
type LookupPrivateLinkAttachmentConnectionResult struct {
	// (Optional Configuration Block) supports the following:
	Aws    []GetPrivateLinkAttachmentConnectionAw    `pulumi:"aws"`
	Azures []GetPrivateLinkAttachmentConnectionAzure `pulumi:"azures"`
	// (Optional String) The name of the Private Link Attachment Connection.
	DisplayName string                                        `pulumi:"displayName"`
	Environment GetPrivateLinkAttachmentConnectionEnvironment `pulumi:"environment"`
	Gcps        []GetPrivateLinkAttachmentConnectionGcp       `pulumi:"gcps"`
	// (Required String) The unique identifier for the private link attachment.
	Id string `pulumi:"id"`
	// (Optional Configuration Block) supports the following:
	PrivateLinkAttachments []GetPrivateLinkAttachmentConnectionPrivateLinkAttachment `pulumi:"privateLinkAttachments"`
	// (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
	ResourceName string `pulumi:"resourceName"`
}

func LookupPrivateLinkAttachmentConnectionOutput(ctx *pulumi.Context, args LookupPrivateLinkAttachmentConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupPrivateLinkAttachmentConnectionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPrivateLinkAttachmentConnectionResult, error) {
			args := v.(LookupPrivateLinkAttachmentConnectionArgs)
			r, err := LookupPrivateLinkAttachmentConnection(ctx, &args, opts...)
			var s LookupPrivateLinkAttachmentConnectionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPrivateLinkAttachmentConnectionResultOutput)
}

// A collection of arguments for invoking getPrivateLinkAttachmentConnection.
type LookupPrivateLinkAttachmentConnectionOutputArgs struct {
	Environment GetPrivateLinkAttachmentConnectionEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the Private Link Attachment Connection belongs to, for example `env-xyz456`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupPrivateLinkAttachmentConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkAttachmentConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getPrivateLinkAttachmentConnection.
type LookupPrivateLinkAttachmentConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupPrivateLinkAttachmentConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPrivateLinkAttachmentConnectionResult)(nil)).Elem()
}

func (o LookupPrivateLinkAttachmentConnectionResultOutput) ToLookupPrivateLinkAttachmentConnectionResultOutput() LookupPrivateLinkAttachmentConnectionResultOutput {
	return o
}

func (o LookupPrivateLinkAttachmentConnectionResultOutput) ToLookupPrivateLinkAttachmentConnectionResultOutputWithContext(ctx context.Context) LookupPrivateLinkAttachmentConnectionResultOutput {
	return o
}

// (Optional Configuration Block) supports the following:
func (o LookupPrivateLinkAttachmentConnectionResultOutput) Aws() GetPrivateLinkAttachmentConnectionAwArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) []GetPrivateLinkAttachmentConnectionAw {
		return v.Aws
	}).(GetPrivateLinkAttachmentConnectionAwArrayOutput)
}

func (o LookupPrivateLinkAttachmentConnectionResultOutput) Azures() GetPrivateLinkAttachmentConnectionAzureArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) []GetPrivateLinkAttachmentConnectionAzure {
		return v.Azures
	}).(GetPrivateLinkAttachmentConnectionAzureArrayOutput)
}

// (Optional String) The name of the Private Link Attachment Connection.
func (o LookupPrivateLinkAttachmentConnectionResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupPrivateLinkAttachmentConnectionResultOutput) Environment() GetPrivateLinkAttachmentConnectionEnvironmentOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) GetPrivateLinkAttachmentConnectionEnvironment {
		return v.Environment
	}).(GetPrivateLinkAttachmentConnectionEnvironmentOutput)
}

func (o LookupPrivateLinkAttachmentConnectionResultOutput) Gcps() GetPrivateLinkAttachmentConnectionGcpArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) []GetPrivateLinkAttachmentConnectionGcp {
		return v.Gcps
	}).(GetPrivateLinkAttachmentConnectionGcpArrayOutput)
}

// (Required String) The unique identifier for the private link attachment.
func (o LookupPrivateLinkAttachmentConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Optional Configuration Block) supports the following:
func (o LookupPrivateLinkAttachmentConnectionResultOutput) PrivateLinkAttachments() GetPrivateLinkAttachmentConnectionPrivateLinkAttachmentArrayOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) []GetPrivateLinkAttachmentConnectionPrivateLinkAttachment {
		return v.PrivateLinkAttachments
	}).(GetPrivateLinkAttachmentConnectionPrivateLinkAttachmentArrayOutput)
}

// (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
func (o LookupPrivateLinkAttachmentConnectionResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPrivateLinkAttachmentConnectionResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPrivateLinkAttachmentConnectionResultOutput{})
}
