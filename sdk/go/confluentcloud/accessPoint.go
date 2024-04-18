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

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `AccessPoint` provides a Access Point resource that enables creating, editing, and deleting Access Points on Confluent Cloud.
//
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
//			development, err := confluentcloud.NewEnvironment(ctx, "development", &confluentcloud.EnvironmentArgs{
//				DisplayName: pulumi.String("Development"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewAccessPoint(ctx, "main", &confluentcloud.AccessPointArgs{
//				DisplayName: pulumi.String("access_point"),
//				Environment: &confluentcloud.AccessPointEnvironmentArgs{
//					Id: development.ID(),
//				},
//				Gateway: &confluentcloud.AccessPointGatewayArgs{
//					Id: pulumi.Any(mainConfluentNetwork.Gateway[0].Id),
//				},
//				AwsEgressPrivateLinkEndpoint: &confluentcloud.AccessPointAwsEgressPrivateLinkEndpointArgs{
//					VpcEndpointServiceName: pulumi.String("com.amazonaws.vpce.us-west-2.vpce-svc-00000000000000000"),
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
// ## Import
//
// You can import a Access Point by using Environment ID and Access Point ID, in the format `<Environment ID>/<Access Point ID>`. The following example shows how to import a Access Point:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/accessPoint:AccessPoint main env-abc123/ap-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type AccessPoint struct {
	pulumi.CustomResourceState

	AwsEgressPrivateLinkEndpoint AccessPointAwsEgressPrivateLinkEndpointPtrOutput `pulumi:"awsEgressPrivateLinkEndpoint"`
	// The name of the Access Point.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment AccessPointEnvironmentOutput `pulumi:"environment"`
	Gateway     AccessPointGatewayOutput     `pulumi:"gateway"`
}

// NewAccessPoint registers a new resource with the given unique name, arguments, and options.
func NewAccessPoint(ctx *pulumi.Context,
	name string, args *AccessPointArgs, opts ...pulumi.ResourceOption) (*AccessPoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Gateway == nil {
		return nil, errors.New("invalid value for required argument 'Gateway'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessPoint
	err := ctx.RegisterResource("confluentcloud:index/accessPoint:AccessPoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessPoint gets an existing AccessPoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessPoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessPointState, opts ...pulumi.ResourceOption) (*AccessPoint, error) {
	var resource AccessPoint
	err := ctx.ReadResource("confluentcloud:index/accessPoint:AccessPoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessPoint resources.
type accessPointState struct {
	AwsEgressPrivateLinkEndpoint *AccessPointAwsEgressPrivateLinkEndpoint `pulumi:"awsEgressPrivateLinkEndpoint"`
	// The name of the Access Point.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *AccessPointEnvironment `pulumi:"environment"`
	Gateway     *AccessPointGateway     `pulumi:"gateway"`
}

type AccessPointState struct {
	AwsEgressPrivateLinkEndpoint AccessPointAwsEgressPrivateLinkEndpointPtrInput
	// The name of the Access Point.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment AccessPointEnvironmentPtrInput
	Gateway     AccessPointGatewayPtrInput
}

func (AccessPointState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPointState)(nil)).Elem()
}

type accessPointArgs struct {
	AwsEgressPrivateLinkEndpoint *AccessPointAwsEgressPrivateLinkEndpoint `pulumi:"awsEgressPrivateLinkEndpoint"`
	// The name of the Access Point.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment AccessPointEnvironment `pulumi:"environment"`
	Gateway     AccessPointGateway     `pulumi:"gateway"`
}

// The set of arguments for constructing a AccessPoint resource.
type AccessPointArgs struct {
	AwsEgressPrivateLinkEndpoint AccessPointAwsEgressPrivateLinkEndpointPtrInput
	// The name of the Access Point.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment AccessPointEnvironmentInput
	Gateway     AccessPointGatewayInput
}

func (AccessPointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessPointArgs)(nil)).Elem()
}

type AccessPointInput interface {
	pulumi.Input

	ToAccessPointOutput() AccessPointOutput
	ToAccessPointOutputWithContext(ctx context.Context) AccessPointOutput
}

func (*AccessPoint) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPoint)(nil)).Elem()
}

func (i *AccessPoint) ToAccessPointOutput() AccessPointOutput {
	return i.ToAccessPointOutputWithContext(context.Background())
}

func (i *AccessPoint) ToAccessPointOutputWithContext(ctx context.Context) AccessPointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPointOutput)
}

// AccessPointArrayInput is an input type that accepts AccessPointArray and AccessPointArrayOutput values.
// You can construct a concrete instance of `AccessPointArrayInput` via:
//
//	AccessPointArray{ AccessPointArgs{...} }
type AccessPointArrayInput interface {
	pulumi.Input

	ToAccessPointArrayOutput() AccessPointArrayOutput
	ToAccessPointArrayOutputWithContext(context.Context) AccessPointArrayOutput
}

type AccessPointArray []AccessPointInput

func (AccessPointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPoint)(nil)).Elem()
}

func (i AccessPointArray) ToAccessPointArrayOutput() AccessPointArrayOutput {
	return i.ToAccessPointArrayOutputWithContext(context.Background())
}

func (i AccessPointArray) ToAccessPointArrayOutputWithContext(ctx context.Context) AccessPointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPointArrayOutput)
}

// AccessPointMapInput is an input type that accepts AccessPointMap and AccessPointMapOutput values.
// You can construct a concrete instance of `AccessPointMapInput` via:
//
//	AccessPointMap{ "key": AccessPointArgs{...} }
type AccessPointMapInput interface {
	pulumi.Input

	ToAccessPointMapOutput() AccessPointMapOutput
	ToAccessPointMapOutputWithContext(context.Context) AccessPointMapOutput
}

type AccessPointMap map[string]AccessPointInput

func (AccessPointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPoint)(nil)).Elem()
}

func (i AccessPointMap) ToAccessPointMapOutput() AccessPointMapOutput {
	return i.ToAccessPointMapOutputWithContext(context.Background())
}

func (i AccessPointMap) ToAccessPointMapOutputWithContext(ctx context.Context) AccessPointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessPointMapOutput)
}

type AccessPointOutput struct{ *pulumi.OutputState }

func (AccessPointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessPoint)(nil)).Elem()
}

func (o AccessPointOutput) ToAccessPointOutput() AccessPointOutput {
	return o
}

func (o AccessPointOutput) ToAccessPointOutputWithContext(ctx context.Context) AccessPointOutput {
	return o
}

func (o AccessPointOutput) AwsEgressPrivateLinkEndpoint() AccessPointAwsEgressPrivateLinkEndpointPtrOutput {
	return o.ApplyT(func(v *AccessPoint) AccessPointAwsEgressPrivateLinkEndpointPtrOutput {
		return v.AwsEgressPrivateLinkEndpoint
	}).(AccessPointAwsEgressPrivateLinkEndpointPtrOutput)
}

// The name of the Access Point.
func (o AccessPointOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessPoint) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o AccessPointOutput) Environment() AccessPointEnvironmentOutput {
	return o.ApplyT(func(v *AccessPoint) AccessPointEnvironmentOutput { return v.Environment }).(AccessPointEnvironmentOutput)
}

func (o AccessPointOutput) Gateway() AccessPointGatewayOutput {
	return o.ApplyT(func(v *AccessPoint) AccessPointGatewayOutput { return v.Gateway }).(AccessPointGatewayOutput)
}

type AccessPointArrayOutput struct{ *pulumi.OutputState }

func (AccessPointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessPoint)(nil)).Elem()
}

func (o AccessPointArrayOutput) ToAccessPointArrayOutput() AccessPointArrayOutput {
	return o
}

func (o AccessPointArrayOutput) ToAccessPointArrayOutputWithContext(ctx context.Context) AccessPointArrayOutput {
	return o
}

func (o AccessPointArrayOutput) Index(i pulumi.IntInput) AccessPointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessPoint {
		return vs[0].([]*AccessPoint)[vs[1].(int)]
	}).(AccessPointOutput)
}

type AccessPointMapOutput struct{ *pulumi.OutputState }

func (AccessPointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessPoint)(nil)).Elem()
}

func (o AccessPointMapOutput) ToAccessPointMapOutput() AccessPointMapOutput {
	return o
}

func (o AccessPointMapOutput) ToAccessPointMapOutputWithContext(ctx context.Context) AccessPointMapOutput {
	return o
}

func (o AccessPointMapOutput) MapIndex(k pulumi.StringInput) AccessPointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessPoint {
		return vs[0].(map[string]*AccessPoint)[vs[1].(string)]
	}).(AccessPointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPointInput)(nil)).Elem(), &AccessPoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPointArrayInput)(nil)).Elem(), AccessPointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessPointMapInput)(nil)).Elem(), AccessPointMap{})
	pulumi.RegisterOutputType(AccessPointOutput{})
	pulumi.RegisterOutputType(AccessPointArrayOutput{})
	pulumi.RegisterOutputType(AccessPointMapOutput{})
}
