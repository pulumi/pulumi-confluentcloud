// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `getOrganization` describes an Organization data source.
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
//			exampleOrganization, err := confluentcloud.GetOrganization(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("example", exampleOrganization)
//			return nil
//		})
//	}
//
// ```
func GetOrganization(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetOrganizationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOrganizationResult
	err := ctx.Invoke("confluentcloud:index/getOrganization:getOrganization", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getOrganization.
type GetOrganizationResult struct {
	// (Required String) The ID of the Organization, for example, `1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
	Id string `pulumi:"id"`
	// (Required String) The Confluent Resource Name of the Organization, for example, `crn://confluent.cloud/organization=1111aaaa-11aa-11aa-11aa-111111aaaaaa`.
	ResourceName string `pulumi:"resourceName"`
}
