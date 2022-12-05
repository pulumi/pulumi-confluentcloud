// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `getSchemaRegistryRegion` describes a Schema Registry cluster data source.
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
//			exampleSchemaRegistryRegion, err := confluentcloud.GetSchemaRegistryRegion(ctx, &GetSchemaRegistryRegionArgs{
//				Cloud:   "AWS",
//				Region:  "us-east-2",
//				Package: "ESSENTIALS",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("example", exampleSchemaRegistryRegion)
//			return nil
//		})
//	}
//
// ```
func GetSchemaRegistryRegion(ctx *pulumi.Context, args *GetSchemaRegistryRegionArgs, opts ...pulumi.InvokeOption) (*GetSchemaRegistryRegionResult, error) {
	var rv GetSchemaRegistryRegionResult
	err := ctx.Invoke("confluentcloud:index/getSchemaRegistryRegion:getSchemaRegistryRegion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemaRegistryRegion.
type GetSchemaRegistryRegionArgs struct {
	// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud string `pulumi:"cloud"`
	// The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
	Package string `pulumi:"package"`
	// The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region string `pulumi:"region"`
}

// A collection of values returned by getSchemaRegistryRegion.
type GetSchemaRegistryRegionResult struct {
	Cloud string `pulumi:"cloud"`
	// (Required String) The ID of the Schema Registry region, for example, `sgreg-1`.
	Id      string `pulumi:"id"`
	Package string `pulumi:"package"`
	Region  string `pulumi:"region"`
}

func GetSchemaRegistryRegionOutput(ctx *pulumi.Context, args GetSchemaRegistryRegionOutputArgs, opts ...pulumi.InvokeOption) GetSchemaRegistryRegionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSchemaRegistryRegionResult, error) {
			args := v.(GetSchemaRegistryRegionArgs)
			r, err := GetSchemaRegistryRegion(ctx, &args, opts...)
			var s GetSchemaRegistryRegionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSchemaRegistryRegionResultOutput)
}

// A collection of arguments for invoking getSchemaRegistryRegion.
type GetSchemaRegistryRegionOutputArgs struct {
	// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringInput `pulumi:"cloud"`
	// The type of the billing package. Accepted values are: `ESSENTIALS` and `ADVANCED`.
	Package pulumi.StringInput `pulumi:"package"`
	// The cloud service provider region, for example, `us-east-2`. See [Cloud Providers and Regions](https://docs.confluent.io/cloud/current/clusters/regions.html#cloud-providers-and-regions) for a full list of options for AWS, Azure, and GCP.
	Region pulumi.StringInput `pulumi:"region"`
}

func (GetSchemaRegistryRegionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemaRegistryRegionArgs)(nil)).Elem()
}

// A collection of values returned by getSchemaRegistryRegion.
type GetSchemaRegistryRegionResultOutput struct{ *pulumi.OutputState }

func (GetSchemaRegistryRegionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemaRegistryRegionResult)(nil)).Elem()
}

func (o GetSchemaRegistryRegionResultOutput) ToGetSchemaRegistryRegionResultOutput() GetSchemaRegistryRegionResultOutput {
	return o
}

func (o GetSchemaRegistryRegionResultOutput) ToGetSchemaRegistryRegionResultOutputWithContext(ctx context.Context) GetSchemaRegistryRegionResultOutput {
	return o
}

func (o GetSchemaRegistryRegionResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryRegionResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Required String) The ID of the Schema Registry region, for example, `sgreg-1`.
func (o GetSchemaRegistryRegionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryRegionResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSchemaRegistryRegionResultOutput) Package() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryRegionResult) string { return v.Package }).(pulumi.StringOutput)
}

func (o GetSchemaRegistryRegionResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaRegistryRegionResult) string { return v.Region }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSchemaRegistryRegionResultOutput{})
}
