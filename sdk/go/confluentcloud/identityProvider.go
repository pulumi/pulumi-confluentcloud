// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `IdentityProvider` provides an Identity Provider resource that enables creating, editing, and deleting identity providers on Confluent Cloud.
//
// ## Example Usage
//
// ### Example Identity Provider: Azure AD
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
//			_, err := confluentcloud.NewIdentityProvider(ctx, "azure", &confluentcloud.IdentityProviderArgs{
//				DisplayName: pulumi.String("My OIDC Provider: Azure AD"),
//				Description: pulumi.String("My description"),
//				Issuer:      pulumi.String("https://login.microsoftonline.com/{tenant_id}/v2.0"),
//				JwksUri:     pulumi.String("https://login.microsoftonline.com/common/discovery/v2.0/keys"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Example Identity Provider: Okta
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
//			_, err := confluentcloud.NewIdentityProvider(ctx, "okta", &confluentcloud.IdentityProviderArgs{
//				DisplayName: pulumi.String("My OIDC Provider: Okta"),
//				Description: pulumi.String("My description"),
//				Issuer:      pulumi.String("https://mycompany.okta.com/oauth2/default"),
//				JwksUri:     pulumi.String("https://mycompany.okta.com/oauth2/default/v1/keys"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## External Documentation
//
// * [Authenticating with OAuth](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/overview.html).
//
// ## Import
//
// You can import an Identity Provider by using Identity Provider ID, for example:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/identityProvider:IdentityProvider example op-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type IdentityProvider struct {
	pulumi.CustomResourceState

	// A description for the Identity Provider.
	Description pulumi.StringOutput `pulumi:"description"`
	// A human-readable name for the Identity Provider.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
	Issuer pulumi.StringOutput `pulumi:"issuer"`
	// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
	//
	// > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
	JwksUri pulumi.StringOutput `pulumi:"jwksUri"`
}

// NewIdentityProvider registers a new resource with the given unique name, arguments, and options.
func NewIdentityProvider(ctx *pulumi.Context,
	name string, args *IdentityProviderArgs, opts ...pulumi.ResourceOption) (*IdentityProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Issuer == nil {
		return nil, errors.New("invalid value for required argument 'Issuer'")
	}
	if args.JwksUri == nil {
		return nil, errors.New("invalid value for required argument 'JwksUri'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IdentityProvider
	err := ctx.RegisterResource("confluentcloud:index/identityProvider:IdentityProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIdentityProvider gets an existing IdentityProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdentityProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IdentityProviderState, opts ...pulumi.ResourceOption) (*IdentityProvider, error) {
	var resource IdentityProvider
	err := ctx.ReadResource("confluentcloud:index/identityProvider:IdentityProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IdentityProvider resources.
type identityProviderState struct {
	// A description for the Identity Provider.
	Description *string `pulumi:"description"`
	// A human-readable name for the Identity Provider.
	DisplayName *string `pulumi:"displayName"`
	// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
	Issuer *string `pulumi:"issuer"`
	// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
	//
	// > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
	JwksUri *string `pulumi:"jwksUri"`
}

type IdentityProviderState struct {
	// A description for the Identity Provider.
	Description pulumi.StringPtrInput
	// A human-readable name for the Identity Provider.
	DisplayName pulumi.StringPtrInput
	// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
	Issuer pulumi.StringPtrInput
	// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
	//
	// > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
	JwksUri pulumi.StringPtrInput
}

func (IdentityProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*identityProviderState)(nil)).Elem()
}

type identityProviderArgs struct {
	// A description for the Identity Provider.
	Description string `pulumi:"description"`
	// A human-readable name for the Identity Provider.
	DisplayName string `pulumi:"displayName"`
	// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
	Issuer string `pulumi:"issuer"`
	// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
	//
	// > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
	JwksUri string `pulumi:"jwksUri"`
}

// The set of arguments for constructing a IdentityProvider resource.
type IdentityProviderArgs struct {
	// A description for the Identity Provider.
	Description pulumi.StringInput
	// A human-readable name for the Identity Provider.
	DisplayName pulumi.StringInput
	// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
	Issuer pulumi.StringInput
	// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
	//
	// > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
	JwksUri pulumi.StringInput
}

func (IdentityProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*identityProviderArgs)(nil)).Elem()
}

type IdentityProviderInput interface {
	pulumi.Input

	ToIdentityProviderOutput() IdentityProviderOutput
	ToIdentityProviderOutputWithContext(ctx context.Context) IdentityProviderOutput
}

func (*IdentityProvider) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityProvider)(nil)).Elem()
}

func (i *IdentityProvider) ToIdentityProviderOutput() IdentityProviderOutput {
	return i.ToIdentityProviderOutputWithContext(context.Background())
}

func (i *IdentityProvider) ToIdentityProviderOutputWithContext(ctx context.Context) IdentityProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderOutput)
}

// IdentityProviderArrayInput is an input type that accepts IdentityProviderArray and IdentityProviderArrayOutput values.
// You can construct a concrete instance of `IdentityProviderArrayInput` via:
//
//	IdentityProviderArray{ IdentityProviderArgs{...} }
type IdentityProviderArrayInput interface {
	pulumi.Input

	ToIdentityProviderArrayOutput() IdentityProviderArrayOutput
	ToIdentityProviderArrayOutputWithContext(context.Context) IdentityProviderArrayOutput
}

type IdentityProviderArray []IdentityProviderInput

func (IdentityProviderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityProvider)(nil)).Elem()
}

func (i IdentityProviderArray) ToIdentityProviderArrayOutput() IdentityProviderArrayOutput {
	return i.ToIdentityProviderArrayOutputWithContext(context.Background())
}

func (i IdentityProviderArray) ToIdentityProviderArrayOutputWithContext(ctx context.Context) IdentityProviderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderArrayOutput)
}

// IdentityProviderMapInput is an input type that accepts IdentityProviderMap and IdentityProviderMapOutput values.
// You can construct a concrete instance of `IdentityProviderMapInput` via:
//
//	IdentityProviderMap{ "key": IdentityProviderArgs{...} }
type IdentityProviderMapInput interface {
	pulumi.Input

	ToIdentityProviderMapOutput() IdentityProviderMapOutput
	ToIdentityProviderMapOutputWithContext(context.Context) IdentityProviderMapOutput
}

type IdentityProviderMap map[string]IdentityProviderInput

func (IdentityProviderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityProvider)(nil)).Elem()
}

func (i IdentityProviderMap) ToIdentityProviderMapOutput() IdentityProviderMapOutput {
	return i.ToIdentityProviderMapOutputWithContext(context.Background())
}

func (i IdentityProviderMap) ToIdentityProviderMapOutputWithContext(ctx context.Context) IdentityProviderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdentityProviderMapOutput)
}

type IdentityProviderOutput struct{ *pulumi.OutputState }

func (IdentityProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IdentityProvider)(nil)).Elem()
}

func (o IdentityProviderOutput) ToIdentityProviderOutput() IdentityProviderOutput {
	return o
}

func (o IdentityProviderOutput) ToIdentityProviderOutputWithContext(ctx context.Context) IdentityProviderOutput {
	return o
}

// A description for the Identity Provider.
func (o IdentityProviderOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// A human-readable name for the Identity Provider.
func (o IdentityProviderOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
func (o IdentityProviderOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringOutput { return v.Issuer }).(pulumi.StringOutput)
}

// A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
//
// > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
func (o IdentityProviderOutput) JwksUri() pulumi.StringOutput {
	return o.ApplyT(func(v *IdentityProvider) pulumi.StringOutput { return v.JwksUri }).(pulumi.StringOutput)
}

type IdentityProviderArrayOutput struct{ *pulumi.OutputState }

func (IdentityProviderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IdentityProvider)(nil)).Elem()
}

func (o IdentityProviderArrayOutput) ToIdentityProviderArrayOutput() IdentityProviderArrayOutput {
	return o
}

func (o IdentityProviderArrayOutput) ToIdentityProviderArrayOutputWithContext(ctx context.Context) IdentityProviderArrayOutput {
	return o
}

func (o IdentityProviderArrayOutput) Index(i pulumi.IntInput) IdentityProviderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IdentityProvider {
		return vs[0].([]*IdentityProvider)[vs[1].(int)]
	}).(IdentityProviderOutput)
}

type IdentityProviderMapOutput struct{ *pulumi.OutputState }

func (IdentityProviderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IdentityProvider)(nil)).Elem()
}

func (o IdentityProviderMapOutput) ToIdentityProviderMapOutput() IdentityProviderMapOutput {
	return o
}

func (o IdentityProviderMapOutput) ToIdentityProviderMapOutputWithContext(ctx context.Context) IdentityProviderMapOutput {
	return o
}

func (o IdentityProviderMapOutput) MapIndex(k pulumi.StringInput) IdentityProviderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IdentityProvider {
		return vs[0].(map[string]*IdentityProvider)[vs[1].(string)]
	}).(IdentityProviderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityProviderInput)(nil)).Elem(), &IdentityProvider{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityProviderArrayInput)(nil)).Elem(), IdentityProviderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdentityProviderMapInput)(nil)).Elem(), IdentityProviderMap{})
	pulumi.RegisterOutputType(IdentityProviderOutput{})
	pulumi.RegisterOutputType(IdentityProviderArrayOutput{})
	pulumi.RegisterOutputType(IdentityProviderMapOutput{})
}
