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

type SchemaRegistryKek struct {
	pulumi.CustomResourceState

	// The Cluster API Credentials.
	Credentials SchemaRegistryKekCredentialsPtrOutput `pulumi:"credentials"`
	Doc         pulumi.StringOutput                   `pulumi:"doc"`
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrOutput   `pulumi:"hardDelete"`
	KmsKeyId   pulumi.StringOutput    `pulumi:"kmsKeyId"`
	KmsType    pulumi.StringOutput    `pulumi:"kmsType"`
	Name       pulumi.StringOutput    `pulumi:"name"`
	Properties pulumi.StringMapOutput `pulumi:"properties"`
	// The REST endpoint of the Schema Registry cluster, for example,
	// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrOutput                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster SchemaRegistryKekSchemaRegistryClusterPtrOutput `pulumi:"schemaRegistryCluster"`
	Shared                pulumi.BoolOutput                               `pulumi:"shared"`
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
	Doc         *string                       `pulumi:"doc"`
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete *bool             `pulumi:"hardDelete"`
	KmsKeyId   *string           `pulumi:"kmsKeyId"`
	KmsType    *string           `pulumi:"kmsType"`
	Name       *string           `pulumi:"name"`
	Properties map[string]string `pulumi:"properties"`
	// The REST endpoint of the Schema Registry cluster, for example,
	// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                 `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryKekSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	Shared                *bool                                   `pulumi:"shared"`
}

type SchemaRegistryKekState struct {
	// The Cluster API Credentials.
	Credentials SchemaRegistryKekCredentialsPtrInput
	Doc         pulumi.StringPtrInput
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrInput
	KmsKeyId   pulumi.StringPtrInput
	KmsType    pulumi.StringPtrInput
	Name       pulumi.StringPtrInput
	Properties pulumi.StringMapInput
	// The REST endpoint of the Schema Registry cluster, for example,
	// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryKekSchemaRegistryClusterPtrInput
	Shared                pulumi.BoolPtrInput
}

func (SchemaRegistryKekState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaRegistryKekState)(nil)).Elem()
}

type schemaRegistryKekArgs struct {
	// The Cluster API Credentials.
	Credentials *SchemaRegistryKekCredentials `pulumi:"credentials"`
	Doc         *string                       `pulumi:"doc"`
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete *bool             `pulumi:"hardDelete"`
	KmsKeyId   string            `pulumi:"kmsKeyId"`
	KmsType    string            `pulumi:"kmsType"`
	Name       *string           `pulumi:"name"`
	Properties map[string]string `pulumi:"properties"`
	// The REST endpoint of the Schema Registry cluster, for example,
	// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                 `pulumi:"restEndpoint"`
	SchemaRegistryCluster *SchemaRegistryKekSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	Shared                *bool                                   `pulumi:"shared"`
}

// The set of arguments for constructing a SchemaRegistryKek resource.
type SchemaRegistryKekArgs struct {
	// The Cluster API Credentials.
	Credentials SchemaRegistryKekCredentialsPtrInput
	Doc         pulumi.StringPtrInput
	// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
	// on destroy. Defaults to `false` (soft delete).
	HardDelete pulumi.BoolPtrInput
	KmsKeyId   pulumi.StringInput
	KmsType    pulumi.StringInput
	Name       pulumi.StringPtrInput
	Properties pulumi.StringMapInput
	// The REST endpoint of the Schema Registry cluster, for example,
	// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput
	SchemaRegistryCluster SchemaRegistryKekSchemaRegistryClusterPtrInput
	Shared                pulumi.BoolPtrInput
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

func (o SchemaRegistryKekOutput) Doc() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.Doc }).(pulumi.StringOutput)
}

// Controls whether a kek should be soft or hard deleted. Set it to `true` if you want to hard delete a schema registry kek
// on destroy. Defaults to `false` (soft delete).
func (o SchemaRegistryKekOutput) HardDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.BoolPtrOutput { return v.HardDelete }).(pulumi.BoolPtrOutput)
}

func (o SchemaRegistryKekOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.KmsKeyId }).(pulumi.StringOutput)
}

func (o SchemaRegistryKekOutput) KmsType() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.KmsType }).(pulumi.StringOutput)
}

func (o SchemaRegistryKekOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SchemaRegistryKekOutput) Properties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringMapOutput { return v.Properties }).(pulumi.StringMapOutput)
}

// The REST endpoint of the Schema Registry cluster, for example,
// `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
func (o SchemaRegistryKekOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o SchemaRegistryKekOutput) SchemaRegistryCluster() SchemaRegistryKekSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) SchemaRegistryKekSchemaRegistryClusterPtrOutput {
		return v.SchemaRegistryCluster
	}).(SchemaRegistryKekSchemaRegistryClusterPtrOutput)
}

func (o SchemaRegistryKekOutput) Shared() pulumi.BoolOutput {
	return o.ApplyT(func(v *SchemaRegistryKek) pulumi.BoolOutput { return v.Shared }).(pulumi.BoolOutput)
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