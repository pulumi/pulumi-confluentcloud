// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := confluentcloud.NewKafkaClientQuota(ctx, "example", &confluentcloud.KafkaClientQuotaArgs{
//				DisplayName: pulumi.String("test-quota"),
//				Description: pulumi.String("Test Quota"),
//				Throughput: &KafkaClientQuotaThroughputArgs{
//					IngressByteRate: pulumi.String("100"),
//					EgressByteRate:  pulumi.String("200"),
//				},
//				Principals: pulumi.StringArray{
//					pulumi.Any(confluent_service_account.App_manager.Id),
//					pulumi.Any(confluent_service_account.App_manager_2.Id),
//				},
//				KafkaCluster: &KafkaClientQuotaKafkaClusterArgs{
//					Id: pulumi.Any(confluent_kafka_cluster.Dedicated.Id),
//				},
//				Environment: &KafkaClientQuotaEnvironmentArgs{
//					Id: pulumi.Any(confluent_environment.Development.Id),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// You can import a Kafka Client Quota by using Kafka Client Quota ID. The following example shows how to import a Kafka Client Quota ID$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/kafkaClientQuota:KafkaClientQuota example cq-abc123
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type KafkaClientQuota struct {
	pulumi.CustomResourceState

	// The description of the Kafka Client Quota.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the Kafka Client Quota.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  KafkaClientQuotaEnvironmentOutput  `pulumi:"environment"`
	KafkaCluster KafkaClientQuotaKafkaClusterOutput `pulumi:"kafkaCluster"`
	// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
	Principals pulumi.StringArrayOutput `pulumi:"principals"`
	// Block for representing a Kafka Quota.
	Throughput KafkaClientQuotaThroughputOutput `pulumi:"throughput"`
}

// NewKafkaClientQuota registers a new resource with the given unique name, arguments, and options.
func NewKafkaClientQuota(ctx *pulumi.Context,
	name string, args *KafkaClientQuotaArgs, opts ...pulumi.ResourceOption) (*KafkaClientQuota, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.KafkaCluster == nil {
		return nil, errors.New("invalid value for required argument 'KafkaCluster'")
	}
	if args.Principals == nil {
		return nil, errors.New("invalid value for required argument 'Principals'")
	}
	if args.Throughput == nil {
		return nil, errors.New("invalid value for required argument 'Throughput'")
	}
	var resource KafkaClientQuota
	err := ctx.RegisterResource("confluentcloud:index/kafkaClientQuota:KafkaClientQuota", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKafkaClientQuota gets an existing KafkaClientQuota resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKafkaClientQuota(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KafkaClientQuotaState, opts ...pulumi.ResourceOption) (*KafkaClientQuota, error) {
	var resource KafkaClientQuota
	err := ctx.ReadResource("confluentcloud:index/kafkaClientQuota:KafkaClientQuota", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KafkaClientQuota resources.
type kafkaClientQuotaState struct {
	// The description of the Kafka Client Quota.
	Description *string `pulumi:"description"`
	// The name of the Kafka Client Quota.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  *KafkaClientQuotaEnvironment  `pulumi:"environment"`
	KafkaCluster *KafkaClientQuotaKafkaCluster `pulumi:"kafkaCluster"`
	// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
	Principals []string `pulumi:"principals"`
	// Block for representing a Kafka Quota.
	Throughput *KafkaClientQuotaThroughput `pulumi:"throughput"`
}

type KafkaClientQuotaState struct {
	// The description of the Kafka Client Quota.
	Description pulumi.StringPtrInput
	// The name of the Kafka Client Quota.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  KafkaClientQuotaEnvironmentPtrInput
	KafkaCluster KafkaClientQuotaKafkaClusterPtrInput
	// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
	Principals pulumi.StringArrayInput
	// Block for representing a Kafka Quota.
	Throughput KafkaClientQuotaThroughputPtrInput
}

func (KafkaClientQuotaState) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaClientQuotaState)(nil)).Elem()
}

type kafkaClientQuotaArgs struct {
	// The description of the Kafka Client Quota.
	Description *string `pulumi:"description"`
	// The name of the Kafka Client Quota.
	DisplayName string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  KafkaClientQuotaEnvironment  `pulumi:"environment"`
	KafkaCluster KafkaClientQuotaKafkaCluster `pulumi:"kafkaCluster"`
	// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
	Principals []string `pulumi:"principals"`
	// Block for representing a Kafka Quota.
	Throughput KafkaClientQuotaThroughput `pulumi:"throughput"`
}

// The set of arguments for constructing a KafkaClientQuota resource.
type KafkaClientQuotaArgs struct {
	// The description of the Kafka Client Quota.
	Description pulumi.StringPtrInput
	// The name of the Kafka Client Quota.
	DisplayName pulumi.StringInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  KafkaClientQuotaEnvironmentInput
	KafkaCluster KafkaClientQuotaKafkaClusterInput
	// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
	Principals pulumi.StringArrayInput
	// Block for representing a Kafka Quota.
	Throughput KafkaClientQuotaThroughputInput
}

func (KafkaClientQuotaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaClientQuotaArgs)(nil)).Elem()
}

type KafkaClientQuotaInput interface {
	pulumi.Input

	ToKafkaClientQuotaOutput() KafkaClientQuotaOutput
	ToKafkaClientQuotaOutputWithContext(ctx context.Context) KafkaClientQuotaOutput
}

func (*KafkaClientQuota) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaClientQuota)(nil)).Elem()
}

func (i *KafkaClientQuota) ToKafkaClientQuotaOutput() KafkaClientQuotaOutput {
	return i.ToKafkaClientQuotaOutputWithContext(context.Background())
}

func (i *KafkaClientQuota) ToKafkaClientQuotaOutputWithContext(ctx context.Context) KafkaClientQuotaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaClientQuotaOutput)
}

// KafkaClientQuotaArrayInput is an input type that accepts KafkaClientQuotaArray and KafkaClientQuotaArrayOutput values.
// You can construct a concrete instance of `KafkaClientQuotaArrayInput` via:
//
//	KafkaClientQuotaArray{ KafkaClientQuotaArgs{...} }
type KafkaClientQuotaArrayInput interface {
	pulumi.Input

	ToKafkaClientQuotaArrayOutput() KafkaClientQuotaArrayOutput
	ToKafkaClientQuotaArrayOutputWithContext(context.Context) KafkaClientQuotaArrayOutput
}

type KafkaClientQuotaArray []KafkaClientQuotaInput

func (KafkaClientQuotaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaClientQuota)(nil)).Elem()
}

func (i KafkaClientQuotaArray) ToKafkaClientQuotaArrayOutput() KafkaClientQuotaArrayOutput {
	return i.ToKafkaClientQuotaArrayOutputWithContext(context.Background())
}

func (i KafkaClientQuotaArray) ToKafkaClientQuotaArrayOutputWithContext(ctx context.Context) KafkaClientQuotaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaClientQuotaArrayOutput)
}

// KafkaClientQuotaMapInput is an input type that accepts KafkaClientQuotaMap and KafkaClientQuotaMapOutput values.
// You can construct a concrete instance of `KafkaClientQuotaMapInput` via:
//
//	KafkaClientQuotaMap{ "key": KafkaClientQuotaArgs{...} }
type KafkaClientQuotaMapInput interface {
	pulumi.Input

	ToKafkaClientQuotaMapOutput() KafkaClientQuotaMapOutput
	ToKafkaClientQuotaMapOutputWithContext(context.Context) KafkaClientQuotaMapOutput
}

type KafkaClientQuotaMap map[string]KafkaClientQuotaInput

func (KafkaClientQuotaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaClientQuota)(nil)).Elem()
}

func (i KafkaClientQuotaMap) ToKafkaClientQuotaMapOutput() KafkaClientQuotaMapOutput {
	return i.ToKafkaClientQuotaMapOutputWithContext(context.Background())
}

func (i KafkaClientQuotaMap) ToKafkaClientQuotaMapOutputWithContext(ctx context.Context) KafkaClientQuotaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaClientQuotaMapOutput)
}

type KafkaClientQuotaOutput struct{ *pulumi.OutputState }

func (KafkaClientQuotaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaClientQuota)(nil)).Elem()
}

func (o KafkaClientQuotaOutput) ToKafkaClientQuotaOutput() KafkaClientQuotaOutput {
	return o
}

func (o KafkaClientQuotaOutput) ToKafkaClientQuotaOutputWithContext(ctx context.Context) KafkaClientQuotaOutput {
	return o
}

// The description of the Kafka Client Quota.
func (o KafkaClientQuotaOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KafkaClientQuota) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the Kafka Client Quota.
func (o KafkaClientQuotaOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaClientQuota) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o KafkaClientQuotaOutput) Environment() KafkaClientQuotaEnvironmentOutput {
	return o.ApplyT(func(v *KafkaClientQuota) KafkaClientQuotaEnvironmentOutput { return v.Environment }).(KafkaClientQuotaEnvironmentOutput)
}

func (o KafkaClientQuotaOutput) KafkaCluster() KafkaClientQuotaKafkaClusterOutput {
	return o.ApplyT(func(v *KafkaClientQuota) KafkaClientQuotaKafkaClusterOutput { return v.KafkaCluster }).(KafkaClientQuotaKafkaClusterOutput)
}

// The list of principals (i.e., service accounts or identity pools) to apply the Kafka Client Quota to. Use the special name, "default", to represent the default quota for all users and service accounts.
func (o KafkaClientQuotaOutput) Principals() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KafkaClientQuota) pulumi.StringArrayOutput { return v.Principals }).(pulumi.StringArrayOutput)
}

// Block for representing a Kafka Quota.
func (o KafkaClientQuotaOutput) Throughput() KafkaClientQuotaThroughputOutput {
	return o.ApplyT(func(v *KafkaClientQuota) KafkaClientQuotaThroughputOutput { return v.Throughput }).(KafkaClientQuotaThroughputOutput)
}

type KafkaClientQuotaArrayOutput struct{ *pulumi.OutputState }

func (KafkaClientQuotaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaClientQuota)(nil)).Elem()
}

func (o KafkaClientQuotaArrayOutput) ToKafkaClientQuotaArrayOutput() KafkaClientQuotaArrayOutput {
	return o
}

func (o KafkaClientQuotaArrayOutput) ToKafkaClientQuotaArrayOutputWithContext(ctx context.Context) KafkaClientQuotaArrayOutput {
	return o
}

func (o KafkaClientQuotaArrayOutput) Index(i pulumi.IntInput) KafkaClientQuotaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KafkaClientQuota {
		return vs[0].([]*KafkaClientQuota)[vs[1].(int)]
	}).(KafkaClientQuotaOutput)
}

type KafkaClientQuotaMapOutput struct{ *pulumi.OutputState }

func (KafkaClientQuotaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaClientQuota)(nil)).Elem()
}

func (o KafkaClientQuotaMapOutput) ToKafkaClientQuotaMapOutput() KafkaClientQuotaMapOutput {
	return o
}

func (o KafkaClientQuotaMapOutput) ToKafkaClientQuotaMapOutputWithContext(ctx context.Context) KafkaClientQuotaMapOutput {
	return o
}

func (o KafkaClientQuotaMapOutput) MapIndex(k pulumi.StringInput) KafkaClientQuotaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KafkaClientQuota {
		return vs[0].(map[string]*KafkaClientQuota)[vs[1].(string)]
	}).(KafkaClientQuotaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaClientQuotaInput)(nil)).Elem(), &KafkaClientQuota{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaClientQuotaArrayInput)(nil)).Elem(), KafkaClientQuotaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaClientQuotaMapInput)(nil)).Elem(), KafkaClientQuotaMap{})
	pulumi.RegisterOutputType(KafkaClientQuotaOutput{})
	pulumi.RegisterOutputType(KafkaClientQuotaArrayOutput{})
	pulumi.RegisterOutputType(KafkaClientQuotaMapOutput{})
}
