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

func LookupSchemaRegistryClusterMode(ctx *pulumi.Context, args *LookupSchemaRegistryClusterModeArgs, opts ...pulumi.InvokeOption) (*LookupSchemaRegistryClusterModeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSchemaRegistryClusterModeResult
	err := ctx.Invoke("confluentcloud:index/getSchemaRegistryClusterMode:getSchemaRegistryClusterMode", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemaRegistryClusterMode.
type LookupSchemaRegistryClusterModeArgs struct {
	Credentials *GetSchemaRegistryClusterModeCredentials `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          *string                                            `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetSchemaRegistryClusterModeSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

// A collection of values returned by getSchemaRegistryClusterMode.
type LookupSchemaRegistryClusterModeResult struct {
	Credentials *GetSchemaRegistryClusterModeCredentials `pulumi:"credentials"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Optional String) The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
	Mode                  string                                             `pulumi:"mode"`
	RestEndpoint          *string                                            `pulumi:"restEndpoint"`
	SchemaRegistryCluster *GetSchemaRegistryClusterModeSchemaRegistryCluster `pulumi:"schemaRegistryCluster"`
}

func LookupSchemaRegistryClusterModeOutput(ctx *pulumi.Context, args LookupSchemaRegistryClusterModeOutputArgs, opts ...pulumi.InvokeOption) LookupSchemaRegistryClusterModeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSchemaRegistryClusterModeResult, error) {
			args := v.(LookupSchemaRegistryClusterModeArgs)
			r, err := LookupSchemaRegistryClusterMode(ctx, &args, opts...)
			var s LookupSchemaRegistryClusterModeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSchemaRegistryClusterModeResultOutput)
}

// A collection of arguments for invoking getSchemaRegistryClusterMode.
type LookupSchemaRegistryClusterModeOutputArgs struct {
	Credentials GetSchemaRegistryClusterModeCredentialsPtrInput `pulumi:"credentials"`
	// The REST endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint          pulumi.StringPtrInput                                     `pulumi:"restEndpoint"`
	SchemaRegistryCluster GetSchemaRegistryClusterModeSchemaRegistryClusterPtrInput `pulumi:"schemaRegistryCluster"`
}

func (LookupSchemaRegistryClusterModeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaRegistryClusterModeArgs)(nil)).Elem()
}

// A collection of values returned by getSchemaRegistryClusterMode.
type LookupSchemaRegistryClusterModeResultOutput struct{ *pulumi.OutputState }

func (LookupSchemaRegistryClusterModeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaRegistryClusterModeResult)(nil)).Elem()
}

func (o LookupSchemaRegistryClusterModeResultOutput) ToLookupSchemaRegistryClusterModeResultOutput() LookupSchemaRegistryClusterModeResultOutput {
	return o
}

func (o LookupSchemaRegistryClusterModeResultOutput) ToLookupSchemaRegistryClusterModeResultOutputWithContext(ctx context.Context) LookupSchemaRegistryClusterModeResultOutput {
	return o
}

func (o LookupSchemaRegistryClusterModeResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupSchemaRegistryClusterModeResult] {
	return pulumix.Output[LookupSchemaRegistryClusterModeResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupSchemaRegistryClusterModeResultOutput) Credentials() GetSchemaRegistryClusterModeCredentialsPtrOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterModeResult) *GetSchemaRegistryClusterModeCredentials {
		return v.Credentials
	}).(GetSchemaRegistryClusterModeCredentialsPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSchemaRegistryClusterModeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterModeResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Optional String) The global Schema Registry mode. Accepted values are: `READWRITE`, `READONLY`, `READONLY_OVERRIDE`, and `IMPORT`.
func (o LookupSchemaRegistryClusterModeResultOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterModeResult) string { return v.Mode }).(pulumi.StringOutput)
}

func (o LookupSchemaRegistryClusterModeResultOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterModeResult) *string { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

func (o LookupSchemaRegistryClusterModeResultOutput) SchemaRegistryCluster() GetSchemaRegistryClusterModeSchemaRegistryClusterPtrOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterModeResult) *GetSchemaRegistryClusterModeSchemaRegistryCluster {
		return v.SchemaRegistryCluster
	}).(GetSchemaRegistryClusterModeSchemaRegistryClusterPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSchemaRegistryClusterModeResultOutput{})
}
