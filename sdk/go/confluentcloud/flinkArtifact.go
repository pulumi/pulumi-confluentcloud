// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			development, err := confluentcloud.NewEnvironment(ctx, "development", &confluentcloud.EnvironmentArgs{
//				DisplayName: pulumi.String("Development"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = confluentcloud.NewFlinkArtifact(ctx, "main", &confluentcloud.FlinkArtifactArgs{
//				Class:         pulumi.String("io.confluent.example.SumScalarFunction"),
//				Region:        pulumi.String("us-west-2"),
//				Cloud:         pulumi.String("AWS"),
//				DisplayName:   pulumi.String("flink_sumscalar_artifact"),
//				ContentFormat: pulumi.String("JAR"),
//				Environment: &confluentcloud.FlinkArtifactEnvironmentArgs{
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
// You can import a Flink Artifact by using cloud, region, Flink Artifact ID and artifact file, in the format `<Environment ID>/<region>/<cloud>/<Flink Artifact ID>`. The following example shows how to import a Flink Artifact:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/flinkArtifact:FlinkArtifact main env-abc123/us-east-1/aws/fa-123
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type FlinkArtifact struct {
	pulumi.CustomResourceState

	// (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// The artifact file for Flink Artifact.
	ArtifactFile pulumi.StringPtrOutput `pulumi:"artifactFile"`
	// Java class or alias for the Flink Artifact as provided by developer.
	Class pulumi.StringOutput `pulumi:"class"`
	// The cloud service provider that runs the Flink Artifact.
	Cloud pulumi.StringOutput `pulumi:"cloud"`
	// (Optional String) Archive format of the Flink Artifact.
	ContentFormat pulumi.StringOutput `pulumi:"contentFormat"`
	// (Optional String) Description of the Flink Artifact.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The display name of Flink Artifact.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkArtifactEnvironmentOutput `pulumi:"environment"`
	// (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// The cloud service provider region that hosts the Flink Artifact.
	Region pulumi.StringOutput `pulumi:"region"`
	// (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
	RuntimeLanguage pulumi.StringPtrOutput `pulumi:"runtimeLanguage"`
	// List of versions for this Flink Artifact.
	Versions FlinkArtifactVersionArrayOutput `pulumi:"versions"`
}

// NewFlinkArtifact registers a new resource with the given unique name, arguments, and options.
func NewFlinkArtifact(ctx *pulumi.Context,
	name string, args *FlinkArtifactArgs, opts ...pulumi.ResourceOption) (*FlinkArtifact, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Class == nil {
		return nil, errors.New("invalid value for required argument 'Class'")
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
	var resource FlinkArtifact
	err := ctx.RegisterResource("confluentcloud:index/flinkArtifact:FlinkArtifact", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFlinkArtifact gets an existing FlinkArtifact resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFlinkArtifact(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FlinkArtifactState, opts ...pulumi.ResourceOption) (*FlinkArtifact, error) {
	var resource FlinkArtifact
	err := ctx.ReadResource("confluentcloud:index/flinkArtifact:FlinkArtifact", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FlinkArtifact resources.
type flinkArtifactState struct {
	// (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
	ApiVersion *string `pulumi:"apiVersion"`
	// The artifact file for Flink Artifact.
	ArtifactFile *string `pulumi:"artifactFile"`
	// Java class or alias for the Flink Artifact as provided by developer.
	Class *string `pulumi:"class"`
	// The cloud service provider that runs the Flink Artifact.
	Cloud *string `pulumi:"cloud"`
	// (Optional String) Archive format of the Flink Artifact.
	ContentFormat *string `pulumi:"contentFormat"`
	// (Optional String) Description of the Flink Artifact.
	Description *string `pulumi:"description"`
	// The display name of Flink Artifact.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *FlinkArtifactEnvironment `pulumi:"environment"`
	// (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
	Kind *string `pulumi:"kind"`
	// The cloud service provider region that hosts the Flink Artifact.
	Region *string `pulumi:"region"`
	// (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
	RuntimeLanguage *string `pulumi:"runtimeLanguage"`
	// List of versions for this Flink Artifact.
	Versions []FlinkArtifactVersion `pulumi:"versions"`
}

type FlinkArtifactState struct {
	// (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
	ApiVersion pulumi.StringPtrInput
	// The artifact file for Flink Artifact.
	ArtifactFile pulumi.StringPtrInput
	// Java class or alias for the Flink Artifact as provided by developer.
	Class pulumi.StringPtrInput
	// The cloud service provider that runs the Flink Artifact.
	Cloud pulumi.StringPtrInput
	// (Optional String) Archive format of the Flink Artifact.
	ContentFormat pulumi.StringPtrInput
	// (Optional String) Description of the Flink Artifact.
	Description pulumi.StringPtrInput
	// The display name of Flink Artifact.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkArtifactEnvironmentPtrInput
	// (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
	Kind pulumi.StringPtrInput
	// The cloud service provider region that hosts the Flink Artifact.
	Region pulumi.StringPtrInput
	// (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
	RuntimeLanguage pulumi.StringPtrInput
	// List of versions for this Flink Artifact.
	Versions FlinkArtifactVersionArrayInput
}

func (FlinkArtifactState) ElementType() reflect.Type {
	return reflect.TypeOf((*flinkArtifactState)(nil)).Elem()
}

type flinkArtifactArgs struct {
	// The artifact file for Flink Artifact.
	ArtifactFile *string `pulumi:"artifactFile"`
	// Java class or alias for the Flink Artifact as provided by developer.
	Class string `pulumi:"class"`
	// The cloud service provider that runs the Flink Artifact.
	Cloud string `pulumi:"cloud"`
	// (Optional String) Archive format of the Flink Artifact.
	ContentFormat *string `pulumi:"contentFormat"`
	// (Optional String) Description of the Flink Artifact.
	Description *string `pulumi:"description"`
	// The display name of Flink Artifact.
	DisplayName string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkArtifactEnvironment `pulumi:"environment"`
	// The cloud service provider region that hosts the Flink Artifact.
	Region string `pulumi:"region"`
	// (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
	RuntimeLanguage *string `pulumi:"runtimeLanguage"`
}

// The set of arguments for constructing a FlinkArtifact resource.
type FlinkArtifactArgs struct {
	// The artifact file for Flink Artifact.
	ArtifactFile pulumi.StringPtrInput
	// Java class or alias for the Flink Artifact as provided by developer.
	Class pulumi.StringInput
	// The cloud service provider that runs the Flink Artifact.
	Cloud pulumi.StringInput
	// (Optional String) Archive format of the Flink Artifact.
	ContentFormat pulumi.StringPtrInput
	// (Optional String) Description of the Flink Artifact.
	Description pulumi.StringPtrInput
	// The display name of Flink Artifact.
	DisplayName pulumi.StringInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment FlinkArtifactEnvironmentInput
	// The cloud service provider region that hosts the Flink Artifact.
	Region pulumi.StringInput
	// (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
	RuntimeLanguage pulumi.StringPtrInput
}

func (FlinkArtifactArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*flinkArtifactArgs)(nil)).Elem()
}

type FlinkArtifactInput interface {
	pulumi.Input

	ToFlinkArtifactOutput() FlinkArtifactOutput
	ToFlinkArtifactOutputWithContext(ctx context.Context) FlinkArtifactOutput
}

func (*FlinkArtifact) ElementType() reflect.Type {
	return reflect.TypeOf((**FlinkArtifact)(nil)).Elem()
}

func (i *FlinkArtifact) ToFlinkArtifactOutput() FlinkArtifactOutput {
	return i.ToFlinkArtifactOutputWithContext(context.Background())
}

func (i *FlinkArtifact) ToFlinkArtifactOutputWithContext(ctx context.Context) FlinkArtifactOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkArtifactOutput)
}

// FlinkArtifactArrayInput is an input type that accepts FlinkArtifactArray and FlinkArtifactArrayOutput values.
// You can construct a concrete instance of `FlinkArtifactArrayInput` via:
//
//	FlinkArtifactArray{ FlinkArtifactArgs{...} }
type FlinkArtifactArrayInput interface {
	pulumi.Input

	ToFlinkArtifactArrayOutput() FlinkArtifactArrayOutput
	ToFlinkArtifactArrayOutputWithContext(context.Context) FlinkArtifactArrayOutput
}

type FlinkArtifactArray []FlinkArtifactInput

func (FlinkArtifactArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlinkArtifact)(nil)).Elem()
}

func (i FlinkArtifactArray) ToFlinkArtifactArrayOutput() FlinkArtifactArrayOutput {
	return i.ToFlinkArtifactArrayOutputWithContext(context.Background())
}

func (i FlinkArtifactArray) ToFlinkArtifactArrayOutputWithContext(ctx context.Context) FlinkArtifactArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkArtifactArrayOutput)
}

// FlinkArtifactMapInput is an input type that accepts FlinkArtifactMap and FlinkArtifactMapOutput values.
// You can construct a concrete instance of `FlinkArtifactMapInput` via:
//
//	FlinkArtifactMap{ "key": FlinkArtifactArgs{...} }
type FlinkArtifactMapInput interface {
	pulumi.Input

	ToFlinkArtifactMapOutput() FlinkArtifactMapOutput
	ToFlinkArtifactMapOutputWithContext(context.Context) FlinkArtifactMapOutput
}

type FlinkArtifactMap map[string]FlinkArtifactInput

func (FlinkArtifactMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlinkArtifact)(nil)).Elem()
}

func (i FlinkArtifactMap) ToFlinkArtifactMapOutput() FlinkArtifactMapOutput {
	return i.ToFlinkArtifactMapOutputWithContext(context.Background())
}

func (i FlinkArtifactMap) ToFlinkArtifactMapOutputWithContext(ctx context.Context) FlinkArtifactMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkArtifactMapOutput)
}

type FlinkArtifactOutput struct{ *pulumi.OutputState }

func (FlinkArtifactOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FlinkArtifact)(nil)).Elem()
}

func (o FlinkArtifactOutput) ToFlinkArtifactOutput() FlinkArtifactOutput {
	return o
}

func (o FlinkArtifactOutput) ToFlinkArtifactOutputWithContext(ctx context.Context) FlinkArtifactOutput {
	return o
}

// (Required String) The API Version of the schema version of the Flink Artifact Pool, for example, `fa/v2`.
func (o FlinkArtifactOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// The artifact file for Flink Artifact.
func (o FlinkArtifactOutput) ArtifactFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringPtrOutput { return v.ArtifactFile }).(pulumi.StringPtrOutput)
}

// Java class or alias for the Flink Artifact as provided by developer.
func (o FlinkArtifactOutput) Class() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringOutput { return v.Class }).(pulumi.StringOutput)
}

// The cloud service provider that runs the Flink Artifact.
func (o FlinkArtifactOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringOutput { return v.Cloud }).(pulumi.StringOutput)
}

// (Optional String) Archive format of the Flink Artifact.
func (o FlinkArtifactOutput) ContentFormat() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringOutput { return v.ContentFormat }).(pulumi.StringOutput)
}

// (Optional String) Description of the Flink Artifact.
func (o FlinkArtifactOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The display name of Flink Artifact.
func (o FlinkArtifactOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o FlinkArtifactOutput) Environment() FlinkArtifactEnvironmentOutput {
	return o.ApplyT(func(v *FlinkArtifact) FlinkArtifactEnvironmentOutput { return v.Environment }).(FlinkArtifactEnvironmentOutput)
}

// (Required String) The kind of the Flink Artifact Pool, for example, `FlinkArtifact`.
func (o FlinkArtifactOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// The cloud service provider region that hosts the Flink Artifact.
func (o FlinkArtifactOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// (Optional String) Runtime language of the Flink Artifact. The default runtime language is Java.
func (o FlinkArtifactOutput) RuntimeLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FlinkArtifact) pulumi.StringPtrOutput { return v.RuntimeLanguage }).(pulumi.StringPtrOutput)
}

// List of versions for this Flink Artifact.
func (o FlinkArtifactOutput) Versions() FlinkArtifactVersionArrayOutput {
	return o.ApplyT(func(v *FlinkArtifact) FlinkArtifactVersionArrayOutput { return v.Versions }).(FlinkArtifactVersionArrayOutput)
}

type FlinkArtifactArrayOutput struct{ *pulumi.OutputState }

func (FlinkArtifactArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlinkArtifact)(nil)).Elem()
}

func (o FlinkArtifactArrayOutput) ToFlinkArtifactArrayOutput() FlinkArtifactArrayOutput {
	return o
}

func (o FlinkArtifactArrayOutput) ToFlinkArtifactArrayOutputWithContext(ctx context.Context) FlinkArtifactArrayOutput {
	return o
}

func (o FlinkArtifactArrayOutput) Index(i pulumi.IntInput) FlinkArtifactOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FlinkArtifact {
		return vs[0].([]*FlinkArtifact)[vs[1].(int)]
	}).(FlinkArtifactOutput)
}

type FlinkArtifactMapOutput struct{ *pulumi.OutputState }

func (FlinkArtifactMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlinkArtifact)(nil)).Elem()
}

func (o FlinkArtifactMapOutput) ToFlinkArtifactMapOutput() FlinkArtifactMapOutput {
	return o
}

func (o FlinkArtifactMapOutput) ToFlinkArtifactMapOutputWithContext(ctx context.Context) FlinkArtifactMapOutput {
	return o
}

func (o FlinkArtifactMapOutput) MapIndex(k pulumi.StringInput) FlinkArtifactOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FlinkArtifact {
		return vs[0].(map[string]*FlinkArtifact)[vs[1].(string)]
	}).(FlinkArtifactOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkArtifactInput)(nil)).Elem(), &FlinkArtifact{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkArtifactArrayInput)(nil)).Elem(), FlinkArtifactArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkArtifactMapInput)(nil)).Elem(), FlinkArtifactMap{})
	pulumi.RegisterOutputType(FlinkArtifactOutput{})
	pulumi.RegisterOutputType(FlinkArtifactArrayOutput{})
	pulumi.RegisterOutputType(FlinkArtifactMapOutput{})
}
