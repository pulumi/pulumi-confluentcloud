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

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `PrivateLinkAttachmentConnection` provides a Private Link Attachment Connection resource that enables creating, editing, and deleting Private Link Attachment Connections on Confluent Cloud.
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
//			aws, err := confluentcloud.NewPrivateLinkAttachmentConnection(ctx, "aws", &confluentcloud.PrivateLinkAttachmentConnectionArgs{
//				DisplayName: pulumi.String("my_endpoint"),
//				Environment: &confluentcloud.PrivateLinkAttachmentConnectionEnvironmentArgs{
//					Id: pulumi.String("env-8gv0v5"),
//				},
//				Aws: &confluentcloud.PrivateLinkAttachmentConnectionAwsArgs{
//					VpcEndpointId: pulumi.String("vpce-0ed4d51f5d6ef9b6d"),
//				},
//				PrivateLinkAttachment: &confluentcloud.PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs{
//					Id: pulumi.String("platt-plyvyl"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewPrivateLinkAttachmentConnection(ctx, "azure", &confluentcloud.PrivateLinkAttachmentConnectionArgs{
//				DisplayName: pulumi.String("prod-azure-central-us-az1-connection"),
//				Environment: &confluentcloud.PrivateLinkAttachmentConnectionEnvironmentArgs{
//					Id: pulumi.String("env-12345"),
//				},
//				Azure: &confluentcloud.PrivateLinkAttachmentConnectionAzureArgs{
//					PrivateEndpointResourceId: pulumi.String("/subscriptions/123aaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa/resourceGroups/testvpc/providers/Microsoft.Network/privateEndpoints/pe-platt-abcdef-az1"),
//				},
//				PrivateLinkAttachment: &confluentcloud.PrivateLinkAttachmentConnectionPrivateLinkAttachmentArgs{
//					Id: pulumi.String("platt-abcdef"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("privateLinkAttachmentConnection", aws)
//			return nil
//		})
//	}
//
// ```
//
// ## Getting Started
//
// The following end-to-end examples might help to get started with `PrivateLinkAttachmentConnection` resource:
// * `enterprise-privatelinkattachment-aws-kafka-acls`: _Enterprise_ Kafka cluster on AWS that is accessible via PrivateLink connections with authorization using ACLs
// * `enterprise-privatelinkattachment-azure-kafka-acls`: _Enterprise_ Kafka cluster on Azure that is accessible via PrivateLink connections with authorization using ACLs
//
// ## Import
//
// You can import a Private Link Attachment Connection by using Environment ID and Private Link Attachment Connection ID, in the format `<Environment ID>/<Private Link Attachment Connection ID>`. The following example shows how to import a Private Link Attachment Connection:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection main env-abc123/plattc-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type PrivateLinkAttachmentConnection struct {
	pulumi.CustomResourceState

	Aws   PrivateLinkAttachmentConnectionAwsPtrOutput   `pulumi:"aws"`
	Azure PrivateLinkAttachmentConnectionAzurePtrOutput `pulumi:"azure"`
	// The name of the Private Link Attachment Connection.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PrivateLinkAttachmentConnectionEnvironmentOutput `pulumi:"environment"`
	Gcp         PrivateLinkAttachmentConnectionGcpPtrOutput      `pulumi:"gcp"`
	// The privateLinkAttachment to which this belongs.
	PrivateLinkAttachment PrivateLinkAttachmentConnectionPrivateLinkAttachmentOutput `pulumi:"privateLinkAttachment"`
	// (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
	ResourceName pulumi.StringOutput `pulumi:"resourceName"`
}

// NewPrivateLinkAttachmentConnection registers a new resource with the given unique name, arguments, and options.
func NewPrivateLinkAttachmentConnection(ctx *pulumi.Context,
	name string, args *PrivateLinkAttachmentConnectionArgs, opts ...pulumi.ResourceOption) (*PrivateLinkAttachmentConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.PrivateLinkAttachment == nil {
		return nil, errors.New("invalid value for required argument 'PrivateLinkAttachment'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PrivateLinkAttachmentConnection
	err := ctx.RegisterResource("confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPrivateLinkAttachmentConnection gets an existing PrivateLinkAttachmentConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPrivateLinkAttachmentConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PrivateLinkAttachmentConnectionState, opts ...pulumi.ResourceOption) (*PrivateLinkAttachmentConnection, error) {
	var resource PrivateLinkAttachmentConnection
	err := ctx.ReadResource("confluentcloud:index/privateLinkAttachmentConnection:PrivateLinkAttachmentConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PrivateLinkAttachmentConnection resources.
type privateLinkAttachmentConnectionState struct {
	Aws   *PrivateLinkAttachmentConnectionAws   `pulumi:"aws"`
	Azure *PrivateLinkAttachmentConnectionAzure `pulumi:"azure"`
	// The name of the Private Link Attachment Connection.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *PrivateLinkAttachmentConnectionEnvironment `pulumi:"environment"`
	Gcp         *PrivateLinkAttachmentConnectionGcp         `pulumi:"gcp"`
	// The privateLinkAttachment to which this belongs.
	PrivateLinkAttachment *PrivateLinkAttachmentConnectionPrivateLinkAttachment `pulumi:"privateLinkAttachment"`
	// (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
	ResourceName *string `pulumi:"resourceName"`
}

type PrivateLinkAttachmentConnectionState struct {
	Aws   PrivateLinkAttachmentConnectionAwsPtrInput
	Azure PrivateLinkAttachmentConnectionAzurePtrInput
	// The name of the Private Link Attachment Connection.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PrivateLinkAttachmentConnectionEnvironmentPtrInput
	Gcp         PrivateLinkAttachmentConnectionGcpPtrInput
	// The privateLinkAttachment to which this belongs.
	PrivateLinkAttachment PrivateLinkAttachmentConnectionPrivateLinkAttachmentPtrInput
	// (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
	ResourceName pulumi.StringPtrInput
}

func (PrivateLinkAttachmentConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkAttachmentConnectionState)(nil)).Elem()
}

type privateLinkAttachmentConnectionArgs struct {
	Aws   *PrivateLinkAttachmentConnectionAws   `pulumi:"aws"`
	Azure *PrivateLinkAttachmentConnectionAzure `pulumi:"azure"`
	// The name of the Private Link Attachment Connection.
	DisplayName string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PrivateLinkAttachmentConnectionEnvironment `pulumi:"environment"`
	Gcp         *PrivateLinkAttachmentConnectionGcp        `pulumi:"gcp"`
	// The privateLinkAttachment to which this belongs.
	PrivateLinkAttachment PrivateLinkAttachmentConnectionPrivateLinkAttachment `pulumi:"privateLinkAttachment"`
}

// The set of arguments for constructing a PrivateLinkAttachmentConnection resource.
type PrivateLinkAttachmentConnectionArgs struct {
	Aws   PrivateLinkAttachmentConnectionAwsPtrInput
	Azure PrivateLinkAttachmentConnectionAzurePtrInput
	// The name of the Private Link Attachment Connection.
	DisplayName pulumi.StringInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PrivateLinkAttachmentConnectionEnvironmentInput
	Gcp         PrivateLinkAttachmentConnectionGcpPtrInput
	// The privateLinkAttachment to which this belongs.
	PrivateLinkAttachment PrivateLinkAttachmentConnectionPrivateLinkAttachmentInput
}

func (PrivateLinkAttachmentConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*privateLinkAttachmentConnectionArgs)(nil)).Elem()
}

type PrivateLinkAttachmentConnectionInput interface {
	pulumi.Input

	ToPrivateLinkAttachmentConnectionOutput() PrivateLinkAttachmentConnectionOutput
	ToPrivateLinkAttachmentConnectionOutputWithContext(ctx context.Context) PrivateLinkAttachmentConnectionOutput
}

func (*PrivateLinkAttachmentConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkAttachmentConnection)(nil)).Elem()
}

func (i *PrivateLinkAttachmentConnection) ToPrivateLinkAttachmentConnectionOutput() PrivateLinkAttachmentConnectionOutput {
	return i.ToPrivateLinkAttachmentConnectionOutputWithContext(context.Background())
}

func (i *PrivateLinkAttachmentConnection) ToPrivateLinkAttachmentConnectionOutputWithContext(ctx context.Context) PrivateLinkAttachmentConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkAttachmentConnectionOutput)
}

// PrivateLinkAttachmentConnectionArrayInput is an input type that accepts PrivateLinkAttachmentConnectionArray and PrivateLinkAttachmentConnectionArrayOutput values.
// You can construct a concrete instance of `PrivateLinkAttachmentConnectionArrayInput` via:
//
//	PrivateLinkAttachmentConnectionArray{ PrivateLinkAttachmentConnectionArgs{...} }
type PrivateLinkAttachmentConnectionArrayInput interface {
	pulumi.Input

	ToPrivateLinkAttachmentConnectionArrayOutput() PrivateLinkAttachmentConnectionArrayOutput
	ToPrivateLinkAttachmentConnectionArrayOutputWithContext(context.Context) PrivateLinkAttachmentConnectionArrayOutput
}

type PrivateLinkAttachmentConnectionArray []PrivateLinkAttachmentConnectionInput

func (PrivateLinkAttachmentConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkAttachmentConnection)(nil)).Elem()
}

func (i PrivateLinkAttachmentConnectionArray) ToPrivateLinkAttachmentConnectionArrayOutput() PrivateLinkAttachmentConnectionArrayOutput {
	return i.ToPrivateLinkAttachmentConnectionArrayOutputWithContext(context.Background())
}

func (i PrivateLinkAttachmentConnectionArray) ToPrivateLinkAttachmentConnectionArrayOutputWithContext(ctx context.Context) PrivateLinkAttachmentConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkAttachmentConnectionArrayOutput)
}

// PrivateLinkAttachmentConnectionMapInput is an input type that accepts PrivateLinkAttachmentConnectionMap and PrivateLinkAttachmentConnectionMapOutput values.
// You can construct a concrete instance of `PrivateLinkAttachmentConnectionMapInput` via:
//
//	PrivateLinkAttachmentConnectionMap{ "key": PrivateLinkAttachmentConnectionArgs{...} }
type PrivateLinkAttachmentConnectionMapInput interface {
	pulumi.Input

	ToPrivateLinkAttachmentConnectionMapOutput() PrivateLinkAttachmentConnectionMapOutput
	ToPrivateLinkAttachmentConnectionMapOutputWithContext(context.Context) PrivateLinkAttachmentConnectionMapOutput
}

type PrivateLinkAttachmentConnectionMap map[string]PrivateLinkAttachmentConnectionInput

func (PrivateLinkAttachmentConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkAttachmentConnection)(nil)).Elem()
}

func (i PrivateLinkAttachmentConnectionMap) ToPrivateLinkAttachmentConnectionMapOutput() PrivateLinkAttachmentConnectionMapOutput {
	return i.ToPrivateLinkAttachmentConnectionMapOutputWithContext(context.Background())
}

func (i PrivateLinkAttachmentConnectionMap) ToPrivateLinkAttachmentConnectionMapOutputWithContext(ctx context.Context) PrivateLinkAttachmentConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PrivateLinkAttachmentConnectionMapOutput)
}

type PrivateLinkAttachmentConnectionOutput struct{ *pulumi.OutputState }

func (PrivateLinkAttachmentConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PrivateLinkAttachmentConnection)(nil)).Elem()
}

func (o PrivateLinkAttachmentConnectionOutput) ToPrivateLinkAttachmentConnectionOutput() PrivateLinkAttachmentConnectionOutput {
	return o
}

func (o PrivateLinkAttachmentConnectionOutput) ToPrivateLinkAttachmentConnectionOutputWithContext(ctx context.Context) PrivateLinkAttachmentConnectionOutput {
	return o
}

func (o PrivateLinkAttachmentConnectionOutput) Aws() PrivateLinkAttachmentConnectionAwsPtrOutput {
	return o.ApplyT(func(v *PrivateLinkAttachmentConnection) PrivateLinkAttachmentConnectionAwsPtrOutput { return v.Aws }).(PrivateLinkAttachmentConnectionAwsPtrOutput)
}

func (o PrivateLinkAttachmentConnectionOutput) Azure() PrivateLinkAttachmentConnectionAzurePtrOutput {
	return o.ApplyT(func(v *PrivateLinkAttachmentConnection) PrivateLinkAttachmentConnectionAzurePtrOutput { return v.Azure }).(PrivateLinkAttachmentConnectionAzurePtrOutput)
}

// The name of the Private Link Attachment Connection.
func (o PrivateLinkAttachmentConnectionOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkAttachmentConnection) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o PrivateLinkAttachmentConnectionOutput) Environment() PrivateLinkAttachmentConnectionEnvironmentOutput {
	return o.ApplyT(func(v *PrivateLinkAttachmentConnection) PrivateLinkAttachmentConnectionEnvironmentOutput {
		return v.Environment
	}).(PrivateLinkAttachmentConnectionEnvironmentOutput)
}

func (o PrivateLinkAttachmentConnectionOutput) Gcp() PrivateLinkAttachmentConnectionGcpPtrOutput {
	return o.ApplyT(func(v *PrivateLinkAttachmentConnection) PrivateLinkAttachmentConnectionGcpPtrOutput { return v.Gcp }).(PrivateLinkAttachmentConnectionGcpPtrOutput)
}

// The privateLinkAttachment to which this belongs.
func (o PrivateLinkAttachmentConnectionOutput) PrivateLinkAttachment() PrivateLinkAttachmentConnectionPrivateLinkAttachmentOutput {
	return o.ApplyT(func(v *PrivateLinkAttachmentConnection) PrivateLinkAttachmentConnectionPrivateLinkAttachmentOutput {
		return v.PrivateLinkAttachment
	}).(PrivateLinkAttachmentConnectionPrivateLinkAttachmentOutput)
}

// (Required String) The Confluent Resource Name of the Private Link Attachment Connection, for example `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa/environment=env-75gxp2/private-link-attachment=platt-1q0ky0/private-link-attachment-connection=plattc-77zq2w`.
func (o PrivateLinkAttachmentConnectionOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *PrivateLinkAttachmentConnection) pulumi.StringOutput { return v.ResourceName }).(pulumi.StringOutput)
}

type PrivateLinkAttachmentConnectionArrayOutput struct{ *pulumi.OutputState }

func (PrivateLinkAttachmentConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PrivateLinkAttachmentConnection)(nil)).Elem()
}

func (o PrivateLinkAttachmentConnectionArrayOutput) ToPrivateLinkAttachmentConnectionArrayOutput() PrivateLinkAttachmentConnectionArrayOutput {
	return o
}

func (o PrivateLinkAttachmentConnectionArrayOutput) ToPrivateLinkAttachmentConnectionArrayOutputWithContext(ctx context.Context) PrivateLinkAttachmentConnectionArrayOutput {
	return o
}

func (o PrivateLinkAttachmentConnectionArrayOutput) Index(i pulumi.IntInput) PrivateLinkAttachmentConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PrivateLinkAttachmentConnection {
		return vs[0].([]*PrivateLinkAttachmentConnection)[vs[1].(int)]
	}).(PrivateLinkAttachmentConnectionOutput)
}

type PrivateLinkAttachmentConnectionMapOutput struct{ *pulumi.OutputState }

func (PrivateLinkAttachmentConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PrivateLinkAttachmentConnection)(nil)).Elem()
}

func (o PrivateLinkAttachmentConnectionMapOutput) ToPrivateLinkAttachmentConnectionMapOutput() PrivateLinkAttachmentConnectionMapOutput {
	return o
}

func (o PrivateLinkAttachmentConnectionMapOutput) ToPrivateLinkAttachmentConnectionMapOutputWithContext(ctx context.Context) PrivateLinkAttachmentConnectionMapOutput {
	return o
}

func (o PrivateLinkAttachmentConnectionMapOutput) MapIndex(k pulumi.StringInput) PrivateLinkAttachmentConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PrivateLinkAttachmentConnection {
		return vs[0].(map[string]*PrivateLinkAttachmentConnection)[vs[1].(string)]
	}).(PrivateLinkAttachmentConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkAttachmentConnectionInput)(nil)).Elem(), &PrivateLinkAttachmentConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkAttachmentConnectionArrayInput)(nil)).Elem(), PrivateLinkAttachmentConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PrivateLinkAttachmentConnectionMapInput)(nil)).Elem(), PrivateLinkAttachmentConnectionMap{})
	pulumi.RegisterOutputType(PrivateLinkAttachmentConnectionOutput{})
	pulumi.RegisterOutputType(PrivateLinkAttachmentConnectionArrayOutput{})
	pulumi.RegisterOutputType(PrivateLinkAttachmentConnectionMapOutput{})
}
