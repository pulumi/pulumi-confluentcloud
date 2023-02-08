// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupSchema(ctx *pulumi.Context, args *LookupSchemaArgs, opts ...pulumi.InvokeOption) (*LookupSchemaResult, error) {
	var rv LookupSchemaResult
	err := ctx.Invoke("confluentcloud:index/getSchema:getSchema", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchema.
type LookupSchemaArgs struct {
	Credentials *GetSchemaCredentials `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
	SchemaIdentifier      int                             `pulumi:"schemaIdentifier"`
	SchemaRegistryCluster *GetSchemaSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
	SubjectName string `pulumi:"subjectName"`
}

// A collection of values returned by getSchema.
type LookupSchemaResult struct {
	Credentials *GetSchemaCredentials `pulumi:"credentials"`
	// (Required String) The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
	Format     string `pulumi:"format"`
	HardDelete bool   `pulumi:"hardDelete"`
	// The provider-assigned unique ID for this managed resource.
	Id               string  `pulumi:"id"`
	RecreateOnUpdate bool    `pulumi:"recreateOnUpdate"`
	RestEndpoint     *string `pulumi:"restEndpoint"`
	// (Required String) The schema string, for example, `file("./schema_version_1.avsc")`.
	Schema           string `pulumi:"schema"`
	SchemaIdentifier int    `pulumi:"schemaIdentifier"`
	// (Optional List) The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
	SchemaReferences      []GetSchemaSchemaReference      `pulumi:"schemaReferences"`
	SchemaRegistryCluster *GetSchemaSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
	SubjectName string `pulumi:"subjectName"`
	// (Required Integer) The version of the Schema, for example, `4`.
	Version int `pulumi:"version"`
}

func LookupSchemaOutput(ctx *pulumi.Context, args LookupSchemaOutputArgs, opts ...pulumi.InvokeOption) LookupSchemaResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSchemaResult, error) {
			args := v.(LookupSchemaArgs)
			r, err := LookupSchema(ctx, &args, opts...)
			var s LookupSchemaResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSchemaResultOutput)
}

// A collection of arguments for invoking getSchema.
type LookupSchemaOutputArgs struct {
	Credentials GetSchemaCredentialsPtrInput `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrInput `pulumi:"restEndpoint"`
	// The globally unique ID of the Schema, for example, `100003`. If the same schema is registered under a different subject, the same identifier will be returned. However, the `version` of the schema may be different under different subjects.
	SchemaIdentifier      pulumi.IntInput                        `pulumi:"schemaIdentifier"`
	SchemaRegistryCluster GetSchemaSchemaRegistryClusterPtrInput `pulumi:"schemaRegistryCluster"`
	// The name of the subject (in other words, the namespace), representing the subject under which the schema will be registered, for example, `test-subject`. Schemas evolve safely, following a compatibility mode defined, under a subject name.
	SubjectName pulumi.StringInput `pulumi:"subjectName"`
}

func (LookupSchemaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaArgs)(nil)).Elem()
}

// A collection of values returned by getSchema.
type LookupSchemaResultOutput struct{ *pulumi.OutputState }

func (LookupSchemaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaResult)(nil)).Elem()
}

func (o LookupSchemaResultOutput) ToLookupSchemaResultOutput() LookupSchemaResultOutput {
	return o
}

func (o LookupSchemaResultOutput) ToLookupSchemaResultOutputWithContext(ctx context.Context) LookupSchemaResultOutput {
	return o
}

func (o LookupSchemaResultOutput) Credentials() GetSchemaCredentialsPtrOutput {
	return o.ApplyT(func(v LookupSchemaResult) *GetSchemaCredentials { return v.Credentials }).(GetSchemaCredentialsPtrOutput)
}

// (Required String) The format of the schema. Accepted values are: `AVRO`, `PROTOBUF`, and `JSON`.
func (o LookupSchemaResultOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaResult) string { return v.Format }).(pulumi.StringOutput)
}

func (o LookupSchemaResultOutput) HardDelete() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSchemaResult) bool { return v.HardDelete }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSchemaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSchemaResultOutput) RecreateOnUpdate() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSchemaResult) bool { return v.RecreateOnUpdate }).(pulumi.BoolOutput)
}

func (o LookupSchemaResultOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSchemaResult) *string { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

// (Required String) The schema string, for example, `file("./schema_version_1.avsc")`.
func (o LookupSchemaResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaResult) string { return v.Schema }).(pulumi.StringOutput)
}

func (o LookupSchemaResultOutput) SchemaIdentifier() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSchemaResult) int { return v.SchemaIdentifier }).(pulumi.IntOutput)
}

// (Optional List) The list of referenced schemas (see [Schema References](https://docs.confluent.io/platform/current/schema-registry/serdes-develop/index.html#schema-references) for more details):
func (o LookupSchemaResultOutput) SchemaReferences() GetSchemaSchemaReferenceArrayOutput {
	return o.ApplyT(func(v LookupSchemaResult) []GetSchemaSchemaReference { return v.SchemaReferences }).(GetSchemaSchemaReferenceArrayOutput)
}

func (o LookupSchemaResultOutput) SchemaRegistryCluster() GetSchemaSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v LookupSchemaResult) *GetSchemaSchemaRegistryCluster { return v.SchemaRegistryCluster }).(GetSchemaSchemaRegistryClusterPtrOutput)
}

// (Required String) The name for the reference. (For Avro Schema, the reference name is the fully qualified schema name, for JSON Schema it is a URL, and for Protobuf Schema, it is the name of another Protobuf file.)
func (o LookupSchemaResultOutput) SubjectName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaResult) string { return v.SubjectName }).(pulumi.StringOutput)
}

// (Required Integer) The version of the Schema, for example, `4`.
func (o LookupSchemaResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSchemaResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSchemaResultOutput{})
}
