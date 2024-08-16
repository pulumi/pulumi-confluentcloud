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
// `IdentityProvider` describes an Identity Provider data source.
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
//			exampleUsingId, err := confluentcloud.LookupIdentityProvider(ctx, &confluentcloud.LookupIdentityProviderArgs{
//				Id: pulumi.StringRef("op-abc123"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingId)
//			exampleUsingName, err := confluentcloud.LookupIdentityProvider(ctx, &confluentcloud.LookupIdentityProviderArgs{
//				DisplayName: pulumi.StringRef("My OIDC Provider: Azure AD"),
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
func LookupIdentityProvider(ctx *pulumi.Context, args *LookupIdentityProviderArgs, opts ...pulumi.InvokeOption) (*LookupIdentityProviderResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIdentityProviderResult
	err := ctx.Invoke("confluentcloud:index/getIdentityProvider:getIdentityProvider", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIdentityProvider.
type LookupIdentityProviderArgs struct {
	// A human-readable name for the Identity Provider.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	DisplayName *string `pulumi:"displayName"`
	// The ID of the Identity Provider, for example, `op-abc123`.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getIdentityProvider.
type LookupIdentityProviderResult struct {
	// (Required String) A description for the Identity Provider.
	Description string `pulumi:"description"`
	// (Required String) A human-readable name for the Identity Provider.
	DisplayName string `pulumi:"displayName"`
	// (Required String) The ID of the Identity Provider, for example, `op-abc123`.
	Id string `pulumi:"id"`
	// (Required String) A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
	Issuer string `pulumi:"issuer"`
	// (Required String) A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
	JwksUri string `pulumi:"jwksUri"`
}

func LookupIdentityProviderOutput(ctx *pulumi.Context, args LookupIdentityProviderOutputArgs, opts ...pulumi.InvokeOption) LookupIdentityProviderResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupIdentityProviderResult, error) {
			args := v.(LookupIdentityProviderArgs)
			r, err := LookupIdentityProvider(ctx, &args, opts...)
			var s LookupIdentityProviderResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupIdentityProviderResultOutput)
}

// A collection of arguments for invoking getIdentityProvider.
type LookupIdentityProviderOutputArgs struct {
	// A human-readable name for the Identity Provider.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// The ID of the Identity Provider, for example, `op-abc123`.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupIdentityProviderOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIdentityProviderArgs)(nil)).Elem()
}

// A collection of values returned by getIdentityProvider.
type LookupIdentityProviderResultOutput struct{ *pulumi.OutputState }

func (LookupIdentityProviderResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIdentityProviderResult)(nil)).Elem()
}

func (o LookupIdentityProviderResultOutput) ToLookupIdentityProviderResultOutput() LookupIdentityProviderResultOutput {
	return o
}

func (o LookupIdentityProviderResultOutput) ToLookupIdentityProviderResultOutputWithContext(ctx context.Context) LookupIdentityProviderResultOutput {
	return o
}

// (Required String) A description for the Identity Provider.
func (o LookupIdentityProviderResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityProviderResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Required String) A human-readable name for the Identity Provider.
func (o LookupIdentityProviderResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityProviderResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required String) The ID of the Identity Provider, for example, `op-abc123`.
func (o LookupIdentityProviderResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityProviderResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
func (o LookupIdentityProviderResultOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityProviderResult) string { return v.Issuer }).(pulumi.StringOutput)
}

// (Required String) A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
func (o LookupIdentityProviderResultOutput) JwksUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIdentityProviderResult) string { return v.JwksUri }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIdentityProviderResultOutput{})
}
