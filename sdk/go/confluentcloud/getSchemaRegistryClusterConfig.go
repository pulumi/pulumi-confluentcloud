// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
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
// `SchemaRegistryClusterConfig` describes a Schema Registry Cluster Config data source.
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
//			example, err := confluentcloud.LookupSchemaRegistryClusterConfig(ctx, &confluentcloud.LookupSchemaRegistryClusterConfigArgs{
//				SchemaRegistryCluster: confluentcloud.GetSchemaRegistryClusterConfigSchemaRegistryCluster{
//					Id: essentials.Id,
//				},
//				RestEndpoint: pulumi.StringRef(essentials.RestEndpoint),
//				Credentials: confluentcloud.GetSchemaRegistryClusterConfigCredentials{
//					Key:    "<Schema Registry API Key for data.confluent_schema_registry_cluster.essentials>",
//					Secret: "<Schema Registry API Secret for data.confluent_schema_registry_cluster.essentials>",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("compatibilityLevel", example.CompatibilityLevel)
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
//			example, err := confluentcloud.LookupSchemaRegistryClusterConfig(ctx, &confluentcloud.LookupSchemaRegistryClusterConfigArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("compatibilityLevel", example.CompatibilityLevel)
//			return nil
//		})
//	}
//
// ```
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
		ApplyT(func(v interface{}) (LookupSchemaRegistryClusterConfigResultOutput, error) {
			args := v.(LookupSchemaRegistryClusterConfigArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupSchemaRegistryClusterConfigResult
			secret, err := ctx.InvokePackageRaw("confluentcloud:index/getSchemaRegistryClusterConfig:getSchemaRegistryClusterConfig", args, &rv, "", opts...)
			if err != nil {
				return LookupSchemaRegistryClusterConfigResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupSchemaRegistryClusterConfigResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupSchemaRegistryClusterConfigResultOutput), nil
			}
			return output, nil
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
