// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Import
//
// You can import a Network by using Environment ID and Network ID, in the format `<Environment ID>/<Network ID>`. The following example shows how to import a Network$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/network:Network my_network env-abc123/n-abc123
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type Network struct {
	pulumi.CustomResourceState

	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws NetworkAwArrayOutput `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures NetworkAzureArrayOutput `pulumi:"azures"`
	// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
	//
	// > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
	Cidr pulumi.StringOutput `pulumi:"cidr"`
	// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringOutput `pulumi:"cloud"`
	// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
	ConnectionTypes pulumi.StringArrayOutput `pulumi:"connectionTypes"`
	// The name of the Network.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Network DNS config. It applies only to the PRIVATELINK network connection type.
	DnsConfig NetworkDnsConfigOutput `pulumi:"dnsConfig"`
	// (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
	DnsDomain pulumi.StringOutput `pulumi:"dnsDomain"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkEnvironmentOutput `pulumi:"environment"`
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps NetworkGcpArrayOutput `pulumi:"gcps"`
	// The cloud provider region where the network exists.
	Region pulumi.StringOutput `pulumi:"region"`
	// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
	ReservedCidr pulumi.StringOutput `pulumi:"reservedCidr"`
	// (Required String) The Confluent Resource Name of the Network.
	ResourceName pulumi.StringOutput `pulumi:"resourceName"`
	// (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
	ZonalSubdomains pulumi.StringMapOutput `pulumi:"zonalSubdomains"`
	// Each item represents information related to a single zone.
	ZoneInfos NetworkZoneInfoArrayOutput `pulumi:"zoneInfos"`
	// The 3 availability zones for this network. They can optionally be specified for AWS networks
	// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
	// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
	// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
	// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
	// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
	Zones pulumi.StringArrayOutput `pulumi:"zones"`
}

// NewNetwork registers a new resource with the given unique name, arguments, and options.
func NewNetwork(ctx *pulumi.Context,
	name string, args *NetworkArgs, opts ...pulumi.ResourceOption) (*Network, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cloud == nil {
		return nil, errors.New("invalid value for required argument 'Cloud'")
	}
	if args.ConnectionTypes == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionTypes'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Network
	err := ctx.RegisterResource("confluentcloud:index/network:Network", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetwork gets an existing Network resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetwork(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkState, opts ...pulumi.ResourceOption) (*Network, error) {
	var resource Network
	err := ctx.ReadResource("confluentcloud:index/network:Network", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Network resources.
type networkState struct {
	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws []NetworkAw `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures []NetworkAzure `pulumi:"azures"`
	// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
	//
	// > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
	Cidr *string `pulumi:"cidr"`
	// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud *string `pulumi:"cloud"`
	// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
	ConnectionTypes []string `pulumi:"connectionTypes"`
	// The name of the Network.
	DisplayName *string `pulumi:"displayName"`
	// Network DNS config. It applies only to the PRIVATELINK network connection type.
	DnsConfig *NetworkDnsConfig `pulumi:"dnsConfig"`
	// (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
	DnsDomain *string `pulumi:"dnsDomain"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *NetworkEnvironment `pulumi:"environment"`
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps []NetworkGcp `pulumi:"gcps"`
	// The cloud provider region where the network exists.
	Region *string `pulumi:"region"`
	// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
	ReservedCidr *string `pulumi:"reservedCidr"`
	// (Required String) The Confluent Resource Name of the Network.
	ResourceName *string `pulumi:"resourceName"`
	// (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
	ZonalSubdomains map[string]string `pulumi:"zonalSubdomains"`
	// Each item represents information related to a single zone.
	ZoneInfos []NetworkZoneInfo `pulumi:"zoneInfos"`
	// The 3 availability zones for this network. They can optionally be specified for AWS networks
	// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
	// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
	// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
	// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
	// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
	Zones []string `pulumi:"zones"`
}

type NetworkState struct {
	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws NetworkAwArrayInput
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures NetworkAzureArrayInput
	// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
	//
	// > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
	Cidr pulumi.StringPtrInput
	// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringPtrInput
	// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
	ConnectionTypes pulumi.StringArrayInput
	// The name of the Network.
	DisplayName pulumi.StringPtrInput
	// Network DNS config. It applies only to the PRIVATELINK network connection type.
	DnsConfig NetworkDnsConfigPtrInput
	// (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
	DnsDomain pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkEnvironmentPtrInput
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps NetworkGcpArrayInput
	// The cloud provider region where the network exists.
	Region pulumi.StringPtrInput
	// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
	ReservedCidr pulumi.StringPtrInput
	// (Required String) The Confluent Resource Name of the Network.
	ResourceName pulumi.StringPtrInput
	// (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
	ZonalSubdomains pulumi.StringMapInput
	// Each item represents information related to a single zone.
	ZoneInfos NetworkZoneInfoArrayInput
	// The 3 availability zones for this network. They can optionally be specified for AWS networks
	// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
	// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
	// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
	// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
	// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
	Zones pulumi.StringArrayInput
}

func (NetworkState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkState)(nil)).Elem()
}

type networkArgs struct {
	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws []NetworkAw `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures []NetworkAzure `pulumi:"azures"`
	// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
	//
	// > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
	Cidr *string `pulumi:"cidr"`
	// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud string `pulumi:"cloud"`
	// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
	ConnectionTypes []string `pulumi:"connectionTypes"`
	// The name of the Network.
	DisplayName *string `pulumi:"displayName"`
	// Network DNS config. It applies only to the PRIVATELINK network connection type.
	DnsConfig *NetworkDnsConfig `pulumi:"dnsConfig"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkEnvironment `pulumi:"environment"`
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps []NetworkGcp `pulumi:"gcps"`
	// The cloud provider region where the network exists.
	Region string `pulumi:"region"`
	// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
	ReservedCidr *string `pulumi:"reservedCidr"`
	// Each item represents information related to a single zone.
	ZoneInfos []NetworkZoneInfo `pulumi:"zoneInfos"`
	// The 3 availability zones for this network. They can optionally be specified for AWS networks
	// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
	// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
	// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
	// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
	// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
	Zones []string `pulumi:"zones"`
}

// The set of arguments for constructing a Network resource.
type NetworkArgs struct {
	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws NetworkAwArrayInput
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures NetworkAzureArrayInput
	// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
	//
	// > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
	Cidr pulumi.StringPtrInput
	// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringInput
	// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
	ConnectionTypes pulumi.StringArrayInput
	// The name of the Network.
	DisplayName pulumi.StringPtrInput
	// Network DNS config. It applies only to the PRIVATELINK network connection type.
	DnsConfig NetworkDnsConfigPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment NetworkEnvironmentInput
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps NetworkGcpArrayInput
	// The cloud provider region where the network exists.
	Region pulumi.StringInput
	// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
	ReservedCidr pulumi.StringPtrInput
	// Each item represents information related to a single zone.
	ZoneInfos NetworkZoneInfoArrayInput
	// The 3 availability zones for this network. They can optionally be specified for AWS networks
	// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
	// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
	// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
	// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
	// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
	Zones pulumi.StringArrayInput
}

func (NetworkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkArgs)(nil)).Elem()
}

type NetworkInput interface {
	pulumi.Input

	ToNetworkOutput() NetworkOutput
	ToNetworkOutputWithContext(ctx context.Context) NetworkOutput
}

func (*Network) ElementType() reflect.Type {
	return reflect.TypeOf((**Network)(nil)).Elem()
}

func (i *Network) ToNetworkOutput() NetworkOutput {
	return i.ToNetworkOutputWithContext(context.Background())
}

func (i *Network) ToNetworkOutputWithContext(ctx context.Context) NetworkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkOutput)
}

func (i *Network) ToOutput(ctx context.Context) pulumix.Output[*Network] {
	return pulumix.Output[*Network]{
		OutputState: i.ToNetworkOutputWithContext(ctx).OutputState,
	}
}

// NetworkArrayInput is an input type that accepts NetworkArray and NetworkArrayOutput values.
// You can construct a concrete instance of `NetworkArrayInput` via:
//
//	NetworkArray{ NetworkArgs{...} }
type NetworkArrayInput interface {
	pulumi.Input

	ToNetworkArrayOutput() NetworkArrayOutput
	ToNetworkArrayOutputWithContext(context.Context) NetworkArrayOutput
}

type NetworkArray []NetworkInput

func (NetworkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Network)(nil)).Elem()
}

func (i NetworkArray) ToNetworkArrayOutput() NetworkArrayOutput {
	return i.ToNetworkArrayOutputWithContext(context.Background())
}

func (i NetworkArray) ToNetworkArrayOutputWithContext(ctx context.Context) NetworkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkArrayOutput)
}

func (i NetworkArray) ToOutput(ctx context.Context) pulumix.Output[[]*Network] {
	return pulumix.Output[[]*Network]{
		OutputState: i.ToNetworkArrayOutputWithContext(ctx).OutputState,
	}
}

// NetworkMapInput is an input type that accepts NetworkMap and NetworkMapOutput values.
// You can construct a concrete instance of `NetworkMapInput` via:
//
//	NetworkMap{ "key": NetworkArgs{...} }
type NetworkMapInput interface {
	pulumi.Input

	ToNetworkMapOutput() NetworkMapOutput
	ToNetworkMapOutputWithContext(context.Context) NetworkMapOutput
}

type NetworkMap map[string]NetworkInput

func (NetworkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Network)(nil)).Elem()
}

func (i NetworkMap) ToNetworkMapOutput() NetworkMapOutput {
	return i.ToNetworkMapOutputWithContext(context.Background())
}

func (i NetworkMap) ToNetworkMapOutputWithContext(ctx context.Context) NetworkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkMapOutput)
}

func (i NetworkMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Network] {
	return pulumix.Output[map[string]*Network]{
		OutputState: i.ToNetworkMapOutputWithContext(ctx).OutputState,
	}
}

type NetworkOutput struct{ *pulumi.OutputState }

func (NetworkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Network)(nil)).Elem()
}

func (o NetworkOutput) ToNetworkOutput() NetworkOutput {
	return o
}

func (o NetworkOutput) ToNetworkOutputWithContext(ctx context.Context) NetworkOutput {
	return o
}

func (o NetworkOutput) ToOutput(ctx context.Context) pulumix.Output[*Network] {
	return pulumix.Output[*Network]{
		OutputState: o.OutputState,
	}
}

// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
func (o NetworkOutput) Aws() NetworkAwArrayOutput {
	return o.ApplyT(func(v *Network) NetworkAwArrayOutput { return v.Aws }).(NetworkAwArrayOutput)
}

// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
func (o NetworkOutput) Azures() NetworkAzureArrayOutput {
	return o.ApplyT(func(v *Network) NetworkAzureArrayOutput { return v.Azures }).(NetworkAzureArrayOutput)
}

// The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
//
// > **Note:** The `zoneInfo` configuration block and `reservedCidr` are in a [Limited Availability lifecycle stage](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy), and it's available only for AWS networks with PEERING connection type.
func (o NetworkOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Cidr }).(pulumi.StringOutput)
}

// The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
func (o NetworkOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Cloud }).(pulumi.StringOutput)
}

// The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
func (o NetworkOutput) ConnectionTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Network) pulumi.StringArrayOutput { return v.ConnectionTypes }).(pulumi.StringArrayOutput)
}

// The name of the Network.
func (o NetworkOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Network DNS config. It applies only to the PRIVATELINK network connection type.
func (o NetworkOutput) DnsConfig() NetworkDnsConfigOutput {
	return o.ApplyT(func(v *Network) NetworkDnsConfigOutput { return v.DnsConfig }).(NetworkDnsConfigOutput)
}

// (Optional String) The root DNS domain for the network, for example, `pr123a.us-east-2.aws.confluent.cloud` if applicable. Present on Networks that support Private Link.
func (o NetworkOutput) DnsDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.DnsDomain }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o NetworkOutput) Environment() NetworkEnvironmentOutput {
	return o.ApplyT(func(v *Network) NetworkEnvironmentOutput { return v.Environment }).(NetworkEnvironmentOutput)
}

// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
func (o NetworkOutput) Gcps() NetworkGcpArrayOutput {
	return o.ApplyT(func(v *Network) NetworkGcpArrayOutput { return v.Gcps }).(NetworkGcpArrayOutput)
}

// The cloud provider region where the network exists.
func (o NetworkOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
func (o NetworkOutput) ReservedCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.ReservedCidr }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Network.
func (o NetworkOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *Network) pulumi.StringOutput { return v.ResourceName }).(pulumi.StringOutput)
}

// (Optional Map) The DNS subdomain for each zone. Present on networks that support Private Link. Keys are zone names, for example, `use2-az1` and values are DNS domains, for example, `use2-az1.pr123a.us-east-2.aws.confluent.cloud`.
func (o NetworkOutput) ZonalSubdomains() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Network) pulumi.StringMapOutput { return v.ZonalSubdomains }).(pulumi.StringMapOutput)
}

// Each item represents information related to a single zone.
func (o NetworkOutput) ZoneInfos() NetworkZoneInfoArrayOutput {
	return o.ApplyT(func(v *Network) NetworkZoneInfoArrayOutput { return v.ZoneInfos }).(NetworkZoneInfoArrayOutput)
}

// The 3 availability zones for this network. They can optionally be specified for AWS networks
// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
func (o NetworkOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Network) pulumi.StringArrayOutput { return v.Zones }).(pulumi.StringArrayOutput)
}

type NetworkArrayOutput struct{ *pulumi.OutputState }

func (NetworkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Network)(nil)).Elem()
}

func (o NetworkArrayOutput) ToNetworkArrayOutput() NetworkArrayOutput {
	return o
}

func (o NetworkArrayOutput) ToNetworkArrayOutputWithContext(ctx context.Context) NetworkArrayOutput {
	return o
}

func (o NetworkArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Network] {
	return pulumix.Output[[]*Network]{
		OutputState: o.OutputState,
	}
}

func (o NetworkArrayOutput) Index(i pulumi.IntInput) NetworkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Network {
		return vs[0].([]*Network)[vs[1].(int)]
	}).(NetworkOutput)
}

type NetworkMapOutput struct{ *pulumi.OutputState }

func (NetworkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Network)(nil)).Elem()
}

func (o NetworkMapOutput) ToNetworkMapOutput() NetworkMapOutput {
	return o
}

func (o NetworkMapOutput) ToNetworkMapOutputWithContext(ctx context.Context) NetworkMapOutput {
	return o
}

func (o NetworkMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Network] {
	return pulumix.Output[map[string]*Network]{
		OutputState: o.OutputState,
	}
}

func (o NetworkMapOutput) MapIndex(k pulumi.StringInput) NetworkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Network {
		return vs[0].(map[string]*Network)[vs[1].(string)]
	}).(NetworkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkInput)(nil)).Elem(), &Network{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkArrayInput)(nil)).Elem(), NetworkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkMapInput)(nil)).Elem(), NetworkMap{})
	pulumi.RegisterOutputType(NetworkOutput{})
	pulumi.RegisterOutputType(NetworkArrayOutput{})
	pulumi.RegisterOutputType(NetworkMapOutput{})
}
