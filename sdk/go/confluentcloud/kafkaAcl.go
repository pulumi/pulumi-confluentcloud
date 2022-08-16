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
// You can import Kafka ACLs by using the Kafka cluster ID and attributes of `confluent_kafka_acl` resource in the format `<Kafka cluster ID>/<Kafka ACL resource type>#<Kafka ACL resource name>#<Kafka ACL pattern type>#<Kafka ACL principal>#<Kafka ACL host>#<Kafka ACL operation>#<Kafka ACL permission>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>" $ export IMPORT_KAFKA_API_KEY="<kafka_api_key>" $ export IMPORT_KAFKA_API_SECRET="<kafka_api_secret>" $ export IMPORT_KAFKA_REST_ENDPOINT="<kafka_rest_endpoint>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/kafkaAcl:KafkaAcl describe-cluster "lkc-12345/CLUSTER#kafka-cluster#LITERAL#User:sa-xyz123#*#DESCRIBE#ALLOW"
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type KafkaAcl struct {
	pulumi.CustomResourceState

	// The Cluster API Credentials.
	Credentials KafkaAclCredentialsPtrOutput `pulumi:"credentials"`
	// The host for the ACL. Should be set to `*` for Confluent Cloud.
	Host         pulumi.StringOutput        `pulumi:"host"`
	KafkaCluster KafkaAclKafkaClusterOutput `pulumi:"kafkaCluster"`
	// The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
	Operation pulumi.StringOutput `pulumi:"operation"`
	// The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
	PatternType pulumi.StringOutput `pulumi:"patternType"`
	// The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
	Permission pulumi.StringOutput `pulumi:"permission"`
	// The principal for the ACL.
	Principal pulumi.StringOutput `pulumi:"principal"`
	// The resource name for the ACL.
	ResourceName pulumi.StringOutput `pulumi:"resourceName"`
	// The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
	ResourceType pulumi.StringOutput `pulumi:"resourceType"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
	RestEndpoint pulumi.StringPtrOutput `pulumi:"restEndpoint"`
}

// NewKafkaAcl registers a new resource with the given unique name, arguments, and options.
func NewKafkaAcl(ctx *pulumi.Context,
	name string, args *KafkaAclArgs, opts ...pulumi.ResourceOption) (*KafkaAcl, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.KafkaCluster == nil {
		return nil, errors.New("invalid value for required argument 'KafkaCluster'")
	}
	if args.Operation == nil {
		return nil, errors.New("invalid value for required argument 'Operation'")
	}
	if args.PatternType == nil {
		return nil, errors.New("invalid value for required argument 'PatternType'")
	}
	if args.Permission == nil {
		return nil, errors.New("invalid value for required argument 'Permission'")
	}
	if args.Principal == nil {
		return nil, errors.New("invalid value for required argument 'Principal'")
	}
	if args.ResourceName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceName'")
	}
	if args.ResourceType == nil {
		return nil, errors.New("invalid value for required argument 'ResourceType'")
	}
	var resource KafkaAcl
	err := ctx.RegisterResource("confluentcloud:index/kafkaAcl:KafkaAcl", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKafkaAcl gets an existing KafkaAcl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKafkaAcl(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KafkaAclState, opts ...pulumi.ResourceOption) (*KafkaAcl, error) {
	var resource KafkaAcl
	err := ctx.ReadResource("confluentcloud:index/kafkaAcl:KafkaAcl", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KafkaAcl resources.
type kafkaAclState struct {
	// The Cluster API Credentials.
	Credentials *KafkaAclCredentials `pulumi:"credentials"`
	// The host for the ACL. Should be set to `*` for Confluent Cloud.
	Host         *string               `pulumi:"host"`
	KafkaCluster *KafkaAclKafkaCluster `pulumi:"kafkaCluster"`
	// The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
	Operation *string `pulumi:"operation"`
	// The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
	PatternType *string `pulumi:"patternType"`
	// The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
	Permission *string `pulumi:"permission"`
	// The principal for the ACL.
	Principal *string `pulumi:"principal"`
	// The resource name for the ACL.
	ResourceName *string `pulumi:"resourceName"`
	// The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
	ResourceType *string `pulumi:"resourceType"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
	RestEndpoint *string `pulumi:"restEndpoint"`
}

type KafkaAclState struct {
	// The Cluster API Credentials.
	Credentials KafkaAclCredentialsPtrInput
	// The host for the ACL. Should be set to `*` for Confluent Cloud.
	Host         pulumi.StringPtrInput
	KafkaCluster KafkaAclKafkaClusterPtrInput
	// The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
	Operation pulumi.StringPtrInput
	// The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
	PatternType pulumi.StringPtrInput
	// The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
	Permission pulumi.StringPtrInput
	// The principal for the ACL.
	Principal pulumi.StringPtrInput
	// The resource name for the ACL.
	ResourceName pulumi.StringPtrInput
	// The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
	ResourceType pulumi.StringPtrInput
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
	RestEndpoint pulumi.StringPtrInput
}

func (KafkaAclState) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaAclState)(nil)).Elem()
}

type kafkaAclArgs struct {
	// The Cluster API Credentials.
	Credentials *KafkaAclCredentials `pulumi:"credentials"`
	// The host for the ACL. Should be set to `*` for Confluent Cloud.
	Host         string               `pulumi:"host"`
	KafkaCluster KafkaAclKafkaCluster `pulumi:"kafkaCluster"`
	// The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
	Operation string `pulumi:"operation"`
	// The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
	PatternType string `pulumi:"patternType"`
	// The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
	Permission string `pulumi:"permission"`
	// The principal for the ACL.
	Principal string `pulumi:"principal"`
	// The resource name for the ACL.
	ResourceName string `pulumi:"resourceName"`
	// The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
	ResourceType string `pulumi:"resourceType"`
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
	RestEndpoint *string `pulumi:"restEndpoint"`
}

// The set of arguments for constructing a KafkaAcl resource.
type KafkaAclArgs struct {
	// The Cluster API Credentials.
	Credentials KafkaAclCredentialsPtrInput
	// The host for the ACL. Should be set to `*` for Confluent Cloud.
	Host         pulumi.StringInput
	KafkaCluster KafkaAclKafkaClusterInput
	// The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
	Operation pulumi.StringInput
	// The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
	PatternType pulumi.StringInput
	// The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
	Permission pulumi.StringInput
	// The principal for the ACL.
	Principal pulumi.StringInput
	// The resource name for the ACL.
	ResourceName pulumi.StringInput
	// The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
	ResourceType pulumi.StringInput
	// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
	RestEndpoint pulumi.StringPtrInput
}

func (KafkaAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaAclArgs)(nil)).Elem()
}

type KafkaAclInput interface {
	pulumi.Input

	ToKafkaAclOutput() KafkaAclOutput
	ToKafkaAclOutputWithContext(ctx context.Context) KafkaAclOutput
}

func (*KafkaAcl) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaAcl)(nil)).Elem()
}

func (i *KafkaAcl) ToKafkaAclOutput() KafkaAclOutput {
	return i.ToKafkaAclOutputWithContext(context.Background())
}

func (i *KafkaAcl) ToKafkaAclOutputWithContext(ctx context.Context) KafkaAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaAclOutput)
}

// KafkaAclArrayInput is an input type that accepts KafkaAclArray and KafkaAclArrayOutput values.
// You can construct a concrete instance of `KafkaAclArrayInput` via:
//
//	KafkaAclArray{ KafkaAclArgs{...} }
type KafkaAclArrayInput interface {
	pulumi.Input

	ToKafkaAclArrayOutput() KafkaAclArrayOutput
	ToKafkaAclArrayOutputWithContext(context.Context) KafkaAclArrayOutput
}

type KafkaAclArray []KafkaAclInput

func (KafkaAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaAcl)(nil)).Elem()
}

func (i KafkaAclArray) ToKafkaAclArrayOutput() KafkaAclArrayOutput {
	return i.ToKafkaAclArrayOutputWithContext(context.Background())
}

func (i KafkaAclArray) ToKafkaAclArrayOutputWithContext(ctx context.Context) KafkaAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaAclArrayOutput)
}

// KafkaAclMapInput is an input type that accepts KafkaAclMap and KafkaAclMapOutput values.
// You can construct a concrete instance of `KafkaAclMapInput` via:
//
//	KafkaAclMap{ "key": KafkaAclArgs{...} }
type KafkaAclMapInput interface {
	pulumi.Input

	ToKafkaAclMapOutput() KafkaAclMapOutput
	ToKafkaAclMapOutputWithContext(context.Context) KafkaAclMapOutput
}

type KafkaAclMap map[string]KafkaAclInput

func (KafkaAclMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaAcl)(nil)).Elem()
}

func (i KafkaAclMap) ToKafkaAclMapOutput() KafkaAclMapOutput {
	return i.ToKafkaAclMapOutputWithContext(context.Background())
}

func (i KafkaAclMap) ToKafkaAclMapOutputWithContext(ctx context.Context) KafkaAclMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaAclMapOutput)
}

type KafkaAclOutput struct{ *pulumi.OutputState }

func (KafkaAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaAcl)(nil)).Elem()
}

func (o KafkaAclOutput) ToKafkaAclOutput() KafkaAclOutput {
	return o
}

func (o KafkaAclOutput) ToKafkaAclOutputWithContext(ctx context.Context) KafkaAclOutput {
	return o
}

// The Cluster API Credentials.
func (o KafkaAclOutput) Credentials() KafkaAclCredentialsPtrOutput {
	return o.ApplyT(func(v *KafkaAcl) KafkaAclCredentialsPtrOutput { return v.Credentials }).(KafkaAclCredentialsPtrOutput)
}

// The host for the ACL. Should be set to `*` for Confluent Cloud.
func (o KafkaAclOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

func (o KafkaAclOutput) KafkaCluster() KafkaAclKafkaClusterOutput {
	return o.ApplyT(func(v *KafkaAcl) KafkaAclKafkaClusterOutput { return v.KafkaCluster }).(KafkaAclKafkaClusterOutput)
}

// The operation type for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `ALL`, `READ`, `WRITE`, `CREATE`, `DELETE`, `ALTER`, `DESCRIBE`, `CLUSTER_ACTION`, `DESCRIBE_CONFIGS`, `ALTER_CONFIGS`, and `IDEMPOTENT_WRITE`.
func (o KafkaAclOutput) Operation() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringOutput { return v.Operation }).(pulumi.StringOutput)
}

// The pattern type for the ACL. Accepted values are: `UNKNOWN`,`ANY`,`MATCH`, `LITERAL`, and `PREFIXED`.
func (o KafkaAclOutput) PatternType() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringOutput { return v.PatternType }).(pulumi.StringOutput)
}

// The permission for the ACL. Accepted values are: `UNKNOWN`, `ANY`, `DENY`, and `ALLOW`.
func (o KafkaAclOutput) Permission() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringOutput { return v.Permission }).(pulumi.StringOutput)
}

// The principal for the ACL.
func (o KafkaAclOutput) Principal() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringOutput { return v.Principal }).(pulumi.StringOutput)
}

// The resource name for the ACL.
func (o KafkaAclOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringOutput { return v.ResourceName }).(pulumi.StringOutput)
}

// The type of the resource. Accepted values are: `UNKNOWN`, `ANY`, `TOPIC`, `GROUP`, `CLUSTER`, `TRANSACTIONAL_ID`, `DELEGATION_TOKEN`.
func (o KafkaAclOutput) ResourceType() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringOutput { return v.ResourceType }).(pulumi.StringOutput)
}

// The REST endpoint of the Kafka cluster, for example, `https://pkc-00000.us-central1.gcp.confluent.cloud:443`.
func (o KafkaAclOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KafkaAcl) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

type KafkaAclArrayOutput struct{ *pulumi.OutputState }

func (KafkaAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaAcl)(nil)).Elem()
}

func (o KafkaAclArrayOutput) ToKafkaAclArrayOutput() KafkaAclArrayOutput {
	return o
}

func (o KafkaAclArrayOutput) ToKafkaAclArrayOutputWithContext(ctx context.Context) KafkaAclArrayOutput {
	return o
}

func (o KafkaAclArrayOutput) Index(i pulumi.IntInput) KafkaAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KafkaAcl {
		return vs[0].([]*KafkaAcl)[vs[1].(int)]
	}).(KafkaAclOutput)
}

type KafkaAclMapOutput struct{ *pulumi.OutputState }

func (KafkaAclMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaAcl)(nil)).Elem()
}

func (o KafkaAclMapOutput) ToKafkaAclMapOutput() KafkaAclMapOutput {
	return o
}

func (o KafkaAclMapOutput) ToKafkaAclMapOutputWithContext(ctx context.Context) KafkaAclMapOutput {
	return o
}

func (o KafkaAclMapOutput) MapIndex(k pulumi.StringInput) KafkaAclOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KafkaAcl {
		return vs[0].(map[string]*KafkaAcl)[vs[1].(string)]
	}).(KafkaAclOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaAclInput)(nil)).Elem(), &KafkaAcl{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaAclArrayInput)(nil)).Elem(), KafkaAclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaAclMapInput)(nil)).Elem(), KafkaAclMap{})
	pulumi.RegisterOutputType(KafkaAclOutput{})
	pulumi.RegisterOutputType(KafkaAclArrayOutput{})
	pulumi.RegisterOutputType(KafkaAclMapOutput{})
}
