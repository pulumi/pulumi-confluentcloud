// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupBusinessMetadataBinding(ctx *pulumi.Context, args *LookupBusinessMetadataBindingArgs, opts ...pulumi.InvokeOption) (*LookupBusinessMetadataBindingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBusinessMetadataBindingResult
	err := ctx.Invoke("confluentcloud:index/getBusinessMetadataBinding:getBusinessMetadataBinding", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBusinessMetadataBinding.
type LookupBusinessMetadataBindingArgs struct {
	// The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	BusinessMetadataName string                                 `pulumi:"businessMetadataName"`
	Credentials          *GetBusinessMetadataBindingCredentials `pulumi:"credentials"`
	// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
	EntityName string `pulumi:"entityName"`
	// The entity type, for example, `srSchema`.
	EntityType string `pulumi:"entityType"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetBusinessMetadataBindingSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// A collection of values returned by getBusinessMetadataBinding.
type LookupBusinessMetadataBindingResult struct {
	// (Optional Map) The block of key-value pair attributes.
	Attributes           map[string]string                      `pulumi:"attributes"`
	BusinessMetadataName string                                 `pulumi:"businessMetadataName"`
	Credentials          *GetBusinessMetadataBindingCredentials `pulumi:"credentials"`
	EntityName           string                                 `pulumi:"entityName"`
	EntityType           string                                 `pulumi:"entityType"`
	// (Required String) The ID of the Business Metadata Binding, in the format `<Schema Registry Cluster Id>/<Business Metadata Name>/<Entity Name>/<Entity Type>`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
	Id                    string                                           `pulumi:"id"`
	RestEndpoint          *string                                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetBusinessMetadataBindingSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

func LookupBusinessMetadataBindingOutput(ctx *pulumi.Context, args LookupBusinessMetadataBindingOutputArgs, opts ...pulumi.InvokeOption) LookupBusinessMetadataBindingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBusinessMetadataBindingResult, error) {
			args := v.(LookupBusinessMetadataBindingArgs)
			r, err := LookupBusinessMetadataBinding(ctx, &args, opts...)
			var s LookupBusinessMetadataBindingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBusinessMetadataBindingResultOutput)
}

// A collection of arguments for invoking getBusinessMetadataBinding.
type LookupBusinessMetadataBindingOutputArgs struct {
	// The name of the Business Metadata to be applied, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	BusinessMetadataName pulumi.StringInput                            `pulumi:"businessMetadataName"`
	Credentials          GetBusinessMetadataBindingCredentialsPtrInput `pulumi:"credentials"`
	// The qualified name of the entity., for example, `${confluent_schema_registry_cluster.main.id}:.:${confluent_schema.purchase.schema_identifier}`, `${confluent_schema_registry_cluster.main.id}:${confluent_kafka_cluster.basic.id}:${confluent_kafka_topic.purchase.topic_name}`.
	EntityName pulumi.StringInput `pulumi:"entityName"`
	// The entity type, for example, `srSchema`.
	EntityType pulumi.StringInput `pulumi:"entityType"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput                                   `pulumi:"restEndpoint"`
	SchemaRegistryCluster GetBusinessMetadataBindingSchemaRegistryClusterPtrInput `pulumi:"schemaRegistryCluster"`
}

func (LookupBusinessMetadataBindingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBusinessMetadataBindingArgs)(nil)).Elem()
}

// A collection of values returned by getBusinessMetadataBinding.
type LookupBusinessMetadataBindingResultOutput struct{ *pulumi.OutputState }

func (LookupBusinessMetadataBindingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBusinessMetadataBindingResult)(nil)).Elem()
}

func (o LookupBusinessMetadataBindingResultOutput) ToLookupBusinessMetadataBindingResultOutput() LookupBusinessMetadataBindingResultOutput {
	return o
}

func (o LookupBusinessMetadataBindingResultOutput) ToLookupBusinessMetadataBindingResultOutputWithContext(ctx context.Context) LookupBusinessMetadataBindingResultOutput {
	return o
}

// (Optional Map) The block of key-value pair attributes.
func (o LookupBusinessMetadataBindingResultOutput) Attributes() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) map[string]string { return v.Attributes }).(pulumi.StringMapOutput)
}

func (o LookupBusinessMetadataBindingResultOutput) BusinessMetadataName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) string { return v.BusinessMetadataName }).(pulumi.StringOutput)
}

func (o LookupBusinessMetadataBindingResultOutput) Credentials() GetBusinessMetadataBindingCredentialsPtrOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) *GetBusinessMetadataBindingCredentials {
		return v.Credentials
	}).(GetBusinessMetadataBindingCredentialsPtrOutput)
}

func (o LookupBusinessMetadataBindingResultOutput) EntityName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) string { return v.EntityName }).(pulumi.StringOutput)
}

func (o LookupBusinessMetadataBindingResultOutput) EntityType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) string { return v.EntityType }).(pulumi.StringOutput)
}

// (Required String) The ID of the Business Metadata Binding, in the format `<Schema Registry Cluster Id>/<Business Metadata Name>/<Entity Name>/<Entity Type>`, for example, `lsrc-8wrx70/PII/lsrc-8wrx70:.:100001/sr_schema`.
func (o LookupBusinessMetadataBindingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBusinessMetadataBindingResultOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) *string { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o LookupBusinessMetadataBindingResultOutput) SchemaRegistryCluster() GetBusinessMetadataBindingSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v LookupBusinessMetadataBindingResult) *GetBusinessMetadataBindingSchemaRegistryCluster {
		return v.SchemaRegistryCluster
	}).(GetBusinessMetadataBindingSchemaRegistryClusterPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBusinessMetadataBindingResultOutput{})
}
