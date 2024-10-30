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

// ## Example Usage
//
// ## Import
//
// You can import a Schema by using the Schema Registry cluster ID, Subject name, and unique identifier (or `latest` when `recreate_on_update = false`) of the Schema in the format `<Schema Registry cluster ID>/<Subject name>/<Schema identifier>`, for example:
//
// Option A: recreate_on_update = false (by default)
//
// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
//
// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
//
// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
// $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/latest
// ```
//
// Option B: recreate_on_update = true
//
// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
//
// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
//
// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
// $ pulumi import confluentcloud:index/schema:Schema my_schema_1 lsrc-abc123/test-subject/100003
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type Schema struct {
	pulumi.CustomResourceState

	// The Cluster API Credentials.
	Credentials SchemaCredentialsPtrOutput `pulumi:"credentials"`
	// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
	Format pulumi.StringOutput `pulumi:"format"`
	// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrOutput `pulumi:"hardDelete"`
	// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
	Metadata SchemaMetadataOutput `pulumi:"metadata"`
	// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
	RecreateOnUpdate pulumi.BoolPtrOutput `pulumi:"recreateOnUpdate"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrOutput `pulumi:"restEndpoint"`
	// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
	Ruleset SchemaRulesetOutput `pulumi:"ruleset"`
	// The schema string, for example, `file("./schema_version_1.avsc")`.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
	SchemaIdentifier pulumi.IntOutput `pulumi:"schemaIdentifier"`
	// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
	SchemaReferences      SchemaSchemaReferenceArrayOutput     `pulumi:"schemaReferences"`
	SchemaRegistryCluster SchemaSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
	// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
	SkipValidationDuringPlan pulumi.BoolPtrOutput `pulumi:"skipValidationDuringPlan"`
	// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
	SubjectName pulumi.StringOutput `pulumi:"subjectName"`
	// (Required Integer) The version of the Schema, for example, `4`.
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewSchema registers a new resource with the given unique name, arguments, and options.
func NewSchema(ctx *pulumi.Context,
	name string, args *SchemaArgs, opts ...pulumi.ResourceOption) (*Schema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Format == nil {
		return nil, errors.New("invalid value for required argument 'Format'")
	}
	if args.SubjectName == nil {
		return nil, errors.New("invalid value for required argument 'SubjectName'")
	}
	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(SchemaCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Schema
	err := ctx.RegisterResource("confluentcloud:index/schema:Schema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchema gets an existing Schema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaState, opts ...pulumi.ResourceOption) (*Schema, error) {
	var resource Schema
	err := ctx.ReadResource("confluentcloud:index/schema:Schema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schema resources.
type schemaState struct {
	// The Cluster API Credentials.
	Credentials *SchemaCredentials `pulumi:"credentials"`
	// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
	Format *string `pulumi:"format"`
	// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
	HardDelete *bool `pulumi:"hardDelete"`
	// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
	Metadata *SchemaMetadata `pulumi:"metadata"`
	// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
	RecreateOnUpdate *bool `pulumi:"recreateOnUpdate"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
	Ruleset *SchemaRuleset `pulumi:"ruleset"`
	// The schema string, for example, `file("./schema_version_1.avsc")`.
	Schema *string `pulumi:"schema"`
	// (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
	SchemaIdentifier *int `pulumi:"schemaIdentifier"`
	// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
	SchemaReferences      []SchemaSchemaReference      `pulumi:"schemaReferences"`
	SchemaRegistryCluster *SchemaSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
	SkipValidationDuringPlan *bool `pulumi:"skipValidationDuringPlan"`
	// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
	SubjectName *string `pulumi:"subjectName"`
	// (Required Integer) The version of the Schema, for example, `4`.
	Version *int `pulumi:"version"`
}

type SchemaState struct {
	// The Cluster API Credentials.
	Credentials SchemaCredentialsPtrInput
	// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
	Format pulumi.StringPtrInput
	// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrInput
	// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
	Metadata SchemaMetadataPtrInput
	// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
	RecreateOnUpdate pulumi.BoolPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrInput
	// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
	Ruleset SchemaRulesetPtrInput
	// The schema string, for example, `file("./schema_version_1.avsc")`.
	Schema pulumi.StringPtrInput
	// (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
	SchemaIdentifier pulumi.IntPtrInput
	// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
	SchemaReferences      SchemaSchemaReferenceArrayInput
	SchemaRegistryCluster SchemaSchemaRegistryClusterPtrInput
	// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
	SkipValidationDuringPlan pulumi.BoolPtrInput
	// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
	SubjectName pulumi.StringPtrInput
	// (Required Integer) The version of the Schema, for example, `4`.
	Version pulumi.IntPtrInput
}

func (SchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaState)(nil)).Elem()
}

type schemaArgs struct {
	// The Cluster API Credentials.
	Credentials *SchemaCredentials `pulumi:"credentials"`
	// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
	Format string `pulumi:"format"`
	// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
	HardDelete *bool `pulumi:"hardDelete"`
	// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
	Metadata *SchemaMetadata `pulumi:"metadata"`
	// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
	RecreateOnUpdate *bool `pulumi:"recreateOnUpdate"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
	Ruleset *SchemaRuleset `pulumi:"ruleset"`
	// The schema string, for example, `file("./schema_version_1.avsc")`.
	Schema *string `pulumi:"schema"`
	// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
	SchemaReferences      []SchemaSchemaReference      `pulumi:"schemaReferences"`
	SchemaRegistryCluster *SchemaSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
	SkipValidationDuringPlan *bool `pulumi:"skipValidationDuringPlan"`
	// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
	SubjectName string `pulumi:"subjectName"`
}

// The set of arguments for constructing a Schema resource.
type SchemaArgs struct {
	// The Cluster API Credentials.
	Credentials SchemaCredentialsPtrInput
	// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
	Format pulumi.StringInput
	// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrInput
	// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
	Metadata SchemaMetadataPtrInput
	// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
	RecreateOnUpdate pulumi.BoolPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrInput
	// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
	Ruleset SchemaRulesetPtrInput
	// The schema string, for example, `file("./schema_version_1.avsc")`.
	Schema pulumi.StringPtrInput
	// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
	SchemaReferences      SchemaSchemaReferenceArrayInput
	SchemaRegistryCluster SchemaSchemaRegistryClusterPtrInput
	// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
	SkipValidationDuringPlan pulumi.BoolPtrInput
	// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
	SubjectName pulumi.StringInput
}

func (SchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaArgs)(nil)).Elem()
}

type SchemaInput interface {
	pulumi.Input

	ToSchemaOutput() SchemaOutput
	ToSchemaOutputWithContext(ctx context.Context) SchemaOutput
}

func (*Schema) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (i *Schema) ToSchemaOutput() SchemaOutput {
	return i.ToSchemaOutputWithContext(context.Background())
}

func (i *Schema) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaOutput)
}

// SchemaArrayInput is an input type that accepts SchemaArray and SchemaArrayOutput values.
// You can construct a concrete instance of `SchemaArrayInput` via:
//
//	SchemaArray{ SchemaArgs{...} }
type SchemaArrayInput interface {
	pulumi.Input

	ToSchemaArrayOutput() SchemaArrayOutput
	ToSchemaArrayOutputWithContext(context.Context) SchemaArrayOutput
}

type SchemaArray []SchemaInput

func (SchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (i SchemaArray) ToSchemaArrayOutput() SchemaArrayOutput {
	return i.ToSchemaArrayOutputWithContext(context.Background())
}

func (i SchemaArray) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaArrayOutput)
}

// SchemaMapInput is an input type that accepts SchemaMap and SchemaMapOutput values.
// You can construct a concrete instance of `SchemaMapInput` via:
//
//	SchemaMap{ "key": SchemaArgs{...} }
type SchemaMapInput interface {
	pulumi.Input

	ToSchemaMapOutput() SchemaMapOutput
	ToSchemaMapOutputWithContext(context.Context) SchemaMapOutput
}

type SchemaMap map[string]SchemaInput

func (SchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (i SchemaMap) ToSchemaMapOutput() SchemaMapOutput {
	return i.ToSchemaMapOutputWithContext(context.Background())
}

func (i SchemaMap) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaMapOutput)
}

type SchemaOutput struct{ *pulumi.OutputState }

func (SchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (o SchemaOutput) ToSchemaOutput() SchemaOutput {
	return o
}

func (o SchemaOutput) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return o
}

// The Cluster API Credentials.
func (o SchemaOutput) Credentials() SchemaCredentialsPtrOutput {
	return o.ApplyT(func(v *Schema) SchemaCredentialsPtrOutput { return v.Credentials }).(SchemaCredentialsPtrOutput)
}

// The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
func (o SchemaOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.Format }).(pulumi.StringOutput)
}

// An optional flag to control whether a schema should be soft or hard deleted. Set it to `true` if you want to hard delete a schema on destroy (see [Schema Deletion Guidelines](https://docs.confluent.io/platform/current/schema-registry/schema-deletion-guidelines.html#schema-deletion-guidelines) for more details). Must be unset when importing. Defaults to `false` (soft delete).
func (o SchemaOutput) HardDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.BoolPtrOutput { return v.HardDelete }).(pulumi.BoolPtrOutput)
}

// See [here](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html) for more details. Supports the following:
func (o SchemaOutput) Metadata() SchemaMetadataOutput {
	return o.ApplyT(func(v *Schema) SchemaMetadataOutput { return v.Metadata }).(SchemaMetadataOutput)
}

// An optional flag to control whether a schema should be recreated on an update. Set it to `true` if you want to manage different schema versions using different resource instances. Must be set to the target value when importing. Defaults to `false`, which manages the latest schema version only. The resource instance always points to the latest schema version by supporting in-place updates.
func (o SchemaOutput) RecreateOnUpdate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.BoolPtrOutput { return v.RecreateOnUpdate }).(pulumi.BoolPtrOutput)
}

// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o SchemaOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

// The list of schema rules. See [Data Contracts for Schema Registry](https://docs.confluent.io/platform/7.5/schema-registry/fundamentals/data-contracts.html#rules) for more details. For example, these rules can enforce that a field that contains sensitive information must be encrypted, or that a message containing an invalid age must be sent to a dead letter queue.
func (o SchemaOutput) Ruleset() SchemaRulesetOutput {
	return o.ApplyT(func(v *Schema) SchemaRulesetOutput { return v.Ruleset }).(SchemaRulesetOutput)
}

// The schema string, for example, `file("./schema_version_1.avsc")`.
func (o SchemaOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// (Required Integer) The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
func (o SchemaOutput) SchemaIdentifier() pulumi.IntOutput {
	return o.ApplyT(func(v *Schema) pulumi.IntOutput { return v.SchemaIdentifier }).(pulumi.IntOutput)
}

// The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
func (o SchemaOutput) SchemaReferences() SchemaSchemaReferenceArrayOutput {
	return o.ApplyT(func(v *Schema) SchemaSchemaReferenceArrayOutput { return v.SchemaReferences }).(SchemaSchemaReferenceArrayOutput)
}

func (o SchemaOutput) SchemaRegistryCluster() SchemaSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *Schema) SchemaSchemaRegistryClusterPtrOutput { return v.SchemaRegistryCluster }).(SchemaSchemaRegistryClusterPtrOutput)
}

// An optional flag to control whether a schema should be validated during `pulumi preview`. Set it to `true` if you want to skip schema validation during `pulumi preview`. Defaults to `false`. Regardless of `true` or `false` for this flag, schema validation will be performed during `pulumi up`.
func (o SchemaOutput) SkipValidationDuringPlan() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.BoolPtrOutput { return v.SkipValidationDuringPlan }).(pulumi.BoolPtrOutput)
}

// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
func (o SchemaOutput) SubjectName() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.SubjectName }).(pulumi.StringOutput)
}

// (Required Integer) The version of the Schema, for example, `4`.
func (o SchemaOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *Schema) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type SchemaArrayOutput struct{ *pulumi.OutputState }

func (SchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (o SchemaArrayOutput) ToSchemaArrayOutput() SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) Index(i pulumi.IntInput) SchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].([]*Schema)[vs[1].(int)]
	}).(SchemaOutput)
}

type SchemaMapOutput struct{ *pulumi.OutputState }

func (SchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (o SchemaMapOutput) ToSchemaMapOutput() SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) MapIndex(k pulumi.StringInput) SchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].(map[string]*Schema)[vs[1].(string)]
	}).(SchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaInput)(nil)).Elem(), &Schema{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaArrayInput)(nil)).Elem(), SchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaMapInput)(nil)).Elem(), SchemaMap{})
	pulumi.RegisterOutputType(SchemaOutput{})
	pulumi.RegisterOutputType(SchemaArrayOutput{})
	pulumi.RegisterOutputType(SchemaMapOutput{})
}
