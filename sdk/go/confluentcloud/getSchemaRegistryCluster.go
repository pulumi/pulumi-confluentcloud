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
// `data.confluent_schema_registry_cluster` describes a Schema Registry cluster data source.
//
// ## Example Usage
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
//			// Loads the only Schema Registry cluster in the target environment
//			exampleUsingEnvId, err := confluentcloud.GetSchemaRegistryCluster(ctx, &confluentcloud.GetSchemaRegistryClusterArgs{
//				Environment: confluentcloud.GetSchemaRegistryClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingEnvId", exampleUsingEnvId)
//			exampleUsingId, err := confluentcloud.GetSchemaRegistryCluster(ctx, &confluentcloud.GetSchemaRegistryClusterArgs{
//				Id: pulumi.StringRef("lsrc-abc123"),
//				Environment: confluentcloud.GetSchemaRegistryClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingId)
//			exampleUsingName, err := confluentcloud.GetSchemaRegistryCluster(ctx, &confluentcloud.GetSchemaRegistryClusterArgs{
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
func GetSchemaRegistryCluster(ctx *pulumi.Context, args *GetSchemaRegistryClusterArgs, opts ...pulumi.InvokeOption) (*GetSchemaRegistryClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSchemaRegistryClusterResult
	err := ctx.Invoke("confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemaRegistryCluster.
type GetSchemaRegistryClusterArgs struct {
	// The name for the Schema Registry cluster.
	DisplayName *string                             `pulumi:"displayName"`
	Environment GetSchemaRegistryClusterEnvironment `pulumi:"environment"`
	// The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
	Id *string `pulumi:"id"`
}

// A collection of values returned by getSchemaRegistryCluster.
type GetSchemaRegistryClusterResult struct {
	// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
	ApiVersion string `pulumi:"apiVersion"`
	// (Required String) The Catalog endpoint of the Schema Registry cluster, for example, `https://psrc-y1113.us-west-2.aws.confluent.cloud`.
	CatalogEndpoint string `pulumi:"catalogEndpoint"`
	// (Required String) The cloud service provider that the Schema Registry cluster belongs to, for example, `AWS`.
	Cloud string `pulumi:"cloud"`
	// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
	DisplayName string                              `pulumi:"displayName"`
	Environment GetSchemaRegistryClusterEnvironment `pulumi:"environment"`
	// (Required String) The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
	Id string `pulumi:"id"`
	// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
	Kind string `pulumi:"kind"`
	// (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
	Package string `pulumi:"package"`
	// (Required String) The private HTTP endpoint of the Schema Registry cluster, for example, `https://lsrc.us-west-2.aws.private.confluent.cloud`.
	PrivateRestEndpoint string `pulumi:"privateRestEndpoint"`
	// (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `us-east4`.
	Region string `pulumi:"region"`
	// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
	ResourceName string `pulumi:"resourceName"`
	// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
	RestEndpoint string `pulumi:"restEndpoint"`
}

func GetSchemaRegistryClusterOutput(ctx *pulumi.Context, args GetSchemaRegistryClusterOutputArgs, opts ...pulumi.InvokeOption) GetSchemaRegistryClusterResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSchemaRegistryClusterResultOutput, error) {
			args := v.(GetSchemaRegistryClusterArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("confluentcloud:index/getSchemaRegistryCluster:getSchemaRegistryCluster", args, GetSchemaRegistryClusterResultOutput{}, options).(GetSchemaRegistryClusterResultOutput), nil
		}).(GetSchemaRegistryClusterResultOutput)
}

// A collection of arguments for invoking getSchemaRegistryCluster.
type GetSchemaRegistryClusterOutputArgs struct {
	// The name for the Schema Registry cluster.
	DisplayName pulumi.StringPtrInput                    `pulumi:"displayName"`
	Environment GetSchemaRegistryClusterEnvironmentInput `pulumi:"environment"`
	// The ID of the Schema Registry cluster (for example, `lsrc-abc123`).
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (GetSchemaRegistryClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemaRegistryClusterArgs)(nil)).Elem()
}

// A collection of values returned by getSchemaRegistryCluster.
type GetSchemaRegistryClusterResultOutput struct{ *pulumi.OutputState }

func (GetSchemaRegistryClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemaRegistryClusterResult)(nil)).Elem()
}

func (o GetSchemaRegistryClusterResultOutput) ToGetSchemaRegistryClusterResultOutput() GetSchemaRegistryClusterResultOutput {
	return o
}

func (o GetSchemaRegistryClusterResultOutput) ToGetSchemaRegistryClusterResultOutputWithContext(ctx context.Context) GetSchemaRegistryClusterResultOutput {
	return o
}

// (Required String) An API Version of the schema version of the Schema Registry cluster, for example, `stream-governance/v2`.
func (o GetSchemaRegistryClusterResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// (Required String) The Catalog endpoint of the Schema Registry cluster, for example, `https://psrc-y1113.us-west-2.aws.confluent.cloud`.
func (o GetSchemaRegistryClusterResultOutput) CatalogEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.CatalogEndpoint }).(pulumi.StringOutput)
}

// (Required String) The cloud service provider that the Schema Registry cluster belongs to, for example, `AWS`.
func (o GetSchemaRegistryClusterResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Required String) The name of the Schema Registry cluster, for example, `Stream Governance Package`.
func (o GetSchemaRegistryClusterResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o GetSchemaRegistryClusterResultOutput) Environment() GetSchemaRegistryClusterEnvironmentOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) GetSchemaRegistryClusterEnvironment { return v.Environment }).(GetSchemaRegistryClusterEnvironmentOutput)
}

// (Required String) The ID of the Schema Registry cluster, for example, `lsrc-abc123`.
func (o GetSchemaRegistryClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A kind of the Schema Registry cluster, for example, `Cluster`.
func (o GetSchemaRegistryClusterResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Required String) The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
func (o GetSchemaRegistryClusterResultOutput) Package() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.Package }).(pulumi.StringOutput)
}

// (Required String) The private HTTP endpoint of the Schema Registry cluster, for example, `https://lsrc.us-west-2.aws.private.confluent.cloud`.
func (o GetSchemaRegistryClusterResultOutput) PrivateRestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.PrivateRestEndpoint }).(pulumi.StringOutput)
}

// (Required String) The ID of the Schema Registry region that the Schema Registry cluster belongs to, for example, `us-east4`.
func (o GetSchemaRegistryClusterResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Schema Registry cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/schema-registry=lsrc-abc123`.
func (o GetSchemaRegistryClusterResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

// (Required String) The HTTP endpoint of the Schema Registry cluster, for example, `https://psrc-00000.us-west-2.aws.confluent.cloud`.
func (o GetSchemaRegistryClusterResultOutput) RestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryClusterResult) string { return v.RestEndpoint }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSchemaRegistryClusterResultOutput{})
}
