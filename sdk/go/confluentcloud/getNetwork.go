// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleUsingId, err := confluentcloud.LookupNetwork(ctx, &confluentcloud.LookupNetworkArgs{
//				Id: pulumi.StringRef("n-abc123"),
//				Environment: confluentcloud.GetNetworkEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewServiceAccount(ctx, "test-sa", &confluentcloud.ServiceAccountArgs{
//				Description: pulumi.String(fmt.Sprintf("test_sa for %v", exampleUsingId.DisplayName)),
//			})
//			if err != nil {
//				return err
//			}
//			exampleUsingNameNetwork, err := confluentcloud.LookupNetwork(ctx, &confluentcloud.LookupNetworkArgs{
//				DisplayName: pulumi.StringRef("my_network"),
//				Environment: confluentcloud.GetNetworkEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingName", exampleUsingNameNetwork)
//			return nil
//		})
//	}
//
// ```
func LookupNetwork(ctx *pulumi.Context, args *LookupNetworkArgs, opts ...pulumi.InvokeOption) (*LookupNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkResult
	err := ctx.Invoke("confluentcloud:index/getNetwork:getNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkArgs struct {
	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws []GetNetworkAw `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures []GetNetworkAzure `pulumi:"azures"`
	// A human-readable name for the Network.
	DisplayName *string `pulumi:"displayName"`
	// (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
	DnsConfigs  []GetNetworkDnsConfig `pulumi:"dnsConfigs"`
	Environment GetNetworkEnvironment `pulumi:"environment"`
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps []GetNetworkGcp `pulumi:"gcps"`
	// The ID of the Network, for example, `n-abc123`.
	Id *string `pulumi:"id"`
}

// A collection of values returned by getNetwork.
type LookupNetworkResult struct {
	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws []GetNetworkAw `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures []GetNetworkAzure `pulumi:"azures"`
	// (Required String) The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
	Cidr string `pulumi:"cidr"`
	// (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud string `pulumi:"cloud"`
	// (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
	ConnectionTypes []string `pulumi:"connectionTypes"`
	// (Required String) The name of the Network.
	DisplayName string `pulumi:"displayName"`
	// (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
	DnsConfigs  []GetNetworkDnsConfig `pulumi:"dnsConfigs"`
	DnsDomain   string                `pulumi:"dnsDomain"`
	Environment GetNetworkEnvironment `pulumi:"environment"`
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps []GetNetworkGcp `pulumi:"gcps"`
	// (Required String) The ID of the Network, for example, `n-abc123`.
	Id string `pulumi:"id"`
	// (Required String) The cloud provider region where the network exists.
	Region string `pulumi:"region"`
	// (Required String) The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
	ReservedCidr string `pulumi:"reservedCidr"`
	// (Required String) The Confluent Resource Name of the Network.
	ResourceName    string            `pulumi:"resourceName"`
	ZonalSubdomains map[string]string `pulumi:"zonalSubdomains"`
	// (Required Configuration Blocks) Each item represents information related to a single zone. It supports the following:
	ZoneInfos []GetNetworkZoneInfo `pulumi:"zoneInfos"`
	// (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
	// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
	// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
	// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
	// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
	// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
	Zones []string `pulumi:"zones"`
}

func LookupNetworkOutput(ctx *pulumi.Context, args LookupNetworkOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkResult, error) {
			args := v.(LookupNetworkArgs)
			r, err := LookupNetwork(ctx, &args, opts...)
			var s LookupNetworkResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNetworkResultOutput)
}

// A collection of arguments for invoking getNetwork.
type LookupNetworkOutputArgs struct {
	// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
	Aws GetNetworkAwArrayInput `pulumi:"aws"`
	// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
	Azures GetNetworkAzureArrayInput `pulumi:"azures"`
	// A human-readable name for the Network.
	DisplayName pulumi.StringPtrInput `pulumi:"displayName"`
	// (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
	DnsConfigs  GetNetworkDnsConfigArrayInput `pulumi:"dnsConfigs"`
	Environment GetNetworkEnvironmentInput    `pulumi:"environment"`
	// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
	Gcps GetNetworkGcpArrayInput `pulumi:"gcps"`
	// The ID of the Network, for example, `n-abc123`.
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (LookupNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getNetwork.
type LookupNetworkResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkResult)(nil)).Elem()
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutput() LookupNetworkResultOutput {
	return o
}

func (o LookupNetworkResultOutput) ToLookupNetworkResultOutputWithContext(ctx context.Context) LookupNetworkResultOutput {
	return o
}

// (Optional Configuration Block) The AWS-specific network details if available. It supports the following:
func (o LookupNetworkResultOutput) Aws() GetNetworkAwArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkAw { return v.Aws }).(GetNetworkAwArrayOutput)
}

// (Optional Configuration Block) The Azure-specific network details if available. It supports the following:
func (o LookupNetworkResultOutput) Azures() GetNetworkAzureArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkAzure { return v.Azures }).(GetNetworkAzureArrayOutput)
}

// (Required String) The IPv4 CIDR block to be used for the network. Must be `/27`. Required for VPC peering and AWS TransitGateway.
func (o LookupNetworkResultOutput) Cidr() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Cidr }).(pulumi.StringOutput)
}

// (Required String) The cloud service provider in which the network exists. Accepted values are: `AWS`, `AZURE`, and `GCP`.
func (o LookupNetworkResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Required List of String) The list of connection types that may be used with the network. Accepted connection types are: `PEERING`, `TRANSITGATEWAY`, and `PRIVATELINK`.
func (o LookupNetworkResultOutput) ConnectionTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []string { return v.ConnectionTypes }).(pulumi.StringArrayOutput)
}

// (Required String) The name of the Network.
func (o LookupNetworkResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Optional Configuration Block) Network DNS config. It applies only to the PRIVATELINK network connection type. It supports the following:
func (o LookupNetworkResultOutput) DnsConfigs() GetNetworkDnsConfigArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkDnsConfig { return v.DnsConfigs }).(GetNetworkDnsConfigArrayOutput)
}

func (o LookupNetworkResultOutput) DnsDomain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.DnsDomain }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) Environment() GetNetworkEnvironmentOutput {
	return o.ApplyT(func(v LookupNetworkResult) GetNetworkEnvironment { return v.Environment }).(GetNetworkEnvironmentOutput)
}

// (Optional Configuration Block) The GCP-specific network details if available. It supports the following:
func (o LookupNetworkResultOutput) Gcps() GetNetworkGcpArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkGcp { return v.Gcps }).(GetNetworkGcpArrayOutput)
}

// (Required String) The ID of the Network, for example, `n-abc123`.
func (o LookupNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) The cloud provider region where the network exists.
func (o LookupNetworkResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The reserved IPv4 CIDR block to be used for the network. Must be `/24`. If not specified, Confluent Cloud Network uses `172.20.255.0/24`.
func (o LookupNetworkResultOutput) ReservedCidr() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.ReservedCidr }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Network.
func (o LookupNetworkResultOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkResult) string { return v.ResourceName }).(pulumi.StringOutput)
}

func (o LookupNetworkResultOutput) ZonalSubdomains() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNetworkResult) map[string]string { return v.ZonalSubdomains }).(pulumi.StringMapOutput)
}

// (Required Configuration Blocks) Each item represents information related to a single zone. It supports the following:
func (o LookupNetworkResultOutput) ZoneInfos() GetNetworkZoneInfoArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []GetNetworkZoneInfo { return v.ZoneInfos }).(GetNetworkZoneInfoArrayOutput)
}

// (Optional List of String) The 3 availability zones for this network. They can optionally be specified for AWS networks
// used with PrivateLink, for GCP networks used with Private Service Connect, and for AWS and GCP
// networks used with Peering. Otherwise, they are automatically chosen by Confluent Cloud.
// On AWS, zones are AWS [AZ IDs](https://docs.aws.amazon.com/ram/latest/userguide/working-with-az-ids.html), for example, `use1-az3`.
// On GCP, zones are GCP [zones](https://cloud.google.com/compute/docs/regions-zones), for example, `us-central1-c`.
// On Azure, zones are Confluent-chosen names (for example, `1`, `2`, `3`) since Azure does not have universal zone identifiers.
func (o LookupNetworkResultOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNetworkResult) []string { return v.Zones }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkResultOutput{})
}
