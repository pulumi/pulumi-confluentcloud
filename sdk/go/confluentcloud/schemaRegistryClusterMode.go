// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// You can import a Mode by using the Schema Registry cluster ID, Subject name in the format `<Schema Registry cluster ID>`, for example$ export IMPORT_SCHEMA_REGISTRY_API_KEY="<schema_registry_api_key>" $ export IMPORT_SCHEMA_REGISTRY_API_SECRET="<schema_registry_api_secret>" $ export IMPORT_SCHEMA_REGISTRY_REST_ENDPOINT="<schema_registry_rest_endpoint>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode example lsrc-abc123
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type SchemaRegistryClusterMode struct {
	pulumi.CustomResourceState

	// The Cluster API Credentials.
	Credentials SchemaRegistryClusterModeCredentialsPtrOutput `pulumi:"credentials"`
	// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrOutput                                  `pulumi:"restEndpoint"`
	SchemaRegistryCluster SchemaRegistryClusterModeSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
}

// NewSchemaRegistryClusterMode registers a new resource with the given unique name, arguments, and options.
func NewSchemaRegistryClusterMode(ctx *pulumi.Context,
	name string, args *SchemaRegistryClusterModeArgs, opts ...pulumi.ResourceOption) (*SchemaRegistryClusterMode, error) {
	if args == nil {
		args = &SchemaRegistryClusterModeArgs{}
	}

	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(SchemaRegistryClusterModeCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SchemaRegistryClusterMode
	err := ctx.RegisterResource("confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchemaRegistryClusterMode gets an existing SchemaRegistryClusterMode resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchemaRegistryClusterMode(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaRegistryClusterModeState, opts ...pulumi.ResourceOption) (*SchemaRegistryClusterMode, error) {
	var resource SchemaRegistryClusterMode
	err := ctx.ReadResource("confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchemaRegistryClusterMode resources.
type schemaRegistryClusterModeState struct {
	// The Cluster API Credentials.
	Credentials *SchemaRegistryClusterModeCredentials `pulumi:"credentials"`
	// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
	Mode *string `pulumi:"mode"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                         `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryClusterModeSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

type SchemaRegistryClusterModeState struct {
	// The Cluster API Credentials.
	Credentials SchemaRegistryClusterModeCredentialsPtrInput
	// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
	Mode pulumi.StringPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryClusterModeSchemaRegistryClusterPtrInput
}

func (SchemaRegistryClusterModeState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaRegistryClusterModeState)(nil)).Elem()
}

type schemaRegistryClusterModeArgs struct {
	// The Cluster API Credentials.
	Credentials *SchemaRegistryClusterModeCredentials `pulumi:"credentials"`
	// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
	Mode *string `pulumi:"mode"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                         `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryClusterModeSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// The set of arguments for constructing a SchemaRegistryClusterMode resource.
type SchemaRegistryClusterModeArgs struct {
	// The Cluster API Credentials.
	Credentials SchemaRegistryClusterModeCredentialsPtrInput
	// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
	Mode pulumi.StringPtrInput
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryClusterModeSchemaRegistryClusterPtrInput
}

func (SchemaRegistryClusterModeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaRegistryClusterModeArgs)(nil)).Elem()
}

type SchemaRegistryClusterModeInput interface {
	pulumi.Input

	ToSchemaRegistryClusterModeOutput() SchemaRegistryClusterModeOutput
	ToSchemaRegistryClusterModeOutputWithContext(ctx context.Context) SchemaRegistryClusterModeOutput
}

func (*SchemaRegistryClusterMode) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaRegistryClusterMode)(nil)).Elem()
}

func (i *SchemaRegistryClusterMode) ToSchemaRegistryClusterModeOutput() SchemaRegistryClusterModeOutput {
	return i.ToSchemaRegistryClusterModeOutputWithContext(context.Background())
}

func (i *SchemaRegistryClusterMode) ToSchemaRegistryClusterModeOutputWithContext(ctx context.Context) SchemaRegistryClusterModeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryClusterModeOutput)
}

// SchemaRegistryClusterModeArrayInput is an input type that accepts SchemaRegistryClusterModeArray and SchemaRegistryClusterModeArrayOutput values.
// You can construct a concrete instance of `SchemaRegistryClusterModeArrayInput` via:
//
//	SchemaRegistryClusterModeArray{ SchemaRegistryClusterModeArgs{...} }
type SchemaRegistryClusterModeArrayInput interface {
	pulumi.Input

	ToSchemaRegistryClusterModeArrayOutput() SchemaRegistryClusterModeArrayOutput
	ToSchemaRegistryClusterModeArrayOutputWithContext(context.Context) SchemaRegistryClusterModeArrayOutput
}

type SchemaRegistryClusterModeArray []SchemaRegistryClusterModeInput

func (SchemaRegistryClusterModeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaRegistryClusterMode)(nil)).Elem()
}

func (i SchemaRegistryClusterModeArray) ToSchemaRegistryClusterModeArrayOutput() SchemaRegistryClusterModeArrayOutput {
	return i.ToSchemaRegistryClusterModeArrayOutputWithContext(context.Background())
}

func (i SchemaRegistryClusterModeArray) ToSchemaRegistryClusterModeArrayOutputWithContext(ctx context.Context) SchemaRegistryClusterModeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryClusterModeArrayOutput)
}

// SchemaRegistryClusterModeMapInput is an input type that accepts SchemaRegistryClusterModeMap and SchemaRegistryClusterModeMapOutput values.
// You can construct a concrete instance of `SchemaRegistryClusterModeMapInput` via:
//
//	SchemaRegistryClusterModeMap{ "key": SchemaRegistryClusterModeArgs{...} }
type SchemaRegistryClusterModeMapInput interface {
	pulumi.Input

	ToSchemaRegistryClusterModeMapOutput() SchemaRegistryClusterModeMapOutput
	ToSchemaRegistryClusterModeMapOutputWithContext(context.Context) SchemaRegistryClusterModeMapOutput
}

type SchemaRegistryClusterModeMap map[string]SchemaRegistryClusterModeInput

func (SchemaRegistryClusterModeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaRegistryClusterMode)(nil)).Elem()
}

func (i SchemaRegistryClusterModeMap) ToSchemaRegistryClusterModeMapOutput() SchemaRegistryClusterModeMapOutput {
	return i.ToSchemaRegistryClusterModeMapOutputWithContext(context.Background())
}

func (i SchemaRegistryClusterModeMap) ToSchemaRegistryClusterModeMapOutputWithContext(ctx context.Context) SchemaRegistryClusterModeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaRegistryClusterModeMapOutput)
}

type SchemaRegistryClusterModeOutput struct{ *pulumi.OutputState }

func (SchemaRegistryClusterModeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaRegistryClusterMode)(nil)).Elem()
}

func (o SchemaRegistryClusterModeOutput) ToSchemaRegistryClusterModeOutput() SchemaRegistryClusterModeOutput {
	return o
}

func (o SchemaRegistryClusterModeOutput) ToSchemaRegistryClusterModeOutputWithContext(ctx context.Context) SchemaRegistryClusterModeOutput {
	return o
}

// The Cluster API Credentials.
func (o SchemaRegistryClusterModeOutput) Credentials() SchemaRegistryClusterModeCredentialsPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterMode) SchemaRegistryClusterModeCredentialsPtrOutput { return v.Credentials }).(SchemaRegistryClusterModeCredentialsPtrOutput)
}

// The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
func (o SchemaRegistryClusterModeOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterMode) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o SchemaRegistryClusterModeOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterMode) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o SchemaRegistryClusterModeOutput) SchemaRegistryCluster() SchemaRegistryClusterModeSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryClusterMode) SchemaRegistryClusterModeSchemaRegistryClusterPtrOutput {
		return v.SchemaRegistryCluster
	}).(SchemaRegistryClusterModeSchemaRegistryClusterPtrOutput)
}

type SchemaRegistryClusterModeArrayOutput struct{ *pulumi.OutputState }

func (SchemaRegistryClusterModeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaRegistryClusterMode)(nil)).Elem()
}

func (o SchemaRegistryClusterModeArrayOutput) ToSchemaRegistryClusterModeArrayOutput() SchemaRegistryClusterModeArrayOutput {
	return o
}

func (o SchemaRegistryClusterModeArrayOutput) ToSchemaRegistryClusterModeArrayOutputWithContext(ctx context.Context) SchemaRegistryClusterModeArrayOutput {
	return o
}

func (o SchemaRegistryClusterModeArrayOutput) Index(i pulumi.IntInput) SchemaRegistryClusterModeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchemaRegistryClusterMode {
		return vs[0].([]*SchemaRegistryClusterMode)[vs[1].(int)]
	}).(SchemaRegistryClusterModeOutput)
}

type SchemaRegistryClusterModeMapOutput struct{ *pulumi.OutputState }

func (SchemaRegistryClusterModeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaRegistryClusterMode)(nil)).Elem()
}

func (o SchemaRegistryClusterModeMapOutput) ToSchemaRegistryClusterModeMapOutput() SchemaRegistryClusterModeMapOutput {
	return o
}

func (o SchemaRegistryClusterModeMapOutput) ToSchemaRegistryClusterModeMapOutputWithContext(ctx context.Context) SchemaRegistryClusterModeMapOutput {
	return o
}

func (o SchemaRegistryClusterModeMapOutput) MapIndex(k pulumi.StringInput) SchemaRegistryClusterModeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchemaRegistryClusterMode {
		return vs[0].(map[string]*SchemaRegistryClusterMode)[vs[1].(string)]
	}).(SchemaRegistryClusterModeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryClusterModeInput)(nil)).Elem(), &SchemaRegistryClusterMode{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryClusterModeArrayInput)(nil)).Elem(), SchemaRegistryClusterModeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaRegistryClusterModeMapInput)(nil)).Elem(), SchemaRegistryClusterModeMap{})
	pulumi.RegisterOutputType(SchemaRegistryClusterModeOutput{})
	pulumi.RegisterOutputType(SchemaRegistryClusterModeArrayOutput{})
	pulumi.RegisterOutputType(SchemaRegistryClusterModeMapOutput{})
}
