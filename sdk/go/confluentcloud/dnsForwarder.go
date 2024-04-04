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
// `DnsForwarder` provides a DNS Forwarder resource that enables creating, editing, and deleting DNS Forwarders on Confluent Cloud.
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
//			development, err := confluentcloud.NewEnvironment(ctx, "development", nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewDnsForwarder(ctx, "main", &confluentcloud.DnsForwarderArgs{
//				DisplayName: pulumi.String("dns_forwarder"),
//				Environment: &confluentcloud.DnsForwarderEnvironmentArgs{
//					Id: development.ID(),
//				},
//				Domains: pulumi.StringArray{
//					pulumi.String("example.com"),
//					pulumi.String("domainname.com"),
//				},
//				Gateway: &confluentcloud.DnsForwarderGatewayArgs{
//					Id: pulumi.Any(confluent_network.Main.Gateway[0].Id),
//				},
//				ForwardViaIp: &confluentcloud.DnsForwarderForwardViaIpArgs{
//					DnsServerIps: pulumi.StringArray{
//						pulumi.String("10.200.0.0"),
//						pulumi.String("10.200.0.1"),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// You can import a DNS Forwarder by using Environment ID and DNS Forwarder ID, in the format `<Environment ID>/<DNS Forwarder ID>`. The following example shows how to import a DNS Forwarder:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/dnsForwarder:DnsForwarder main env-abc123/dnsf-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type DnsForwarder struct {
	pulumi.CustomResourceState

	// The name of the DNS Forwarder.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// List of domains for the DNS forwarder to use.
	Domains pulumi.StringArrayOutput `pulumi:"domains"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  DnsForwarderEnvironmentOutput     `pulumi:"environment"`
	ForwardViaIp DnsForwarderForwardViaIpPtrOutput `pulumi:"forwardViaIp"`
	Gateway      DnsForwarderGatewayOutput         `pulumi:"gateway"`
}

// NewDnsForwarder registers a new resource with the given unique name, arguments, and options.
func NewDnsForwarder(ctx *pulumi.Context,
	name string, args *DnsForwarderArgs, opts ...pulumi.ResourceOption) (*DnsForwarder, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domains == nil {
		return nil, errors.New("invalid value for required argument 'Domains'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Gateway == nil {
		return nil, errors.New("invalid value for required argument 'Gateway'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DnsForwarder
	err := ctx.RegisterResource("confluentcloud:index/dnsForwarder:DnsForwarder", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDnsForwarder gets an existing DnsForwarder resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDnsForwarder(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DnsForwarderState, opts ...pulumi.ResourceOption) (*DnsForwarder, error) {
	var resource DnsForwarder
	err := ctx.ReadResource("confluentcloud:index/dnsForwarder:DnsForwarder", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DnsForwarder resources.
type dnsForwarderState struct {
	// The name of the DNS Forwarder.
	DisplayName *string `pulumi:"displayName"`
	// List of domains for the DNS forwarder to use.
	Domains []string `pulumi:"domains"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  *DnsForwarderEnvironment  `pulumi:"environment"`
	ForwardViaIp *DnsForwarderForwardViaIp `pulumi:"forwardViaIp"`
	Gateway      *DnsForwarderGateway      `pulumi:"gateway"`
}

type DnsForwarderState struct {
	// The name of the DNS Forwarder.
	DisplayName pulumi.StringPtrInput
	// List of domains for the DNS forwarder to use.
	Domains pulumi.StringArrayInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  DnsForwarderEnvironmentPtrInput
	ForwardViaIp DnsForwarderForwardViaIpPtrInput
	Gateway      DnsForwarderGatewayPtrInput
}

func (DnsForwarderState) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsForwarderState)(nil)).Elem()
}

type dnsForwarderArgs struct {
	// The name of the DNS Forwarder.
	DisplayName *string `pulumi:"displayName"`
	// List of domains for the DNS forwarder to use.
	Domains []string `pulumi:"domains"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  DnsForwarderEnvironment   `pulumi:"environment"`
	ForwardViaIp *DnsForwarderForwardViaIp `pulumi:"forwardViaIp"`
	Gateway      DnsForwarderGateway       `pulumi:"gateway"`
}

// The set of arguments for constructing a DnsForwarder resource.
type DnsForwarderArgs struct {
	// The name of the DNS Forwarder.
	DisplayName pulumi.StringPtrInput
	// List of domains for the DNS forwarder to use.
	Domains pulumi.StringArrayInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  DnsForwarderEnvironmentInput
	ForwardViaIp DnsForwarderForwardViaIpPtrInput
	Gateway      DnsForwarderGatewayInput
}

func (DnsForwarderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsForwarderArgs)(nil)).Elem()
}

type DnsForwarderInput interface {
	pulumi.Input

	ToDnsForwarderOutput() DnsForwarderOutput
	ToDnsForwarderOutputWithContext(ctx context.Context) DnsForwarderOutput
}

func (*DnsForwarder) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsForwarder)(nil)).Elem()
}

func (i *DnsForwarder) ToDnsForwarderOutput() DnsForwarderOutput {
	return i.ToDnsForwarderOutputWithContext(context.Background())
}

func (i *DnsForwarder) ToDnsForwarderOutputWithContext(ctx context.Context) DnsForwarderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsForwarderOutput)
}

// DnsForwarderArrayInput is an input type that accepts DnsForwarderArray and DnsForwarderArrayOutput values.
// You can construct a concrete instance of `DnsForwarderArrayInput` via:
//
//	DnsForwarderArray{ DnsForwarderArgs{...} }
type DnsForwarderArrayInput interface {
	pulumi.Input

	ToDnsForwarderArrayOutput() DnsForwarderArrayOutput
	ToDnsForwarderArrayOutputWithContext(context.Context) DnsForwarderArrayOutput
}

type DnsForwarderArray []DnsForwarderInput

func (DnsForwarderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsForwarder)(nil)).Elem()
}

func (i DnsForwarderArray) ToDnsForwarderArrayOutput() DnsForwarderArrayOutput {
	return i.ToDnsForwarderArrayOutputWithContext(context.Background())
}

func (i DnsForwarderArray) ToDnsForwarderArrayOutputWithContext(ctx context.Context) DnsForwarderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsForwarderArrayOutput)
}

// DnsForwarderMapInput is an input type that accepts DnsForwarderMap and DnsForwarderMapOutput values.
// You can construct a concrete instance of `DnsForwarderMapInput` via:
//
//	DnsForwarderMap{ "key": DnsForwarderArgs{...} }
type DnsForwarderMapInput interface {
	pulumi.Input

	ToDnsForwarderMapOutput() DnsForwarderMapOutput
	ToDnsForwarderMapOutputWithContext(context.Context) DnsForwarderMapOutput
}

type DnsForwarderMap map[string]DnsForwarderInput

func (DnsForwarderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsForwarder)(nil)).Elem()
}

func (i DnsForwarderMap) ToDnsForwarderMapOutput() DnsForwarderMapOutput {
	return i.ToDnsForwarderMapOutputWithContext(context.Background())
}

func (i DnsForwarderMap) ToDnsForwarderMapOutputWithContext(ctx context.Context) DnsForwarderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsForwarderMapOutput)
}

type DnsForwarderOutput struct{ *pulumi.OutputState }

func (DnsForwarderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsForwarder)(nil)).Elem()
}

func (o DnsForwarderOutput) ToDnsForwarderOutput() DnsForwarderOutput {
	return o
}

func (o DnsForwarderOutput) ToDnsForwarderOutputWithContext(ctx context.Context) DnsForwarderOutput {
	return o
}

// The name of the DNS Forwarder.
func (o DnsForwarderOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsForwarder) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// List of domains for the DNS forwarder to use.
func (o DnsForwarderOutput) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DnsForwarder) pulumi.StringArrayOutput { return v.Domains }).(pulumi.StringArrayOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o DnsForwarderOutput) Environment() DnsForwarderEnvironmentOutput {
	return o.ApplyT(func(v *DnsForwarder) DnsForwarderEnvironmentOutput { return v.Environment }).(DnsForwarderEnvironmentOutput)
}

func (o DnsForwarderOutput) ForwardViaIp() DnsForwarderForwardViaIpPtrOutput {
	return o.ApplyT(func(v *DnsForwarder) DnsForwarderForwardViaIpPtrOutput { return v.ForwardViaIp }).(DnsForwarderForwardViaIpPtrOutput)
}

func (o DnsForwarderOutput) Gateway() DnsForwarderGatewayOutput {
	return o.ApplyT(func(v *DnsForwarder) DnsForwarderGatewayOutput { return v.Gateway }).(DnsForwarderGatewayOutput)
}

type DnsForwarderArrayOutput struct{ *pulumi.OutputState }

func (DnsForwarderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsForwarder)(nil)).Elem()
}

func (o DnsForwarderArrayOutput) ToDnsForwarderArrayOutput() DnsForwarderArrayOutput {
	return o
}

func (o DnsForwarderArrayOutput) ToDnsForwarderArrayOutputWithContext(ctx context.Context) DnsForwarderArrayOutput {
	return o
}

func (o DnsForwarderArrayOutput) Index(i pulumi.IntInput) DnsForwarderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DnsForwarder {
		return vs[0].([]*DnsForwarder)[vs[1].(int)]
	}).(DnsForwarderOutput)
}

type DnsForwarderMapOutput struct{ *pulumi.OutputState }

func (DnsForwarderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsForwarder)(nil)).Elem()
}

func (o DnsForwarderMapOutput) ToDnsForwarderMapOutput() DnsForwarderMapOutput {
	return o
}

func (o DnsForwarderMapOutput) ToDnsForwarderMapOutputWithContext(ctx context.Context) DnsForwarderMapOutput {
	return o
}

func (o DnsForwarderMapOutput) MapIndex(k pulumi.StringInput) DnsForwarderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DnsForwarder {
		return vs[0].(map[string]*DnsForwarder)[vs[1].(string)]
	}).(DnsForwarderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DnsForwarderInput)(nil)).Elem(), &DnsForwarder{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsForwarderArrayInput)(nil)).Elem(), DnsForwarderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsForwarderMapInput)(nil)).Elem(), DnsForwarderMap{})
	pulumi.RegisterOutputType(DnsForwarderOutput{})
	pulumi.RegisterOutputType(DnsForwarderArrayOutput{})
	pulumi.RegisterOutputType(DnsForwarderMapOutput{})
}
