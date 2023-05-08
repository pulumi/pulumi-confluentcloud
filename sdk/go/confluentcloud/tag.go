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
// You can import a Tag by using the Schema Registry cluster ID, Tag name in the format `<Schema Registry cluster ID>/<Tag name>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/tag:Tag pii lsrc-8wrx70/PII
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type Tag struct {
	pulumi.CustomResourceState

	// The Cluster API Credentials.
	Credentials TagCredentialsPtrOutput `pulumi:"credentials"`
	// The description of the tag.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
	EntityTypes pulumi.StringArrayOutput `pulumi:"entityTypes"`
	// The name of the tag, for example, `PII`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrOutput            `pulumi:"restEndpoint"`
	SchemaRegistryCluster TagSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
	// (Optional Integer) The version, for example, `1`.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewTag registers a new resource with the given unique name, arguments, and options.
func NewTag(ctx *pulumi.Context,
	name string, args *TagArgs, opts ...pulumi.ResourceOption) (*Tag, error) {
	if args == nil {
		args = &TagArgs{}
	}

	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(TagCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	var resource Tag
	err := ctx.RegisterResource("confluentcloud:index/tag:Tag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTag gets an existing Tag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagState, opts ...pulumi.ResourceOption) (*Tag, error) {
	var resource Tag
	err := ctx.ReadResource("confluentcloud:index/tag:Tag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tag resources.
type tagState struct {
	// The Cluster API Credentials.
	Credentials *TagCredentials `pulumi:"credentials"`
	// The description of the tag.
	Description *string `pulumi:"description"`
	// (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
	EntityTypes []string `pulumi:"entityTypes"`
	// The name of the tag, for example, `PII`.
	Name *string `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                   `pulumi:"restEndpoint"`
	SchemaRegistryCluster *TagSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// (Optional Integer) The version, for example, `1`.
	Version *int `pulumi:"version"`
}

type TagState struct {
	// The Cluster API Credentials.
	Credentials TagCredentialsPtrInput
	// The description of the tag.
	Description pulumi.StringPtrInput
	// (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
	EntityTypes pulumi.StringArrayInput
	// The name of the tag, for example, `PII`.
	Name pulumi.StringPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster TagSchemaRegistryClusterPtrInput
	// (Optional Integer) The version, for example, `1`.
	Version pulumi.IntPtrInput
}

func (TagState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagState)(nil)).Elem()
}

type tagArgs struct {
	// The Cluster API Credentials.
	Credentials *TagCredentials `pulumi:"credentials"`
	// The description of the tag.
	Description *string `pulumi:"description"`
	// The name of the tag, for example, `PII`.
	Name *string `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                   `pulumi:"restEndpoint"`
	SchemaRegistryCluster *TagSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// The set of arguments for constructing a Tag resource.
type TagArgs struct {
	// The Cluster API Credentials.
	Credentials TagCredentialsPtrInput
	// The description of the tag.
	Description pulumi.StringPtrInput
	// The name of the tag, for example, `PII`.
	Name pulumi.StringPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster TagSchemaRegistryClusterPtrInput
}

func (TagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagArgs)(nil)).Elem()
}

type TagInput interface {
	pulumi.Input

	ToTagOutput() TagOutput
	ToTagOutputWithContext(ctx context.Context) TagOutput
}

func (*Tag) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (i *Tag) ToTagOutput() TagOutput {
	return i.ToTagOutputWithContext(context.Background())
}

func (i *Tag) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagOutput)
}

// TagArrayInput is an input type that accepts TagArray and TagArrayOutput values.
// You can construct a concrete instance of `TagArrayInput` via:
//
//	TagArray{ TagArgs{...} }
type TagArrayInput interface {
	pulumi.Input

	ToTagArrayOutput() TagArrayOutput
	ToTagArrayOutputWithContext(context.Context) TagArrayOutput
}

type TagArray []TagInput

func (TagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (i TagArray) ToTagArrayOutput() TagArrayOutput {
	return i.ToTagArrayOutputWithContext(context.Background())
}

func (i TagArray) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagArrayOutput)
}

// TagMapInput is an input type that accepts TagMap and TagMapOutput values.
// You can construct a concrete instance of `TagMapInput` via:
//
//	TagMap{ "key": TagArgs{...} }
type TagMapInput interface {
	pulumi.Input

	ToTagMapOutput() TagMapOutput
	ToTagMapOutputWithContext(context.Context) TagMapOutput
}

type TagMap map[string]TagInput

func (TagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (i TagMap) ToTagMapOutput() TagMapOutput {
	return i.ToTagMapOutputWithContext(context.Background())
}

func (i TagMap) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagMapOutput)
}

type TagOutput struct{ *pulumi.OutputState }

func (TagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (o TagOutput) ToTagOutput() TagOutput {
	return o
}

func (o TagOutput) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return o
}

// The Cluster API Credentials.
func (o TagOutput) Credentials() TagCredentialsPtrOutput {
	return o.ApplyT(func(v *Tag) TagCredentialsPtrOutput { return v.Credentials }).(TagCredentialsPtrOutput)
}

// The description of the tag.
func (o TagOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`. Refer to the [Entity types](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog-rest-apis.html#entity-types) to learn more about entity types.
func (o TagOutput) EntityTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringArrayOutput { return v.EntityTypes }).(pulumi.StringArrayOutput)
}

// The name of the tag, for example, `PII`.
func (o TagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o TagOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o TagOutput) SchemaRegistryCluster() TagSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *Tag) TagSchemaRegistryClusterPtrOutput { return v.SchemaRegistryCluster }).(TagSchemaRegistryClusterPtrOutput)
}

// (Optional Integer) The version, for example, `1`.
func (o TagOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *Tag) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type TagArrayOutput struct{ *pulumi.OutputState }

func (TagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (o TagArrayOutput) ToTagArrayOutput() TagArrayOutput {
	return o
}

func (o TagArrayOutput) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return o
}

func (o TagArrayOutput) Index(i pulumi.IntInput) TagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].([]*Tag)[vs[1].(int)]
	}).(TagOutput)
}

type TagMapOutput struct{ *pulumi.OutputState }

func (TagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (o TagMapOutput) ToTagMapOutput() TagMapOutput {
	return o
}

func (o TagMapOutput) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return o
}

func (o TagMapOutput) MapIndex(k pulumi.StringInput) TagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].(map[string]*Tag)[vs[1].(string)]
	}).(TagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagInput)(nil)).Elem(), &Tag{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagArrayInput)(nil)).Elem(), TagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagMapInput)(nil)).Elem(), TagMap{})
	pulumi.RegisterOutputType(TagOutput{})
	pulumi.RegisterOutputType(TagArrayOutput{})
	pulumi.RegisterOutputType(TagMapOutput{})
}
