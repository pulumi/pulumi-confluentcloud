// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupBusinessMetadata(ctx *pulumi.Context, args *LookupBusinessMetadataArgs, opts ...pulumi.InvokeOption) (*LookupBusinessMetadataResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBusinessMetadataResult
	err := ctx.Invoke("confluentcloud:index/getBusinessMetadata:getBusinessMetadata", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBusinessMetadata.
type LookupBusinessMetadataArgs struct {
	Credentials *GetBusinessMetadataCredentials `pulumi:"credentials"`
	// The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	//
	// > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
	Name string `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                   `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetBusinessMetadataSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// A collection of values returned by getBusinessMetadata.
type LookupBusinessMetadataResult struct {
	// (Optional List) The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
	AttributeDefinitions []GetBusinessMetadataAttributeDefinition `pulumi:"attributeDefinitions"`
	Credentials          *GetBusinessMetadataCredentials          `pulumi:"credentials"`
	// (Optional String) The description of this attribute.
	Description string `pulumi:"description"`
	// (Required String) The ID of the Business Metadata, in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example, `lsrc-8wrx70/PII`.
	Id string `pulumi:"id"`
	// (Required String) The name of the attribute.
	Name                  string                                    `pulumi:"name"`
	RestEndpoint          *string                                   `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetBusinessMetadataSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// (Required Integer) The version of the Business Metadata, for example, `1`.
	Version int `pulumi:"version"`
}

func LookupBusinessMetadataOutput(ctx *pulumi.Context, args LookupBusinessMetadataOutputArgs, opts ...pulumi.InvokeOption) LookupBusinessMetadataResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBusinessMetadataResult, error) {
			args := v.(LookupBusinessMetadataArgs)
			r, err := LookupBusinessMetadata(ctx, &args, opts...)
			var s LookupBusinessMetadataResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBusinessMetadataResultOutput)
}

// A collection of arguments for invoking getBusinessMetadata.
type LookupBusinessMetadataOutputArgs struct {
	Credentials GetBusinessMetadataCredentialsPtrInput `pulumi:"credentials"`
	// The name of the Business Metadata, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	//
	// > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
	Name pulumi.StringInput `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput                            `pulumi:"restEndpoint"`
	SchemaRegistryCluster GetBusinessMetadataSchemaRegistryClusterPtrInput `pulumi:"schemaRegistryCluster"`
}

func (LookupBusinessMetadataOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBusinessMetadataArgs)(nil)).Elem()
}

// A collection of values returned by getBusinessMetadata.
type LookupBusinessMetadataResultOutput struct{ *pulumi.OutputState }

func (LookupBusinessMetadataResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBusinessMetadataResult)(nil)).Elem()
}

func (o LookupBusinessMetadataResultOutput) ToLookupBusinessMetadataResultOutput() LookupBusinessMetadataResultOutput {
	return o
}

func (o LookupBusinessMetadataResultOutput) ToLookupBusinessMetadataResultOutputWithContext(ctx context.Context) LookupBusinessMetadataResultOutput {
	return o
}

// (Optional List) The list of attribute definitions (see [Business Metadata](https://docs.confluent.io/cloud/current/stream-governance/stream-catalog.html#business-metadata-for-schemas) for more details):
func (o LookupBusinessMetadataResultOutput) AttributeDefinitions() GetBusinessMetadataAttributeDefinitionArrayOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) []GetBusinessMetadataAttributeDefinition {
		return v.AttributeDefinitions
	}).(GetBusinessMetadataAttributeDefinitionArrayOutput)
}

func (o LookupBusinessMetadataResultOutput) Credentials() GetBusinessMetadataCredentialsPtrOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) *GetBusinessMetadataCredentials { return v.Credentials }).(GetBusinessMetadataCredentialsPtrOutput)
}

// (Optional String) The description of this attribute.
func (o LookupBusinessMetadataResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Required String) The ID of the Business Metadata, in the format `<Schema Registry cluster ID>/<Business Metadata name>`, for example, `lsrc-8wrx70/PII`.
func (o LookupBusinessMetadataResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) The name of the attribute.
func (o LookupBusinessMetadataResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupBusinessMetadataResultOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) *string { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o LookupBusinessMetadataResultOutput) SchemaRegistryCluster() GetBusinessMetadataSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) *GetBusinessMetadataSchemaRegistryCluster {
		return v.SchemaRegistryCluster
	}).(GetBusinessMetadataSchemaRegistryClusterPtrOutput)
}

// (Required Integer) The version of the Business Metadata, for example, `1`.
func (o LookupBusinessMetadataResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupBusinessMetadataResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBusinessMetadataResultOutput{})
}
