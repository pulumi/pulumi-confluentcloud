// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `SchemaRegistryClusterMode` describes a Mode data source.
//
// ## Example Usage
//
// ### Option #1: Manage multiple Schema Registry clusters in the same Pulumi Stack
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := confluentcloud.LookupSchemaRegistryClusterMode(ctx, &confluentcloud.LookupSchemaRegistryClusterModeArgs{
//				SchemaRegistryCluster: confluentcloud.GetSchemaRegistryClusterModeSchemaRegistryCluster{
//					Id: essentials.Id,
//				},
//				RestEndpoint: pulumi.StringRef(essentials.RestEndpoint),
//				Credentials: confluentcloud.GetSchemaRegistryClusterModeCredentials{
//					Key:    "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
//					Secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mode", example.Mode)
//			return nil
//		})
//	}
//
// ```
//
// ### Option #2: Manage a single Schema Registry cluster in the same Pulumi Stack
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := confluentcloud.LookupSchemaRegistryClusterMode(ctx, &confluentcloud.LookupSchemaRegistryClusterModeArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("mode", example.Mode)
//			return nil
//		})
//	}
//
// ```
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
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSchemaRegistryClusterModeResultOutput, error) {
			args := v.(LookupSchemaRegistryClusterModeArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("confluentcloud:index/getSchemaRegistryClusterMode:getSchemaRegistryClusterMode", args, LookupSchemaRegistryClusterModeResultOutput{}, options).(LookupSchemaRegistryClusterModeResultOutput), nil
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
