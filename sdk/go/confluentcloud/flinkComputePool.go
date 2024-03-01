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
//			development, err := confluentcloud.NewEnvironment(ctx, "development", nil)
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewFlinkComputePool(ctx, "main", &confluentcloud.FlinkComputePoolArgs{
//				DisplayName: pulumi.String("standard_compute_pool"),
//				Cloud:       pulumi.String("AWS"),
//				Region:      pulumi.String("us-east-1"),
//				MaxCfu:      pulumi.Int(5),
//				Environment: &confluentcloud.FlinkComputePoolEnvironmentArgs{
//					Id: development.ID(),
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
//
// ## Import
//
// You can import a Flink Compute Pool by using Environment ID and Flink Compute Pool ID, in the format `<Environment ID>/<Flink Compute Pool ID>`. The following example shows how to import a Flink Compute Pool:
//
//	$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
//	$ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/flinkComputePool:FlinkComputePool main env-abc123/lfcp-abc123
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type FlinkComputePool struct {
	pulumi.CustomResourceState

	// (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// The cloud service provider that runs the Flink Compute Pool.
	Cloud pulumi.StringOutput `pulumi:"cloud"`
	// The name of the Flink Compute Pool.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkComputePoolEnvironmentOutput `pulumi:"environment"`
	// (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
	MaxCfu pulumi.IntOutput `pulumi:"maxCfu"`
	// The cloud service provider region that hosts the Flink Compute Pool.
	Region pulumi.StringOutput `pulumi:"region"`
	// (Required String) The Confluent Resource Name of the Flink Compute Pool.
	ResourceName pulumi.StringOutput `pulumi:"resourceName"`
}

// NewFlinkComputePool registers a new resource with the given unique name, arguments, and options.
func NewFlinkComputePool(ctx *pulumi.Context,
	name string, args *FlinkComputePoolArgs, opts ...pulumi.ResourceOption) (*FlinkComputePool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cloud == nil {
		return nil, errors.New("invalid value for required argument 'Cloud'")
	}
	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FlinkComputePool
	err := ctx.RegisterResource("confluentcloud:index/flinkComputePool:FlinkComputePool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFlinkComputePool gets an existing FlinkComputePool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFlinkComputePool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FlinkComputePoolState, opts ...pulumi.ResourceOption) (*FlinkComputePool, error) {
	var resource FlinkComputePool
	err := ctx.ReadResource("confluentcloud:index/flinkComputePool:FlinkComputePool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FlinkComputePool resources.
type flinkComputePoolState struct {
	// (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
	ApiVersion *string `pulumi:"apiVersion"`
	// The cloud service provider that runs the Flink Compute Pool.
	Cloud *string `pulumi:"cloud"`
	// The name of the Flink Compute Pool.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *FlinkComputePoolEnvironment `pulumi:"environment"`
	// (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
	Kind *string `pulumi:"kind"`
	// Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
	MaxCfu *int `pulumi:"maxCfu"`
	// The cloud service provider region that hosts the Flink Compute Pool.
	Region *string `pulumi:"region"`
	// (Required String) The Confluent Resource Name of the Flink Compute Pool.
	ResourceName *string `pulumi:"resourceName"`
}

type FlinkComputePoolState struct {
	// (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
	ApiVersion pulumi.StringPtrInput
	// The cloud service provider that runs the Flink Compute Pool.
	Cloud pulumi.StringPtrInput
	// The name of the Flink Compute Pool.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkComputePoolEnvironmentPtrInput
	// (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
	Kind pulumi.StringPtrInput
	// Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
	MaxCfu pulumi.IntPtrInput
	// The cloud service provider region that hosts the Flink Compute Pool.
	Region pulumi.StringPtrInput
	// (Required String) The Confluent Resource Name of the Flink Compute Pool.
	ResourceName pulumi.StringPtrInput
}

func (FlinkComputePoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*flinkComputePoolState)(nil)).Elem()
}

type flinkComputePoolArgs struct {
	// The cloud service provider that runs the Flink Compute Pool.
	Cloud string `pulumi:"cloud"`
	// The name of the Flink Compute Pool.
	DisplayName string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkComputePoolEnvironment `pulumi:"environment"`
	// Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
	MaxCfu *int `pulumi:"maxCfu"`
	// The cloud service provider region that hosts the Flink Compute Pool.
	Region string `pulumi:"region"`
}

// The set of arguments for constructing a FlinkComputePool resource.
type FlinkComputePoolArgs struct {
	// The cloud service provider that runs the Flink Compute Pool.
	Cloud pulumi.StringInput
	// The name of the Flink Compute Pool.
	DisplayName pulumi.StringInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkComputePoolEnvironmentInput
	// Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
	MaxCfu pulumi.IntPtrInput
	// The cloud service provider region that hosts the Flink Compute Pool.
	Region pulumi.StringInput
}

func (FlinkComputePoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*flinkComputePoolArgs)(nil)).Elem()
}

type FlinkComputePoolInput interface {
	pulumi.Input

	ToFlinkComputePoolOutput() FlinkComputePoolOutput
	ToFlinkComputePoolOutputWithContext(ctx context.Context) FlinkComputePoolOutput
}

func (*FlinkComputePool) ElementType() reflect.Type {
	return reflect.TypeOf((**FlinkComputePool)(nil)).Elem()
}

func (i *FlinkComputePool) ToFlinkComputePoolOutput() FlinkComputePoolOutput {
	return i.ToFlinkComputePoolOutputWithContext(context.Background())
}

func (i *FlinkComputePool) ToFlinkComputePoolOutputWithContext(ctx context.Context) FlinkComputePoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkComputePoolOutput)
}

// FlinkComputePoolArrayInput is an input type that accepts FlinkComputePoolArray and FlinkComputePoolArrayOutput values.
// You can construct a concrete instance of `FlinkComputePoolArrayInput` via:
//
//	FlinkComputePoolArray{ FlinkComputePoolArgs{...} }
type FlinkComputePoolArrayInput interface {
	pulumi.Input

	ToFlinkComputePoolArrayOutput() FlinkComputePoolArrayOutput
	ToFlinkComputePoolArrayOutputWithContext(context.Context) FlinkComputePoolArrayOutput
}

type FlinkComputePoolArray []FlinkComputePoolInput

func (FlinkComputePoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlinkComputePool)(nil)).Elem()
}

func (i FlinkComputePoolArray) ToFlinkComputePoolArrayOutput() FlinkComputePoolArrayOutput {
	return i.ToFlinkComputePoolArrayOutputWithContext(context.Background())
}

func (i FlinkComputePoolArray) ToFlinkComputePoolArrayOutputWithContext(ctx context.Context) FlinkComputePoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkComputePoolArrayOutput)
}

// FlinkComputePoolMapInput is an input type that accepts FlinkComputePoolMap and FlinkComputePoolMapOutput values.
// You can construct a concrete instance of `FlinkComputePoolMapInput` via:
//
//	FlinkComputePoolMap{ "key": FlinkComputePoolArgs{...} }
type FlinkComputePoolMapInput interface {
	pulumi.Input

	ToFlinkComputePoolMapOutput() FlinkComputePoolMapOutput
	ToFlinkComputePoolMapOutputWithContext(context.Context) FlinkComputePoolMapOutput
}

type FlinkComputePoolMap map[string]FlinkComputePoolInput

func (FlinkComputePoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlinkComputePool)(nil)).Elem()
}

func (i FlinkComputePoolMap) ToFlinkComputePoolMapOutput() FlinkComputePoolMapOutput {
	return i.ToFlinkComputePoolMapOutputWithContext(context.Background())
}

func (i FlinkComputePoolMap) ToFlinkComputePoolMapOutputWithContext(ctx context.Context) FlinkComputePoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkComputePoolMapOutput)
}

type FlinkComputePoolOutput struct{ *pulumi.OutputState }

func (FlinkComputePoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FlinkComputePool)(nil)).Elem()
}

func (o FlinkComputePoolOutput) ToFlinkComputePoolOutput() FlinkComputePoolOutput {
	return o
}

func (o FlinkComputePoolOutput) ToFlinkComputePoolOutputWithContext(ctx context.Context) FlinkComputePoolOutput {
	return o
}

// (Required String) The API Version of the schema version of the Flink Compute Pool, for example, `fcpm/v2`.
func (o FlinkComputePoolOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkComputePool) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// The cloud service provider that runs the Flink Compute Pool.
func (o FlinkComputePoolOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkComputePool) pulumi.StringOutput { return v.Cloud }).(pulumi.StringOutput)
}

// The name of the Flink Compute Pool.
func (o FlinkComputePoolOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkComputePool) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o FlinkComputePoolOutput) Environment() FlinkComputePoolEnvironmentOutput {
	return o.ApplyT(func(v *FlinkComputePool) FlinkComputePoolEnvironmentOutput { return v.Environment }).(FlinkComputePoolEnvironmentOutput)
}

// (Required String) The kind of the Flink Compute Pool, for example, `ComputePool`.
func (o FlinkComputePoolOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkComputePool) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// Maximum number of Confluent Flink Units (CFUs) that the Flink compute pool should auto-scale to. The accepted values are: `5`, `10`, `20`, `30`, `40` and `50`.
func (o FlinkComputePoolOutput) MaxCfu() pulumi.IntOutput {
	return o.ApplyT(func(v *FlinkComputePool) pulumi.IntOutput { return v.MaxCfu }).(pulumi.IntOutput)
}

// The cloud service provider region that hosts the Flink Compute Pool.
func (o FlinkComputePoolOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkComputePool) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// (Required String) The Confluent Resource Name of the Flink Compute Pool.
func (o FlinkComputePoolOutput) ResourceName() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkComputePool) pulumi.StringOutput { return v.ResourceName }).(pulumi.StringOutput)
}

type FlinkComputePoolArrayOutput struct{ *pulumi.OutputState }

func (FlinkComputePoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlinkComputePool)(nil)).Elem()
}

func (o FlinkComputePoolArrayOutput) ToFlinkComputePoolArrayOutput() FlinkComputePoolArrayOutput {
	return o
}

func (o FlinkComputePoolArrayOutput) ToFlinkComputePoolArrayOutputWithContext(ctx context.Context) FlinkComputePoolArrayOutput {
	return o
}

func (o FlinkComputePoolArrayOutput) Index(i pulumi.IntInput) FlinkComputePoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FlinkComputePool {
		return vs[0].([]*FlinkComputePool)[vs[1].(int)]
	}).(FlinkComputePoolOutput)
}

type FlinkComputePoolMapOutput struct{ *pulumi.OutputState }

func (FlinkComputePoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlinkComputePool)(nil)).Elem()
}

func (o FlinkComputePoolMapOutput) ToFlinkComputePoolMapOutput() FlinkComputePoolMapOutput {
	return o
}

func (o FlinkComputePoolMapOutput) ToFlinkComputePoolMapOutputWithContext(ctx context.Context) FlinkComputePoolMapOutput {
	return o
}

func (o FlinkComputePoolMapOutput) MapIndex(k pulumi.StringInput) FlinkComputePoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FlinkComputePool {
		return vs[0].(map[string]*FlinkComputePool)[vs[1].(string)]
	}).(FlinkComputePoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkComputePoolInput)(nil)).Elem(), &FlinkComputePool{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkComputePoolArrayInput)(nil)).Elem(), FlinkComputePoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkComputePoolMapInput)(nil)).Elem(), FlinkComputePoolMap{})
	pulumi.RegisterOutputType(FlinkComputePoolOutput{})
	pulumi.RegisterOutputType(FlinkComputePoolArrayOutput{})
	pulumi.RegisterOutputType(FlinkComputePoolMapOutput{})
}
