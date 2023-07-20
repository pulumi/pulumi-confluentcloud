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
// `KafkaCluster` describes a Kafka cluster data source.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleUsingId, err := confluentcloud.LookupKafkaCluster(ctx, &confluentcloud.LookupKafkaClusterArgs{
//				Id: pulumi.StringRef("lkc-abc123"),
//				Environment: confluentcloud.GetKafkaClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewServiceAccount(ctx, "test-sa", &confluentcloud.ServiceAccountArgs{
//				Description: pulumi.String(fmt.Sprintf("app_mgr for %v", exampleUsingId.DisplayName)),
//			})
//			if err != nil {
//				return err
//			}
//			exampleUsingNameKafkaCluster, err := confluentcloud.LookupKafkaCluster(ctx, &confluentcloud.LookupKafkaClusterArgs{
//				DisplayName: pulumi.StringRef("basic_kafka_cluster"),
//				Environment: confluentcloud.GetKafkaClusterEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingName", exampleUsingNameKafkaCluster)
//			return nil
//		})
//	}
//
// ```
func LookupKafkaCluster(ctx *pulumi.Context, args *LookupKafkaClusterArgs, opts ...pulumi.InvokeOption) (*LookupKafkaClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKafkaClusterResult
	err := ctx.Invoke("confluentcloud:index/getKafkaCluster:getKafkaCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKafkaCluster.
type LookupKafkaClusterArgs struct {
	// (Optional Configuration Block) The configuration of the Basic Kafka cluster.
	Basics []GetKafkaClusterBasic `pulumi:"basics"`
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated *GetKafkaClusterDedicated `pulumi:"dedicated"`
	// A human-readable name for the Kafka cluster.
	DisplayName *string                    `pulumi:"displayName"`
	Environment GetKafkaClusterEnvironment `pulumi:"environment"`
	// The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	Id *string `pulumi:"id"`
	// (Optional Configuration Block) The configuration of the Standard Kafka cluster.
	Standards []GetKafkaClusterStandard `pulumi:"standards"`
}

// A collection of values returned by getKafkaCluster.
type LookupKafkaClusterResult struct {
	// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
	ApiVersion string `pulumi:"apiVersion"`
	// (Required String) The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
	Availability string `pulumi:"availability"`
	// (Optional Configuration Block) The configuration of the Basic Kafka cluster.
	Basics []GetKafkaClusterBasic `pulumi:"basics"`
	// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
	BootstrapEndpoint string `pulumi:"bootstrapEndpoint"`
	// (Optional Configuration Block) supports the following:
	ByokKeys []GetKafkaClusterByokKey `pulumi:"byokKeys"`
	// (Required String) The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud string `pulumi:"cloud"`
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated *GetKafkaClusterDedicated `pulumi:"dedicated"`
	// (Required String) The name of the Kafka cluster.
	DisplayName string                     `pulumi:"displayName"`
	Environment GetKafkaClusterEnvironment `pulumi:"environment"`
	// (Required String) The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
	Id string `pulumi:"id"`
	// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
	Kind string `pulumi:"kind"`
	// (Optional Configuration Block) supports the following:
	Networks []GetKafkaClusterNetwork `pulumi:"networks"`
	// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
	RbacCrn string `pulumi:"rbacCrn"`
	// (Required String) The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region string `pulumi:"region"`
	// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint string `pulumi:"restEndpoint"`
	// (Optional Configuration Block) The configuration of the Standard Kafka cluster.
	Standards []GetKafkaClusterStandard `pulumi:"standards"`
}

func LookupKafkaClusterOutput(ctx *pulumi.Context, args LookupKafkaClusterOutputArgs, opts ...pulumi.InvokeOption) LookupKafkaClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKafkaClusterResult, error) {
			args := v.(LookupKafkaClusterArgs)
			r, err := LookupKafkaCluster(ctx, &args, opts...)
			var s LookupKafkaClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupKafkaClusterResultOutput)
}

// A collection of arguments for invoking getKafkaCluster.
type LookupKafkaClusterOutputArgs struct {
	// (Optional Configuration Block) The configuration of the Basic Kafka cluster.
	Basics GetKafkaClusterBasicArrayInput `pulumi:"basics"`
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated GetKafkaClusterDedicatedPtrInput `pulumi:"dedicated"`
	// A human-readable name for the Kafka cluster.
	DisplayName pulumi.StringPtrInput           `pulumi:"displayName"`
	Environment GetKafkaClusterEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the Kafka cluster belongs to, for example, `env-xyz456`.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// (Optional Configuration Block) The configuration of the Standard Kafka cluster.
	Standards GetKafkaClusterStandardArrayInput `pulumi:"standards"`
}

func (LookupKafkaClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaClusterArgs)(nil)).Elem()
}

// A collection of values returned by getKafkaCluster.
type LookupKafkaClusterResultOutput struct{ *pulumi.OutputState }

func (LookupKafkaClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaClusterResult)(nil)).Elem()
}

func (o LookupKafkaClusterResultOutput) ToLookupKafkaClusterResultOutput() LookupKafkaClusterResultOutput {
	return o
}

func (o LookupKafkaClusterResultOutput) ToLookupKafkaClusterResultOutputWithContext(ctx context.Context) LookupKafkaClusterResultOutput {
	return o
}

// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
func (o LookupKafkaClusterResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// (Required String) The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE` and `MULTI_ZONE`.
func (o LookupKafkaClusterResultOutput) Availability() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.Availability }).(pulumi.StringOutput)
}

// (Optional Configuration Block) The configuration of the Basic Kafka cluster.
func (o LookupKafkaClusterResultOutput) Basics() GetKafkaClusterBasicArrayOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) []GetKafkaClusterBasic { return v.Basics }).(GetKafkaClusterBasicArrayOutput)
}

// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `pkc-00000.us-central1.gcp.confluent.cloud:9092`).
func (o LookupKafkaClusterResultOutput) BootstrapEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.BootstrapEndpoint }).(pulumi.StringOutput)
}

// (Optional Configuration Block) supports the following:
func (o LookupKafkaClusterResultOutput) ByokKeys() GetKafkaClusterByokKeyArrayOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) []GetKafkaClusterByokKey { return v.ByokKeys }).(GetKafkaClusterByokKeyArrayOutput)
}

// (Required String) The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
func (o LookupKafkaClusterResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
func (o LookupKafkaClusterResultOutput) Dedicated() GetKafkaClusterDedicatedPtrOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) *GetKafkaClusterDedicated { return v.Dedicated }).(GetKafkaClusterDedicatedPtrOutput)
}

// (Required String) The name of the Kafka cluster.
func (o LookupKafkaClusterResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupKafkaClusterResultOutput) Environment() GetKafkaClusterEnvironmentOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) GetKafkaClusterEnvironment { return v.Environment }).(GetKafkaClusterEnvironmentOutput)
}

// (Required String) The ID of the Confluent key that is used to encrypt the data in the Kafka cluster, for example, `cck-lye5m`.
func (o LookupKafkaClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
func (o LookupKafkaClusterResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.Kind }).(pulumi.StringOutput)
}

// (Optional Configuration Block) supports the following:
func (o LookupKafkaClusterResultOutput) Networks() GetKafkaClusterNetworkArrayOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) []GetKafkaClusterNetwork { return v.Networks }).(GetKafkaClusterNetworkArrayOutput)
}

// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
func (o LookupKafkaClusterResultOutput) RbacCrn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.RbacCrn }).(pulumi.StringOutput)
}

// (Required String) The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
func (o LookupKafkaClusterResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
func (o LookupKafkaClusterResultOutput) RestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) string { return v.RestEndpoint }).(pulumi.StringOutput)
}

// (Optional Configuration Block) The configuration of the Standard Kafka cluster.
func (o LookupKafkaClusterResultOutput) Standards() GetKafkaClusterStandardArrayOutput {
	return o.ApplyT(func(v LookupKafkaClusterResult) []GetKafkaClusterStandard { return v.Standards }).(GetKafkaClusterStandardArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKafkaClusterResultOutput{})
}
