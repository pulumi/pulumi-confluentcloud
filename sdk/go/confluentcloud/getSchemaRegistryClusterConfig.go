// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

func LookupSchemaRegistryClusterConfig(ctx *pulumi.Context, args *LookupSchemaRegistryClusterConfigArgs, opts ...pulumi.InvokeOption) (*LookupSchemaRegistryClusterConfigResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSchemaRegistryClusterConfigResult
	err := ctx.Invoke("confluentcloud:index/getSchemaRegistryClusterConfig:getSchemaRegistryClusterConfig", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemaRegistryClusterConfig.
type LookupSchemaRegistryClusterConfigArgs struct {
	Credentials *GetSchemaRegistryClusterConfigCredentials `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                              `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetSchemaRegistryClusterConfigSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// A collection of values returned by getSchemaRegistryClusterConfig.
type LookupSchemaRegistryClusterConfigResult struct {
	// (Required String) The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
	CompatibilityLevel string                                     `pulumi:"compatibilityLevel"`
	Credentials        *GetSchemaRegistryClusterConfigCredentials `pulumi:"credentials"`
	// The provider-assigned unique ID for this managed resource.
	Id                    string                                               `pulumi:"id"`
	RestEndpoint          *string                                              `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetSchemaRegistryClusterConfigSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

func LookupSchemaRegistryClusterConfigOutput(ctx *pulumi.Context, args LookupSchemaRegistryClusterConfigOutputArgs, opts ...pulumi.InvokeOption) LookupSchemaRegistryClusterConfigResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSchemaRegistryClusterConfigResult, error) {
			args := v.(LookupSchemaRegistryClusterConfigArgs)
			r, err := LookupSchemaRegistryClusterConfig(ctx, &args, opts...)
			var s LookupSchemaRegistryClusterConfigResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSchemaRegistryClusterConfigResultOutput)
}

// A collection of arguments for invoking getSchemaRegistryClusterConfig.
type LookupSchemaRegistryClusterConfigOutputArgs struct {
	Credentials GetSchemaRegistryClusterConfigCredentialsPtrInput `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput                                       `pulumi:"restEndpoint"`
	SchemaRegistryCluster GetSchemaRegistryClusterConfigSchemaRegistryClusterPtrInput `pulumi:"schemaRegistryCluster"`
}

func (LookupSchemaRegistryClusterConfigOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaRegistryClusterConfigArgs)(nil)).Elem()
}

// A collection of values returned by getSchemaRegistryClusterConfig.
type LookupSchemaRegistryClusterConfigResultOutput struct{ *pulumi.OutputState }

func (LookupSchemaRegistryClusterConfigResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaRegistryClusterConfigResult)(nil)).Elem()
}

func (o LookupSchemaRegistryClusterConfigResultOutput) ToLookupSchemaRegistryClusterConfigResultOutput() LookupSchemaRegistryClusterConfigResultOutput {
	return o
}

func (o LookupSchemaRegistryClusterConfigResultOutput) ToLookupSchemaRegistryClusterConfigResultOutputWithContext(ctx context.Context) LookupSchemaRegistryClusterConfigResultOutput {
	return o
}

func (o LookupSchemaRegistryClusterConfigResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupSchemaRegistryClusterConfigResult] {
	return pulumix.Output[LookupSchemaRegistryClusterConfigResult]{
		OutputState: o.OutputState,
	}
}

// (Required String) The global Schema Registry compatibility level. Accepted values are: `BACKWARD`, `BACKWARD_TRANSITIVE`, `FORWARD`, `FORWARD_TRANSITIVE`, `FULL`, `FULL_TRANSITIVE`, and `NONE`. See the [Compatibility Types](https://docs.confluent.io/platform/current/schema-registry/avro.html#compatibility-types) for more details.
func (o LookupSchemaRegistryClusterConfigResultOutput) CompatibilityLevel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterConfigResult) string { return v.CompatibilityLevel }).(pulumi.StringOutput)
}

func (o LookupSchemaRegistryClusterConfigResultOutput) Credentials() GetSchemaRegistryClusterConfigCredentialsPtrOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterConfigResult) *GetSchemaRegistryClusterConfigCredentials {
		return v.Credentials
	}).(GetSchemaRegistryClusterConfigCredentialsPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSchemaRegistryClusterConfigResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterConfigResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSchemaRegistryClusterConfigResultOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterConfigResult) *string { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o LookupSchemaRegistryClusterConfigResultOutput) SchemaRegistryCluster() GetSchemaRegistryClusterConfigSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterConfigResult) *GetSchemaRegistryClusterConfigSchemaRegistryCluster {
		return v.SchemaRegistryCluster
	}).(GetSchemaRegistryClusterConfigSchemaRegistryClusterPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSchemaRegistryClusterConfigResultOutput{})
}
