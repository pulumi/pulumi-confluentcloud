// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupTag(ctx *pulumi.Context, args *LookupTagArgs, opts ...pulumi.InvokeOption) (*LookupTagResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTagResult
	err := ctx.Invoke("confluentcloud:index/getTag:getTag", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTag.
type LookupTagArgs struct {
	Credentials *GetTagCredentials `pulumi:"credentials"`
	// The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	//
	// > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
	Name string `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                      `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetTagSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// A collection of values returned by getTag.
type LookupTagResult struct {
	Credentials *GetTagCredentials `pulumi:"credentials"`
	// (Optional String) The description of the tag.
	Description string `pulumi:"description"`
	// (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`.
	EntityTypes []string `pulumi:"entityTypes"`
	// (Required String) The ID of the Tag, in the format `<Schema Registry cluster ID>/<Tag name>`, for example, `lsrc-8wrx70/PII`.
	Id                    string                       `pulumi:"id"`
	Name                  string                       `pulumi:"name"`
	RestEndpoint          *string                      `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetTagSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// (Optional Integer) The version, for example, `1`.
	Version int `pulumi:"version"`
}

func LookupTagOutput(ctx *pulumi.Context, args LookupTagOutputArgs, opts ...pulumi.InvokeOption) LookupTagResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTagResultOutput, error) {
			args := v.(LookupTagArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupTagResult
			secret, err := ctx.InvokePackageRaw("confluentcloud:index/getTag:getTag", args, &rv, "", opts...)
			if err != nil {
				return LookupTagResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupTagResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupTagResultOutput), nil
			}
			return output, nil
		}).(LookupTagResultOutput)
}

// A collection of arguments for invoking getTag.
type LookupTagOutputArgs struct {
	Credentials GetTagCredentialsPtrInput `pulumi:"credentials"`
	// The name of the tag, for example, `PII`. The name must not be empty and consist of a letter followed by a sequence of letter, number, space, or _ characters.
	//
	// > **Note:** A Schema Registry API key consists of a key and a secret. Schema Registry API keys are required to interact with Schema Registry clusters in Confluent Cloud. Each Schema Registry API key is valid for one specific Schema Registry cluster.
	Name pulumi.StringInput `pulumi:"name"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput               `pulumi:"restEndpoint"`
	SchemaRegistryCluster GetTagSchemaRegistryClusterPtrInput `pulumi:"schemaRegistryCluster"`
}

func (LookupTagOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTagArgs)(nil)).Elem()
}

// A collection of values returned by getTag.
type LookupTagResultOutput struct{ *pulumi.OutputState }

func (LookupTagResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTagResult)(nil)).Elem()
}

func (o LookupTagResultOutput) ToLookupTagResultOutput() LookupTagResultOutput {
	return o
}

func (o LookupTagResultOutput) ToLookupTagResultOutputWithContext(ctx context.Context) LookupTagResultOutput {
	return o
}

func (o LookupTagResultOutput) Credentials() GetTagCredentialsPtrOutput {
	return o.ApplyT(func(v LookupTagResult) *GetTagCredentials { return v.Credentials }).(GetTagCredentialsPtrOutput)
}

// (Optional String) The description of the tag.
func (o LookupTagResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Optional List of String) The entity types of the tag, this always returns `["cfEntity"]`.
func (o LookupTagResultOutput) EntityTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTagResult) []string { return v.EntityTypes }).(pulumi.StringArrayOutput)
}

// (Required String) The ID of the Tag, in the format `<Schema Registry cluster ID>/<Tag name>`, for example, `lsrc-8wrx70/PII`.
func (o LookupTagResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupTagResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupTagResultOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTagResult) *string { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o LookupTagResultOutput) SchemaRegistryCluster() GetTagSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v LookupTagResult) *GetTagSchemaRegistryCluster { return v.SchemaRegistryCluster }).(GetTagSchemaRegistryClusterPtrOutput)
}

// (Optional Integer) The version, for example, `1`.
func (o LookupTagResultOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTagResult) int { return v.Version }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTagResultOutput{})
}
