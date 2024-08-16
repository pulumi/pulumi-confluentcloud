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
// `ServiceAccount` provides a Service Account resource that enables creating, editing, and deleting service accounts on Confluent Cloud.
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
//			_, err := confluentcloud.NewServiceAccount(ctx, "example-sa", &confluentcloud.ServiceAccountArgs{
//				DisplayName: pulumi.String("orders-app-sa"),
//				Description: pulumi.String("Service Account for orders app"),
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
// The following end-to-end examples might help to get started with `ServiceAccount` resource:
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
//
// ## Import
//
// You can import a Service Account by using Service Account ID, for example:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/serviceAccount:ServiceAccount my_sa sa-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type ServiceAccount struct {
	pulumi.CustomResourceState

	// (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// A free-form description of the Service Account.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A human-readable name for the Service Account.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// (Required String) A kind of the Service Account, for example, `ServiceAccount`.
	Kind pulumi.StringOutput `pulumi:"kind"`
}

// NewServiceAccount registers a new resource with the given unique name, arguments, and options.
func NewServiceAccount(ctx *pulumi.Context,
	name string, args *ServiceAccountArgs, opts ...pulumi.ResourceOption) (*ServiceAccount, error) {
	if args == nil {
		args = &ServiceAccountArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceAccount
	err := ctx.RegisterResource("confluentcloud:index/serviceAccount:ServiceAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceAccount gets an existing ServiceAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceAccountState, opts ...pulumi.ResourceOption) (*ServiceAccount, error) {
	var resource ServiceAccount
	err := ctx.ReadResource("confluentcloud:index/serviceAccount:ServiceAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceAccount resources.
type serviceAccountState struct {
	// (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
	ApiVersion *string `pulumi:"apiVersion"`
	// A free-form description of the Service Account.
	Description *string `pulumi:"description"`
	// A human-readable name for the Service Account.
	DisplayName *string `pulumi:"displayName"`
	// (Required String) A kind of the Service Account, for example, `ServiceAccount`.
	Kind *string `pulumi:"kind"`
}

type ServiceAccountState struct {
	// (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
	ApiVersion pulumi.StringPtrInput
	// A free-form description of the Service Account.
	Description pulumi.StringPtrInput
	// A human-readable name for the Service Account.
	DisplayName pulumi.StringPtrInput
	// (Required String) A kind of the Service Account, for example, `ServiceAccount`.
	Kind pulumi.StringPtrInput
}

func (ServiceAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceAccountState)(nil)).Elem()
}

type serviceAccountArgs struct {
	// A free-form description of the Service Account.
	Description *string `pulumi:"description"`
	// A human-readable name for the Service Account.
	DisplayName *string `pulumi:"displayName"`
}

// The set of arguments for constructing a ServiceAccount resource.
type ServiceAccountArgs struct {
	// A free-form description of the Service Account.
	Description pulumi.StringPtrInput
	// A human-readable name for the Service Account.
	DisplayName pulumi.StringPtrInput
}

func (ServiceAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceAccountArgs)(nil)).Elem()
}

type ServiceAccountInput interface {
	pulumi.Input

	ToServiceAccountOutput() ServiceAccountOutput
	ToServiceAccountOutputWithContext(ctx context.Context) ServiceAccountOutput
}

func (*ServiceAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAccount)(nil)).Elem()
}

func (i *ServiceAccount) ToServiceAccountOutput() ServiceAccountOutput {
	return i.ToServiceAccountOutputWithContext(context.Background())
}

func (i *ServiceAccount) ToServiceAccountOutputWithContext(ctx context.Context) ServiceAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAccountOutput)
}

// ServiceAccountArrayInput is an input type that accepts ServiceAccountArray and ServiceAccountArrayOutput values.
// You can construct a concrete instance of `ServiceAccountArrayInput` via:
//
//	ServiceAccountArray{ ServiceAccountArgs{...} }
type ServiceAccountArrayInput interface {
	pulumi.Input

	ToServiceAccountArrayOutput() ServiceAccountArrayOutput
	ToServiceAccountArrayOutputWithContext(context.Context) ServiceAccountArrayOutput
}

type ServiceAccountArray []ServiceAccountInput

func (ServiceAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceAccount)(nil)).Elem()
}

func (i ServiceAccountArray) ToServiceAccountArrayOutput() ServiceAccountArrayOutput {
	return i.ToServiceAccountArrayOutputWithContext(context.Background())
}

func (i ServiceAccountArray) ToServiceAccountArrayOutputWithContext(ctx context.Context) ServiceAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAccountArrayOutput)
}

// ServiceAccountMapInput is an input type that accepts ServiceAccountMap and ServiceAccountMapOutput values.
// You can construct a concrete instance of `ServiceAccountMapInput` via:
//
//	ServiceAccountMap{ "key": ServiceAccountArgs{...} }
type ServiceAccountMapInput interface {
	pulumi.Input

	ToServiceAccountMapOutput() ServiceAccountMapOutput
	ToServiceAccountMapOutputWithContext(context.Context) ServiceAccountMapOutput
}

type ServiceAccountMap map[string]ServiceAccountInput

func (ServiceAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceAccount)(nil)).Elem()
}

func (i ServiceAccountMap) ToServiceAccountMapOutput() ServiceAccountMapOutput {
	return i.ToServiceAccountMapOutputWithContext(context.Background())
}

func (i ServiceAccountMap) ToServiceAccountMapOutputWithContext(ctx context.Context) ServiceAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAccountMapOutput)
}

type ServiceAccountOutput struct{ *pulumi.OutputState }

func (ServiceAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAccount)(nil)).Elem()
}

func (o ServiceAccountOutput) ToServiceAccountOutput() ServiceAccountOutput {
	return o
}

func (o ServiceAccountOutput) ToServiceAccountOutputWithContext(ctx context.Context) ServiceAccountOutput {
	return o
}

// (Required String) An API Version of the schema version of the Service Account, for example, `iam/v2`.
func (o ServiceAccountOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// A free-form description of the Service Account.
func (o ServiceAccountOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A human-readable name for the Service Account.
func (o ServiceAccountOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required String) A kind of the Service Account, for example, `ServiceAccount`.
func (o ServiceAccountOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

type ServiceAccountArrayOutput struct{ *pulumi.OutputState }

func (ServiceAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceAccount)(nil)).Elem()
}

func (o ServiceAccountArrayOutput) ToServiceAccountArrayOutput() ServiceAccountArrayOutput {
	return o
}

func (o ServiceAccountArrayOutput) ToServiceAccountArrayOutputWithContext(ctx context.Context) ServiceAccountArrayOutput {
	return o
}

func (o ServiceAccountArrayOutput) Index(i pulumi.IntInput) ServiceAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceAccount {
		return vs[0].([]*ServiceAccount)[vs[1].(int)]
	}).(ServiceAccountOutput)
}

type ServiceAccountMapOutput struct{ *pulumi.OutputState }

func (ServiceAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceAccount)(nil)).Elem()
}

func (o ServiceAccountMapOutput) ToServiceAccountMapOutput() ServiceAccountMapOutput {
	return o
}

func (o ServiceAccountMapOutput) ToServiceAccountMapOutputWithContext(ctx context.Context) ServiceAccountMapOutput {
	return o
}

func (o ServiceAccountMapOutput) MapIndex(k pulumi.StringInput) ServiceAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceAccount {
		return vs[0].(map[string]*ServiceAccount)[vs[1].(string)]
	}).(ServiceAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAccountInput)(nil)).Elem(), &ServiceAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAccountArrayInput)(nil)).Elem(), ServiceAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAccountMapInput)(nil)).Elem(), ServiceAccountMap{})
	pulumi.RegisterOutputType(ServiceAccountOutput{})
	pulumi.RegisterOutputType(ServiceAccountArrayOutput{})
	pulumi.RegisterOutputType(ServiceAccountMapOutput{})
}
