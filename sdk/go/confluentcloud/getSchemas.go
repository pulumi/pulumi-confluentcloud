// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetSchemas(ctx *pulumi.Context, args *GetSchemasArgs, opts ...pulumi.InvokeOption) (*GetSchemasResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSchemasResult
	err := ctx.Invoke("confluentcloud:index/getSchemas:getSchemas", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemas.
type GetSchemasArgs struct {
	Credentials *GetSchemasCredentials `pulumi:"credentials"`
	Filter      *GetSchemasFilter      `pulumi:"filter"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetSchemasSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// A collection of values returned by getSchemas.
type GetSchemasResult struct {
	Credentials *GetSchemasCredentials `pulumi:"credentials"`
	Filter      *GetSchemasFilter      `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id                    string                           `pulumi:"id"`
	RestEndpoint          *string                          `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetSchemasSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
	// (List of Object) List of schemas. Each schema object exports the following attributes:
	Schemas []GetSchemasSchema `pulumi:"schemas"`
}

func GetSchemasOutput(ctx *pulumi.Context, args GetSchemasOutputArgs, opts ...pulumi.InvokeOption) GetSchemasResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSchemasResultOutput, error) {
			args := v.(GetSchemasArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetSchemasResult
			secret, err := ctx.InvokePackageRaw("confluentcloud:index/getSchemas:getSchemas", args, &rv, "", opts...)
			if err != nil {
				return GetSchemasResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetSchemasResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetSchemasResultOutput), nil
			}
			return output, nil
		}).(GetSchemasResultOutput)
}

// A collection of arguments for invoking getSchemas.
type GetSchemasOutputArgs struct {
	Credentials GetSchemasCredentialsPtrInput `pulumi:"credentials"`
	Filter      GetSchemasFilterPtrInput      `pulumi:"filter"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput                   `pulumi:"restEndpoint"`
	SchemaRegistryCluster GetSchemasSchemaRegistryClusterPtrInput `pulumi:"schemaRegistryCluster"`
}

func (GetSchemasOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemasArgs)(nil)).Elem()
}

// A collection of values returned by getSchemas.
type GetSchemasResultOutput struct{ *pulumi.OutputState }

func (GetSchemasResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemasResult)(nil)).Elem()
}

func (o GetSchemasResultOutput) ToGetSchemasResultOutput() GetSchemasResultOutput {
	return o
}

func (o GetSchemasResultOutput) ToGetSchemasResultOutputWithContext(ctx context.Context) GetSchemasResultOutput {
	return o
}

func (o GetSchemasResultOutput) Credentials() GetSchemasCredentialsPtrOutput {
	return o.ApplyT(func(v GetSchemasResult) *GetSchemasCredentials { return v.Credentials }).(GetSchemasCredentialsPtrOutput)
}

func (o GetSchemasResultOutput) Filter() GetSchemasFilterPtrOutput {
	return o.ApplyT(func(v GetSchemasResult) *GetSchemasFilter { return v.Filter }).(GetSchemasFilterPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSchemasResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemasResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSchemasResultOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSchemasResult) *string { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o GetSchemasResultOutput) SchemaRegistryCluster() GetSchemasSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v GetSchemasResult) *GetSchemasSchemaRegistryCluster { return v.SchemaRegistryCluster }).(GetSchemasSchemaRegistryClusterPtrOutput)
}

// (List of Object) List of schemas. Each schema object exports the following attributes:
func (o GetSchemasResultOutput) Schemas() GetSchemasSchemaArrayOutput {
	return o.ApplyT(func(v GetSchemasResult) []GetSchemasSchema { return v.Schemas }).(GetSchemasSchemaArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSchemasResultOutput{})
}
