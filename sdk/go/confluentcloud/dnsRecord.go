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
// `DnsRecord` provides a DNS Record resource that enables creating, editing, and deleting DNS Records on Confluent Cloud.
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
//			_, err = confluentcloud.NewDnsRecord(ctx, "main", &confluentcloud.DnsRecordArgs{
//				DisplayName: pulumi.String("dns_record"),
//				Environment: &confluentcloud.DnsRecordEnvironmentArgs{
//					Id: development.ID(),
//				},
//				Domain: pulumi.String("example.com"),
//				Gateway: &confluentcloud.DnsRecordGatewayArgs{
//					Id: pulumi.Any(confluent_network.Main.Gateway[0].Id),
//				},
//				PrivateLinkAccessPoint: &confluentcloud.DnsRecordPrivateLinkAccessPointArgs{
//					Id: pulumi.Any(confluent_access_point.Main.Id),
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
// You can import a DNS Record by using Environment ID and DNS Record ID, in the format `<Environment ID>/<DNS Record ID>`. The following example shows how to import a DNS Record:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/dnsRecord:DnsRecord main env-abc123/dnsrec-abc123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type DnsRecord struct {
	pulumi.CustomResourceState

	// The name of the DNS Record.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The fully qualified domain name of the DNS Record.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment            DnsRecordEnvironmentOutput               `pulumi:"environment"`
	Gateway                DnsRecordGatewayOutput                   `pulumi:"gateway"`
	PrivateLinkAccessPoint DnsRecordPrivateLinkAccessPointPtrOutput `pulumi:"privateLinkAccessPoint"`
}

// NewDnsRecord registers a new resource with the given unique name, arguments, and options.
func NewDnsRecord(ctx *pulumi.Context,
	name string, args *DnsRecordArgs, opts ...pulumi.ResourceOption) (*DnsRecord, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Gateway == nil {
		return nil, errors.New("invalid value for required argument 'Gateway'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DnsRecord
	err := ctx.RegisterResource("confluentcloud:index/dnsRecord:DnsRecord", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDnsRecord gets an existing DnsRecord resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDnsRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DnsRecordState, opts ...pulumi.ResourceOption) (*DnsRecord, error) {
	var resource DnsRecord
	err := ctx.ReadResource("confluentcloud:index/dnsRecord:DnsRecord", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DnsRecord resources.
type dnsRecordState struct {
	// The name of the DNS Record.
	DisplayName *string `pulumi:"displayName"`
	// The fully qualified domain name of the DNS Record.
	Domain *string `pulumi:"domain"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment            *DnsRecordEnvironment            `pulumi:"environment"`
	Gateway                *DnsRecordGateway                `pulumi:"gateway"`
	PrivateLinkAccessPoint *DnsRecordPrivateLinkAccessPoint `pulumi:"privateLinkAccessPoint"`
}

type DnsRecordState struct {
	// The name of the DNS Record.
	DisplayName pulumi.StringPtrInput
	// The fully qualified domain name of the DNS Record.
	Domain pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment            DnsRecordEnvironmentPtrInput
	Gateway                DnsRecordGatewayPtrInput
	PrivateLinkAccessPoint DnsRecordPrivateLinkAccessPointPtrInput
}

func (DnsRecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsRecordState)(nil)).Elem()
}

type dnsRecordArgs struct {
	// The name of the DNS Record.
	DisplayName *string `pulumi:"displayName"`
	// The fully qualified domain name of the DNS Record.
	Domain string `pulumi:"domain"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment            DnsRecordEnvironment             `pulumi:"environment"`
	Gateway                DnsRecordGateway                 `pulumi:"gateway"`
	PrivateLinkAccessPoint *DnsRecordPrivateLinkAccessPoint `pulumi:"privateLinkAccessPoint"`
}

// The set of arguments for constructing a DnsRecord resource.
type DnsRecordArgs struct {
	// The name of the DNS Record.
	DisplayName pulumi.StringPtrInput
	// The fully qualified domain name of the DNS Record.
	Domain pulumi.StringInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment            DnsRecordEnvironmentInput
	Gateway                DnsRecordGatewayInput
	PrivateLinkAccessPoint DnsRecordPrivateLinkAccessPointPtrInput
}

func (DnsRecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dnsRecordArgs)(nil)).Elem()
}

type DnsRecordInput interface {
	pulumi.Input

	ToDnsRecordOutput() DnsRecordOutput
	ToDnsRecordOutputWithContext(ctx context.Context) DnsRecordOutput
}

func (*DnsRecord) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsRecord)(nil)).Elem()
}

func (i *DnsRecord) ToDnsRecordOutput() DnsRecordOutput {
	return i.ToDnsRecordOutputWithContext(context.Background())
}

func (i *DnsRecord) ToDnsRecordOutputWithContext(ctx context.Context) DnsRecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsRecordOutput)
}

// DnsRecordArrayInput is an input type that accepts DnsRecordArray and DnsRecordArrayOutput values.
// You can construct a concrete instance of `DnsRecordArrayInput` via:
//
//	DnsRecordArray{ DnsRecordArgs{...} }
type DnsRecordArrayInput interface {
	pulumi.Input

	ToDnsRecordArrayOutput() DnsRecordArrayOutput
	ToDnsRecordArrayOutputWithContext(context.Context) DnsRecordArrayOutput
}

type DnsRecordArray []DnsRecordInput

func (DnsRecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsRecord)(nil)).Elem()
}

func (i DnsRecordArray) ToDnsRecordArrayOutput() DnsRecordArrayOutput {
	return i.ToDnsRecordArrayOutputWithContext(context.Background())
}

func (i DnsRecordArray) ToDnsRecordArrayOutputWithContext(ctx context.Context) DnsRecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsRecordArrayOutput)
}

// DnsRecordMapInput is an input type that accepts DnsRecordMap and DnsRecordMapOutput values.
// You can construct a concrete instance of `DnsRecordMapInput` via:
//
//	DnsRecordMap{ "key": DnsRecordArgs{...} }
type DnsRecordMapInput interface {
	pulumi.Input

	ToDnsRecordMapOutput() DnsRecordMapOutput
	ToDnsRecordMapOutputWithContext(context.Context) DnsRecordMapOutput
}

type DnsRecordMap map[string]DnsRecordInput

func (DnsRecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsRecord)(nil)).Elem()
}

func (i DnsRecordMap) ToDnsRecordMapOutput() DnsRecordMapOutput {
	return i.ToDnsRecordMapOutputWithContext(context.Background())
}

func (i DnsRecordMap) ToDnsRecordMapOutputWithContext(ctx context.Context) DnsRecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DnsRecordMapOutput)
}

type DnsRecordOutput struct{ *pulumi.OutputState }

func (DnsRecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DnsRecord)(nil)).Elem()
}

func (o DnsRecordOutput) ToDnsRecordOutput() DnsRecordOutput {
	return o
}

func (o DnsRecordOutput) ToDnsRecordOutputWithContext(ctx context.Context) DnsRecordOutput {
	return o
}

// The name of the DNS Record.
func (o DnsRecordOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The fully qualified domain name of the DNS Record.
func (o DnsRecordOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *DnsRecord) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o DnsRecordOutput) Environment() DnsRecordEnvironmentOutput {
	return o.ApplyT(func(v *DnsRecord) DnsRecordEnvironmentOutput { return v.Environment }).(DnsRecordEnvironmentOutput)
}

func (o DnsRecordOutput) Gateway() DnsRecordGatewayOutput {
	return o.ApplyT(func(v *DnsRecord) DnsRecordGatewayOutput { return v.Gateway }).(DnsRecordGatewayOutput)
}

func (o DnsRecordOutput) PrivateLinkAccessPoint() DnsRecordPrivateLinkAccessPointPtrOutput {
	return o.ApplyT(func(v *DnsRecord) DnsRecordPrivateLinkAccessPointPtrOutput { return v.PrivateLinkAccessPoint }).(DnsRecordPrivateLinkAccessPointPtrOutput)
}

type DnsRecordArrayOutput struct{ *pulumi.OutputState }

func (DnsRecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DnsRecord)(nil)).Elem()
}

func (o DnsRecordArrayOutput) ToDnsRecordArrayOutput() DnsRecordArrayOutput {
	return o
}

func (o DnsRecordArrayOutput) ToDnsRecordArrayOutputWithContext(ctx context.Context) DnsRecordArrayOutput {
	return o
}

func (o DnsRecordArrayOutput) Index(i pulumi.IntInput) DnsRecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DnsRecord {
		return vs[0].([]*DnsRecord)[vs[1].(int)]
	}).(DnsRecordOutput)
}

type DnsRecordMapOutput struct{ *pulumi.OutputState }

func (DnsRecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DnsRecord)(nil)).Elem()
}

func (o DnsRecordMapOutput) ToDnsRecordMapOutput() DnsRecordMapOutput {
	return o
}

func (o DnsRecordMapOutput) ToDnsRecordMapOutputWithContext(ctx context.Context) DnsRecordMapOutput {
	return o
}

func (o DnsRecordMapOutput) MapIndex(k pulumi.StringInput) DnsRecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DnsRecord {
		return vs[0].(map[string]*DnsRecord)[vs[1].(string)]
	}).(DnsRecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DnsRecordInput)(nil)).Elem(), &DnsRecord{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsRecordArrayInput)(nil)).Elem(), DnsRecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DnsRecordMapInput)(nil)).Elem(), DnsRecordMap{})
	pulumi.RegisterOutputType(DnsRecordOutput{})
	pulumi.RegisterOutputType(DnsRecordArrayOutput{})
	pulumi.RegisterOutputType(DnsRecordMapOutput{})
}