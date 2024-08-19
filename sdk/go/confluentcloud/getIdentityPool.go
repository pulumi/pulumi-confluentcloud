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
// `IdentityPool` describes an Identity Pool data source.
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
//			exampleUsingId, err := confluentcloud.LookupIdentityPool(ctx, &confluentcloud.LookupIdentityPoolArgs{
//				Id: pulumi.StringRef("pool-xyz456"),
//				IdentityProvider: confluentcloud.GetIdentityPoolIdentityProvider{
//					Id: "op-abc123",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingId)
//			exampleUsingName, err := confluentcloud.LookupIdentityPool(ctx, &confluentcloud.LookupIdentityPoolArgs{
//				DisplayName: pulumi.StringRef("My Identity Pool"),
//				IdentityProvider: confluentcloud.GetIdentityPoolIdentityProvider{
//					Id: "op-abc123",
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
func LookupIdentityPool(ctx *pulumi.Context, args *LookupIdentityPoolArgs, opts ...pulumi.InvokeOption) (*LookupIdentityPoolResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIdentityPoolResult
	err := ctx.Invoke("confluentcloud:index/getIdentityPool:getIdentityPool", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIdentityPool.
type LookupIdentityPoolArgs struct {
	// A human-readable name for the Identity Pool.
	DisplayName *string `pulumi:"displayName"`
	// The ID of the Identity Pool, for example, `pool-xyz456`.
	Id *string `pulumi:"id"`
	// (Required Configuration Block) supports the following:
	IdentityProvider GetIdentityPoolIdentityProvider `pulumi:"identityProvider"`
}

// A collection of values returned by getIdentityPool.
type LookupIdentityPoolResult struct {
	// (Required String) A description for the Identity Pool.
	Description string `pulumi:"description"`
	// (Required String) A human-readable name for the Identity Pool.
	DisplayName string `pulumi:"displayName"`
	// (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
	Filter string `pulumi:"filter"`
	// (Required String) The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
	Id string `pulumi:"id"`
	// (Required String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
	IdentityClaim string `pulumi:"identityClaim"`
	// (Required Configuration Block) supports the following:
	IdentityProvider GetIdentityPoolIdentityProvider `pulumi:"identityProvider"`
}

func LookupIdentityPoolOutput(ctx *pulumi.Context, args LookupIdentityPoolOutputArgs, opts ...pulumi.InvokeOption) LookupIdentityPoolResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupIdentityPoolResult, error) {
			args := v.(LookupIdentityPoolArgs)
			r, err := LookupIdentityPool(ctx, &args, opts...)
			var s LookupIdentityPoolResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupIdentityPoolResultOutput)
}

// A collection of arguments for invoking getIdentityPool.
type LookupIdentityPoolOutputArgs struct {
	// A human-readable name for the Identity Pool.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// The ID of the Identity Pool, for example, `pool-xyz456`.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// (Required Configuration Block) supports the following:
	IdentityProvider GetIdentityPoolIdentityProviderInput `pulumi:"identityProvider"`
}

func (LookupIdentityPoolOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIdentityPoolArgs)(nil)).Elem()
}

// A collection of values returned by getIdentityPool.
type LookupIdentityPoolResultOutput struct{ *pulumi.OutputState }

func (LookupIdentityPoolResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIdentityPoolResult)(nil)).Elem()
}

func (o LookupIdentityPoolResultOutput) ToLookupIdentityPoolResultOutput() LookupIdentityPoolResultOutput {
	return o
}

func (o LookupIdentityPoolResultOutput) ToLookupIdentityPoolResultOutputWithContext(ctx context.Context) LookupIdentityPoolResultOutput {
	return o
}

// (Required String) A description for the Identity Pool.
func (o LookupIdentityPoolResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityPoolResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Required String) A human-readable name for the Identity Pool.
func (o LookupIdentityPoolResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityPoolResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required String) A filter expression in [Supported Common Expression Language (CEL)](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#supported-common-expression-language-cel-filters) that specifies which identities can authenticate using your identity pool (see [Set identity pool filters](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/identity-pools.html#set-identity-pool-filters) for more details).
func (o LookupIdentityPoolResultOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityPoolResult) string { return v.Filter }).(pulumi.StringOutput)
}

// (Required String) The ID of the Identity Provider associated with the Identity Pool, for example, `op-abc123`.
func (o LookupIdentityPoolResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityPoolResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from (see [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1) for more details). This appears in the audit log records, showing, for example, that "identity Z used identity pool X to access topic A".
func (o LookupIdentityPoolResultOutput) IdentityClaim() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityPoolResult) string { return v.IdentityClaim }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupIdentityPoolResultOutput) IdentityProvider() GetIdentityPoolIdentityProviderOutput {
	return o.ApplyT(func(v LookupIdentityPoolResult) GetIdentityPoolIdentityProvider { return v.IdentityProvider }).(GetIdentityPoolIdentityProviderOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIdentityPoolResultOutput{})
}
