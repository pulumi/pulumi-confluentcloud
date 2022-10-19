// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// You can import a Kafka topic by using the Kafka cluster ID and Kafka topic name in the format `<Kafka cluster ID>/<Kafka topic name>`, for example$ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/kafkaTopic:KafkaTopic my_topic lkc-abc123/orders-123
//
// ```
//
//	resource "confluent_kafka_topic" "orders" {
//
//	kafka_cluster {
//
//	id = confluent_kafka_cluster.basic-cluster.id
//
//	}
//
//	topic_name
//
//	= "orders"
//
//	partitions_count
//
//	= 4
//
//	rest_endpoint
//
// = confluent_kafka_cluster.basic-cluster.rest_endpoint
//
// # https://docs.confluent.io/cloud/current/clusters/broker-config.html#custom-topic-settings-for-all-cluster-types
//
//	config = {
//
//	"cleanup.policy"
//
// = "delete"
//
//	"delete.retention.ms"
//
//	= "86400000"
//
//	"max.compaction.lag.ms"
//
//	= "9223372036854775807"
//
//	"max.message.bytes"
//
//	= "2097164"
//
//	"message.timestamp.difference.max.ms" = "9223372036854775807"
//
//	"message.timestamp.type"
//
// = "CreateTime"
//
//	"min.compaction.lag.ms"
//
//	= "0"
//
//	"min.insync.replicas"
//
//	= "2"
//
//	"retention.bytes"
//
//	= "-1"
//
//	"retention.ms"
//
// = "604800000"
//
//	"segment.bytes"
//
//	= "104857600"
//
//	"segment.ms"
//
// = "604800000"
//
//	}
//
//	credentials {
//
//	key
//
// = confluent_api_key.app-manager-kafka-api-key.id
//
//	secret = confluent_api_key.app-manager-kafka-api-key.secret
//
//	} } !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type KafkaTopic struct {
	pulumi.CustomResourceState

	// The custom topic settings to set:
	Config pulumi.StringMapOutput `pulumi:"config"`
	// The Cluster API Credentials.
	Credentials KafkaTopicCredentialsPtrOutput `pulumi:"credentials"`
	// The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	//
	// Deprecated: This parameter has been deprecated in favour of Rest Endpoint
	HttpEndpoint pulumi.StringOutput          `pulumi:"httpEndpoint"`
	KafkaCluster KafkaTopicKafkaClusterOutput `pulumi:"kafkaCluster"`
	// The number of partitions to create in the topic. Defaults to `6`.
	PartitionsCount pulumi.IntPtrOutput `pulumi:"partitionsCount"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrOutput `pulumi:"restEndpoint"`
	// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
	TopicName pulumi.StringOutput `pulumi:"topicName"`
}

// NewKafkaTopic registers a new resource with the given unique name, arguments, and options.
func NewKafkaTopic(ctx *pulumi.Context,
	name string, args *KafkaTopicArgs, opts ...pulumi.ResourceOption) (*KafkaTopic, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KafkaCluster == nil {
		return nil, errors.New("invalid value for required argument 'KafkaCluster'")
	}
	if args.TopicName == nil {
		return nil, errors.New("invalid value for required argument 'TopicName'")
	}
	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(KafkaTopicCredentialsPtrOutput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	var resource KafkaTopic
	err := ctx.RegisterResource("confluentcloud:index/kafkaTopic:KafkaTopic", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKafkaTopic gets an existing KafkaTopic resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKafkaTopic(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KafkaTopicState, opts ...pulumi.ResourceOption) (*KafkaTopic, error) {
	var resource KafkaTopic
	err := ctx.ReadResource("confluentcloud:index/kafkaTopic:KafkaTopic", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KafkaTopic resources.
type kafkaTopicState struct {
	// The custom topic settings to set:
	Config map[string]string `pulumi:"config"`
	// The Cluster API Credentials.
	Credentials *KafkaTopicCredentials `pulumi:"credentials"`
	// The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	//
	// Deprecated: This parameter has been deprecated in favour of Rest Endpoint
	HttpEndpoint *string                 `pulumi:"httpEndpoint"`
	KafkaCluster *KafkaTopicKafkaCluster `pulumi:"kafkaCluster"`
	// The number of partitions to create in the topic. Defaults to `6`.
	PartitionsCount *int `pulumi:"partitionsCount"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
	TopicName *string `pulumi:"topicName"`
}

type KafkaTopicState struct {
	// The custom topic settings to set:
	Config pulumi.StringMapInput
	// The Cluster API Credentials.
	Credentials KafkaTopicCredentialsPtrInput
	// The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	//
	// Deprecated: This parameter has been deprecated in favour of Rest Endpoint
	HttpEndpoint pulumi.StringPtrInput
	KafkaCluster KafkaTopicKafkaClusterPtrInput
	// The number of partitions to create in the topic. Defaults to `6`.
	PartitionsCount pulumi.IntPtrInput
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrInput
	// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
	TopicName pulumi.StringPtrInput
}

func (KafkaTopicState) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaTopicState)(nil)).Elem()
}

type kafkaTopicArgs struct {
	// The custom topic settings to set:
	Config map[string]string `pulumi:"config"`
	// The Cluster API Credentials.
	Credentials *KafkaTopicCredentials `pulumi:"credentials"`
	// The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	//
	// Deprecated: This parameter has been deprecated in favour of Rest Endpoint
	HttpEndpoint *string                `pulumi:"httpEndpoint"`
	KafkaCluster KafkaTopicKafkaCluster `pulumi:"kafkaCluster"`
	// The number of partitions to create in the topic. Defaults to `6`.
	PartitionsCount *int `pulumi:"partitionsCount"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
	TopicName string `pulumi:"topicName"`
}

// The set of arguments for constructing a KafkaTopic resource.
type KafkaTopicArgs struct {
	// The custom topic settings to set:
	Config pulumi.StringMapInput
	// The Cluster API Credentials.
	Credentials KafkaTopicCredentialsPtrInput
	// The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	//
	// Deprecated: This parameter has been deprecated in favour of Rest Endpoint
	HttpEndpoint pulumi.StringPtrInput
	KafkaCluster KafkaTopicKafkaClusterInput
	// The number of partitions to create in the topic. Defaults to `6`.
	PartitionsCount pulumi.IntPtrInput
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrInput
	// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
	TopicName pulumi.StringInput
}

func (KafkaTopicArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaTopicArgs)(nil)).Elem()
}

type KafkaTopicInput interface {
	pulumi.Input

	ToKafkaTopicOutput() KafkaTopicOutput
	ToKafkaTopicOutputWithContext(ctx context.Context) KafkaTopicOutput
}

func (*KafkaTopic) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaTopic)(nil)).Elem()
}

func (i *KafkaTopic) ToKafkaTopicOutput() KafkaTopicOutput {
	return i.ToKafkaTopicOutputWithContext(context.Background())
}

func (i *KafkaTopic) ToKafkaTopicOutputWithContext(ctx context.Context) KafkaTopicOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaTopicOutput)
}

// KafkaTopicArrayInput is an input type that accepts KafkaTopicArray and KafkaTopicArrayOutput values.
// You can construct a concrete instance of `KafkaTopicArrayInput` via:
//
//	KafkaTopicArray{ KafkaTopicArgs{...} }
type KafkaTopicArrayInput interface {
	pulumi.Input

	ToKafkaTopicArrayOutput() KafkaTopicArrayOutput
	ToKafkaTopicArrayOutputWithContext(context.Context) KafkaTopicArrayOutput
}

type KafkaTopicArray []KafkaTopicInput

func (KafkaTopicArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaTopic)(nil)).Elem()
}

func (i KafkaTopicArray) ToKafkaTopicArrayOutput() KafkaTopicArrayOutput {
	return i.ToKafkaTopicArrayOutputWithContext(context.Background())
}

func (i KafkaTopicArray) ToKafkaTopicArrayOutputWithContext(ctx context.Context) KafkaTopicArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaTopicArrayOutput)
}

// KafkaTopicMapInput is an input type that accepts KafkaTopicMap and KafkaTopicMapOutput values.
// You can construct a concrete instance of `KafkaTopicMapInput` via:
//
//	KafkaTopicMap{ "key": KafkaTopicArgs{...} }
type KafkaTopicMapInput interface {
	pulumi.Input

	ToKafkaTopicMapOutput() KafkaTopicMapOutput
	ToKafkaTopicMapOutputWithContext(context.Context) KafkaTopicMapOutput
}

type KafkaTopicMap map[string]KafkaTopicInput

func (KafkaTopicMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaTopic)(nil)).Elem()
}

func (i KafkaTopicMap) ToKafkaTopicMapOutput() KafkaTopicMapOutput {
	return i.ToKafkaTopicMapOutputWithContext(context.Background())
}

func (i KafkaTopicMap) ToKafkaTopicMapOutputWithContext(ctx context.Context) KafkaTopicMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaTopicMapOutput)
}

type KafkaTopicOutput struct{ *pulumi.OutputState }

func (KafkaTopicOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaTopic)(nil)).Elem()
}

func (o KafkaTopicOutput) ToKafkaTopicOutput() KafkaTopicOutput {
	return o
}

func (o KafkaTopicOutput) ToKafkaTopicOutputWithContext(ctx context.Context) KafkaTopicOutput {
	return o
}

// The custom topic settings to set:
func (o KafkaTopicOutput) Config() pulumi.StringMapOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringMapOutput { return v.Config }).(pulumi.StringMapOutput)
}

// The Cluster API Credentials.
func (o KafkaTopicOutput) Credentials() KafkaTopicCredentialsPtrOutput {
	return o.ApplyT(func(v *KafkaTopic) KafkaTopicCredentialsPtrOutput { return v.Credentials }).(KafkaTopicCredentialsPtrOutput)
}

// The HTTP endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
//
// Deprecated: This parameter has been deprecated in favour of Rest Endpoint
func (o KafkaTopicOutput) HttpEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringOutput { return v.HttpEndpoint }).(pulumi.StringOutput)
}

func (o KafkaTopicOutput) KafkaCluster() KafkaTopicKafkaClusterOutput {
	return o.ApplyT(func(v *KafkaTopic) KafkaTopicKafkaClusterOutput { return v.KafkaCluster }).(KafkaTopicKafkaClusterOutput)
}

// The number of partitions to create in the topic. Defaults to `6`.
func (o KafkaTopicOutput) PartitionsCount() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.IntPtrOutput { return v.PartitionsCount }).(pulumi.IntPtrOutput)
}

// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
func (o KafkaTopicOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

// The name of the topic, for example, `orders-1`. The topic name can be up to 249 characters in length, and can include the following characters: a-z, A-Z, 0-9, . (dot), _ (underscore), and - (dash). As a best practice, we recommend against using any personally identifiable information (PII) when naming your topic.
func (o KafkaTopicOutput) TopicName() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaTopic) pulumi.StringOutput { return v.TopicName }).(pulumi.StringOutput)
}

type KafkaTopicArrayOutput struct{ *pulumi.OutputState }

func (KafkaTopicArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaTopic)(nil)).Elem()
}

func (o KafkaTopicArrayOutput) ToKafkaTopicArrayOutput() KafkaTopicArrayOutput {
	return o
}

func (o KafkaTopicArrayOutput) ToKafkaTopicArrayOutputWithContext(ctx context.Context) KafkaTopicArrayOutput {
	return o
}

func (o KafkaTopicArrayOutput) Index(i pulumi.IntInput) KafkaTopicOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KafkaTopic {
		return vs[0].([]*KafkaTopic)[vs[1].(int)]
	}).(KafkaTopicOutput)
}

type KafkaTopicMapOutput struct{ *pulumi.OutputState }

func (KafkaTopicMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaTopic)(nil)).Elem()
}

func (o KafkaTopicMapOutput) ToKafkaTopicMapOutput() KafkaTopicMapOutput {
	return o
}

func (o KafkaTopicMapOutput) ToKafkaTopicMapOutputWithContext(ctx context.Context) KafkaTopicMapOutput {
	return o
}

func (o KafkaTopicMapOutput) MapIndex(k pulumi.StringInput) KafkaTopicOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KafkaTopic {
		return vs[0].(map[string]*KafkaTopic)[vs[1].(string)]
	}).(KafkaTopicOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaTopicInput)(nil)).Elem(), &KafkaTopic{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaTopicArrayInput)(nil)).Elem(), KafkaTopicArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaTopicMapInput)(nil)).Elem(), KafkaTopicMap{})
	pulumi.RegisterOutputType(KafkaTopicOutput{})
	pulumi.RegisterOutputType(KafkaTopicArrayOutput{})
	pulumi.RegisterOutputType(KafkaTopicMapOutput{})
}
