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
//	"github.com/pulumi/pulumi-confluentcloud/sdk/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := confluentcloud.NewTfImporter(ctx, "example", &confluentcloud.TfImporterArgs{
//				Resources: pulumi.StringArray{
//					pulumi.String("confluent_service_account"),
//					pulumi.String("confluent_environment"),
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
// ## Getting Started
//
// The following end-to-end examples might help to get started with the `TfImporter` resource:
//   - `cloud-importer`: Export _Cloud_ resources (for example, Service Accounts, Environments)
//   - `kafka-importer`: Export _Kafka_ resources (for example, ACLs, Topics)
type TfImporter struct {
	pulumi.CustomResourceState

	// An absolute path to a folder for outputting generated TF state and TF configuration files for your infrastructure. The folder is created if it doesn't exist. Defaults to `./imported_confluent_infrastructure`.
	//
	// These are the exportable resources:
	// * Service Accounts
	// * Environments
	// * Connectors
	// * Kafka Clusters
	// * Access Control Lists (ACLs)
	// * Topics
	// * Schemas
	//
	// > **Note:** File an issue to request a support for other resources.
	OutputPath pulumi.StringPtrOutput `pulumi:"outputPath"`
	// A list of resources names to export. Defaults to all exportable resources.
	Resources pulumi.StringArrayOutput `pulumi:"resources"`
}

// NewTfImporter registers a new resource with the given unique name, arguments, and options.
func NewTfImporter(ctx *pulumi.Context,
	name string, args *TfImporterArgs, opts ...pulumi.ResourceOption) (*TfImporter, error) {
	if args == nil {
		args = &TfImporterArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TfImporter
	err := ctx.RegisterResource("confluentcloud:index/tfImporter:TfImporter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTfImporter gets an existing TfImporter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTfImporter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TfImporterState, opts ...pulumi.ResourceOption) (*TfImporter, error) {
	var resource TfImporter
	err := ctx.ReadResource("confluentcloud:index/tfImporter:TfImporter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TfImporter resources.
type tfImporterState struct {
	// An absolute path to a folder for outputting generated TF state and TF configuration files for your infrastructure. The folder is created if it doesn't exist. Defaults to `./imported_confluent_infrastructure`.
	//
	// These are the exportable resources:
	// * Service Accounts
	// * Environments
	// * Connectors
	// * Kafka Clusters
	// * Access Control Lists (ACLs)
	// * Topics
	// * Schemas
	//
	// > **Note:** File an issue to request a support for other resources.
	OutputPath *string `pulumi:"outputPath"`
	// A list of resources names to export. Defaults to all exportable resources.
	Resources []string `pulumi:"resources"`
}

type TfImporterState struct {
	// An absolute path to a folder for outputting generated TF state and TF configuration files for your infrastructure. The folder is created if it doesn't exist. Defaults to `./imported_confluent_infrastructure`.
	//
	// These are the exportable resources:
	// * Service Accounts
	// * Environments
	// * Connectors
	// * Kafka Clusters
	// * Access Control Lists (ACLs)
	// * Topics
	// * Schemas
	//
	// > **Note:** File an issue to request a support for other resources.
	OutputPath pulumi.StringPtrInput
	// A list of resources names to export. Defaults to all exportable resources.
	Resources pulumi.StringArrayInput
}

func (TfImporterState) ElementType() reflect.Type {
	return reflect.TypeOf((*tfImporterState)(nil)).Elem()
}

type tfImporterArgs struct {
	// An absolute path to a folder for outputting generated TF state and TF configuration files for your infrastructure. The folder is created if it doesn't exist. Defaults to `./imported_confluent_infrastructure`.
	//
	// These are the exportable resources:
	// * Service Accounts
	// * Environments
	// * Connectors
	// * Kafka Clusters
	// * Access Control Lists (ACLs)
	// * Topics
	// * Schemas
	//
	// > **Note:** File an issue to request a support for other resources.
	OutputPath *string `pulumi:"outputPath"`
	// A list of resources names to export. Defaults to all exportable resources.
	Resources []string `pulumi:"resources"`
}

// The set of arguments for constructing a TfImporter resource.
type TfImporterArgs struct {
	// An absolute path to a folder for outputting generated TF state and TF configuration files for your infrastructure. The folder is created if it doesn't exist. Defaults to `./imported_confluent_infrastructure`.
	//
	// These are the exportable resources:
	// * Service Accounts
	// * Environments
	// * Connectors
	// * Kafka Clusters
	// * Access Control Lists (ACLs)
	// * Topics
	// * Schemas
	//
	// > **Note:** File an issue to request a support for other resources.
	OutputPath pulumi.StringPtrInput
	// A list of resources names to export. Defaults to all exportable resources.
	Resources pulumi.StringArrayInput
}

func (TfImporterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tfImporterArgs)(nil)).Elem()
}

type TfImporterInput interface {
	pulumi.Input

	ToTfImporterOutput() TfImporterOutput
	ToTfImporterOutputWithContext(ctx context.Context) TfImporterOutput
}

func (*TfImporter) ElementType() reflect.Type {
	return reflect.TypeOf((**TfImporter)(nil)).Elem()
}

func (i *TfImporter) ToTfImporterOutput() TfImporterOutput {
	return i.ToTfImporterOutputWithContext(context.Background())
}

func (i *TfImporter) ToTfImporterOutputWithContext(ctx context.Context) TfImporterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TfImporterOutput)
}

// TfImporterArrayInput is an input type that accepts TfImporterArray and TfImporterArrayOutput values.
// You can construct a concrete instance of `TfImporterArrayInput` via:
//
//	TfImporterArray{ TfImporterArgs{...} }
type TfImporterArrayInput interface {
	pulumi.Input

	ToTfImporterArrayOutput() TfImporterArrayOutput
	ToTfImporterArrayOutputWithContext(context.Context) TfImporterArrayOutput
}

type TfImporterArray []TfImporterInput

func (TfImporterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TfImporter)(nil)).Elem()
}

func (i TfImporterArray) ToTfImporterArrayOutput() TfImporterArrayOutput {
	return i.ToTfImporterArrayOutputWithContext(context.Background())
}

func (i TfImporterArray) ToTfImporterArrayOutputWithContext(ctx context.Context) TfImporterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TfImporterArrayOutput)
}

// TfImporterMapInput is an input type that accepts TfImporterMap and TfImporterMapOutput values.
// You can construct a concrete instance of `TfImporterMapInput` via:
//
//	TfImporterMap{ "key": TfImporterArgs{...} }
type TfImporterMapInput interface {
	pulumi.Input

	ToTfImporterMapOutput() TfImporterMapOutput
	ToTfImporterMapOutputWithContext(context.Context) TfImporterMapOutput
}

type TfImporterMap map[string]TfImporterInput

func (TfImporterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TfImporter)(nil)).Elem()
}

func (i TfImporterMap) ToTfImporterMapOutput() TfImporterMapOutput {
	return i.ToTfImporterMapOutputWithContext(context.Background())
}

func (i TfImporterMap) ToTfImporterMapOutputWithContext(ctx context.Context) TfImporterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TfImporterMapOutput)
}

type TfImporterOutput struct{ *pulumi.OutputState }

func (TfImporterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TfImporter)(nil)).Elem()
}

func (o TfImporterOutput) ToTfImporterOutput() TfImporterOutput {
	return o
}

func (o TfImporterOutput) ToTfImporterOutputWithContext(ctx context.Context) TfImporterOutput {
	return o
}

// An absolute path to a folder for outputting generated TF state and TF configuration files for your infrastructure. The folder is created if it doesn't exist. Defaults to `./imported_confluent_infrastructure`.
//
// These are the exportable resources:
// * Service Accounts
// * Environments
// * Connectors
// * Kafka Clusters
// * Access Control Lists (ACLs)
// * Topics
// * Schemas
//
// > **Note:** File an issue to request a support for other resources.
func (o TfImporterOutput) OutputPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TfImporter) pulumi.StringPtrOutput { return v.OutputPath }).(pulumi.StringPtrOutput)
}

// A list of resources names to export. Defaults to all exportable resources.
func (o TfImporterOutput) Resources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TfImporter) pulumi.StringArrayOutput { return v.Resources }).(pulumi.StringArrayOutput)
}

type TfImporterArrayOutput struct{ *pulumi.OutputState }

func (TfImporterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TfImporter)(nil)).Elem()
}

func (o TfImporterArrayOutput) ToTfImporterArrayOutput() TfImporterArrayOutput {
	return o
}

func (o TfImporterArrayOutput) ToTfImporterArrayOutputWithContext(ctx context.Context) TfImporterArrayOutput {
	return o
}

func (o TfImporterArrayOutput) Index(i pulumi.IntInput) TfImporterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TfImporter {
		return vs[0].([]*TfImporter)[vs[1].(int)]
	}).(TfImporterOutput)
}

type TfImporterMapOutput struct{ *pulumi.OutputState }

func (TfImporterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TfImporter)(nil)).Elem()
}

func (o TfImporterMapOutput) ToTfImporterMapOutput() TfImporterMapOutput {
	return o
}

func (o TfImporterMapOutput) ToTfImporterMapOutputWithContext(ctx context.Context) TfImporterMapOutput {
	return o
}

func (o TfImporterMapOutput) MapIndex(k pulumi.StringInput) TfImporterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TfImporter {
		return vs[0].(map[string]*TfImporter)[vs[1].(string)]
	}).(TfImporterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TfImporterInput)(nil)).Elem(), &TfImporter{})
	pulumi.RegisterInputType(reflect.TypeOf((*TfImporterArrayInput)(nil)).Elem(), TfImporterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TfImporterMapInput)(nil)).Elem(), TfImporterMap{})
	pulumi.RegisterOutputType(TfImporterOutput{})
	pulumi.RegisterOutputType(TfImporterArrayOutput{})
	pulumi.RegisterOutputType(TfImporterMapOutput{})
}
