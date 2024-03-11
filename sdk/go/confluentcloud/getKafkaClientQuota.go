// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](<https://img.shields.io/badge/Lifecycle%!S(MISSING)tage-General%!A(MISSING)vailability-%!c(MISSING)6e8>)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `KafkaClientQuota` describes a Kafka Client Quota.
//
// > **Note:** See [Control application usage with Client Quotas](https://docs.confluent.io/cloud/current/clusters/client-quotas.html#control-application-usage-with-client-quotas) for more details.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			exampleKafkaClientQuota, err := confluentcloud.LookupKafkaClientQuota(ctx, &confluentcloud.LookupKafkaClientQuotaArgs{
//				Id: "cq-abc123",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("example", exampleKafkaClientQuota)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupKafkaClientQuota(ctx *pulumi.Context, args *LookupKafkaClientQuotaArgs, opts ...pulumi.InvokeOption) (*LookupKafkaClientQuotaResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKafkaClientQuotaResult
	err := ctx.Invoke("confluentcloud:index/getKafkaClientQuota:getKafkaClientQuota", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKafkaClientQuota.
type LookupKafkaClientQuotaArgs struct {
	// The ID of the Kafka Client Quota (for example, `cq-abc123`).
	Id string `pulumi:"id"`
}

// A collection of values returned by getKafkaClientQuota.
type LookupKafkaClientQuotaResult struct {
	// (Required String) The description of the Kafka Client Quota.
	Description string `pulumi:"description"`
	// (Required String) The name of the Kafka Client Quota.
	DisplayName string `pulumi:"displayName"`
	// (Required Configuration Block) supports the following:
	Environments []GetKafkaClientQuotaEnvironment `pulumi:"environments"`
	// (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
	Id string `pulumi:"id"`
	// (Required Configuration Block) supports the following:
	KafkaClusters []GetKafkaClientQuotaKafkaCluster `pulumi:"kafkaClusters"`
	// (Required Set of Strings) The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
	Principals []string `pulumi:"principals"`
	// (Required Configuration Block) supports the following:
	Throughputs []GetKafkaClientQuotaThroughput `pulumi:"throughputs"`
}

func LookupKafkaClientQuotaOutput(ctx *pulumi.Context, args LookupKafkaClientQuotaOutputArgs, opts ...pulumi.InvokeOption) LookupKafkaClientQuotaResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKafkaClientQuotaResult, error) {
			args := v.(LookupKafkaClientQuotaArgs)
			r, err := LookupKafkaClientQuota(ctx, &args, opts...)
			var s LookupKafkaClientQuotaResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupKafkaClientQuotaResultOutput)
}

// A collection of arguments for invoking getKafkaClientQuota.
type LookupKafkaClientQuotaOutputArgs struct {
	// The ID of the Kafka Client Quota (for example, `cq-abc123`).
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupKafkaClientQuotaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaClientQuotaArgs)(nil)).Elem()
}

// A collection of values returned by getKafkaClientQuota.
type LookupKafkaClientQuotaResultOutput struct{ *pulumi.OutputState }

func (LookupKafkaClientQuotaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaClientQuotaResult)(nil)).Elem()
}

func (o LookupKafkaClientQuotaResultOutput) ToLookupKafkaClientQuotaResultOutput() LookupKafkaClientQuotaResultOutput {
	return o
}

func (o LookupKafkaClientQuotaResultOutput) ToLookupKafkaClientQuotaResultOutputWithContext(ctx context.Context) LookupKafkaClientQuotaResultOutput {
	return o
}

// (Required String) The description of the Kafka Client Quota.
func (o LookupKafkaClientQuotaResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClientQuotaResult) string { return v.Description }).(pulumi.StringOutput)
}

// (Required String) The name of the Kafka Client Quota.
func (o LookupKafkaClientQuotaResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClientQuotaResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupKafkaClientQuotaResultOutput) Environments() GetKafkaClientQuotaEnvironmentArrayOutput {
	return o.ApplyT(func(v LookupKafkaClientQuotaResult) []GetKafkaClientQuotaEnvironment { return v.Environments }).(GetKafkaClientQuotaEnvironmentArrayOutput)
}

// (Required String) The ID of the Environment that the corresponding Kafka Cluster belongs to, for example, `env-abc123`.
func (o LookupKafkaClientQuotaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaClientQuotaResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupKafkaClientQuotaResultOutput) KafkaClusters() GetKafkaClientQuotaKafkaClusterArrayOutput {
	return o.ApplyT(func(v LookupKafkaClientQuotaResult) []GetKafkaClientQuotaKafkaCluster { return v.KafkaClusters }).(GetKafkaClientQuotaKafkaClusterArrayOutput)
}

// (Required Set of Strings) The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "<default>", to represent the default quota for all users and service accounts.
func (o LookupKafkaClientQuotaResultOutput) Principals() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupKafkaClientQuotaResult) []string { return v.Principals }).(pulumi.StringArrayOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupKafkaClientQuotaResultOutput) Throughputs() GetKafkaClientQuotaThroughputArrayOutput {
	return o.ApplyT(func(v LookupKafkaClientQuotaResult) []GetKafkaClientQuotaThroughput { return v.Throughputs }).(GetKafkaClientQuotaThroughputArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKafkaClientQuotaResultOutput{})
}
