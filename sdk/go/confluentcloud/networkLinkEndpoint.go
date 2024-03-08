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
//			nle, err := confluentcloud.NewNetworkLinkEndpoint(ctx, "nle", &confluentcloud.NetworkLinkEndpointArgs{
//				DisplayName: pulumi.String("nle1"),
//				Description: pulumi.String("TEST-NLE1"),
//				Environment: &confluentcloud.NetworkLinkEndpointEnvironmentArgs{
//					Id: pulumi.String("env-xyz456"),
//				},
//				Network: &confluentcloud.NetworkLinkEndpointNetworkArgs{
//					Id: pulumi.String("n-abc123"),
//				},
//				NetworkLinkService: &confluentcloud.NetworkLinkEndpointNetworkLinkServiceArgs{
//					Id: pulumi.String("nls-g3e1ox"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("networkLinkEndpoint", nle)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Getting Started
//
// The following end-to-end examples might help to get started with `NetworkLinkEndpoint` resource:
// * `cluster-link-over-aws-private-link-networks`: Cluster link over two dedicated clusters in separate AWS PrivateLink networks
//
// ## Import
//
// You can import a Network Link Endpoint by using Environment ID and Network Link Endpoint ID, in the format `<Environment ID>/<Network Link Endpoint ID>`. The following example shows how to import a Network Link Endpoint:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/networkLinkEndpoint:NetworkLinkEndpoint my_nle env-abc123/nle-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type NetworkLinkEndpoint struct {
	pulumi.CustomResourceState

	// The description of the Network Link Endpoint.
	Description pulumi.StringOutput `pulumi:"description"`
	// The name of the Network Link Endpoint.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkEndpointEnvironmentOutput `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network            NetworkLinkEndpointNetworkOutput            `pulumi:"network"`
	NetworkLinkService NetworkLinkEndpointNetworkLinkServiceOutput `pulumi:"networkLinkService"`
	// (Required String) The Confluent Resource Name of the Network Link Endpoint.
	ResourceName pulumi.StringOutput `pulumi:"resourceName"`
}

// NewNetworkLinkEndpoint registers a new resource with the given unique name, arguments, and options.
func NewNetworkLinkEndpoint(ctx *pulumi.Context,
	name string, args *NetworkLinkEndpointArgs, opts ...pulumi.ResourceOption) (*NetworkLinkEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Network == nil {
		return nil, errors.New("invalid value for required argument 'Network'")
	}
	if args.NetworkLinkService == nil {
		return nil, errors.New("invalid value for required argument 'NetworkLinkService'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NetworkLinkEndpoint
	err := ctx.RegisterResource("confluentcloud:index/networkLinkEndpoint:NetworkLinkEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkLinkEndpoint gets an existing NetworkLinkEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkLinkEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkLinkEndpointState, opts ...pulumi.ResourceOption) (*NetworkLinkEndpoint, error) {
	var resource NetworkLinkEndpoint
	err := ctx.ReadResource("confluentcloud:index/networkLinkEndpoint:NetworkLinkEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkLinkEndpoint resources.
type networkLinkEndpointState struct {
	// The description of the Network Link Endpoint.
	Description *string `pulumi:"description"`
	// The name of the Network Link Endpoint.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *NetworkLinkEndpointEnvironment `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network            *NetworkLinkEndpointNetwork            `pulumi:"network"`
	NetworkLinkService *NetworkLinkEndpointNetworkLinkService `pulumi:"networkLinkService"`
	// (Required String) The Confluent Resource Name of the Network Link Endpoint.
	ResourceName *string `pulumi:"resourceName"`
}

type NetworkLinkEndpointState struct {
	// The description of the Network Link Endpoint.
	Description pulumi.StringPtrInput
	// The name of the Network Link Endpoint.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkEndpointEnvironmentPtrInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network            NetworkLinkEndpointNetworkPtrInput
	NetworkLinkService NetworkLinkEndpointNetworkLinkServicePtrInput
	// (Required String) The Confluent Resource Name of the Network Link Endpoint.
	ResourceName pulumi.StringPtrInput
}

func (NetworkLinkEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkLinkEndpointState)(nil)).Elem()
}

type networkLinkEndpointArgs struct {
	// The description of the Network Link Endpoint.
	Description *string `pulumi:"description"`
	// The name of the Network Link Endpoint.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkEndpointEnvironment `pulumi:"environment"`
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network            NetworkLinkEndpointNetwork            `pulumi:"network"`
	NetworkLinkService NetworkLinkEndpointNetworkLinkService `pulumi:"networkLinkService"`
}

// The set of arguments for constructing a NetworkLinkEndpoint resource.
type NetworkLinkEndpointArgs struct {
	// The description of the Network Link Endpoint.
	Description pulumi.StringPtrInput
	// The name of the Network Link Endpoint.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkLinkEndpointEnvironmentInput
	// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
	// accounts.
	Network            NetworkLinkEndpointNetworkInput
	NetworkLinkService NetworkLinkEndpointNetworkLinkServiceInput
}

func (NetworkLinkEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkLinkEndpointArgs)(nil)).Elem()
}

type NetworkLinkEndpointInput interface {
	pulumi.Input

	ToNetworkLinkEndpointOutput() NetworkLinkEndpointOutput
	ToNetworkLinkEndpointOutputWithContext(ctx context.Context) NetworkLinkEndpointOutput
}

func (*NetworkLinkEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkLinkEndpoint)(nil)).Elem()
}

func (i *NetworkLinkEndpoint) ToNetworkLinkEndpointOutput() NetworkLinkEndpointOutput {
	return i.ToNetworkLinkEndpointOutputWithContext(context.Background())
}

func (i *NetworkLinkEndpoint) ToNetworkLinkEndpointOutputWithContext(ctx context.Context) NetworkLinkEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkLinkEndpointOutput)
}

// NetworkLinkEndpointArrayInput is an input type that accepts NetworkLinkEndpointArray and NetworkLinkEndpointArrayOutput values.
// You can construct a concrete instance of `NetworkLinkEndpointArrayInput` via:
//
//	NetworkLinkEndpointArray{ NetworkLinkEndpointArgs{...} }
type NetworkLinkEndpointArrayInput interface {
	pulumi.Input

	ToNetworkLinkEndpointArrayOutput() NetworkLinkEndpointArrayOutput
	ToNetworkLinkEndpointArrayOutputWithContext(context.Context) NetworkLinkEndpointArrayOutput
}

type NetworkLinkEndpointArray []NetworkLinkEndpointInput

func (NetworkLinkEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkLinkEndpoint)(nil)).Elem()
}

func (i NetworkLinkEndpointArray) ToNetworkLinkEndpointArrayOutput() NetworkLinkEndpointArrayOutput {
	return i.ToNetworkLinkEndpointArrayOutputWithContext(context.Background())
}

func (i NetworkLinkEndpointArray) ToNetworkLinkEndpointArrayOutputWithContext(ctx context.Context) NetworkLinkEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkLinkEndpointArrayOutput)
}

// NetworkLinkEndpointMapInput is an input type that accepts NetworkLinkEndpointMap and NetworkLinkEndpointMapOutput values.
// You can construct a concrete instance of `NetworkLinkEndpointMapInput` via:
//
//	NetworkLinkEndpointMap{ "key": NetworkLinkEndpointArgs{...} }
type NetworkLinkEndpointMapInput interface {
	pulumi.Input

	ToNetworkLinkEndpointMapOutput() NetworkLinkEndpointMapOutput
	ToNetworkLinkEndpointMapOutputWithContext(context.Context) NetworkLinkEndpointMapOutput
}

type NetworkLinkEndpointMap map[string]NetworkLinkEndpointInput

func (NetworkLinkEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkLinkEndpoint)(nil)).Elem()
}

func (i NetworkLinkEndpointMap) ToNetworkLinkEndpointMapOutput() NetworkLinkEndpointMapOutput {
	return i.ToNetworkLinkEndpointMapOutputWithContext(context.Background())
}

func (i NetworkLinkEndpointMap) ToNetworkLinkEndpointMapOutputWithContext(ctx context.Context) NetworkLinkEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkLinkEndpointMapOutput)
}

type NetworkLinkEndpointOutput struct{ *pulumi.OutputState }

func (NetworkLinkEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkLinkEndpoint)(nil)).Elem()
}

func (o NetworkLinkEndpointOutput) ToNetworkLinkEndpointOutput() NetworkLinkEndpointOutput {
	return o
}

func (o NetworkLinkEndpointOutput) ToNetworkLinkEndpointOutputWithContext(ctx context.Context) NetworkLinkEndpointOutput {
	return o
}

// The description of the Network Link Endpoint.
func (o NetworkLinkEndpointOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkLinkEndpoint) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The name of the Network Link Endpoint.
func (o NetworkLinkEndpointOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkLinkEndpoint) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o NetworkLinkEndpointOutput) Environment() NetworkLinkEndpointEnvironmentOutput {
	return o.ApplyT(func(v *NetworkLinkEndpoint) NetworkLinkEndpointEnvironmentOutput { return v.Environment }).(NetworkLinkEndpointEnvironmentOutput)
}

// Network represents a network (VPC) in Confluent Cloud. All Networks exist within Confluent-managed cloud provider
// accounts.
func (o NetworkLinkEndpointOutput) Network() NetworkLinkEndpointNetworkOutput {
	return o.ApplyT(func(v *NetworkLinkEndpoint) NetworkLinkEndpointNetworkOutput { return v.Network }).(NetworkLinkEndpointNetworkOutput)
}

func (o NetworkLinkEndpointOutput) NetworkLinkService() NetworkLinkEndpointNetworkLinkServiceOutput {
	return o.ApplyT(func(v *NetworkLinkEndpoint) NetworkLinkEndpointNetworkLinkServiceOutput { return v.NetworkLinkService }).(NetworkLinkEndpointNetworkLinkServiceOutput)
}

// (Required String) The Confluent Resource Name of the Network Link Endpoint.
func (o NetworkLinkEndpointOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkLinkEndpoint) pulumi.StringOutput { return v.ResourceName }).(pulumi.StringOutput)
}

type NetworkLinkEndpointArrayOutput struct{ *pulumi.OutputState }

func (NetworkLinkEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkLinkEndpoint)(nil)).Elem()
}

func (o NetworkLinkEndpointArrayOutput) ToNetworkLinkEndpointArrayOutput() NetworkLinkEndpointArrayOutput {
	return o
}

func (o NetworkLinkEndpointArrayOutput) ToNetworkLinkEndpointArrayOutputWithContext(ctx context.Context) NetworkLinkEndpointArrayOutput {
	return o
}

func (o NetworkLinkEndpointArrayOutput) Index(i pulumi.IntInput) NetworkLinkEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkLinkEndpoint {
		return vs[0].([]*NetworkLinkEndpoint)[vs[1].(int)]
	}).(NetworkLinkEndpointOutput)
}

type NetworkLinkEndpointMapOutput struct{ *pulumi.OutputState }

func (NetworkLinkEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkLinkEndpoint)(nil)).Elem()
}

func (o NetworkLinkEndpointMapOutput) ToNetworkLinkEndpointMapOutput() NetworkLinkEndpointMapOutput {
	return o
}

func (o NetworkLinkEndpointMapOutput) ToNetworkLinkEndpointMapOutputWithContext(ctx context.Context) NetworkLinkEndpointMapOutput {
	return o
}

func (o NetworkLinkEndpointMapOutput) MapIndex(k pulumi.StringInput) NetworkLinkEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkLinkEndpoint {
		return vs[0].(map[string]*NetworkLinkEndpoint)[vs[1].(string)]
	}).(NetworkLinkEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkLinkEndpointInput)(nil)).Elem(), &NetworkLinkEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkLinkEndpointArrayInput)(nil)).Elem(), NetworkLinkEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkLinkEndpointMapInput)(nil)).Elem(), NetworkLinkEndpointMap{})
	pulumi.RegisterOutputType(NetworkLinkEndpointOutput{})
	pulumi.RegisterOutputType(NetworkLinkEndpointArrayOutput{})
	pulumi.RegisterOutputType(NetworkLinkEndpointMapOutput{})
}
