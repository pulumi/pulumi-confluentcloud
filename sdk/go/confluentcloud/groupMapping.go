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
// `GroupMapping` provides a Group Mapping resource that enables creating, editing, and deleting group mappings on Confluent Cloud.
//
// > **Note:** See [Group Mapping in Confluent Cloud](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html) for more details.
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
//			_, err := confluentcloud.NewGroupMapping(ctx, "application-developers", &confluentcloud.GroupMappingArgs{
//				DisplayName: pulumi.String("Application Developers"),
//				Description: pulumi.String("Admin access to production environment for Engineering"),
//				Filter:      pulumi.String("\"engineering\" in groups"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewRoleBinding(ctx, "envadmin", &confluentcloud.RoleBindingArgs{
//				Principal: application_developers.ID().ApplyT(func(id string) (string, error) {
//					return fmt.Sprintf("User:%v", id), nil
//				}).(pulumi.StringOutput),
//				RoleName:   pulumi.String("EnvironmentAdmin"),
//				CrnPattern: pulumi.Any(data.Confluent_environment.Prod.Resource_name),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// You can import a Group Mapping by using Group Mapping ID, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
//
//	$ pulumi import confluentcloud:index/groupMapping:GroupMapping application-developers group-abc123
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type GroupMapping struct {
	pulumi.CustomResourceState

	// A description explaining the purpose and use of the group mapping.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the Group Mapping.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
	Filter pulumi.StringOutput `pulumi:"filter"`
}

// NewGroupMapping registers a new resource with the given unique name, arguments, and options.
func NewGroupMapping(ctx *pulumi.Context,
	name string, args *GroupMappingArgs, opts ...pulumi.ResourceOption) (*GroupMapping, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Filter == nil {
		return nil, errors.New("invalid value for required argument 'Filter'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GroupMapping
	err := ctx.RegisterResource("confluentcloud:index/groupMapping:GroupMapping", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroupMapping gets an existing GroupMapping resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroupMapping(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupMappingState, opts ...pulumi.ResourceOption) (*GroupMapping, error) {
	var resource GroupMapping
	err := ctx.ReadResource("confluentcloud:index/groupMapping:GroupMapping", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GroupMapping resources.
type groupMappingState struct {
	// A description explaining the purpose and use of the group mapping.
	Description *string `pulumi:"description"`
	// The name of the Group Mapping.
	DisplayName *string `pulumi:"displayName"`
	// A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
	Filter *string `pulumi:"filter"`
}

type GroupMappingState struct {
	// A description explaining the purpose and use of the group mapping.
	Description pulumi.StringPtrInput
	// The name of the Group Mapping.
	DisplayName pulumi.StringPtrInput
	// A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
	Filter pulumi.StringPtrInput
}

func (GroupMappingState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupMappingState)(nil)).Elem()
}

type groupMappingArgs struct {
	// A description explaining the purpose and use of the group mapping.
	Description *string `pulumi:"description"`
	// The name of the Group Mapping.
	DisplayName string `pulumi:"displayName"`
	// A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
	Filter string `pulumi:"filter"`
}

// The set of arguments for constructing a GroupMapping resource.
type GroupMappingArgs struct {
	// A description explaining the purpose and use of the group mapping.
	Description pulumi.StringPtrInput
	// The name of the Group Mapping.
	DisplayName pulumi.StringInput
	// A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
	Filter pulumi.StringInput
}

func (GroupMappingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupMappingArgs)(nil)).Elem()
}

type GroupMappingInput interface {
	pulumi.Input

	ToGroupMappingOutput() GroupMappingOutput
	ToGroupMappingOutputWithContext(ctx context.Context) GroupMappingOutput
}

func (*GroupMapping) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupMapping)(nil)).Elem()
}

func (i *GroupMapping) ToGroupMappingOutput() GroupMappingOutput {
	return i.ToGroupMappingOutputWithContext(context.Background())
}

func (i *GroupMapping) ToGroupMappingOutputWithContext(ctx context.Context) GroupMappingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupMappingOutput)
}

// GroupMappingArrayInput is an input type that accepts GroupMappingArray and GroupMappingArrayOutput values.
// You can construct a concrete instance of `GroupMappingArrayInput` via:
//
//	GroupMappingArray{ GroupMappingArgs{...} }
type GroupMappingArrayInput interface {
	pulumi.Input

	ToGroupMappingArrayOutput() GroupMappingArrayOutput
	ToGroupMappingArrayOutputWithContext(context.Context) GroupMappingArrayOutput
}

type GroupMappingArray []GroupMappingInput

func (GroupMappingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupMapping)(nil)).Elem()
}

func (i GroupMappingArray) ToGroupMappingArrayOutput() GroupMappingArrayOutput {
	return i.ToGroupMappingArrayOutputWithContext(context.Background())
}

func (i GroupMappingArray) ToGroupMappingArrayOutputWithContext(ctx context.Context) GroupMappingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupMappingArrayOutput)
}

// GroupMappingMapInput is an input type that accepts GroupMappingMap and GroupMappingMapOutput values.
// You can construct a concrete instance of `GroupMappingMapInput` via:
//
//	GroupMappingMap{ "key": GroupMappingArgs{...} }
type GroupMappingMapInput interface {
	pulumi.Input

	ToGroupMappingMapOutput() GroupMappingMapOutput
	ToGroupMappingMapOutputWithContext(context.Context) GroupMappingMapOutput
}

type GroupMappingMap map[string]GroupMappingInput

func (GroupMappingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupMapping)(nil)).Elem()
}

func (i GroupMappingMap) ToGroupMappingMapOutput() GroupMappingMapOutput {
	return i.ToGroupMappingMapOutputWithContext(context.Background())
}

func (i GroupMappingMap) ToGroupMappingMapOutputWithContext(ctx context.Context) GroupMappingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupMappingMapOutput)
}

type GroupMappingOutput struct{ *pulumi.OutputState }

func (GroupMappingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GroupMapping)(nil)).Elem()
}

func (o GroupMappingOutput) ToGroupMappingOutput() GroupMappingOutput {
	return o
}

func (o GroupMappingOutput) ToGroupMappingOutputWithContext(ctx context.Context) GroupMappingOutput {
	return o
}

// A description explaining the purpose and use of the group mapping.
func (o GroupMappingOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GroupMapping) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the Group Mapping.
func (o GroupMappingOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupMapping) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// A single group identifier or a condition based on [supported CEL operators](https://docs.confluent.io/cloud/current/access-management/authenticate/sso/group-mapping/overview.html#supported-cel-operators-for-group-mapping) that defines which groups are included.
func (o GroupMappingOutput) Filter() pulumi.StringOutput {
	return o.ApplyT(func(v *GroupMapping) pulumi.StringOutput { return v.Filter }).(pulumi.StringOutput)
}

type GroupMappingArrayOutput struct{ *pulumi.OutputState }

func (GroupMappingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GroupMapping)(nil)).Elem()
}

func (o GroupMappingArrayOutput) ToGroupMappingArrayOutput() GroupMappingArrayOutput {
	return o
}

func (o GroupMappingArrayOutput) ToGroupMappingArrayOutputWithContext(ctx context.Context) GroupMappingArrayOutput {
	return o
}

func (o GroupMappingArrayOutput) Index(i pulumi.IntInput) GroupMappingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GroupMapping {
		return vs[0].([]*GroupMapping)[vs[1].(int)]
	}).(GroupMappingOutput)
}

type GroupMappingMapOutput struct{ *pulumi.OutputState }

func (GroupMappingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GroupMapping)(nil)).Elem()
}

func (o GroupMappingMapOutput) ToGroupMappingMapOutput() GroupMappingMapOutput {
	return o
}

func (o GroupMappingMapOutput) ToGroupMappingMapOutputWithContext(ctx context.Context) GroupMappingMapOutput {
	return o
}

func (o GroupMappingMapOutput) MapIndex(k pulumi.StringInput) GroupMappingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GroupMapping {
		return vs[0].(map[string]*GroupMapping)[vs[1].(string)]
	}).(GroupMappingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupMappingInput)(nil)).Elem(), &GroupMapping{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupMappingArrayInput)(nil)).Elem(), GroupMappingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupMappingMapInput)(nil)).Elem(), GroupMappingMap{})
	pulumi.RegisterOutputType(GroupMappingOutput{})
	pulumi.RegisterOutputType(GroupMappingArrayOutput{})
	pulumi.RegisterOutputType(GroupMappingMapOutput{})
}
