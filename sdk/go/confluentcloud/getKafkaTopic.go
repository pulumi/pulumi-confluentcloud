// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupKafkaTopic(ctx *pulumi.Context, args *LookupKafkaTopicArgs, opts ...pulumi.InvokeOption) (*LookupKafkaTopicResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupKafkaTopicResult
	err := ctx.Invoke("confluentcloud:index/getKafkaTopic:getKafkaTopic", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKafkaTopic.
type LookupKafkaTopicArgs struct {
	Credentials  *GetKafkaTopicCredentials  `pulumi:"credentials"`
	KafkaCluster *GetKafkaTopicKafkaCluster `pulumi:"kafkaCluster"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint string `pulumi:"restEndpoint"`
	// The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
	TopicName string `pulumi:"topicName"`
}

// A collection of values returned by getKafkaTopic.
type LookupKafkaTopicResult struct {
	// (Optional Map) The custom topic settings:
	Config      map[string]string         `pulumi:"config"`
	Credentials *GetKafkaTopicCredentials `pulumi:"credentials"`
	// The provider-assigned unique ID for this managed resource.
	Id           string                     `pulumi:"id"`
	KafkaCluster *GetKafkaTopicKafkaCluster `pulumi:"kafkaCluster"`
	// (Required Number) The number of partitions to create in the topic. Defaults to `6`.
	PartitionsCount int    `pulumi:"partitionsCount"`
	RestEndpoint    string `pulumi:"restEndpoint"`
	TopicName       string `pulumi:"topicName"`
}

func LookupKafkaTopicOutput(ctx *pulumi.Context, args LookupKafkaTopicOutputArgs, opts ...pulumi.InvokeOption) LookupKafkaTopicResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupKafkaTopicResult, error) {
			args := v.(LookupKafkaTopicArgs)
			r, err := LookupKafkaTopic(ctx, &args, opts...)
			var s LookupKafkaTopicResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupKafkaTopicResultOutput)
}

// A collection of arguments for invoking getKafkaTopic.
type LookupKafkaTopicOutputArgs struct {
	Credentials  GetKafkaTopicCredentialsPtrInput  `pulumi:"credentials"`
	KafkaCluster GetKafkaTopicKafkaClusterPtrInput `pulumi:"kafkaCluster"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringInput `pulumi:"restEndpoint"`
	// The name of the topic, for example, `orders-1`. The topic name can be up to 255 characters in length and can contain only alphanumeric characters, hyphens, and underscores.
	TopicName pulumi.StringInput `pulumi:"topicName"`
}

func (LookupKafkaTopicOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaTopicArgs)(nil)).Elem()
}

// A collection of values returned by getKafkaTopic.
type LookupKafkaTopicResultOutput struct{ *pulumi.OutputState }

func (LookupKafkaTopicResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupKafkaTopicResult)(nil)).Elem()
}

func (o LookupKafkaTopicResultOutput) ToLookupKafkaTopicResultOutput() LookupKafkaTopicResultOutput {
	return o
}

func (o LookupKafkaTopicResultOutput) ToLookupKafkaTopicResultOutputWithContext(ctx context.Context) LookupKafkaTopicResultOutput {
	return o
}

// (Optional Map) The custom topic settings:
func (o LookupKafkaTopicResultOutput) Config() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupKafkaTopicResult) map[string]string { return v.Config }).(pulumi.StringMapOutput)
}

func (o LookupKafkaTopicResultOutput) Credentials() GetKafkaTopicCredentialsPtrOutput {
	return o.ApplyT(func(v LookupKafkaTopicResult) *GetKafkaTopicCredentials { return v.Credentials }).(GetKafkaTopicCredentialsPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupKafkaTopicResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaTopicResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupKafkaTopicResultOutput) KafkaCluster() GetKafkaTopicKafkaClusterPtrOutput {
	return o.ApplyT(func(v LookupKafkaTopicResult) *GetKafkaTopicKafkaCluster { return v.KafkaCluster }).(GetKafkaTopicKafkaClusterPtrOutput)
}

// (Required Number) The number of partitions to create in the topic. Defaults to `6`.
func (o LookupKafkaTopicResultOutput) PartitionsCount() pulumi.IntOutput {
	return o.ApplyT(func(v LookupKafkaTopicResult) int { return v.PartitionsCount }).(pulumi.IntOutput)
}

func (o LookupKafkaTopicResultOutput) RestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaTopicResult) string { return v.RestEndpoint }).(pulumi.StringOutput)
}

func (o LookupKafkaTopicResultOutput) TopicName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupKafkaTopicResult) string { return v.TopicName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupKafkaTopicResultOutput{})
}
