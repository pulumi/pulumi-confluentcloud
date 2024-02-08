// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// You can import a Tag Binding by using the Schema Registry cluster ID, Tag name, entity name and entity type in the format `<Schema Registry Cluster Id>/<Tag Name>/<Entity Name>/<Entity Type>`, for example:
//
//	$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
//
//	$ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
//
//	$ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
// $ pulumi import confluentcloud:index/tagBinding:TagBinding main lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type TagBinding struct {
	pulumi.CustomResourceState

	// The Cluster API Credentials.
	Credentials TagBindingCredentialsPtrOutput `pulumi:"credentials"`
	// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
	EntityName pulumi.StringOutput `pulumi:"entityName"`
	// The entity type.
	EntityType pulumi.StringOutput `pulumi:"entityType"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrOutput                   `pulumi:"restEndpoint"`
	SchemaRegistryCluster TagBindingSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
	// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	TagName pulumi.StringOutput `pulumi:"tagName"`
}

// NewTagBinding registers a new resource with the given unique name, arguments, and options.
func NewTagBinding(ctx *pulumi.Context,
	name string, args *TagBindingArgs, opts ...pulumi.ResourceOption) (*TagBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EntityName == nil {
		return nil, errors.New("invalid value for required argument 'EntityName'")
	}
	if args.EntityType == nil {
		return nil, errors.New("invalid value for required argument 'EntityType'")
	}
	if args.TagName == nil {
		return nil, errors.New("invalid value for required argument 'TagName'")
	}
	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(TagBindingCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TagBinding
	err := ctx.RegisterResource("confluentcloud:index/tagBinding:TagBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTagBinding gets an existing TagBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTagBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagBindingState, opts ...pulumi.ResourceOption) (*TagBinding, error) {
	var resource TagBinding
	err := ctx.ReadResource("confluentcloud:index/tagBinding:TagBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TagBinding resources.
type tagBindingState struct {
	// The Cluster API Credentials.
	Credentials *TagBindingCredentials `pulumi:"credentials"`
	// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
	EntityName *string `pulumi:"entityName"`
	// The entity type.
	EntityType *string `pulumi:"entityType"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster *TagBindingSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	TagName *string `pulumi:"tagName"`
}

type TagBindingState struct {
	// The Cluster API Credentials.
	Credentials TagBindingCredentialsPtrInput
	// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
	EntityName pulumi.StringPtrInput
	// The entity type.
	EntityType pulumi.StringPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster TagBindingSchemaRegistryClusterPtrInput
	// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	TagName pulumi.StringPtrInput
}

func (TagBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagBindingState)(nil)).Elem()
}

type tagBindingArgs struct {
	// The Cluster API Credentials.
	Credentials *TagBindingCredentials `pulumi:"credentials"`
	// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
	EntityName string `pulumi:"entityName"`
	// The entity type.
	EntityType string `pulumi:"entityType"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster *TagBindingSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	TagName string `pulumi:"tagName"`
}

// The set of arguments for constructing a TagBinding resource.
type TagBindingArgs struct {
	// The Cluster API Credentials.
	Credentials TagBindingCredentialsPtrInput
	// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
	EntityName pulumi.StringInput
	// The entity type.
	EntityType pulumi.StringInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster TagBindingSchemaRegistryClusterPtrInput
	// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	TagName pulumi.StringInput
}

func (TagBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagBindingArgs)(nil)).Elem()
}

type TagBindingInput interface {
	pulumi.Input

	ToTagBindingOutput() TagBindingOutput
	ToTagBindingOutputWithContext(ctx context.Context) TagBindingOutput
}

func (*TagBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**TagBinding)(nil)).Elem()
}

func (i *TagBinding) ToTagBindingOutput() TagBindingOutput {
	return i.ToTagBindingOutputWithContext(context.Background())
}

func (i *TagBinding) ToTagBindingOutputWithContext(ctx context.Context) TagBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagBindingOutput)
}

// TagBindingArrayInput is an input type that accepts TagBindingArray and TagBindingArrayOutput values.
// You can construct a concrete instance of `TagBindingArrayInput` via:
//
//	TagBindingArray{ TagBindingArgs{...} }
type TagBindingArrayInput interface {
	pulumi.Input

	ToTagBindingArrayOutput() TagBindingArrayOutput
	ToTagBindingArrayOutputWithContext(context.Context) TagBindingArrayOutput
}

type TagBindingArray []TagBindingInput

func (TagBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagBinding)(nil)).Elem()
}

func (i TagBindingArray) ToTagBindingArrayOutput() TagBindingArrayOutput {
	return i.ToTagBindingArrayOutputWithContext(context.Background())
}

func (i TagBindingArray) ToTagBindingArrayOutputWithContext(ctx context.Context) TagBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagBindingArrayOutput)
}

// TagBindingMapInput is an input type that accepts TagBindingMap and TagBindingMapOutput values.
// You can construct a concrete instance of `TagBindingMapInput` via:
//
//	TagBindingMap{ "key": TagBindingArgs{...} }
type TagBindingMapInput interface {
	pulumi.Input

	ToTagBindingMapOutput() TagBindingMapOutput
	ToTagBindingMapOutputWithContext(context.Context) TagBindingMapOutput
}

type TagBindingMap map[string]TagBindingInput

func (TagBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagBinding)(nil)).Elem()
}

func (i TagBindingMap) ToTagBindingMapOutput() TagBindingMapOutput {
	return i.ToTagBindingMapOutputWithContext(context.Background())
}

func (i TagBindingMap) ToTagBindingMapOutputWithContext(ctx context.Context) TagBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagBindingMapOutput)
}

type TagBindingOutput struct{ *pulumi.OutputState }

func (TagBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TagBinding)(nil)).Elem()
}

func (o TagBindingOutput) ToTagBindingOutput() TagBindingOutput {
	return o
}

func (o TagBindingOutput) ToTagBindingOutputWithContext(ctx context.Context) TagBindingOutput {
	return o
}

// The Cluster API Credentials.
func (o TagBindingOutput) Credentials() TagBindingCredentialsPtrOutput {
	return o.ApplyT(func(v *TagBinding) TagBindingCredentialsPtrOutput { return v.Credentials }).(TagBindingCredentialsPtrOutput)
}

// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
func (o TagBindingOutput) EntityName() pulumi.StringOutput {
	return o.ApplyT(func(v *TagBinding) pulumi.StringOutput { return v.EntityName }).(pulumi.StringOutput)
}

// The entity type.
func (o TagBindingOutput) EntityType() pulumi.StringOutput {
	return o.ApplyT(func(v *TagBinding) pulumi.StringOutput { return v.EntityType }).(pulumi.StringOutput)
}

// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o TagBindingOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TagBinding) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o TagBindingOutput) SchemaRegistryCluster() TagBindingSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *TagBinding) TagBindingSchemaRegistryClusterPtrOutput { return v.SchemaRegistryCluster }).(TagBindingSchemaRegistryClusterPtrOutput)
}

// The name of the tag to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
func (o TagBindingOutput) TagName() pulumi.StringOutput {
	return o.ApplyT(func(v *TagBinding) pulumi.StringOutput { return v.TagName }).(pulumi.StringOutput)
}

type TagBindingArrayOutput struct{ *pulumi.OutputState }

func (TagBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TagBinding)(nil)).Elem()
}

func (o TagBindingArrayOutput) ToTagBindingArrayOutput() TagBindingArrayOutput {
	return o
}

func (o TagBindingArrayOutput) ToTagBindingArrayOutputWithContext(ctx context.Context) TagBindingArrayOutput {
	return o
}

func (o TagBindingArrayOutput) Index(i pulumi.IntInput) TagBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TagBinding {
		return vs[0].([]*TagBinding)[vs[1].(int)]
	}).(TagBindingOutput)
}

type TagBindingMapOutput struct{ *pulumi.OutputState }

func (TagBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TagBinding)(nil)).Elem()
}

func (o TagBindingMapOutput) ToTagBindingMapOutput() TagBindingMapOutput {
	return o
}

func (o TagBindingMapOutput) ToTagBindingMapOutputWithContext(ctx context.Context) TagBindingMapOutput {
	return o
}

func (o TagBindingMapOutput) MapIndex(k pulumi.StringInput) TagBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TagBinding {
		return vs[0].(map[string]*TagBinding)[vs[1].(string)]
	}).(TagBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagBindingInput)(nil)).Elem(), &TagBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagBindingArrayInput)(nil)).Elem(), TagBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagBindingMapInput)(nil)).Elem(), TagBindingMap{})
	pulumi.RegisterOutputType(TagBindingOutput{})
	pulumi.RegisterOutputType(TagBindingArrayOutput{})
	pulumi.RegisterOutputType(TagBindingMapOutput{})
}
