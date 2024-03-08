// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ### Example Transit Gateway Attachment on AWS
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
//			development, err := confluentcloud.NewEnvironment(ctx, "development", nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewNetwork(ctx, "aws-transit-gateway-attachment", &confluentcloud.NetworkArgs{
//				DisplayName: pulumi.String("AWS Transit Gateway Attachment Network"),
//				Cloud:       pulumi.String("AWS"),
//				Region:      pulumi.String("us-east-2"),
//				Cidr:        pulumi.String("10.10.0.0/16"),
//				ConnectionTypes: pulumi.StringArray{
//					pulumi.String("TRANSITGATEWAY"),
//				},
//				Environment: &confluentcloud.NetworkEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewTransitGatewayAttachment(ctx, "aws", &confluentcloud.TransitGatewayAttachmentArgs{
//				DisplayName: pulumi.String("AWS Transit Gateway Attachment"),
//				Aws: &confluentcloud.TransitGatewayAttachmentAwsArgs{
//					RamResourceShareArn: pulumi.String("arn:aws:ram:us-east-2:000000000000:resource-share/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxx"),
//					TransitGatewayId:    pulumi.String("tgw-xxxxxxxxxxxxxxxxx"),
//					Routes: pulumi.StringArray{
//						pulumi.String("192.168.0.0/16"),
//						pulumi.String("172.16.0.0/12"),
//						pulumi.String("100.64.0.0/10"),
//						pulumi.String("10.0.0.0/8"),
//					},
//				},
//				Environment: &confluentcloud.TransitGatewayAttachmentEnvironmentArgs{
//					Id: development.ID(),
//				},
//				Network: &confluentcloud.TransitGatewayAttachmentNetworkArgs{
//					Id: aws_transit_gateway_attachment.ID(),
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
// <!--End PulumiCodeChooser -->
//
// ## Getting Started
//
// The following end-to-end examples might help to get started with `TransitGatewayAttachment` resource:
//   - `dedicated-transit-gateway-attachment-aws-kafka-acls`: _Dedicated_ Kafka cluster on AWS that is accessible via Transit Gateway Endpoint with authorization using ACLs
//   - enterprise-privatelinkattachment-aws-kafka-acls
//
// ## Import
//
// You can import a Transit Gateway Attachment by using Environment ID and Transit Gateway Attachment ID, in the format `<Environment ID>/<Transit Gateway Attachment ID>`. The following example shows how to import a Transit Gateway Attachment:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment my_tgwa env-abc123/tgwa-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type TransitGatewayAttachment struct {
	pulumi.CustomResourceState

	// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
	Aws TransitGatewayAttachmentAwsPtrOutput `pulumi:"aws"`
	// The name of the Transit Gateway Attachment.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment TransitGatewayAttachmentEnvironmentOutput `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network TransitGatewayAttachmentNetworkOutput `pulumi:"network"`
}

// NewTransitGatewayAttachment registers a new resource with the given unique name, arguments, and options.
func NewTransitGatewayAttachment(ctx *pulumi.Context,
	name string, args *TransitGatewayAttachmentArgs, opts ...pulumi.ResourceOption) (*TransitGatewayAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitGatewayAttachment
	err := ctx.RegisterResource("confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitGatewayAttachment gets an existing TransitGatewayAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitGatewayAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitGatewayAttachmentState, opts ...pulumi.ResourceOption) (*TransitGatewayAttachment, error) {
	var resource TransitGatewayAttachment
	err := ctx.ReadResource("confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitGatewayAttachment resources.
type transitGatewayAttachmentState struct {
	// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
	Aws *TransitGatewayAttachmentAws `pulumi:"aws"`
	// The name of the Transit Gateway Attachment.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *TransitGatewayAttachmentEnvironment `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network *TransitGatewayAttachmentNetwork `pulumi:"network"`
}

type TransitGatewayAttachmentState struct {
	// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
	Aws TransitGatewayAttachmentAwsPtrInput
	// The name of the Transit Gateway Attachment.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment TransitGatewayAttachmentEnvironmentPtrInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network TransitGatewayAttachmentNetworkPtrInput
}

func (TransitGatewayAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayAttachmentState)(nil)).Elem()
}

type transitGatewayAttachmentArgs struct {
	// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
	Aws *TransitGatewayAttachmentAws `pulumi:"aws"`
	// The name of the Transit Gateway Attachment.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment TransitGatewayAttachmentEnvironment `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network TransitGatewayAttachmentNetwork `pulumi:"network"`
}

// The set of arguments for constructing a TransitGatewayAttachment resource.
type TransitGatewayAttachmentArgs struct {
	// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
	Aws TransitGatewayAttachmentAwsPtrInput
	// The name of the Transit Gateway Attachment.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment TransitGatewayAttachmentEnvironmentInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network TransitGatewayAttachmentNetworkInput
}

func (TransitGatewayAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitGatewayAttachmentArgs)(nil)).Elem()
}

type TransitGatewayAttachmentInput interface {
	pulumi.Input

	ToTransitGatewayAttachmentOutput() TransitGatewayAttachmentOutput
	ToTransitGatewayAttachmentOutputWithContext(ctx context.Context) TransitGatewayAttachmentOutput
}

func (*TransitGatewayAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayAttachment)(nil)).Elem()
}

func (i *TransitGatewayAttachment) ToTransitGatewayAttachmentOutput() TransitGatewayAttachmentOutput {
	return i.ToTransitGatewayAttachmentOutputWithContext(context.Background())
}

func (i *TransitGatewayAttachment) ToTransitGatewayAttachmentOutputWithContext(ctx context.Context) TransitGatewayAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayAttachmentOutput)
}

// TransitGatewayAttachmentArrayInput is an input type that accepts TransitGatewayAttachmentArray and TransitGatewayAttachmentArrayOutput values.
// You can construct a concrete instance of `TransitGatewayAttachmentArrayInput` via:
//
//	TransitGatewayAttachmentArray{ TransitGatewayAttachmentArgs{...} }
type TransitGatewayAttachmentArrayInput interface {
	pulumi.Input

	ToTransitGatewayAttachmentArrayOutput() TransitGatewayAttachmentArrayOutput
	ToTransitGatewayAttachmentArrayOutputWithContext(context.Context) TransitGatewayAttachmentArrayOutput
}

type TransitGatewayAttachmentArray []TransitGatewayAttachmentInput

func (TransitGatewayAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayAttachment)(nil)).Elem()
}

func (i TransitGatewayAttachmentArray) ToTransitGatewayAttachmentArrayOutput() TransitGatewayAttachmentArrayOutput {
	return i.ToTransitGatewayAttachmentArrayOutputWithContext(context.Background())
}

func (i TransitGatewayAttachmentArray) ToTransitGatewayAttachmentArrayOutputWithContext(ctx context.Context) TransitGatewayAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayAttachmentArrayOutput)
}

// TransitGatewayAttachmentMapInput is an input type that accepts TransitGatewayAttachmentMap and TransitGatewayAttachmentMapOutput values.
// You can construct a concrete instance of `TransitGatewayAttachmentMapInput` via:
//
//	TransitGatewayAttachmentMap{ "key": TransitGatewayAttachmentArgs{...} }
type TransitGatewayAttachmentMapInput interface {
	pulumi.Input

	ToTransitGatewayAttachmentMapOutput() TransitGatewayAttachmentMapOutput
	ToTransitGatewayAttachmentMapOutputWithContext(context.Context) TransitGatewayAttachmentMapOutput
}

type TransitGatewayAttachmentMap map[string]TransitGatewayAttachmentInput

func (TransitGatewayAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayAttachment)(nil)).Elem()
}

func (i TransitGatewayAttachmentMap) ToTransitGatewayAttachmentMapOutput() TransitGatewayAttachmentMapOutput {
	return i.ToTransitGatewayAttachmentMapOutputWithContext(context.Background())
}

func (i TransitGatewayAttachmentMap) ToTransitGatewayAttachmentMapOutputWithContext(ctx context.Context) TransitGatewayAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitGatewayAttachmentMapOutput)
}

type TransitGatewayAttachmentOutput struct{ *pulumi.OutputState }

func (TransitGatewayAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitGatewayAttachment)(nil)).Elem()
}

func (o TransitGatewayAttachmentOutput) ToTransitGatewayAttachmentOutput() TransitGatewayAttachmentOutput {
	return o
}

func (o TransitGatewayAttachmentOutput) ToTransitGatewayAttachmentOutputWithContext(ctx context.Context) TransitGatewayAttachmentOutput {
	return o
}

// (Required Configuration Block) The AWS-specific Transit Gateway Attachment details. It supports the following:
func (o TransitGatewayAttachmentOutput) Aws() TransitGatewayAttachmentAwsPtrOutput {
	return o.ApplyT(func(v *TransitGatewayAttachment) TransitGatewayAttachmentAwsPtrOutput { return v.Aws }).(TransitGatewayAttachmentAwsPtrOutput)
}

// The name of the Transit Gateway Attachment.
func (o TransitGatewayAttachmentOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitGatewayAttachment) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o TransitGatewayAttachmentOutput) Environment() TransitGatewayAttachmentEnvironmentOutput {
	return o.ApplyT(func(v *TransitGatewayAttachment) TransitGatewayAttachmentEnvironmentOutput { return v.Environment }).(TransitGatewayAttachmentEnvironmentOutput)
}

// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
// accounts.
func (o TransitGatewayAttachmentOutput) Network() TransitGatewayAttachmentNetworkOutput {
	return o.ApplyT(func(v *TransitGatewayAttachment) TransitGatewayAttachmentNetworkOutput { return v.Network }).(TransitGatewayAttachmentNetworkOutput)
}

type TransitGatewayAttachmentArrayOutput struct{ *pulumi.OutputState }

func (TransitGatewayAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitGatewayAttachment)(nil)).Elem()
}

func (o TransitGatewayAttachmentArrayOutput) ToTransitGatewayAttachmentArrayOutput() TransitGatewayAttachmentArrayOutput {
	return o
}

func (o TransitGatewayAttachmentArrayOutput) ToTransitGatewayAttachmentArrayOutputWithContext(ctx context.Context) TransitGatewayAttachmentArrayOutput {
	return o
}

func (o TransitGatewayAttachmentArrayOutput) Index(i pulumi.IntInput) TransitGatewayAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitGatewayAttachment {
		return vs[0].([]*TransitGatewayAttachment)[vs[1].(int)]
	}).(TransitGatewayAttachmentOutput)
}

type TransitGatewayAttachmentMapOutput struct{ *pulumi.OutputState }

func (TransitGatewayAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitGatewayAttachment)(nil)).Elem()
}

func (o TransitGatewayAttachmentMapOutput) ToTransitGatewayAttachmentMapOutput() TransitGatewayAttachmentMapOutput {
	return o
}

func (o TransitGatewayAttachmentMapOutput) ToTransitGatewayAttachmentMapOutputWithContext(ctx context.Context) TransitGatewayAttachmentMapOutput {
	return o
}

func (o TransitGatewayAttachmentMapOutput) MapIndex(k pulumi.StringInput) TransitGatewayAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitGatewayAttachment {
		return vs[0].(map[string]*TransitGatewayAttachment)[vs[1].(string)]
	}).(TransitGatewayAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayAttachmentInput)(nil)).Elem(), &TransitGatewayAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayAttachmentArrayInput)(nil)).Elem(), TransitGatewayAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitGatewayAttachmentMapInput)(nil)).Elem(), TransitGatewayAttachmentMap{})
	pulumi.RegisterOutputType(TransitGatewayAttachmentOutput{})
	pulumi.RegisterOutputType(TransitGatewayAttachmentArrayOutput{})
	pulumi.RegisterOutputType(TransitGatewayAttachmentMapOutput{})
}
