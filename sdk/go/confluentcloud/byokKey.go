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
// `ByokKey` provides a BYOK Key resource that enables creating, editing, and deleting BYOK Key on Confluent Cloud.
//
// ## Example Usage
//
// ### Example BYOK Key on Azure
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
//			_, err := confluentcloud.NewByokKey(ctx, "azure_key", &confluentcloud.ByokKeyArgs{
//				Azure: &confluentcloud.ByokKeyAzureArgs{
//					TenantId:      pulumi.String("11111111-1111-1111-1111-111111111111"),
//					KeyVaultId:    pulumi.String("/subscriptions/11111111-1111-1111-1111-111111111111/resourceGroups/test-vault/providers/Microsoft.KeyVault/vaults/test-vault"),
//					KeyIdentifier: pulumi.String("https://test-vault.vault.azure.net/keys/test-key"),
//				},
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
// ### Example BYOK Key on GCP
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
//			_, err := confluentcloud.NewByokKey(ctx, "gcp_key", &confluentcloud.ByokKeyArgs{
//				Gcp: &confluentcloud.ByokKeyGcpArgs{
//					KeyId: pulumi.String("projects/temp-gear-123456/locations/us-central1/keyRings/byok-test/cryptoKeys/byok-test"),
//				},
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
// ## Getting Started
//
// The following end-to-end examples might help to get started with `ByokKey` resource:
//   - dedicated-public-aws-byok-kafka-acls: An example of Encrypting Confluent Cloud Dedicated Kafka Clusters using Self-Managed Keys on AWS.
//   - dedicated-public-azure-byok-kafka-acls: An example of Encrypting Confluent Cloud Dedicated Kafka Clusters using Self-Managed Keys on Azure.
//
// See [Confluent Cloud Bring Your Own Key (BYOK) Management API](https://docs.confluent.io/cloud/current/clusters/byok/index.html) to learn more about Encrypting Confluent Cloud Kafka Clusters using Self-Managed Keys.
//
// ## Import
//
// You can import a BYOK Key by using BYOK Key ID. The following example shows how to import a BYOK Key:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/byokKey:ByokKey aws_key cck-abcde
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type ByokKey struct {
	pulumi.CustomResourceState

	// (Optional Configuration Block) supports the following:
	Aws ByokKeyAwsOutput `pulumi:"aws"`
	// (Optional Configuration Block) supports the following:
	Azure ByokKeyAzureOutput `pulumi:"azure"`
	// (Optional Configuration Block) supports the following:
	Gcp ByokKeyGcpOutput `pulumi:"gcp"`
}

// NewByokKey registers a new resource with the given unique name, arguments, and options.
func NewByokKey(ctx *pulumi.Context,
	name string, args *ByokKeyArgs, opts ...pulumi.ResourceOption) (*ByokKey, error) {
	if args == nil {
		args = &ByokKeyArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ByokKey
	err := ctx.RegisterResource("confluentcloud:index/byokKey:ByokKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetByokKey gets an existing ByokKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetByokKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ByokKeyState, opts ...pulumi.ResourceOption) (*ByokKey, error) {
	var resource ByokKey
	err := ctx.ReadResource("confluentcloud:index/byokKey:ByokKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ByokKey resources.
type byokKeyState struct {
	// (Optional Configuration Block) supports the following:
	Aws *ByokKeyAws `pulumi:"aws"`
	// (Optional Configuration Block) supports the following:
	Azure *ByokKeyAzure `pulumi:"azure"`
	// (Optional Configuration Block) supports the following:
	Gcp *ByokKeyGcp `pulumi:"gcp"`
}

type ByokKeyState struct {
	// (Optional Configuration Block) supports the following:
	Aws ByokKeyAwsPtrInput
	// (Optional Configuration Block) supports the following:
	Azure ByokKeyAzurePtrInput
	// (Optional Configuration Block) supports the following:
	Gcp ByokKeyGcpPtrInput
}

func (ByokKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*byokKeyState)(nil)).Elem()
}

type byokKeyArgs struct {
	// (Optional Configuration Block) supports the following:
	Aws *ByokKeyAws `pulumi:"aws"`
	// (Optional Configuration Block) supports the following:
	Azure *ByokKeyAzure `pulumi:"azure"`
	// (Optional Configuration Block) supports the following:
	Gcp *ByokKeyGcp `pulumi:"gcp"`
}

// The set of arguments for constructing a ByokKey resource.
type ByokKeyArgs struct {
	// (Optional Configuration Block) supports the following:
	Aws ByokKeyAwsPtrInput
	// (Optional Configuration Block) supports the following:
	Azure ByokKeyAzurePtrInput
	// (Optional Configuration Block) supports the following:
	Gcp ByokKeyGcpPtrInput
}

func (ByokKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*byokKeyArgs)(nil)).Elem()
}

type ByokKeyInput interface {
	pulumi.Input

	ToByokKeyOutput() ByokKeyOutput
	ToByokKeyOutputWithContext(ctx context.Context) ByokKeyOutput
}

func (*ByokKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ByokKey)(nil)).Elem()
}

func (i *ByokKey) ToByokKeyOutput() ByokKeyOutput {
	return i.ToByokKeyOutputWithContext(context.Background())
}

func (i *ByokKey) ToByokKeyOutputWithContext(ctx context.Context) ByokKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByokKeyOutput)
}

// ByokKeyArrayInput is an input type that accepts ByokKeyArray and ByokKeyArrayOutput values.
// You can construct a concrete instance of `ByokKeyArrayInput` via:
//
//	ByokKeyArray{ ByokKeyArgs{...} }
type ByokKeyArrayInput interface {
	pulumi.Input

	ToByokKeyArrayOutput() ByokKeyArrayOutput
	ToByokKeyArrayOutputWithContext(context.Context) ByokKeyArrayOutput
}

type ByokKeyArray []ByokKeyInput

func (ByokKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ByokKey)(nil)).Elem()
}

func (i ByokKeyArray) ToByokKeyArrayOutput() ByokKeyArrayOutput {
	return i.ToByokKeyArrayOutputWithContext(context.Background())
}

func (i ByokKeyArray) ToByokKeyArrayOutputWithContext(ctx context.Context) ByokKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByokKeyArrayOutput)
}

// ByokKeyMapInput is an input type that accepts ByokKeyMap and ByokKeyMapOutput values.
// You can construct a concrete instance of `ByokKeyMapInput` via:
//
//	ByokKeyMap{ "key": ByokKeyArgs{...} }
type ByokKeyMapInput interface {
	pulumi.Input

	ToByokKeyMapOutput() ByokKeyMapOutput
	ToByokKeyMapOutputWithContext(context.Context) ByokKeyMapOutput
}

type ByokKeyMap map[string]ByokKeyInput

func (ByokKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ByokKey)(nil)).Elem()
}

func (i ByokKeyMap) ToByokKeyMapOutput() ByokKeyMapOutput {
	return i.ToByokKeyMapOutputWithContext(context.Background())
}

func (i ByokKeyMap) ToByokKeyMapOutputWithContext(ctx context.Context) ByokKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ByokKeyMapOutput)
}

type ByokKeyOutput struct{ *pulumi.OutputState }

func (ByokKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ByokKey)(nil)).Elem()
}

func (o ByokKeyOutput) ToByokKeyOutput() ByokKeyOutput {
	return o
}

func (o ByokKeyOutput) ToByokKeyOutputWithContext(ctx context.Context) ByokKeyOutput {
	return o
}

// (Optional Configuration Block) supports the following:
func (o ByokKeyOutput) Aws() ByokKeyAwsOutput {
	return o.ApplyT(func(v *ByokKey) ByokKeyAwsOutput { return v.Aws }).(ByokKeyAwsOutput)
}

// (Optional Configuration Block) supports the following:
func (o ByokKeyOutput) Azure() ByokKeyAzureOutput {
	return o.ApplyT(func(v *ByokKey) ByokKeyAzureOutput { return v.Azure }).(ByokKeyAzureOutput)
}

// (Optional Configuration Block) supports the following:
func (o ByokKeyOutput) Gcp() ByokKeyGcpOutput {
	return o.ApplyT(func(v *ByokKey) ByokKeyGcpOutput { return v.Gcp }).(ByokKeyGcpOutput)
}

type ByokKeyArrayOutput struct{ *pulumi.OutputState }

func (ByokKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ByokKey)(nil)).Elem()
}

func (o ByokKeyArrayOutput) ToByokKeyArrayOutput() ByokKeyArrayOutput {
	return o
}

func (o ByokKeyArrayOutput) ToByokKeyArrayOutputWithContext(ctx context.Context) ByokKeyArrayOutput {
	return o
}

func (o ByokKeyArrayOutput) Index(i pulumi.IntInput) ByokKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ByokKey {
		return vs[0].([]*ByokKey)[vs[1].(int)]
	}).(ByokKeyOutput)
}

type ByokKeyMapOutput struct{ *pulumi.OutputState }

func (ByokKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ByokKey)(nil)).Elem()
}

func (o ByokKeyMapOutput) ToByokKeyMapOutput() ByokKeyMapOutput {
	return o
}

func (o ByokKeyMapOutput) ToByokKeyMapOutputWithContext(ctx context.Context) ByokKeyMapOutput {
	return o
}

func (o ByokKeyMapOutput) MapIndex(k pulumi.StringInput) ByokKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ByokKey {
		return vs[0].(map[string]*ByokKey)[vs[1].(string)]
	}).(ByokKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ByokKeyInput)(nil)).Elem(), &ByokKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ByokKeyArrayInput)(nil)).Elem(), ByokKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ByokKeyMapInput)(nil)).Elem(), ByokKeyMap{})
	pulumi.RegisterOutputType(ByokKeyOutput{})
	pulumi.RegisterOutputType(ByokKeyArrayOutput{})
	pulumi.RegisterOutputType(ByokKeyMapOutput{})
}
