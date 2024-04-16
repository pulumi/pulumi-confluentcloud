// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `DnsRecord` describes a DNS Record data source.
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
//			main, err := confluentcloud.LookupDnsRecord(ctx, &confluentcloud.LookupDnsRecordArgs{
//				Id: "dnsrec-abc123",
//				Environment: confluentcloud.GetDnsRecordEnvironment{
//					Id: "env-123abc",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("dnsRecord", main)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupDnsRecord(ctx *pulumi.Context, args *LookupDnsRecordArgs, opts ...pulumi.InvokeOption) (*LookupDnsRecordResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDnsRecordResult
	err := ctx.Invoke("confluentcloud:index/getDnsRecord:getDnsRecord", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDnsRecord.
type LookupDnsRecordArgs struct {
	Environment GetDnsRecordEnvironment `pulumi:"environment"`
	// The ID of the Environment that the DNS Record belongs to, for example, `env-123abc`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getDnsRecord.
type LookupDnsRecordResult struct {
	// (Required String) A human-readable name for the DNS Record.
	DisplayName string `pulumi:"displayName"`
	// (Required String) The fully qualified domain name of the DNS Record.
	Domain      string                  `pulumi:"domain"`
	Environment GetDnsRecordEnvironment `pulumi:"environment"`
	// (Required Configuration Block) supports the following:
	Gateways []GetDnsRecordGateway `pulumi:"gateways"`
	// (Required String) The ID of the Private Link access point to which the DNS Record is associated, for example `ap-123abc`.
	Id string `pulumi:"id"`
	// (Required Configuration Block) supports the following:
	PrivateLinkAccessPoints []GetDnsRecordPrivateLinkAccessPoint `pulumi:"privateLinkAccessPoints"`
}

func LookupDnsRecordOutput(ctx *pulumi.Context, args LookupDnsRecordOutputArgs, opts ...pulumi.InvokeOption) LookupDnsRecordResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDnsRecordResult, error) {
			args := v.(LookupDnsRecordArgs)
			r, err := LookupDnsRecord(ctx, &args, opts...)
			var s LookupDnsRecordResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDnsRecordResultOutput)
}

// A collection of arguments for invoking getDnsRecord.
type LookupDnsRecordOutputArgs struct {
	Environment GetDnsRecordEnvironmentInput `pulumi:"environment"`
	// The ID of the Environment that the DNS Record belongs to, for example, `env-123abc`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupDnsRecordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDnsRecordArgs)(nil)).Elem()
}

// A collection of values returned by getDnsRecord.
type LookupDnsRecordResultOutput struct{ *pulumi.OutputState }

func (LookupDnsRecordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDnsRecordResult)(nil)).Elem()
}

func (o LookupDnsRecordResultOutput) ToLookupDnsRecordResultOutput() LookupDnsRecordResultOutput {
	return o
}

func (o LookupDnsRecordResultOutput) ToLookupDnsRecordResultOutputWithContext(ctx context.Context) LookupDnsRecordResultOutput {
	return o
}

// (Required String) A human-readable name for the DNS Record.
func (o LookupDnsRecordResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsRecordResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// (Required String) The fully qualified domain name of the DNS Record.
func (o LookupDnsRecordResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsRecordResult) string { return v.Domain }).(pulumi.StringOutput)
}

func (o LookupDnsRecordResultOutput) Environment() GetDnsRecordEnvironmentOutput {
	return o.ApplyT(func(v LookupDnsRecordResult) GetDnsRecordEnvironment { return v.Environment }).(GetDnsRecordEnvironmentOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupDnsRecordResultOutput) Gateways() GetDnsRecordGatewayArrayOutput {
	return o.ApplyT(func(v LookupDnsRecordResult) []GetDnsRecordGateway { return v.Gateways }).(GetDnsRecordGatewayArrayOutput)
}

// (Required String) The ID of the Private Link access point to which the DNS Record is associated, for example `ap-123abc`.
func (o LookupDnsRecordResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsRecordResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required Configuration Block) supports the following:
func (o LookupDnsRecordResultOutput) PrivateLinkAccessPoints() GetDnsRecordPrivateLinkAccessPointArrayOutput {
	return o.ApplyT(func(v LookupDnsRecordResult) []GetDnsRecordPrivateLinkAccessPoint { return v.PrivateLinkAccessPoints }).(GetDnsRecordPrivateLinkAccessPointArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDnsRecordResultOutput{})
}