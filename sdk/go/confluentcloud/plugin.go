// Code generated by pulumi-language-go DO NOT EDIT.
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
// ## Import
//
// You can import a Custom Connector Plugin by using a Plugin ID, in the format `<Environment ID/Custom Connector Plugin ID>`. The following example shows how to import a Plugin:
//
// $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
//
// $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
// $ pulumi import confluentcloud:index/plugin:Plugin main env-123/ccpm-abc123xyz
// ```
//
// !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type Plugin struct {
	pulumi.CustomResourceState

	// (Required String) The API Version of the schema version of the plugin, for example, `ccpm/v1`.
	ApiVersion pulumi.StringOutput `pulumi:"apiVersion"`
	// Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
	Cloud pulumi.StringOutput `pulumi:"cloud"`
	// The description of the Plugin.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the Plugin.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PluginEnvironmentOutput `pulumi:"environment"`
	// (Required String) The kind of the Plugin, for example, `CustomConnectPlugin`.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// (Optional String) Runtime language of the plugin.
	RuntimeLanguage pulumi.StringOutput `pulumi:"runtimeLanguage"`
}

// NewPlugin registers a new resource with the given unique name, arguments, and options.
func NewPlugin(ctx *pulumi.Context,
	name string, args *PluginArgs, opts ...pulumi.ResourceOption) (*Plugin, error) {
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
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Plugin
	err := ctx.RegisterResource("confluentcloud:index/plugin:Plugin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPlugin gets an existing Plugin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPlugin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PluginState, opts ...pulumi.ResourceOption) (*Plugin, error) {
	var resource Plugin
	err := ctx.ReadResource("confluentcloud:index/plugin:Plugin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Plugin resources.
type pluginState struct {
	// (Required String) The API Version of the schema version of the plugin, for example, `ccpm/v1`.
	ApiVersion *string `pulumi:"apiVersion"`
	// Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
	Cloud *string `pulumi:"cloud"`
	// The description of the Plugin.
	Description *string `pulumi:"description"`
	// The name of the Plugin.
	DisplayName *string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment *PluginEnvironment `pulumi:"environment"`
	// (Required String) The kind of the Plugin, for example, `CustomConnectPlugin`.
	Kind *string `pulumi:"kind"`
	// (Optional String) Runtime language of the plugin.
	RuntimeLanguage *string `pulumi:"runtimeLanguage"`
}

type PluginState struct {
	// (Required String) The API Version of the schema version of the plugin, for example, `ccpm/v1`.
	ApiVersion pulumi.StringPtrInput
	// Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
	Cloud pulumi.StringPtrInput
	// The description of the Plugin.
	Description pulumi.StringPtrInput
	// The name of the Plugin.
	DisplayName pulumi.StringPtrInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PluginEnvironmentPtrInput
	// (Required String) The kind of the Plugin, for example, `CustomConnectPlugin`.
	Kind pulumi.StringPtrInput
	// (Optional String) Runtime language of the plugin.
	RuntimeLanguage pulumi.StringPtrInput
}

func (PluginState) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginState)(nil)).Elem()
}

type pluginArgs struct {
	// Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
	Cloud string `pulumi:"cloud"`
	// The description of the Plugin.
	Description *string `pulumi:"description"`
	// The name of the Plugin.
	DisplayName string `pulumi:"displayName"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PluginEnvironment `pulumi:"environment"`
	// (Optional String) Runtime language of the plugin.
	RuntimeLanguage *string `pulumi:"runtimeLanguage"`
}

// The set of arguments for constructing a Plugin resource.
type PluginArgs struct {
	// Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
	Cloud pulumi.StringInput
	// The description of the Plugin.
	Description pulumi.StringPtrInput
	// The name of the Plugin.
	DisplayName pulumi.StringInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment PluginEnvironmentInput
	// (Optional String) Runtime language of the plugin.
	RuntimeLanguage pulumi.StringPtrInput
}

func (PluginArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pluginArgs)(nil)).Elem()
}

type PluginInput interface {
	pulumi.Input

	ToPluginOutput() PluginOutput
	ToPluginOutputWithContext(ctx context.Context) PluginOutput
}

func (*Plugin) ElementType() reflect.Type {
	return reflect.TypeOf((**Plugin)(nil)).Elem()
}

func (i *Plugin) ToPluginOutput() PluginOutput {
	return i.ToPluginOutputWithContext(context.Background())
}

func (i *Plugin) ToPluginOutputWithContext(ctx context.Context) PluginOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginOutput)
}

// PluginArrayInput is an input type that accepts PluginArray and PluginArrayOutput values.
// You can construct a concrete instance of `PluginArrayInput` via:
//
//	PluginArray{ PluginArgs{...} }
type PluginArrayInput interface {
	pulumi.Input

	ToPluginArrayOutput() PluginArrayOutput
	ToPluginArrayOutputWithContext(context.Context) PluginArrayOutput
}

type PluginArray []PluginInput

func (PluginArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Plugin)(nil)).Elem()
}

func (i PluginArray) ToPluginArrayOutput() PluginArrayOutput {
	return i.ToPluginArrayOutputWithContext(context.Background())
}

func (i PluginArray) ToPluginArrayOutputWithContext(ctx context.Context) PluginArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginArrayOutput)
}

// PluginMapInput is an input type that accepts PluginMap and PluginMapOutput values.
// You can construct a concrete instance of `PluginMapInput` via:
//
//	PluginMap{ "key": PluginArgs{...} }
type PluginMapInput interface {
	pulumi.Input

	ToPluginMapOutput() PluginMapOutput
	ToPluginMapOutputWithContext(context.Context) PluginMapOutput
}

type PluginMap map[string]PluginInput

func (PluginMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Plugin)(nil)).Elem()
}

func (i PluginMap) ToPluginMapOutput() PluginMapOutput {
	return i.ToPluginMapOutputWithContext(context.Background())
}

func (i PluginMap) ToPluginMapOutputWithContext(ctx context.Context) PluginMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PluginMapOutput)
}

type PluginOutput struct{ *pulumi.OutputState }

func (PluginOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Plugin)(nil)).Elem()
}

func (o PluginOutput) ToPluginOutput() PluginOutput {
	return o
}

func (o PluginOutput) ToPluginOutputWithContext(ctx context.Context) PluginOutput {
	return o
}

// (Required String) The API Version of the schema version of the plugin, for example, `ccpm/v1`.
func (o PluginOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.ApiVersion }).(pulumi.StringOutput)
}

// Cloud provider where the Custom Connector Plugin archive is uploaded. Accepted values are: `AWS`, `AZURE`, `GCP`.
func (o PluginOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.Cloud }).(pulumi.StringOutput)
}

// The description of the Plugin.
func (o PluginOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the Plugin.
func (o PluginOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o PluginOutput) Environment() PluginEnvironmentOutput {
	return o.ApplyT(func(v *Plugin) PluginEnvironmentOutput { return v.Environment }).(PluginEnvironmentOutput)
}

// (Required String) The kind of the Plugin, for example, `CustomConnectPlugin`.
func (o PluginOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.Kind }).(pulumi.StringOutput)
}

// (Optional String) Runtime language of the plugin.
func (o PluginOutput) RuntimeLanguage() pulumi.StringOutput {
	return o.ApplyT(func(v *Plugin) pulumi.StringOutput { return v.RuntimeLanguage }).(pulumi.StringOutput)
}

type PluginArrayOutput struct{ *pulumi.OutputState }

func (PluginArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Plugin)(nil)).Elem()
}

func (o PluginArrayOutput) ToPluginArrayOutput() PluginArrayOutput {
	return o
}

func (o PluginArrayOutput) ToPluginArrayOutputWithContext(ctx context.Context) PluginArrayOutput {
	return o
}

func (o PluginArrayOutput) Index(i pulumi.IntInput) PluginOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Plugin {
		return vs[0].([]*Plugin)[vs[1].(int)]
	}).(PluginOutput)
}

type PluginMapOutput struct{ *pulumi.OutputState }

func (PluginMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Plugin)(nil)).Elem()
}

func (o PluginMapOutput) ToPluginMapOutput() PluginMapOutput {
	return o
}

func (o PluginMapOutput) ToPluginMapOutputWithContext(ctx context.Context) PluginMapOutput {
	return o
}

func (o PluginMapOutput) MapIndex(k pulumi.StringInput) PluginOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Plugin {
		return vs[0].(map[string]*Plugin)[vs[1].(string)]
	}).(PluginOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PluginInput)(nil)).Elem(), &Plugin{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginArrayInput)(nil)).Elem(), PluginArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PluginMapInput)(nil)).Elem(), PluginMap{})
	pulumi.RegisterOutputType(PluginOutput{})
	pulumi.RegisterOutputType(PluginArrayOutput{})
	pulumi.RegisterOutputType(PluginMapOutput{})
}
