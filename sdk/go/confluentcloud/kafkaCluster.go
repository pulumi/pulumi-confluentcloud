// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Example Kafka clusters on AWS
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
//			development, err := confluentcloud.NewEnvironment(ctx, "development", &confluentcloud.EnvironmentArgs{
//				DisplayName: pulumi.String("Development"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "basic", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("basic_kafka_cluster"),
//				Availability: pulumi.String("SINGLE_ZONE"),
//				Cloud:        pulumi.String("AWS"),
//				Region:       pulumi.String("us-east-2"),
//				Basic:        &confluentcloud.KafkaClusterBasicArgs{},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "standard", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("standard_kafka_cluster"),
//				Availability: pulumi.String("SINGLE_ZONE"),
//				Cloud:        pulumi.String("AWS"),
//				Region:       pulumi.String("us-east-2"),
//				Standard:     &confluentcloud.KafkaClusterStandardArgs{},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "enterprise", &confluentcloud.KafkaClusterArgs{
//				Enterprises: confluentcloud.KafkaClusterEnterpriseArray{
//					&confluentcloud.KafkaClusterEnterpriseArgs{},
//				},
//				DisplayName:  pulumi.String("enterprise_kafka_cluster"),
//				Availability: pulumi.String("HIGH"),
//				Cloud:        pulumi.String("AWS"),
//				Region:       pulumi.String("us-east-2"),
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "dedicated", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("dedicated_kafka_cluster"),
//				Availability: pulumi.String("MULTI_ZONE"),
//				Cloud:        pulumi.String("AWS"),
//				Region:       pulumi.String("us-east-2"),
//				Dedicated: &confluentcloud.KafkaClusterDedicatedArgs{
//					Cku: pulumi.Int(2),
//				},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "freight", &confluentcloud.KafkaClusterArgs{
//				Freights: confluentcloud.KafkaClusterFreightArray{
//					&confluentcloud.KafkaClusterFreightArgs{},
//				},
//				DisplayName:  pulumi.String("freight_kafka_cluster"),
//				Availability: pulumi.String("HIGH"),
//				Cloud:        pulumi.String("AWS"),
//				Region:       pulumi.String("us-east-1"),
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: pulumi.Any(staging.Id),
//				},
//				Network: &confluentcloud.KafkaClusterNetworkArgs{
//					Id: pulumi.Any(peering.Id),
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
// ### Example Kafka clusters on Azure
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
//			development, err := confluentcloud.NewEnvironment(ctx, "development", &confluentcloud.EnvironmentArgs{
//				DisplayName: pulumi.String("Development"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "basic", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("basic_kafka_cluster"),
//				Availability: pulumi.String("SINGLE_ZONE"),
//				Cloud:        pulumi.String("AZURE"),
//				Region:       pulumi.String("centralus"),
//				Basic:        &confluentcloud.KafkaClusterBasicArgs{},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "standard", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("standard_kafka_cluster"),
//				Availability: pulumi.String("SINGLE_ZONE"),
//				Cloud:        pulumi.String("AZURE"),
//				Region:       pulumi.String("centralus"),
//				Standard:     &confluentcloud.KafkaClusterStandardArgs{},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "enterprise", &confluentcloud.KafkaClusterArgs{
//				Enterprises: confluentcloud.KafkaClusterEnterpriseArray{
//					&confluentcloud.KafkaClusterEnterpriseArgs{},
//				},
//				DisplayName:  pulumi.String("enterprise_kafka_cluster"),
//				Availability: pulumi.String("HIGH"),
//				Cloud:        pulumi.String("AZURE"),
//				Region:       pulumi.String("centralus"),
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "dedicated", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("dedicated_kafka_cluster"),
//				Availability: pulumi.String("MULTI_ZONE"),
//				Cloud:        pulumi.String("AZURE"),
//				Region:       pulumi.String("centralus"),
//				Dedicated: &confluentcloud.KafkaClusterDedicatedArgs{
//					Cku: pulumi.Int(2),
//				},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
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
// ### Example Kafka clusters on GCP
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
//			development, err := confluentcloud.NewEnvironment(ctx, "development", &confluentcloud.EnvironmentArgs{
//				DisplayName: pulumi.String("Development"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "basic", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("basic_kafka_cluster"),
//				Availability: pulumi.String("SINGLE_ZONE"),
//				Cloud:        pulumi.String("GCP"),
//				Region:       pulumi.String("us-central1"),
//				Basic:        &confluentcloud.KafkaClusterBasicArgs{},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "standard", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("standard_kafka_cluster"),
//				Availability: pulumi.String("SINGLE_ZONE"),
//				Cloud:        pulumi.String("GCP"),
//				Region:       pulumi.String("us-central1"),
//				Standard:     &confluentcloud.KafkaClusterStandardArgs{},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "dedicated", &confluentcloud.KafkaClusterArgs{
//				DisplayName:  pulumi.String("dedicated_kafka_cluster"),
//				Availability: pulumi.String("MULTI_ZONE"),
//				Cloud:        pulumi.String("GCP"),
//				Region:       pulumi.String("us-central1"),
//				Dedicated: &confluentcloud.KafkaClusterDedicatedArgs{
//					Cku: pulumi.Int(2),
//				},
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: development.ID(),
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
// ## Getting Started
//
// The following end-to-end examples might help to get started with `KafkaCluster` resource:
//   - `basic-kafka-acls`: _Basic_ Kafka cluster with authorization using ACLs
//   - `basic-kafka-acls-with-alias`: _Basic_ Kafka cluster with authorization using ACLs
//   - `standard-kafka-acls`: _Standard_ Kafka cluster with authorization using ACLs
//   - `standard-kafka-rbac`: _Standard_ Kafka cluster with authorization using RBAC
//   - `dedicated-public-kafka-acls`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using ACLs
//   - `dedicated-public-kafka-rbac`: _Dedicated_ Kafka cluster that is accessible over the public internet with authorization using RBAC
//   - `dedicated-privatelink-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
//   - `dedicated-privatelink-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using RBAC
//   - `dedicated-privatelink-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using RBAC
//   - `dedicated-privatelink-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
//   - `dedicated-private-service-connect-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using ACLs
//   - `dedicated-private-service-connect-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via Private Service Connect connections with authorization using RBAC
//   - `dedicated-vnet-peering-azure-kafka-acls`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using ACLs
//   - `dedicated-vnet-peering-azure-kafka-rbac`: _Dedicated_ Kafka cluster on Azure that is accessible via VPC Peering connections with authorization using RBAC
//   - `dedicated-vpc-peering-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using ACLs
//   - `dedicated-vpc-peering-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via VPC Peering connections with authorization using RBAC
//   - `dedicated-vpc-peering-gcp-kafka-acls`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using ACLs
//   - `dedicated-vpc-peering-gcp-kafka-rbac`: _Dedicated_ Kafka cluster on GCP that is accessible via VPC Peering connections with authorization using RBAC
//   - `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
//   - `dedicated-transit-gateway-attachment-aws-kafka-rbac`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using RBAC
//   - `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
//   - `enterprise-privatelinkattachment-azure-kafka-acls`: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
//
// ## Import
//
// You can import a Kafka cluster by using Environment ID and Kafka cluster ID, in the format `<Environment ID>/<Kafka cluster ID>`, e.g.
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/kafkaCluster:KafkaCluster my_kafka env-abc123/lkc-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type KafkaCluster struct {
	pulumi.CustomResourceState

	// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
	Availability pulumi.StringOutput `pulumi:"availability"`
	// The configuration of the Basic Kafka cluster.
	Basic KafkaClusterBasicPtrOutput `pulumi:"basic"`
	// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
	BootstrapEndpoint pulumi.StringOutput       `pulumi:"bootstrapEndpoint"`
	ByokKey           KafkaClusterByokKeyOutput `pulumi:"byokKey"`
	// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringOutput `pulumi:"cloud"`
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated KafkaClusterDedicatedPtrOutput `pulumi:"dedicated"`
	// The name of the Kafka cluster.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The configuration of the Enterprise Kafka cluster.
	Enterprises KafkaClusterEnterpriseArrayOutput `pulumi:"enterprises"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment KafkaClusterEnvironmentOutput `pulumi:"environment"`
	// The configuration of the Freight Kafka cluster.
	Freights KafkaClusterFreightArrayOutput `pulumi:"freights"`
	// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network KafkaClusterNetworkOutput `pulumi:"network"`
	// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
	RbacCrn pulumi.StringOutput `pulumi:"rbacCrn"`
	// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region pulumi.StringOutput `pulumi:"region"`
	// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringOutput `pulumi:"restEndpoint"`
	// The configuration of the Standard Kafka cluster.
	Standard KafkaClusterStandardPtrOutput `pulumi:"standard"`
}

// NewKafkaCluster registers a new resource with the given unique name, arguments, and options.
func NewKafkaCluster(ctx *pulumi.Context,
	name string, args *KafkaClusterArgs, opts ...pulumi.ResourceOption) (*KafkaCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Availability == nil {
		return nil, errors.New("invalid value for required argument 'Availability'")
	}
	if args.Cloud == nil {
		return nil, errors.New("invalid value for required argument 'Cloud'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KafkaCluster
	err := ctx.RegisterResource("confluentcloud:index/kafkaCluster:KafkaCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKafkaCluster gets an existing KafkaCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKafkaCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KafkaClusterState, opts ...pulumi.ResourceOption) (*KafkaCluster, error) {
	var resource KafkaCluster
	err := ctx.ReadResource("confluentcloud:index/kafkaCluster:KafkaCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KafkaCluster resources.
type kafkaClusterState struct {
	// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
	ApiVersion *string `pulumi:"apiVersion"`
	// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
	Availability *string `pulumi:"availability"`
	// The configuration of the Basic Kafka cluster.
	Basic *KafkaClusterBasic `pulumi:"basic"`
	// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
	BootstrapEndpoint *string              `pulumi:"bootstrapEndpoint"`
	ByokKey           *KafkaClusterByokKey `pulumi:"byokKey"`
	// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud *string `pulumi:"cloud"`
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated *KafkaClusterDedicated `pulumi:"dedicated"`
	// The name of the Kafka cluster.
	DisplayName *string `pulumi:"displayName"`
	// The configuration of the Enterprise Kafka cluster.
	Enterprises []KafkaClusterEnterprise `pulumi:"enterprises"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *KafkaClusterEnvironment `pulumi:"environment"`
	// The configuration of the Freight Kafka cluster.
	Freights []KafkaClusterFreight `pulumi:"freights"`
	// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
	Kind *string `pulumi:"kind"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network *KafkaClusterNetwork `pulumi:"network"`
	// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
	RbacCrn *string `pulumi:"rbacCrn"`
	// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region *string `pulumi:"region"`
	// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The configuration of the Standard Kafka cluster.
	Standard *KafkaClusterStandard `pulumi:"standard"`
}

type KafkaClusterState struct {
	// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
	ApiVersion pulumi.StringPtrInput
	// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
	Availability pulumi.StringPtrInput
	// The configuration of the Basic Kafka cluster.
	Basic KafkaClusterBasicPtrInput
	// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
	BootstrapEndpoint pulumi.StringPtrInput
	ByokKey           KafkaClusterByokKeyPtrInput
	// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringPtrInput
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated KafkaClusterDedicatedPtrInput
	// The name of the Kafka cluster.
	DisplayName pulumi.StringPtrInput
	// The configuration of the Enterprise Kafka cluster.
	Enterprises KafkaClusterEnterpriseArrayInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment KafkaClusterEnvironmentPtrInput
	// The configuration of the Freight Kafka cluster.
	Freights KafkaClusterFreightArrayInput
	// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
	Kind pulumi.StringPtrInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network KafkaClusterNetworkPtrInput
	// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
	RbacCrn pulumi.StringPtrInput
	// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region pulumi.StringPtrInput
	// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
	RestEndpoint pulumi.StringPtrInput
	// The configuration of the Standard Kafka cluster.
	Standard KafkaClusterStandardPtrInput
}

func (KafkaClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaClusterState)(nil)).Elem()
}

type kafkaClusterArgs struct {
	// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
	Availability string `pulumi:"availability"`
	// The configuration of the Basic Kafka cluster.
	Basic   *KafkaClusterBasic   `pulumi:"basic"`
	ByokKey *KafkaClusterByokKey `pulumi:"byokKey"`
	// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud string `pulumi:"cloud"`
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated *KafkaClusterDedicated `pulumi:"dedicated"`
	// The name of the Kafka cluster.
	DisplayName *string `pulumi:"displayName"`
	// The configuration of the Enterprise Kafka cluster.
	Enterprises []KafkaClusterEnterprise `pulumi:"enterprises"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment KafkaClusterEnvironment `pulumi:"environment"`
	// The configuration of the Freight Kafka cluster.
	Freights []KafkaClusterFreight `pulumi:"freights"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network *KafkaClusterNetwork `pulumi:"network"`
	// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region string `pulumi:"region"`
	// The configuration of the Standard Kafka cluster.
	Standard *KafkaClusterStandard `pulumi:"standard"`
}

// The set of arguments for constructing a KafkaCluster resource.
type KafkaClusterArgs struct {
	// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
	Availability pulumi.StringInput
	// The configuration of the Basic Kafka cluster.
	Basic   KafkaClusterBasicPtrInput
	ByokKey KafkaClusterByokKeyPtrInput
	// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringInput
	// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
	Dedicated KafkaClusterDedicatedPtrInput
	// The name of the Kafka cluster.
	DisplayName pulumi.StringPtrInput
	// The configuration of the Enterprise Kafka cluster.
	Enterprises KafkaClusterEnterpriseArrayInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment KafkaClusterEnvironmentInput
	// The configuration of the Freight Kafka cluster.
	Freights KafkaClusterFreightArrayInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network KafkaClusterNetworkPtrInput
	// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region pulumi.StringInput
	// The configuration of the Standard Kafka cluster.
	Standard KafkaClusterStandardPtrInput
}

func (KafkaClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kafkaClusterArgs)(nil)).Elem()
}

type KafkaClusterInput interface {
	pulumi.Input

	ToKafkaClusterOutput() KafkaClusterOutput
	ToKafkaClusterOutputWithContext(ctx context.Context) KafkaClusterOutput
}

func (*KafkaCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaCluster)(nil)).Elem()
}

func (i *KafkaCluster) ToKafkaClusterOutput() KafkaClusterOutput {
	return i.ToKafkaClusterOutputWithContext(context.Background())
}

func (i *KafkaCluster) ToKafkaClusterOutputWithContext(ctx context.Context) KafkaClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaClusterOutput)
}

// KafkaClusterArrayInput is an input type that accepts KafkaClusterArray and KafkaClusterArrayOutput values.
// You can construct a concrete instance of `KafkaClusterArrayInput` via:
//
//	KafkaClusterArray{ KafkaClusterArgs{...} }
type KafkaClusterArrayInput interface {
	pulumi.Input

	ToKafkaClusterArrayOutput() KafkaClusterArrayOutput
	ToKafkaClusterArrayOutputWithContext(context.Context) KafkaClusterArrayOutput
}

type KafkaClusterArray []KafkaClusterInput

func (KafkaClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaCluster)(nil)).Elem()
}

func (i KafkaClusterArray) ToKafkaClusterArrayOutput() KafkaClusterArrayOutput {
	return i.ToKafkaClusterArrayOutputWithContext(context.Background())
}

func (i KafkaClusterArray) ToKafkaClusterArrayOutputWithContext(ctx context.Context) KafkaClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaClusterArrayOutput)
}

// KafkaClusterMapInput is an input type that accepts KafkaClusterMap and KafkaClusterMapOutput values.
// You can construct a concrete instance of `KafkaClusterMapInput` via:
//
//	KafkaClusterMap{ "key": KafkaClusterArgs{...} }
type KafkaClusterMapInput interface {
	pulumi.Input

	ToKafkaClusterMapOutput() KafkaClusterMapOutput
	ToKafkaClusterMapOutputWithContext(context.Context) KafkaClusterMapOutput
}

type KafkaClusterMap map[string]KafkaClusterInput

func (KafkaClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaCluster)(nil)).Elem()
}

func (i KafkaClusterMap) ToKafkaClusterMapOutput() KafkaClusterMapOutput {
	return i.ToKafkaClusterMapOutputWithContext(context.Background())
}

func (i KafkaClusterMap) ToKafkaClusterMapOutputWithContext(ctx context.Context) KafkaClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KafkaClusterMapOutput)
}

type KafkaClusterOutput struct{ *pulumi.OutputState }

func (KafkaClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KafkaCluster)(nil)).Elem()
}

func (o KafkaClusterOutput) ToKafkaClusterOutput() KafkaClusterOutput {
	return o
}

func (o KafkaClusterOutput) ToKafkaClusterOutputWithContext(ctx context.Context) KafkaClusterOutput {
	return o
}

// (Required String) An API Version of the schema version of the Kafka cluster, for example, `cmk/v2`.
func (o KafkaClusterOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// The availability zone configuration of the Kafka cluster. Accepted values are: `SINGLE_ZONE`, `MULTI_ZONE`, `LOW`, and `HIGH`.
func (o KafkaClusterOutput) Availability() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.Availability }).(pulumi.StringOutput)
}

// The configuration of the Basic Kafka cluster.
func (o KafkaClusterOutput) Basic() KafkaClusterBasicPtrOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterBasicPtrOutput { return v.Basic }).(KafkaClusterBasicPtrOutput)
}

// (Required String) The bootstrap endpoint used by Kafka clients to connect to the Kafka cluster. (e.g., `SASL_SSL://pkc-00000.us-central1.gcp.confluent.cloud:9092`).
func (o KafkaClusterOutput) BootstrapEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.BootstrapEndpoint }).(pulumi.StringOutput)
}

func (o KafkaClusterOutput) ByokKey() KafkaClusterByokKeyOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterByokKeyOutput { return v.ByokKey }).(KafkaClusterByokKeyOutput)
}

// The cloud service provider that runs the Kafka cluster. Accepted values are: `AWS`, `AZURE`, and `GCP`.
func (o KafkaClusterOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.Cloud }).(pulumi.StringOutput)
}

// (Optional Configuration Block) The configuration of the Dedicated Kafka cluster. It supports the following:
func (o KafkaClusterOutput) Dedicated() KafkaClusterDedicatedPtrOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterDedicatedPtrOutput { return v.Dedicated }).(KafkaClusterDedicatedPtrOutput)
}

// The name of the Kafka cluster.
func (o KafkaClusterOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The configuration of the Enterprise Kafka cluster.
func (o KafkaClusterOutput) Enterprises() KafkaClusterEnterpriseArrayOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterEnterpriseArrayOutput { return v.Enterprises }).(KafkaClusterEnterpriseArrayOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o KafkaClusterOutput) Environment() KafkaClusterEnvironmentOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterEnvironmentOutput { return v.Environment }).(KafkaClusterEnvironmentOutput)
}

// The configuration of the Freight Kafka cluster.
func (o KafkaClusterOutput) Freights() KafkaClusterFreightArrayOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterFreightArrayOutput { return v.Freights }).(KafkaClusterFreightArrayOutput)
}

// (Required String) A kind of the Kafka cluster, for example, `Cluster`.
func (o KafkaClusterOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
// accounts.
func (o KafkaClusterOutput) Network() KafkaClusterNetworkOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterNetworkOutput { return v.Network }).(KafkaClusterNetworkOutput)
}

// (Required String) The Confluent Resource Name of the Kafka cluster, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-abc123/cloud-cluster=lkc-abc123`.
func (o KafkaClusterOutput) RbacCrn() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.RbacCrn }).(pulumi.StringOutput)
}

// The cloud service provider region where the Kafka cluster is running, for example, `us-west-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
func (o KafkaClusterOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The REST endpoint of the Kafka cluster (e.g., `https://pkc-00000.us-central1.gcp.confluent.cloud:443`).
func (o KafkaClusterOutput) RestEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *KafkaCluster) pulumi.StringOutput { return v.RestEndpoint }).(pulumi.StringOutput)
}

// The configuration of the Standard Kafka cluster.
func (o KafkaClusterOutput) Standard() KafkaClusterStandardPtrOutput {
	return o.ApplyT(func(v *KafkaCluster) KafkaClusterStandardPtrOutput { return v.Standard }).(KafkaClusterStandardPtrOutput)
}

type KafkaClusterArrayOutput struct{ *pulumi.OutputState }

func (KafkaClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KafkaCluster)(nil)).Elem()
}

func (o KafkaClusterArrayOutput) ToKafkaClusterArrayOutput() KafkaClusterArrayOutput {
	return o
}

func (o KafkaClusterArrayOutput) ToKafkaClusterArrayOutputWithContext(ctx context.Context) KafkaClusterArrayOutput {
	return o
}

func (o KafkaClusterArrayOutput) Index(i pulumi.IntInput) KafkaClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KafkaCluster {
		return vs[0].([]*KafkaCluster)[vs[1].(int)]
	}).(KafkaClusterOutput)
}

type KafkaClusterMapOutput struct{ *pulumi.OutputState }

func (KafkaClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KafkaCluster)(nil)).Elem()
}

func (o KafkaClusterMapOutput) ToKafkaClusterMapOutput() KafkaClusterMapOutput {
	return o
}

func (o KafkaClusterMapOutput) ToKafkaClusterMapOutputWithContext(ctx context.Context) KafkaClusterMapOutput {
	return o
}

func (o KafkaClusterMapOutput) MapIndex(k pulumi.StringInput) KafkaClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KafkaCluster {
		return vs[0].(map[string]*KafkaCluster)[vs[1].(string)]
	}).(KafkaClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaClusterInput)(nil)).Elem(), &KafkaCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaClusterArrayInput)(nil)).Elem(), KafkaClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KafkaClusterMapInput)(nil)).Elem(), KafkaClusterMap{})
	pulumi.RegisterOutputType(KafkaClusterOutput{})
	pulumi.RegisterOutputType(KafkaClusterArrayOutput{})
	pulumi.RegisterOutputType(KafkaClusterMapOutput{})
}
