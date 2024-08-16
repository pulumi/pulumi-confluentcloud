// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// You can import a Schema Registry Cluster Config by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>`, for example:
//
// $ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>"
//
// $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>"
//
// $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
// $ pulumi import confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig example lsrc-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type SchemaRegistryClusterConfig struct {
	pulumi.CustomResourceState

	// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
	CompatibilityLevel pulumi.StringOutput `pulumi:"compatibilityLevel"`
	// The Cluster API Credentials.
	Credentials SchemaRegistryClusterConfigCredentialsPtrOutput `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrOutput                                    `pulumi:"restEndpoint"`
	SchemaRegistryCluster SchemaRegistryClusterConfigSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
}

// NewSchemaRegistryClusterConfig registers a new resource with the given unique name, arguments, and options.
func NewSchemaRegistryClusterConfig(ctx *pulumi.Context,
	name string, args *SchemaRegistryClusterConfigArgs, opts ...pulumi.ResourceOption) (*SchemaRegistryClusterConfig, error) {
	if args == nil {
		args = &SchemaRegistryClusterConfigArgs{}
	}

	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(SchemaRegistryClusterConfigCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SchemaRegistryClusterConfig
	err := ctx.RegisterResource("confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchemaRegistryClusterConfig gets an existing SchemaRegistryClusterConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchemaRegistryClusterConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaRegistryClusterConfigState, opts ...pulumi.ResourceOption) (*SchemaRegistryClusterConfig, error) {
	var resource SchemaRegistryClusterConfig
	err := ctx.ReadResource("confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchemaRegistryClusterConfig resources.
type schemaRegistryClusterConfigState struct {
	// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
	CompatibilityLevel *string `pulumi:"compatibilityLevel"`
	// The Cluster API Credentials.
	Credentials *SchemaRegistryClusterConfigCredentials `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                           `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryClusterConfigSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

type SchemaRegistryClusterConfigState struct {
	// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
	CompatibilityLevel pulumi.StringPtrInput
	// The Cluster API Credentials.
	Credentials SchemaRegistryClusterConfigCredentialsPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryClusterConfigSchemaRegistryClusterPtrInput
}

func (SchemaRegistryClusterConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaRegistryClusterConfigState)(nil)).Elem()
}

type schemaRegistryClusterConfigArgs struct {
	// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
	CompatibilityLevel *string `pulumi:"compatibilityLevel"`
	// The Cluster API Credentials.
	Credentials *SchemaRegistryClusterConfigCredentials `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                           `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryClusterConfigSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// The set of arguments for constructing a SchemaRegistryClusterConfig resource.
type SchemaRegistryClusterConfigArgs struct {
	// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
	CompatibilityLevel pulumi.StringPtrInput
	// The Cluster API Credentials.
	Credentials SchemaRegistryClusterConfigCredentialsPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryClusterConfigSchemaRegistryClusterPtrInput
}

func (SchemaRegistryClusterConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaRegistryClusterConfigArgs)(nil)).Elem()
}

type SchemaRegistryClusterConfigInput interface {
	pulumi.Input

	ToSchemaRegistryClusterConfigOutput() SchemaRegistryClusterConfigOutput
	ToSchemaRegistryClusterConfigOutputWithContext(ctx context.Context) SchemaRegistryClusterConfigOutput
}

func (*SchemaRegistryClusterConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaRegistryClusterConfig)(nil)).Elem()
}

func (i *SchemaRegistryClusterConfig) ToSchemaRegistryClusterConfigOutput() SchemaRegistryClusterConfigOutput {
	return i.ToSchemaRegistryClusterConfigOutputWithContext(context.Background())
}

func (i *SchemaRegistryClusterConfig) ToSchemaRegistryClusterConfigOutputWithContext(ctx context.Context) SchemaRegistryClusterConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryClusterConfigOutput)
}

// SchemaRegistryClusterConfigArrayInput is an input type that accepts SchemaRegistryClusterConfigArray and SchemaRegistryClusterConfigArrayOutput values.
// You can construct a concrete instance of `SchemaRegistryClusterConfigArrayInput` via:
//
//	SchemaRegistryClusterConfigArray{ SchemaRegistryClusterConfigArgs{...} }
type SchemaRegistryClusterConfigArrayInput interface {
	pulumi.Input

	ToSchemaRegistryClusterConfigArrayOutput() SchemaRegistryClusterConfigArrayOutput
	ToSchemaRegistryClusterConfigArrayOutputWithContext(context.Context) SchemaRegistryClusterConfigArrayOutput
}

type SchemaRegistryClusterConfigArray []SchemaRegistryClusterConfigInput

func (SchemaRegistryClusterConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaRegistryClusterConfig)(nil)).Elem()
}

func (i SchemaRegistryClusterConfigArray) ToSchemaRegistryClusterConfigArrayOutput() SchemaRegistryClusterConfigArrayOutput {
	return i.ToSchemaRegistryClusterConfigArrayOutputWithContext(context.Background())
}

func (i SchemaRegistryClusterConfigArray) ToSchemaRegistryClusterConfigArrayOutputWithContext(ctx context.Context) SchemaRegistryClusterConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryClusterConfigArrayOutput)
}

// SchemaRegistryClusterConfigMapInput is an input type that accepts SchemaRegistryClusterConfigMap and SchemaRegistryClusterConfigMapOutput values.
// You can construct a concrete instance of `SchemaRegistryClusterConfigMapInput` via:
//
//	SchemaRegistryClusterConfigMap{ "key": SchemaRegistryClusterConfigArgs{...} }
type SchemaRegistryClusterConfigMapInput interface {
	pulumi.Input

	ToSchemaRegistryClusterConfigMapOutput() SchemaRegistryClusterConfigMapOutput
	ToSchemaRegistryClusterConfigMapOutputWithContext(context.Context) SchemaRegistryClusterConfigMapOutput
}

type SchemaRegistryClusterConfigMap map[string]SchemaRegistryClusterConfigInput

func (SchemaRegistryClusterConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaRegistryClusterConfig)(nil)).Elem()
}

func (i SchemaRegistryClusterConfigMap) ToSchemaRegistryClusterConfigMapOutput() SchemaRegistryClusterConfigMapOutput {
	return i.ToSchemaRegistryClusterConfigMapOutputWithContext(context.Background())
}

func (i SchemaRegistryClusterConfigMap) ToSchemaRegistryClusterConfigMapOutputWithContext(ctx context.Context) SchemaRegistryClusterConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryClusterConfigMapOutput)
}

type SchemaRegistryClusterConfigOutput struct{ *pulumi.OutputState }

func (SchemaRegistryClusterConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaRegistryClusterConfig)(nil)).Elem()
}

func (o SchemaRegistryClusterConfigOutput) ToSchemaRegistryClusterConfigOutput() SchemaRegistryClusterConfigOutput {
	return o
}

func (o SchemaRegistryClusterConfigOutput) ToSchemaRegistryClusterConfigOutputWithContext(ctx context.Context) SchemaRegistryClusterConfigOutput {
	return o
}

// The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
func (o SchemaRegistryClusterConfigOutput) CompatibilityLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterConfig) pulumi.StringOutput { return v.CompatibilityLevel }).(pulumi.StringOutput)
}

// The Cluster API Credentials.
func (o SchemaRegistryClusterConfigOutput) Credentials() SchemaRegistryClusterConfigCredentialsPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterConfig) SchemaRegistryClusterConfigCredentialsPtrOutput {
		return v.Credentials
	}).(SchemaRegistryClusterConfigCredentialsPtrOutput)
}

// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o SchemaRegistryClusterConfigOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterConfig) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o SchemaRegistryClusterConfigOutput) SchemaRegistryCluster() SchemaRegistryClusterConfigSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterConfig) SchemaRegistryClusterConfigSchemaRegistryClusterPtrOutput {
		return v.SchemaRegistryCluster
	}).(SchemaRegistryClusterConfigSchemaRegistryClusterPtrOutput)
}

type SchemaRegistryClusterConfigArrayOutput struct{ *pulumi.OutputState }

func (SchemaRegistryClusterConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaRegistryClusterConfig)(nil)).Elem()
}

func (o SchemaRegistryClusterConfigArrayOutput) ToSchemaRegistryClusterConfigArrayOutput() SchemaRegistryClusterConfigArrayOutput {
	return o
}

func (o SchemaRegistryClusterConfigArrayOutput) ToSchemaRegistryClusterConfigArrayOutputWithContext(ctx context.Context) SchemaRegistryClusterConfigArrayOutput {
	return o
}

func (o SchemaRegistryClusterConfigArrayOutput) Index(i pulumi.IntInput) SchemaRegistryClusterConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchemaRegistryClusterConfig {
		return vs[0].([]*SchemaRegistryClusterConfig)[vs[1].(int)]
	}).(SchemaRegistryClusterConfigOutput)
}

type SchemaRegistryClusterConfigMapOutput struct{ *pulumi.OutputState }

func (SchemaRegistryClusterConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaRegistryClusterConfig)(nil)).Elem()
}

func (o SchemaRegistryClusterConfigMapOutput) ToSchemaRegistryClusterConfigMapOutput() SchemaRegistryClusterConfigMapOutput {
	return o
}

func (o SchemaRegistryClusterConfigMapOutput) ToSchemaRegistryClusterConfigMapOutputWithContext(ctx context.Context) SchemaRegistryClusterConfigMapOutput {
	return o
}

func (o SchemaRegistryClusterConfigMapOutput) MapIndex(k pulumi.StringInput) SchemaRegistryClusterConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchemaRegistryClusterConfig {
		return vs[0].(map[string]*SchemaRegistryClusterConfig)[vs[1].(string)]
	}).(SchemaRegistryClusterConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryClusterConfigInput)(nil)).Elem(), &SchemaRegistryClusterConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryClusterConfigArrayInput)(nil)).Elem(), SchemaRegistryClusterConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryClusterConfigMapInput)(nil)).Elem(), SchemaRegistryClusterConfigMap{})
	pulumi.RegisterOutputType(SchemaRegistryClusterConfigOutput{})
	pulumi.RegisterOutputType(SchemaRegistryClusterConfigArrayOutput{})
	pulumi.RegisterOutputType(SchemaRegistryClusterConfigMapOutput{})
}
