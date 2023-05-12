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
// `getUser` describes a User data source.
//
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
//			exampleUsingIdUser, err := confluentcloud.GetUser(ctx, &confluentcloud.GetUserArgs{
//				Id: pulumi.StringRef("u-abc123"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingIdUser)
//			exampleUsingEmail, err := confluentcloud.GetUser(ctx, &confluentcloud.GetUserArgs{
//				Email: pulumi.StringRef("test123@gmail.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewEnvironment(ctx, "test-env", nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewKafkaCluster(ctx, "standard-cluster-on-aws", &confluentcloud.KafkaClusterArgs{
//				Availability: pulumi.String("SINGLE_ZONE"),
//				Cloud:        pulumi.String("AWS"),
//				Region:       pulumi.String("us-west-2"),
//				Standard:     nil,
//				Environment: &confluentcloud.KafkaClusterEnvironmentArgs{
//					Id: test_env.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewRoleBinding(ctx, "test-role-binding", &confluentcloud.RoleBindingArgs{
//				Principal:  pulumi.String(fmt.Sprintf("User:%v", exampleUsingEmail.Id)),
//				RoleName:   pulumi.String("CloudClusterAdmin"),
//				CrnPattern: standard_cluster_on_aws.RbacCrn,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.GetUser(ctx, &confluentcloud.GetUserArgs{
//				FullName: pulumi.StringRef("John Doe"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetUser(ctx *pulumi.Context, args *GetUserArgs, opts ...pulumi.InvokeOption) (*GetUserResult, error) {
	var rv GetUserResult
	err := ctx.Invoke("confluentcloud:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type GetUserArgs struct {
	// The email address of the User.
	//
	// > **Note:** Exactly one from the `id`, `fullName` and `email` attributes must be specified.
	Email *string `pulumi:"email"`
	// The full name of the User.
	FullName *string `pulumi:"fullName"`
	// The ID of the User (e.g., `u-abc123`).
	Id *string `pulumi:"id"`
}

// A collection of values returned by getUser.
type GetUserResult struct {
	// (Required String) An API Version of the schema version of the User.
	ApiVersion string `pulumi:"apiVersion"`
	// (Required String) The email address of the User.
	Email string `pulumi:"email"`
	// (Required String) The full name of the User.
	FullName string `pulumi:"fullName"`
	// (Required String) The ID of the User, for example, `u-abc123`.
	Id string `pulumi:"id"`
	// (Required String) A kind of the User.
	Kind string `pulumi:"kind"`
}

func GetUserOutput(ctx *pulumi.Context, args GetUserOutputArgs, opts ...pulumi.InvokeOption) GetUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetUserResult, error) {
			args := v.(GetUserArgs)
			r, err := GetUser(ctx, &args, opts...)
			var s GetUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetUserResultOutput)
}

// A collection of arguments for invoking getUser.
type GetUserOutputArgs struct {
	// The email address of the User.
	//
	// > **Note:** Exactly one from the `id`, `fullName` and `email` attributes must be specified.
	Email pulumi.StringPtrInput `pulumi:"email"`
	// The full name of the User.
	FullName pulumi.StringPtrInput `pulumi:"fullName"`
	// The ID of the User (e.g., `u-abc123`).
	Id pulumi.StringPtrInput `pulumi:"id"`
}

func (GetUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type GetUserResultOutput struct{ *pulumi.OutputState }

func (GetUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUserResult)(nil)).Elem()
}

func (o GetUserResultOutput) ToGetUserResultOutput() GetUserResultOutput {
	return o
}

func (o GetUserResultOutput) ToGetUserResultOutputWithContext(ctx context.Context) GetUserResultOutput {
	return o
}

// (Required String) An API Version of the schema version of the User.
func (o GetUserResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// (Required String) The email address of the User.
func (o GetUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// (Required String) The full name of the User.
func (o GetUserResultOutput) FullName() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.FullName }).(pulumi.StringOutput)
}

// (Required String) The ID of the User, for example, `u-abc123`.
func (o GetUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) A kind of the User.
func (o GetUserResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v GetUserResult) string { return v.Kind }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUserResultOutput{})
}
