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
// `getGateway` describes a Gateway data source.
//
// ## Example Usage
//
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
//			main, err := confluentcloud.GetGateway(ctx, &confluentcloud.GetGatewayArgs{
//				Id: "gw-abc123",
//				Environment: confluentcloud.GetGatewayEnvironment{
//					Id: "env-123abc",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("gateway", main)
//			return nil
//		})
//	}
//
// ```
func GetGateway(ctx *pulumi.Context, args *GetGatewayArgs, opts ...pulumi.InvokeOption) (*GetGatewayResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewayResult
	err := ctx.Invoke("confluentcloud:index/getGateway:getGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGateway.
type GetGatewayArgs struct {
	Environment GetGatewayEnvironment `pulumi:"environment"`
	// The ID of the Gateway, for example, `gw-abc123`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getGateway.
type GetGatewayResult struct {
	// (Optional Configuration Block) supports the following:
	AwsEgressPrivateLinkGateways []GetGatewayAwsEgressPrivateLinkGateway `pulumi:"awsEgressPrivateLinkGateways"`
	// (Optional Configuration Block) supports the following:
	AwsPeeringGateways []GetGatewayAwsPeeringGateway `pulumi:"awsPeeringGateways"`
	// (Optional Configuration Block) supports the following:
	AzureEgressPrivateLinkGateways []GetGatewayAzureEgressPrivateLinkGateway `pulumi:"azureEgressPrivateLinkGateways"`
	// (Optional Configuration Block) supports the following:
	AzurePeeringGateways []GetGatewayAzurePeeringGateway `pulumi:"azurePeeringGateways"`
	// (Required String) A human-readable name for the Gateway.
	DisplayName string                `pulumi:"displayName"`
	Environment GetGatewayEnvironment `pulumi:"environment"`
	Id          string                `pulumi:"id"`
}

func GetGatewayOutput(ctx *pulumi.Context, args GetGatewayOutputArgs, opts ...pulumi.InvokeOption) GetGatewayResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGatewayResult, error) {
			args := v.(GetGatewayArgs)
			r, err := GetGateway(ctx, &args, opts...)
			var s GetGatewayResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGatewayResultOutput)
}

// A collection of arguments for invoking getGateway.
type GetGatewayOutputArgs struct {
	Environment GetGatewayEnvironmentInput `pulumi:"environment"`
	// The ID of the Gateway, for example, `gw-abc123`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (GetGatewayOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayArgs)(nil)).Elem()
}

// A collection of values returned by getGateway.
type GetGatewayResultOutput struct{ *pulumi.OutputState }

func (GetGatewayResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayResult)(nil)).Elem()
}

func (o GetGatewayResultOutput) ToGetGatewayResultOutput() GetGatewayResultOutput {
	return o
}

func (o GetGatewayResultOutput) ToGetGatewayResultOutputWithContext(ctx context.Context) GetGatewayResultOutput {
	return o
}

// (Optional Configuration Block) supports the following:
func (o GetGatewayResultOutput) AwsEgressPrivateLinkGateways() GetGatewayAwsEgressPrivateLinkGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewayResult) []GetGatewayAwsEgressPrivateLinkGateway {
		return v.AwsEgressPrivateLinkGateways
	}).(GetGatewayAwsEgressPrivateLinkGatewayArrayOutput)
}

// (Optional Configuration Block) supports the following:
func (o GetGatewayResultOutput) AwsPeeringGateways() GetGatewayAwsPeeringGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewayResult) []GetGatewayAwsPeeringGateway { return v.AwsPeeringGateways }).(GetGatewayAwsPeeringGatewayArrayOutput)
}

// (Optional Configuration Block) supports the following:
func (o GetGatewayResultOutput) AzureEgressPrivateLinkGateways() GetGatewayAzureEgressPrivateLinkGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewayResult) []GetGatewayAzureEgressPrivateLinkGateway {
		return v.AzureEgressPrivateLinkGateways
	}).(GetGatewayAzureEgressPrivateLinkGatewayArrayOutput)
}

// (Optional Configuration Block) supports the following:
func (o GetGatewayResultOutput) AzurePeeringGateways() GetGatewayAzurePeeringGatewayArrayOutput {
	return o.ApplyT(func(v GetGatewayResult) []GetGatewayAzurePeeringGateway { return v.AzurePeeringGateways }).(GetGatewayAzurePeeringGatewayArrayOutput)
}

// (Required String) A human-readable name for the Gateway.
func (o GetGatewayResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o GetGatewayResultOutput) Environment() GetGatewayEnvironmentOutput {
	return o.ApplyT(func(v GetGatewayResult) GetGatewayEnvironment { return v.Environment }).(GetGatewayEnvironmentOutput)
}

func (o GetGatewayResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewayResultOutput{})
}
