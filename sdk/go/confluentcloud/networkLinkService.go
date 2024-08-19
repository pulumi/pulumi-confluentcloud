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
// ### Example Network Link Service on AWS
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
//			_, err = confluentcloud.NewNetwork(ctx, "aws-private-link", &confluentcloud.NetworkArgs{
//				DisplayName: pulumi.String("AWS Private Link Network"),
//				Cloud:       pulumi.String("AWS"),
//				Region:      pulumi.String("us-east-1"),
//				ConnectionTypes: pulumi.StringArray{
//					pulumi.String("PRIVATELINK"),
//				},
//				Zones: pulumi.StringArray{
//					pulumi.String("use1-az1"),
//					pulumi.String("use1-az2"),
//					pulumi.String("use1-az6"),
//				},
//				Environment: &confluentcloud.NetworkEnvironmentArgs{
//					Id: development.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewNetworkLinkService(ctx, "aws_nls", &confluentcloud.NetworkLinkServiceArgs{
//				DisplayName: pulumi.String("AWS Private Link network link service"),
//				Environment: &confluentcloud.NetworkLinkServiceEnvironmentArgs{
//					Id: development.ID(),
//				},
//				Network: &confluentcloud.NetworkLinkServiceNetworkArgs{
//					Id: aws_private_link.ID(),
//				},
//				Description: pulumi.String("Test NL service"),
//				Accept: &confluentcloud.NetworkLinkServiceAcceptArgs{
//					Environments: pulumi.StringArray{
//						pulumi.String("env-5678"),
//						pulumi.String("env-0923"),
//					},
//					Networks: pulumi.StringArray{
//						pulumi.String("n-1234"),
//					},
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
// The following end-to-end examples might help to get started with `NetworkLinkService` resource:
// * `cluster-link-over-aws-private-link-networks`: Cluster link over two dedicated clusters in separate AWS PrivateLink networks
//
// ## Import
//
// You can import a Network Link Service by using Environment ID and Network Link Service ID, in the format `<Environment ID>/<Network Link Service ID>`. The following example shows how to import a Network Link Service:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/networkLinkService:NetworkLinkService my_nls env-abc123/nls-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type NetworkLinkService struct {
	pulumi.CustomResourceState

	Accept NetworkLinkServiceAcceptOutput `pulumi:"accept"`
	// The description of the Network Link Service.
	Description pulumi.StringOutput `pulumi:"description"`
	// The name of the Network Link Service.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkServiceEnvironmentOutput `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network NetworkLinkServiceNetworkOutput `pulumi:"network"`
	// (Required String) The Confluent Resource Name of the Network Link Service.
	ResourceName pulumi.StringOutput `pulumi:"resourceName"`
}

// NewNetworkLinkService registers a new resource with the given unique name, arguments, and options.
func NewNetworkLinkService(ctx *pulumi.Context,
	name string, args *NetworkLinkServiceArgs, opts ...pulumi.ResourceOption) (*NetworkLinkService, error) {
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
	var resource NetworkLinkService
	err := ctx.RegisterResource("confluentcloud:index/networkLinkService:NetworkLinkService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkLinkService gets an existing NetworkLinkService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkLinkService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkLinkServiceState, opts ...pulumi.ResourceOption) (*NetworkLinkService, error) {
	var resource NetworkLinkService
	err := ctx.ReadResource("confluentcloud:index/networkLinkService:NetworkLinkService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkLinkService resources.
type networkLinkServiceState struct {
	Accept *NetworkLinkServiceAccept `pulumi:"accept"`
	// The description of the Network Link Service.
	Description *string `pulumi:"description"`
	// The name of the Network Link Service.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *NetworkLinkServiceEnvironment `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network *NetworkLinkServiceNetwork `pulumi:"network"`
	// (Required String) The Confluent Resource Name of the Network Link Service.
	ResourceName *string `pulumi:"resourceName"`
}

type NetworkLinkServiceState struct {
	Accept NetworkLinkServiceAcceptPtrInput
	// The description of the Network Link Service.
	Description pulumi.StringPtrInput
	// The name of the Network Link Service.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkServiceEnvironmentPtrInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network NetworkLinkServiceNetworkPtrInput
	// (Required String) The Confluent Resource Name of the Network Link Service.
	ResourceName pulumi.StringPtrInput
}

func (NetworkLinkServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkLinkServiceState)(nil)).Elem()
}

type networkLinkServiceArgs struct {
	Accept *NetworkLinkServiceAccept `pulumi:"accept"`
	// The description of the Network Link Service.
	Description *string `pulumi:"description"`
	// The name of the Network Link Service.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkServiceEnvironment `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network NetworkLinkServiceNetwork `pulumi:"network"`
}

// The set of arguments for constructing a NetworkLinkService resource.
type NetworkLinkServiceArgs struct {
	Accept NetworkLinkServiceAcceptPtrInput
	// The description of the Network Link Service.
	Description pulumi.StringPtrInput
	// The name of the Network Link Service.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkServiceEnvironmentInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network NetworkLinkServiceNetworkInput
}

func (NetworkLinkServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkLinkServiceArgs)(nil)).Elem()
}

type NetworkLinkServiceInput interface {
	pulumi.Input

	ToNetworkLinkServiceOutput() NetworkLinkServiceOutput
	ToNetworkLinkServiceOutputWithContext(ctx context.Context) NetworkLinkServiceOutput
}

func (*NetworkLinkService) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkLinkService)(nil)).Elem()
}

func (i *NetworkLinkService) ToNetworkLinkServiceOutput() NetworkLinkServiceOutput {
	return i.ToNetworkLinkServiceOutputWithContext(context.Background())
}

func (i *NetworkLinkService) ToNetworkLinkServiceOutputWithContext(ctx context.Context) NetworkLinkServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkLinkServiceOutput)
}

// NetworkLinkServiceArrayInput is an input type that accepts NetworkLinkServiceArray and NetworkLinkServiceArrayOutput values.
// You can construct a concrete instance of `NetworkLinkServiceArrayInput` via:
//
//	NetworkLinkServiceArray{ NetworkLinkServiceArgs{...} }
type NetworkLinkServiceArrayInput interface {
	pulumi.Input

	ToNetworkLinkServiceArrayOutput() NetworkLinkServiceArrayOutput
	ToNetworkLinkServiceArrayOutputWithContext(context.Context) NetworkLinkServiceArrayOutput
}

type NetworkLinkServiceArray []NetworkLinkServiceInput

func (NetworkLinkServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkLinkService)(nil)).Elem()
}

func (i NetworkLinkServiceArray) ToNetworkLinkServiceArrayOutput() NetworkLinkServiceArrayOutput {
	return i.ToNetworkLinkServiceArrayOutputWithContext(context.Background())
}

func (i NetworkLinkServiceArray) ToNetworkLinkServiceArrayOutputWithContext(ctx context.Context) NetworkLinkServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkLinkServiceArrayOutput)
}

// NetworkLinkServiceMapInput is an input type that accepts NetworkLinkServiceMap and NetworkLinkServiceMapOutput values.
// You can construct a concrete instance of `NetworkLinkServiceMapInput` via:
//
//	NetworkLinkServiceMap{ "key": NetworkLinkServiceArgs{...} }
type NetworkLinkServiceMapInput interface {
	pulumi.Input

	ToNetworkLinkServiceMapOutput() NetworkLinkServiceMapOutput
	ToNetworkLinkServiceMapOutputWithContext(context.Context) NetworkLinkServiceMapOutput
}

type NetworkLinkServiceMap map[string]NetworkLinkServiceInput

func (NetworkLinkServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkLinkService)(nil)).Elem()
}

func (i NetworkLinkServiceMap) ToNetworkLinkServiceMapOutput() NetworkLinkServiceMapOutput {
	return i.ToNetworkLinkServiceMapOutputWithContext(context.Background())
}

func (i NetworkLinkServiceMap) ToNetworkLinkServiceMapOutputWithContext(ctx context.Context) NetworkLinkServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkLinkServiceMapOutput)
}

type NetworkLinkServiceOutput struct{ *pulumi.OutputState }

func (NetworkLinkServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkLinkService)(nil)).Elem()
}

func (o NetworkLinkServiceOutput) ToNetworkLinkServiceOutput() NetworkLinkServiceOutput {
	return o
}

func (o NetworkLinkServiceOutput) ToNetworkLinkServiceOutputWithContext(ctx context.Context) NetworkLinkServiceOutput {
	return o
}

func (o NetworkLinkServiceOutput) Accept() NetworkLinkServiceAcceptOutput {
	return o.ApplyT(func(v *NetworkLinkService) NetworkLinkServiceAcceptOutput { return v.Accept }).(NetworkLinkServiceAcceptOutput)
}

// The description of the Network Link Service.
func (o NetworkLinkServiceOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkLinkService) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The name of the Network Link Service.
func (o NetworkLinkServiceOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkLinkService) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o NetworkLinkServiceOutput) Environment() NetworkLinkServiceEnvironmentOutput {
	return o.ApplyT(func(v *NetworkLinkService) NetworkLinkServiceEnvironmentOutput { return v.Environment }).(NetworkLinkServiceEnvironmentOutput)
}

// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
// accounts.
func (o NetworkLinkServiceOutput) Network() NetworkLinkServiceNetworkOutput {
	return o.ApplyT(func(v *NetworkLinkService) NetworkLinkServiceNetworkOutput { return v.Network }).(NetworkLinkServiceNetworkOutput)
}

// (Required String) The Confluent Resource Name of the Network Link Service.
func (o NetworkLinkServiceOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkLinkService) pulumi.StringOutput { return v.ResourceName }).(pulumi.StringOutput)
}

type NetworkLinkServiceArrayOutput struct{ *pulumi.OutputState }

func (NetworkLinkServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkLinkService)(nil)).Elem()
}

func (o NetworkLinkServiceArrayOutput) ToNetworkLinkServiceArrayOutput() NetworkLinkServiceArrayOutput {
	return o
}

func (o NetworkLinkServiceArrayOutput) ToNetworkLinkServiceArrayOutputWithContext(ctx context.Context) NetworkLinkServiceArrayOutput {
	return o
}

func (o NetworkLinkServiceArrayOutput) Index(i pulumi.IntInput) NetworkLinkServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkLinkService {
		return vs[0].([]*NetworkLinkService)[vs[1].(int)]
	}).(NetworkLinkServiceOutput)
}

type NetworkLinkServiceMapOutput struct{ *pulumi.OutputState }

func (NetworkLinkServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkLinkService)(nil)).Elem()
}

func (o NetworkLinkServiceMapOutput) ToNetworkLinkServiceMapOutput() NetworkLinkServiceMapOutput {
	return o
}

func (o NetworkLinkServiceMapOutput) ToNetworkLinkServiceMapOutputWithContext(ctx context.Context) NetworkLinkServiceMapOutput {
	return o
}

func (o NetworkLinkServiceMapOutput) MapIndex(k pulumi.StringInput) NetworkLinkServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkLinkService {
		return vs[0].(map[string]*NetworkLinkService)[vs[1].(string)]
	}).(NetworkLinkServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkLinkServiceInput)(nil)).Elem(), &NetworkLinkService{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkLinkServiceArrayInput)(nil)).Elem(), NetworkLinkServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkLinkServiceMapInput)(nil)).Elem(), NetworkLinkServiceMap{})
	pulumi.RegisterOutputType(NetworkLinkServiceOutput{})
	pulumi.RegisterOutputType(NetworkLinkServiceArrayOutput{})
	pulumi.RegisterOutputType(NetworkLinkServiceMapOutput{})
}
