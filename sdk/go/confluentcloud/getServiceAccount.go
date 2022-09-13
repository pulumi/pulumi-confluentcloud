// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `ServiceAccount` describes a Service Account data source.
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
//			exampleUsingIdServiceAccount, err := confluentcloud.LookupServiceAccount(ctx, &GetServiceAccountArgs{
//				Id: pulumi.StringRef("sa-abc123"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingIdServiceAccount)
//			_, err = confluentcloud.LookupServiceAccount(ctx, &GetServiceAccountArgs{
//				DisplayName: pulumi.StringRef("test_sa"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewEnvironment(ctx, "test-env", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceAccount(ctx *pulumi.Context, args *LookupServiceAccountArgs, opts ...pulumi.InvokeOption) (*LookupServiceAccountResult, error) {
	var rv LookupServiceAccountResult
	err := ctx.Invoke("confluentcloud:index/getServiceAccount:getServiceAccount", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceAccount.
type LookupServiceAccountArgs struct {
	// A human-readable name for the Service Account.
	DisplayName *string `pulumi:"displayName"`
	// The ID of the Service Account (e.g., `sa-abc123`).
	Id *string `pulumi:"id"`
}

// A collection of values returned by getServiceAccount.
type LookupServiceAccountResult struct {
	// (Required String) An API Version of the schema version of the Service Account.
	ApiVersion string `pulumi:"apiVersion"`
	// (Required String) A free-form description of the Service Account.
	Description string `pulumi:"description"`
	// (Required String) A human-readable name for the Service Account.
	DisplayName string `pulumi:"displayName"`
	// (Required String) The ID of the Service Account (e.g., `sa-abc123`).
	Id string `pulumi:"id"`
	// (Required String) A kind of the Service Account.
	Kind string `pulumi:"kind"`
}

func LookupServiceAccountOutput(ctx *pulumi.Context, args LookupServiceAccountOutputArgs, opts ...pulumi.InvokeOption) LookupServiceAccountResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceAccountResult, error) {
			args := v.(LookupServiceAccountArgs)
			r, err := LookupServiceAccount(ctx, &args, opts...)
			var s LookupServiceAccountResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupServiceAccountResultOutput)
}

// A collection of arguments for invoking getServiceAccount.
type LookupServiceAccountOutputArgs struct {
	// A human-readable name for the Service Account.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// The ID of the Service Account (e.g., `sa-abc123`).
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupServiceAccountOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceAccountArgs)(nil)).Elem()
}

// A collection of values returned by getServiceAccount.
type LookupServiceAccountResultOutput struct{ *pulumi.OutputState }

func (LookupServiceAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceAccountResult)(nil)).Elem()
}

func (o LookupServiceAccountResultOutput) ToLookupServiceAccountResultOutput() LookupServiceAccountResultOutput {
	return o
}

func (o LookupServiceAccountResultOutput) ToLookupServiceAccountResultOutputWithContext(ctx context.Context) LookupServiceAccountResultOutput {
	return o
}

// (Required String) An API Version of the schema version of the Service Account.
func (o LookupServiceAccountResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// (Required String) A free-form description of the Service Account.
func (o LookupServiceAccountResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Required String) A human-readable name for the Service Account.
func (o LookupServiceAccountResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required String) The ID of the Service Account (e.g., `sa-abc123`).
func (o LookupServiceAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A kind of the Service Account.
func (o LookupServiceAccountResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceAccountResult) string { return v.Kind }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceAccountResultOutput{})
}
