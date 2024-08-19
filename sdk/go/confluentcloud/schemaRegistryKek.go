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

// ## Import
//
// You can import a Schema Registry Key by using the Schema Registry cluster ID, Kek name in the format `<Schema Registry cluster ID>/<Kek name>`, for example:
//
// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
//
// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
//
// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
// $ pulumi import confluentcloud:index/schemaRegistryKek:SchemaRegistryKek aws_key lsrc-8wrx70/aws_key
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type SchemaRegistryKek struct {
	pulumi.CustomResourceState

	// The Cluster API Credentials.
	Credentials SchemaRegistryKekCredentialsPtrOutput `pulumi:"credentials"`
	// The optional description for the KEK.
	Doc pulumi.StringOutput `pulumi:"doc"`
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrOutput `pulumi:"hardDelete"`
	// The ID of the key from KMS.
	// - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
	// - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
	// - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
	KmsKeyId pulumi.StringOutput `pulumi:"kmsKeyId"`
	// The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
	KmsType pulumi.StringOutput `pulumi:"kmsType"`
	// The name for the KEK.
	Name pulumi.StringOutput `pulumi:"name"`
	// The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
	Properties pulumi.StringMapOutput `pulumi:"properties"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrOutput                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster SchemaRegistryKekSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
	// The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
	Shared pulumi.BoolPtrOutput `pulumi:"shared"`
}

// NewSchemaRegistryKek registers a new resource with the given unique name, arguments, and options.
func NewSchemaRegistryKek(ctx *pulumi.Context,
	name string, args *SchemaRegistryKekArgs, opts ...pulumi.ResourceOption) (*SchemaRegistryKek, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KmsKeyId == nil {
		return nil, errors.New("invalid value for required argument 'KmsKeyId'")
	}
	if args.KmsType == nil {
		return nil, errors.New("invalid value for required argument 'KmsType'")
	}
	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(SchemaRegistryKekCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SchemaRegistryKek
	err := ctx.RegisterResource("confluentcloud:index/schemaRegistryKek:SchemaRegistryKek", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchemaRegistryKek gets an existing SchemaRegistryKek resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchemaRegistryKek(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaRegistryKekState, opts ...pulumi.ResourceOption) (*SchemaRegistryKek, error) {
	var resource SchemaRegistryKek
	err := ctx.ReadResource("confluentcloud:index/schemaRegistryKek:SchemaRegistryKek", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchemaRegistryKek resources.
type schemaRegistryKekState struct {
	// The Cluster API Credentials.
	Credentials *SchemaRegistryKekCredentials `pulumi:"credentials"`
	// The optional description for the KEK.
	Doc *string `pulumi:"doc"`
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete *bool `pulumi:"hardDelete"`
	// The ID of the key from KMS.
	// - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
	// - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
	// - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
	KmsType *string `pulumi:"kmsType"`
	// The name for the KEK.
	Name *string `pulumi:"name"`
	// The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
	Properties map[string]string `pulumi:"properties"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                 `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryKekSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
	Shared *bool `pulumi:"shared"`
}

type SchemaRegistryKekState struct {
	// The Cluster API Credentials.
	Credentials SchemaRegistryKekCredentialsPtrInput
	// The optional description for the KEK.
	Doc pulumi.StringPtrInput
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrInput
	// The ID of the key from KMS.
	// - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
	// - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
	// - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
	KmsKeyId pulumi.StringPtrInput
	// The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
	KmsType pulumi.StringPtrInput
	// The name for the KEK.
	Name pulumi.StringPtrInput
	// The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
	Properties pulumi.StringMapInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryKekSchemaRegistryClusterPtrInput
	// The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
	Shared pulumi.BoolPtrInput
}

func (SchemaRegistryKekState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaRegistryKekState)(nil)).Elem()
}

type schemaRegistryKekArgs struct {
	// The Cluster API Credentials.
	Credentials *SchemaRegistryKekCredentials `pulumi:"credentials"`
	// The optional description for the KEK.
	Doc *string `pulumi:"doc"`
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete *bool `pulumi:"hardDelete"`
	// The ID of the key from KMS.
	// - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
	// - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
	// - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
	KmsKeyId string `pulumi:"kmsKeyId"`
	// The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
	KmsType string `pulumi:"kmsType"`
	// The name for the KEK.
	Name *string `pulumi:"name"`
	// The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
	Properties map[string]string `pulumi:"properties"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                 `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryKekSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
	Shared *bool `pulumi:"shared"`
}

// The set of arguments for constructing a SchemaRegistryKek resource.
type SchemaRegistryKekArgs struct {
	// The Cluster API Credentials.
	Credentials SchemaRegistryKekCredentialsPtrInput
	// The optional description for the KEK.
	Doc pulumi.StringPtrInput
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrInput
	// The ID of the key from KMS.
	// - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
	// - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
	// - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
	KmsKeyId pulumi.StringInput
	// The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
	KmsType pulumi.StringInput
	// The name for the KEK.
	Name pulumi.StringPtrInput
	// The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
	Properties pulumi.StringMapInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryKekSchemaRegistryClusterPtrInput
	// The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
	Shared pulumi.BoolPtrInput
}

func (SchemaRegistryKekArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaRegistryKekArgs)(nil)).Elem()
}

type SchemaRegistryKekInput interface {
	pulumi.Input

	ToSchemaRegistryKekOutput() SchemaRegistryKekOutput
	ToSchemaRegistryKekOutputWithContext(ctx context.Context) SchemaRegistryKekOutput
}

func (*SchemaRegistryKek) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaRegistryKek)(nil)).Elem()
}

func (i *SchemaRegistryKek) ToSchemaRegistryKekOutput() SchemaRegistryKekOutput {
	return i.ToSchemaRegistryKekOutputWithContext(context.Background())
}

func (i *SchemaRegistryKek) ToSchemaRegistryKekOutputWithContext(ctx context.Context) SchemaRegistryKekOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryKekOutput)
}

// SchemaRegistryKekArrayInput is an input type that accepts SchemaRegistryKekArray and SchemaRegistryKekArrayOutput values.
// You can construct a concrete instance of `SchemaRegistryKekArrayInput` via:
//
//	SchemaRegistryKekArray{ SchemaRegistryKekArgs{...} }
type SchemaRegistryKekArrayInput interface {
	pulumi.Input

	ToSchemaRegistryKekArrayOutput() SchemaRegistryKekArrayOutput
	ToSchemaRegistryKekArrayOutputWithContext(context.Context) SchemaRegistryKekArrayOutput
}

type SchemaRegistryKekArray []SchemaRegistryKekInput

func (SchemaRegistryKekArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaRegistryKek)(nil)).Elem()
}

func (i SchemaRegistryKekArray) ToSchemaRegistryKekArrayOutput() SchemaRegistryKekArrayOutput {
	return i.ToSchemaRegistryKekArrayOutputWithContext(context.Background())
}

func (i SchemaRegistryKekArray) ToSchemaRegistryKekArrayOutputWithContext(ctx context.Context) SchemaRegistryKekArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryKekArrayOutput)
}

// SchemaRegistryKekMapInput is an input type that accepts SchemaRegistryKekMap and SchemaRegistryKekMapOutput values.
// You can construct a concrete instance of `SchemaRegistryKekMapInput` via:
//
//	SchemaRegistryKekMap{ "key": SchemaRegistryKekArgs{...} }
type SchemaRegistryKekMapInput interface {
	pulumi.Input

	ToSchemaRegistryKekMapOutput() SchemaRegistryKekMapOutput
	ToSchemaRegistryKekMapOutputWithContext(context.Context) SchemaRegistryKekMapOutput
}

type SchemaRegistryKekMap map[string]SchemaRegistryKekInput

func (SchemaRegistryKekMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaRegistryKek)(nil)).Elem()
}

func (i SchemaRegistryKekMap) ToSchemaRegistryKekMapOutput() SchemaRegistryKekMapOutput {
	return i.ToSchemaRegistryKekMapOutputWithContext(context.Background())
}

func (i SchemaRegistryKekMap) ToSchemaRegistryKekMapOutputWithContext(ctx context.Context) SchemaRegistryKekMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryKekMapOutput)
}

type SchemaRegistryKekOutput struct{ *pulumi.OutputState }

func (SchemaRegistryKekOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaRegistryKek)(nil)).Elem()
}

func (o SchemaRegistryKekOutput) ToSchemaRegistryKekOutput() SchemaRegistryKekOutput {
	return o
}

func (o SchemaRegistryKekOutput) ToSchemaRegistryKekOutputWithContext(ctx context.Context) SchemaRegistryKekOutput {
	return o
}

// The Cluster API Credentials.
func (o SchemaRegistryKekOutput) Credentials() SchemaRegistryKekCredentialsPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) SchemaRegistryKekCredentialsPtrOutput { return v.Credentials }).(SchemaRegistryKekCredentialsPtrOutput)
}

// The optional description for the KEK.
func (o SchemaRegistryKekOutput) Doc() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.Doc }).(pulumi.StringOutput)
}

// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
// on destroy. Defaults to `false` (soft delete).
func (o SchemaRegistryKekOutput) HardDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.BoolPtrOutput { return v.HardDelete }).(pulumi.BoolPtrOutput)
}

// The ID of the key from KMS.
// - When using the AWS KMS, this is an ARN, for example, `arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789abc`.
// - When using the Azure Key Vault, this is a Key Identifier (URI), for example, `https://test-keyvault1.vault.azure.net/keys/test-key1/1234567890abcdef1234567890abcdef`.
// - When using the GCP KMS, this is a resource name, for example, `projects/test-project1/locations/us-central1/keyRings/test-keyRing1/cryptoKeys/test-key1`.
func (o SchemaRegistryKekOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.KmsKeyId }).(pulumi.StringOutput)
}

// The type of Key Management Service (KMS). The supported values include `aws-kms`, `azure-kms`, and `gcp-kms`. Additionally, custom KMS types are supported as well.
func (o SchemaRegistryKekOutput) KmsType() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.KmsType }).(pulumi.StringOutput)
}

// The name for the KEK.
func (o SchemaRegistryKekOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The custom properties to set (for example, `KeyUsage=ENCRYPT_DECRYPT`, `KeyState=Enabled`):
func (o SchemaRegistryKekOutput) Properties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringMapOutput { return v.Properties }).(pulumi.StringMapOutput)
}

// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o SchemaRegistryKekOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o SchemaRegistryKekOutput) SchemaRegistryCluster() SchemaRegistryKekSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) SchemaRegistryKekSchemaRegistryClusterPtrOutput {
		return v.SchemaRegistryCluster
	}).(SchemaRegistryKekSchemaRegistryClusterPtrOutput)
}

// The optional flag to control whether the DEK Registry has shared access to the KMS. Defaults to `false`.
func (o SchemaRegistryKekOutput) Shared() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.BoolPtrOutput { return v.Shared }).(pulumi.BoolPtrOutput)
}

type SchemaRegistryKekArrayOutput struct{ *pulumi.OutputState }

func (SchemaRegistryKekArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaRegistryKek)(nil)).Elem()
}

func (o SchemaRegistryKekArrayOutput) ToSchemaRegistryKekArrayOutput() SchemaRegistryKekArrayOutput {
	return o
}

func (o SchemaRegistryKekArrayOutput) ToSchemaRegistryKekArrayOutputWithContext(ctx context.Context) SchemaRegistryKekArrayOutput {
	return o
}

func (o SchemaRegistryKekArrayOutput) Index(i pulumi.IntInput) SchemaRegistryKekOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchemaRegistryKek {
		return vs[0].([]*SchemaRegistryKek)[vs[1].(int)]
	}).(SchemaRegistryKekOutput)
}

type SchemaRegistryKekMapOutput struct{ *pulumi.OutputState }

func (SchemaRegistryKekMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaRegistryKek)(nil)).Elem()
}

func (o SchemaRegistryKekMapOutput) ToSchemaRegistryKekMapOutput() SchemaRegistryKekMapOutput {
	return o
}

func (o SchemaRegistryKekMapOutput) ToSchemaRegistryKekMapOutputWithContext(ctx context.Context) SchemaRegistryKekMapOutput {
	return o
}

func (o SchemaRegistryKekMapOutput) MapIndex(k pulumi.StringInput) SchemaRegistryKekOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchemaRegistryKek {
		return vs[0].(map[string]*SchemaRegistryKek)[vs[1].(string)]
	}).(SchemaRegistryKekOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryKekInput)(nil)).Elem(), &SchemaRegistryKek{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryKekArrayInput)(nil)).Elem(), SchemaRegistryKekArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryKekMapInput)(nil)).Elem(), SchemaRegistryKekMap{})
	pulumi.RegisterOutputType(SchemaRegistryKekOutput{})
	pulumi.RegisterOutputType(SchemaRegistryKekArrayOutput{})
	pulumi.RegisterOutputType(SchemaRegistryKekMapOutput{})
}
