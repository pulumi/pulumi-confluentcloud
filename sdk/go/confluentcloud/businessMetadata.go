// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// You can import a Business Metadata by using the Schema Registry cluster ID, Business Metadata name in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/businessMetadata:BusinessMetadata pii lsrc-8wrx70/PII
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type BusinessMetadata struct {
	pulumi.CustomResourceState

	// The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
	AttributeDefinitions BusinessMetadataAttributeDefinitionArrayOutput `pulumi:"attributeDefinitions"`
	// The Cluster API Credentials.
	Credentials BusinessMetadataCredentialsPtrOutput `pulumi:"credentials"`
	// The description of the Business Metadata.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the attribute.
	Name pulumi.StringOutput `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrOutput                         `pulumi:"restEndpoint"`
	SchemaRegistryCluster BusinessMetadataSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
	// (Required Integer) The version of the Business Metadata, for example, `1`.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewBusinessMetadata registers a new resource with the given unique name, arguments, and options.
func NewBusinessMetadata(ctx *pulumi.Context,
	name string, args *BusinessMetadataArgs, opts ...pulumi.ResourceOption) (*BusinessMetadata, error) {
	if args == nil {
		args = &BusinessMetadataArgs{}
	}

	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(BusinessMetadataCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	var resource BusinessMetadata
	err := ctx.RegisterResource("confluentcloud:index/businessMetadata:BusinessMetadata", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBusinessMetadata gets an existing BusinessMetadata resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBusinessMetadata(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BusinessMetadataState, opts ...pulumi.ResourceOption) (*BusinessMetadata, error) {
	var resource BusinessMetadata
	err := ctx.ReadResource("confluentcloud:index/businessMetadata:BusinessMetadata", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BusinessMetadata resources.
type businessMetadataState struct {
	// The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
	AttributeDefinitions []BusinessMetadataAttributeDefinition `pulumi:"attributeDefinitions"`
	// The Cluster API Credentials.
	Credentials *BusinessMetadataCredentials `pulumi:"credentials"`
	// The description of the Business Metadata.
	Description *string `pulumi:"description"`
	// The name of the attribute.
	Name *string `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                `pulumi:"restEndpoint"`
	SchemaRegistryCluster *BusinessMetadataSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// (Required Integer) The version of the Business Metadata, for example, `1`.
	Version *int `pulumi:"version"`
}

type BusinessMetadataState struct {
	// The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
	AttributeDefinitions BusinessMetadataAttributeDefinitionArrayInput
	// The Cluster API Credentials.
	Credentials BusinessMetadataCredentialsPtrInput
	// The description of the Business Metadata.
	Description pulumi.StringPtrInput
	// The name of the attribute.
	Name pulumi.StringPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster BusinessMetadataSchemaRegistryClusterPtrInput
	// (Required Integer) The version of the Business Metadata, for example, `1`.
	Version pulumi.IntPtrInput
}

func (BusinessMetadataState) ElementType() reflect.Type {
	return reflect.TypeOf((*businessMetadataState)(nil)).Elem()
}

type businessMetadataArgs struct {
	// The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
	AttributeDefinitions []BusinessMetadataAttributeDefinition `pulumi:"attributeDefinitions"`
	// The Cluster API Credentials.
	Credentials *BusinessMetadataCredentials `pulumi:"credentials"`
	// The description of the Business Metadata.
	Description *string `pulumi:"description"`
	// The name of the attribute.
	Name *string `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                `pulumi:"restEndpoint"`
	SchemaRegistryCluster *BusinessMetadataSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// The set of arguments for constructing a BusinessMetadata resource.
type BusinessMetadataArgs struct {
	// The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
	AttributeDefinitions BusinessMetadataAttributeDefinitionArrayInput
	// The Cluster API Credentials.
	Credentials BusinessMetadataCredentialsPtrInput
	// The description of the Business Metadata.
	Description pulumi.StringPtrInput
	// The name of the attribute.
	Name pulumi.StringPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster BusinessMetadataSchemaRegistryClusterPtrInput
}

func (BusinessMetadataArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*businessMetadataArgs)(nil)).Elem()
}

type BusinessMetadataInput interface {
	pulumi.Input

	ToBusinessMetadataOutput() BusinessMetadataOutput
	ToBusinessMetadataOutputWithContext(ctx context.Context) BusinessMetadataOutput
}

func (*BusinessMetadata) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessMetadata)(nil)).Elem()
}

func (i *BusinessMetadata) ToBusinessMetadataOutput() BusinessMetadataOutput {
	return i.ToBusinessMetadataOutputWithContext(context.Background())
}

func (i *BusinessMetadata) ToBusinessMetadataOutputWithContext(ctx context.Context) BusinessMetadataOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessMetadataOutput)
}

// BusinessMetadataArrayInput is an input type that accepts BusinessMetadataArray and BusinessMetadataArrayOutput values.
// You can construct a concrete instance of `BusinessMetadataArrayInput` via:
//
//	BusinessMetadataArray{ BusinessMetadataArgs{...} }
type BusinessMetadataArrayInput interface {
	pulumi.Input

	ToBusinessMetadataArrayOutput() BusinessMetadataArrayOutput
	ToBusinessMetadataArrayOutputWithContext(context.Context) BusinessMetadataArrayOutput
}

type BusinessMetadataArray []BusinessMetadataInput

func (BusinessMetadataArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessMetadata)(nil)).Elem()
}

func (i BusinessMetadataArray) ToBusinessMetadataArrayOutput() BusinessMetadataArrayOutput {
	return i.ToBusinessMetadataArrayOutputWithContext(context.Background())
}

func (i BusinessMetadataArray) ToBusinessMetadataArrayOutputWithContext(ctx context.Context) BusinessMetadataArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessMetadataArrayOutput)
}

// BusinessMetadataMapInput is an input type that accepts BusinessMetadataMap and BusinessMetadataMapOutput values.
// You can construct a concrete instance of `BusinessMetadataMapInput` via:
//
//	BusinessMetadataMap{ "key": BusinessMetadataArgs{...} }
type BusinessMetadataMapInput interface {
	pulumi.Input

	ToBusinessMetadataMapOutput() BusinessMetadataMapOutput
	ToBusinessMetadataMapOutputWithContext(context.Context) BusinessMetadataMapOutput
}

type BusinessMetadataMap map[string]BusinessMetadataInput

func (BusinessMetadataMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessMetadata)(nil)).Elem()
}

func (i BusinessMetadataMap) ToBusinessMetadataMapOutput() BusinessMetadataMapOutput {
	return i.ToBusinessMetadataMapOutputWithContext(context.Background())
}

func (i BusinessMetadataMap) ToBusinessMetadataMapOutputWithContext(ctx context.Context) BusinessMetadataMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BusinessMetadataMapOutput)
}

type BusinessMetadataOutput struct{ *pulumi.OutputState }

func (BusinessMetadataOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BusinessMetadata)(nil)).Elem()
}

func (o BusinessMetadataOutput) ToBusinessMetadataOutput() BusinessMetadataOutput {
	return o
}

func (o BusinessMetadataOutput) ToBusinessMetadataOutputWithContext(ctx context.Context) BusinessMetadataOutput {
	return o
}

// The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
func (o BusinessMetadataOutput) AttributeDefinitions() BusinessMetadataAttributeDefinitionArrayOutput {
	return o.ApplyT(func(v *BusinessMetadata) BusinessMetadataAttributeDefinitionArrayOutput {
		return v.AttributeDefinitions
	}).(BusinessMetadataAttributeDefinitionArrayOutput)
}

// The Cluster API Credentials.
func (o BusinessMetadataOutput) Credentials() BusinessMetadataCredentialsPtrOutput {
	return o.ApplyT(func(v *BusinessMetadata) BusinessMetadataCredentialsPtrOutput { return v.Credentials }).(BusinessMetadataCredentialsPtrOutput)
}

// The description of the Business Metadata.
func (o BusinessMetadataOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BusinessMetadata) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the attribute.
func (o BusinessMetadataOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *BusinessMetadata) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o BusinessMetadataOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BusinessMetadata) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o BusinessMetadataOutput) SchemaRegistryCluster() BusinessMetadataSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *BusinessMetadata) BusinessMetadataSchemaRegistryClusterPtrOutput {
		return v.SchemaRegistryCluster
	}).(BusinessMetadataSchemaRegistryClusterPtrOutput)
}

// (Required Integer) The version of the Business Metadata, for example, `1`.
func (o BusinessMetadataOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *BusinessMetadata) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type BusinessMetadataArrayOutput struct{ *pulumi.OutputState }

func (BusinessMetadataArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BusinessMetadata)(nil)).Elem()
}

func (o BusinessMetadataArrayOutput) ToBusinessMetadataArrayOutput() BusinessMetadataArrayOutput {
	return o
}

func (o BusinessMetadataArrayOutput) ToBusinessMetadataArrayOutputWithContext(ctx context.Context) BusinessMetadataArrayOutput {
	return o
}

func (o BusinessMetadataArrayOutput) Index(i pulumi.IntInput) BusinessMetadataOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BusinessMetadata {
		return vs[0].([]*BusinessMetadata)[vs[1].(int)]
	}).(BusinessMetadataOutput)
}

type BusinessMetadataMapOutput struct{ *pulumi.OutputState }

func (BusinessMetadataMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BusinessMetadata)(nil)).Elem()
}

func (o BusinessMetadataMapOutput) ToBusinessMetadataMapOutput() BusinessMetadataMapOutput {
	return o
}

func (o BusinessMetadataMapOutput) ToBusinessMetadataMapOutputWithContext(ctx context.Context) BusinessMetadataMapOutput {
	return o
}

func (o BusinessMetadataMapOutput) MapIndex(k pulumi.StringInput) BusinessMetadataOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BusinessMetadata {
		return vs[0].(map[string]*BusinessMetadata)[vs[1].(string)]
	}).(BusinessMetadataOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessMetadataInput)(nil)).Elem(), &BusinessMetadata{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessMetadataArrayInput)(nil)).Elem(), BusinessMetadataArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BusinessMetadataMapInput)(nil)).Elem(), BusinessMetadataMap{})
	pulumi.RegisterOutputType(BusinessMetadataOutput{})
	pulumi.RegisterOutputType(BusinessMetadataArrayOutput{})
	pulumi.RegisterOutputType(BusinessMetadataMapOutput{})
}
