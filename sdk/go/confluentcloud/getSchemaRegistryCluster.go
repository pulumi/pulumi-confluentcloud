// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			// Loads the only Schema Registry cluster in the target environment
//			exampleUsingEnvId, err := confluentcloud.LookupSchemaRegistryCluster(ctx, &confluentcloud.LookupSchemaRegistryClusterArgs{
//				Environment: confluentcloud.GetSchemaRegistryClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingEnvId", exampleUsingEnvId)
//			exampleUsingId, err := confluentcloud.LookupSchemaRegistryCluster(ctx, &confluentcloud.LookupSchemaRegistryClusterArgs{
//				Id: pulumi.StringRef("lsrc-abc123"),
//				Environment: confluentcloud.GetSchemaRegistryClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingId)
//			exampleUsingName, err := confluentcloud.LookupSchemaRegistryCluster(ctx, &confluentcloud.LookupSchemaRegistryClusterArgs{
//				DisplayName: pulumi.StringRef("Stream Governance Package"),
//				Environment: confluentcloud.GetSchemaRegistryClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingName", exampleUsingName)
//			return nil
//		})
//	}
//
// ```
func LookupSchemaRegistryCluster(ctx *pulumi.Context, args *LookupSchemaRegistryClusterArgs, opts ...pulumi.InvokeOption) (*LookupSchemaRegistryClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSchemaRegistryClusterResult
	err := ctx.Invoke("confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemaRegistryCluster.
type LookupSchemaRegistryClusterArgs struct {
	// The name for the Schema Registry cluster.
	DisplayName *string                             `pulumi:"displayName"`
	Environment GetSchemaRegistryClusterEnvironment `pulumi:"environment"`
	// The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
	Id *string `pulumi:"id"`
}

// A collection of values returned by getSchemaRegistryCluster.
type LookupSchemaRegistryClusterResult struct {
	// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
	ApiVersion string `pulumi:"apiVersion"`
	// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
	DisplayName string                              `pulumi:"displayName"`
	Environment GetSchemaRegistryClusterEnvironment `pulumi:"environment"`
	// (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See Schema Registry Regions.
	Id string `pulumi:"id"`
	// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
	Kind string `pulumi:"kind"`
	// (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
	Package string `pulumi:"package"`
	// (Required Configuration Block) supports the following:
	Regions []GetSchemaRegistryClusterRegion `pulumi:"regions"`
	// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
	ResourceName string `pulumi:"resourceName"`
	// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
	RestEndpoint string `pulumi:"restEndpoint"`
}

func LookupSchemaRegistryClusterOutput(ctx *pulumi.Context, args LookupSchemaRegistryClusterOutputArgs, opts ...pulumi.InvokeOption) LookupSchemaRegistryClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSchemaRegistryClusterResult, error) {
			args := v.(LookupSchemaRegistryClusterArgs)
			r, err := LookupSchemaRegistryCluster(ctx, &args, opts...)
			var s LookupSchemaRegistryClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSchemaRegistryClusterResultOutput)
}

// A collection of arguments for invoking getSchemaRegistryCluster.
type LookupSchemaRegistryClusterOutputArgs struct {
	// The name for the Schema Registry cluster.
	DisplayName pulumi.StringPtrInput                    `pulumi:"displayName"`
	Environment GetSchemaRegistryClusterEnvironmentInput `pulumi:"environment"`
	// The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupSchemaRegistryClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaRegistryClusterArgs)(nil)).Elem()
}

// A collection of values returned by getSchemaRegistryCluster.
type LookupSchemaRegistryClusterResultOutput struct{ *pulumi.OutputState }

func (LookupSchemaRegistryClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaRegistryClusterResult)(nil)).Elem()
}

func (o LookupSchemaRegistryClusterResultOutput) ToLookupSchemaRegistryClusterResultOutput() LookupSchemaRegistryClusterResultOutput {
	return o
}

func (o LookupSchemaRegistryClusterResultOutput) ToLookupSchemaRegistryClusterResultOutputWithContext(ctx context.Context) LookupSchemaRegistryClusterResultOutput {
	return o
}

// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
func (o LookupSchemaRegistryClusterResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
func (o LookupSchemaRegistryClusterResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupSchemaRegistryClusterResultOutput) Environment() GetSchemaRegistryClusterEnvironmentOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) GetSchemaRegistryClusterEnvironment { return v.Environment }).(GetSchemaRegistryClusterEnvironmentOutput)
}

// (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `sgreg-1`. See Schema Registry Regions.
func (o LookupSchemaRegistryClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
func (o LookupSchemaRegistryClusterResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
func (o LookupSchemaRegistryClusterResultOutput) Package() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) string { return v.Package }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupSchemaRegistryClusterResultOutput) Regions() GetSchemaRegistryClusterRegionArrayOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) []GetSchemaRegistryClusterRegion { return v.Regions }).(GetSchemaRegistryClusterRegionArrayOutput)
}

// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
func (o LookupSchemaRegistryClusterResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
func (o LookupSchemaRegistryClusterResultOutput) RestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaRegistryClusterResult) string { return v.RestEndpoint }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSchemaRegistryClusterResultOutput{})
}
