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
// `ByokKey` describes a BYOK Key data source.
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
//			azureKey, err := confluentcloud.LookupByokKey(ctx, &confluentcloud.LookupByokKeyArgs{
//				Id: "cck-abcde",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("byok", azureKey)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupByokKey(ctx *pulumi.Context, args *LookupByokKeyArgs, opts ...pulumi.InvokeOption) (*LookupByokKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupByokKeyResult
	err := ctx.Invoke("confluentcloud:index/getByokKey:getByokKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getByokKey.
type LookupByokKeyArgs struct {
	// The ID of the BYOK key, for example, `cck-abcde`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getByokKey.
type LookupByokKeyResult struct {
	// (Optional Configuration Block) supports the following:
	Aws []GetByokKeyAw `pulumi:"aws"`
	// (Optional Configuration Block) supports the following:
	Azures []GetByokKeyAzure `pulumi:"azures"`
	// (Optional Configuration Block) supports the following:
	Gcps []GetByokKeyGcp `pulumi:"gcps"`
	// (Required String) The ID of the BYOK key, for example, `cck-abcde`.
	Id string `pulumi:"id"`
}

func LookupByokKeyOutput(ctx *pulumi.Context, args LookupByokKeyOutputArgs, opts ...pulumi.InvokeOption) LookupByokKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupByokKeyResult, error) {
			args := v.(LookupByokKeyArgs)
			r, err := LookupByokKey(ctx, &args, opts...)
			var s LookupByokKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupByokKeyResultOutput)
}

// A collection of arguments for invoking getByokKey.
type LookupByokKeyOutputArgs struct {
	// The ID of the BYOK key, for example, `cck-abcde`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupByokKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupByokKeyArgs)(nil)).Elem()
}

// A collection of values returned by getByokKey.
type LookupByokKeyResultOutput struct{ *pulumi.OutputState }

func (LookupByokKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupByokKeyResult)(nil)).Elem()
}

func (o LookupByokKeyResultOutput) ToLookupByokKeyResultOutput() LookupByokKeyResultOutput {
	return o
}

func (o LookupByokKeyResultOutput) ToLookupByokKeyResultOutputWithContext(ctx context.Context) LookupByokKeyResultOutput {
	return o
}

// (Optional Configuration Block) supports the following:
func (o LookupByokKeyResultOutput) Aws() GetByokKeyAwArrayOutput {
	return o.ApplyT(func(v LookupByokKeyResult) []GetByokKeyAw { return v.Aws }).(GetByokKeyAwArrayOutput)
}

// (Optional Configuration Block) supports the following:
func (o LookupByokKeyResultOutput) Azures() GetByokKeyAzureArrayOutput {
	return o.ApplyT(func(v LookupByokKeyResult) []GetByokKeyAzure { return v.Azures }).(GetByokKeyAzureArrayOutput)
}

// (Optional Configuration Block) supports the following:
func (o LookupByokKeyResultOutput) Gcps() GetByokKeyGcpArrayOutput {
	return o.ApplyT(func(v LookupByokKeyResult) []GetByokKeyGcp { return v.Gcps }).(GetByokKeyGcpArrayOutput)
}

// (Required String) The ID of the BYOK key, for example, `cck-abcde`.
func (o LookupByokKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupByokKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupByokKeyResultOutput{})
}
