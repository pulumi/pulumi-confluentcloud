// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// You can import a Kafka API Key by using the Environment ID and Kafka API Key ID in the format `<Environment ID>/<Kafka API Key ID>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>" $ export API_KEY_SECRET="<api_key_secret>" Option #1Kafka API Key
//
// ```sh
//
//	$ pulumi import confluentcloud:index/apiKey:ApiKey example_kafka_api_key "env-abc123/UTT6WDRXX7FHD2GV"
//
// ```
//
//	You can import a Cloud API Key by using Cloud API Key ID, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>" $ export API_KEY_SECRET="<api_key_secret>" Option #2Cloud API Key
//
// ```sh
//
//	$ pulumi import confluentcloud:index/apiKey:ApiKey example_cloud_api_key "4UEXOMMWIBE5KZQG"
//
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type ApiKey struct {
	pulumi.CustomResourceState

	// A free-form description of the API Account.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
	DisableWaitForReady pulumi.BoolPtrOutput `pulumi:"disableWaitForReady"`
	// A human-readable name for the API Key.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
	ManagedResource ApiKeyManagedResourcePtrOutput `pulumi:"managedResource"`
	// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
	Owner ApiKeyOwnerOutput `pulumi:"owner"`
	// (Required String, Sensitive) The secret of the API Key.
	Secret pulumi.StringOutput `pulumi:"secret"`
}

// NewApiKey registers a new resource with the given unique name, arguments, and options.
func NewApiKey(ctx *pulumi.Context,
	name string, args *ApiKeyArgs, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Owner == nil {
		return nil, errors.New("invalid value for required argument 'Owner'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secret",
	})
	opts = append(opts, secrets)
	var resource ApiKey
	err := ctx.RegisterResource("confluentcloud:index/apiKey:ApiKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiKey gets an existing ApiKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiKeyState, opts ...pulumi.ResourceOption) (*ApiKey, error) {
	var resource ApiKey
	err := ctx.ReadResource("confluentcloud:index/apiKey:ApiKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiKey resources.
type apiKeyState struct {
	// A free-form description of the API Account.
	Description *string `pulumi:"description"`
	// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
	DisableWaitForReady *bool `pulumi:"disableWaitForReady"`
	// A human-readable name for the API Key.
	DisplayName *string `pulumi:"displayName"`
	// The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
	ManagedResource *ApiKeyManagedResource `pulumi:"managedResource"`
	// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
	Owner *ApiKeyOwner `pulumi:"owner"`
	// (Required String, Sensitive) The secret of the API Key.
	Secret *string `pulumi:"secret"`
}

type ApiKeyState struct {
	// A free-form description of the API Account.
	Description pulumi.StringPtrInput
	// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
	DisableWaitForReady pulumi.BoolPtrInput
	// A human-readable name for the API Key.
	DisplayName pulumi.StringPtrInput
	// The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
	ManagedResource ApiKeyManagedResourcePtrInput
	// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
	Owner ApiKeyOwnerPtrInput
	// (Required String, Sensitive) The secret of the API Key.
	Secret pulumi.StringPtrInput
}

func (ApiKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyState)(nil)).Elem()
}

type apiKeyArgs struct {
	// A free-form description of the API Account.
	Description *string `pulumi:"description"`
	// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
	DisableWaitForReady *bool `pulumi:"disableWaitForReady"`
	// A human-readable name for the API Key.
	DisplayName *string `pulumi:"displayName"`
	// The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
	ManagedResource *ApiKeyManagedResource `pulumi:"managedResource"`
	// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
	Owner ApiKeyOwner `pulumi:"owner"`
}

// The set of arguments for constructing a ApiKey resource.
type ApiKeyArgs struct {
	// A free-form description of the API Account.
	Description pulumi.StringPtrInput
	// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
	DisableWaitForReady pulumi.BoolPtrInput
	// A human-readable name for the API Key.
	DisplayName pulumi.StringPtrInput
	// The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
	ManagedResource ApiKeyManagedResourcePtrInput
	// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
	Owner ApiKeyOwnerInput
}

func (ApiKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiKeyArgs)(nil)).Elem()
}

type ApiKeyInput interface {
	pulumi.Input

	ToApiKeyOutput() ApiKeyOutput
	ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput
}

func (*ApiKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (i *ApiKey) ToApiKeyOutput() ApiKeyOutput {
	return i.ToApiKeyOutputWithContext(context.Background())
}

func (i *ApiKey) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyOutput)
}

// ApiKeyArrayInput is an input type that accepts ApiKeyArray and ApiKeyArrayOutput values.
// You can construct a concrete instance of `ApiKeyArrayInput` via:
//
//	ApiKeyArray{ ApiKeyArgs{...} }
type ApiKeyArrayInput interface {
	pulumi.Input

	ToApiKeyArrayOutput() ApiKeyArrayOutput
	ToApiKeyArrayOutputWithContext(context.Context) ApiKeyArrayOutput
}

type ApiKeyArray []ApiKeyInput

func (ApiKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (i ApiKeyArray) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return i.ToApiKeyArrayOutputWithContext(context.Background())
}

func (i ApiKeyArray) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyArrayOutput)
}

// ApiKeyMapInput is an input type that accepts ApiKeyMap and ApiKeyMapOutput values.
// You can construct a concrete instance of `ApiKeyMapInput` via:
//
//	ApiKeyMap{ "key": ApiKeyArgs{...} }
type ApiKeyMapInput interface {
	pulumi.Input

	ToApiKeyMapOutput() ApiKeyMapOutput
	ToApiKeyMapOutputWithContext(context.Context) ApiKeyMapOutput
}

type ApiKeyMap map[string]ApiKeyInput

func (ApiKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (i ApiKeyMap) ToApiKeyMapOutput() ApiKeyMapOutput {
	return i.ToApiKeyMapOutputWithContext(context.Background())
}

func (i ApiKeyMap) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiKeyMapOutput)
}

type ApiKeyOutput struct{ *pulumi.OutputState }

func (ApiKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiKey)(nil)).Elem()
}

func (o ApiKeyOutput) ToApiKeyOutput() ApiKeyOutput {
	return o
}

func (o ApiKeyOutput) ToApiKeyOutputWithContext(ctx context.Context) ApiKeyOutput {
	return o
}

// A free-form description of the API Account.
func (o ApiKeyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// An optional flag to disable wait-for-readiness on create. Its primary use case is for Cluster API Keys for private networking options when readiness check fails. Must be unset when importing. Defaults to `false`.
func (o ApiKeyOutput) DisableWaitForReady() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.BoolPtrOutput { return v.DisableWaitForReady }).(pulumi.BoolPtrOutput)
}

// A human-readable name for the API Key.
func (o ApiKeyOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The resource associated with this object. The only resource that is supported is 'cmk.v2.KafkaCluster'.
func (o ApiKeyOutput) ManagedResource() ApiKeyManagedResourcePtrOutput {
	return o.ApplyT(func(v *ApiKey) ApiKeyManagedResourcePtrOutput { return v.ManagedResource }).(ApiKeyManagedResourcePtrOutput)
}

// The owner to which the API Key belongs. The owner can be one of 'iam.v2.User', 'iam.v2.ServiceAccount'.
func (o ApiKeyOutput) Owner() ApiKeyOwnerOutput {
	return o.ApplyT(func(v *ApiKey) ApiKeyOwnerOutput { return v.Owner }).(ApiKeyOwnerOutput)
}

// (Required String, Sensitive) The secret of the API Key.
func (o ApiKeyOutput) Secret() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiKey) pulumi.StringOutput { return v.Secret }).(pulumi.StringOutput)
}

type ApiKeyArrayOutput struct{ *pulumi.OutputState }

func (ApiKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiKey)(nil)).Elem()
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutput() ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) ToApiKeyArrayOutputWithContext(ctx context.Context) ApiKeyArrayOutput {
	return o
}

func (o ApiKeyArrayOutput) Index(i pulumi.IntInput) ApiKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].([]*ApiKey)[vs[1].(int)]
	}).(ApiKeyOutput)
}

type ApiKeyMapOutput struct{ *pulumi.OutputState }

func (ApiKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiKey)(nil)).Elem()
}

func (o ApiKeyMapOutput) ToApiKeyMapOutput() ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) ToApiKeyMapOutputWithContext(ctx context.Context) ApiKeyMapOutput {
	return o
}

func (o ApiKeyMapOutput) MapIndex(k pulumi.StringInput) ApiKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiKey {
		return vs[0].(map[string]*ApiKey)[vs[1].(string)]
	}).(ApiKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyInput)(nil)).Elem(), &ApiKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyArrayInput)(nil)).Elem(), ApiKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiKeyMapInput)(nil)).Elem(), ApiKeyMap{})
	pulumi.RegisterOutputType(ApiKeyOutput{})
	pulumi.RegisterOutputType(ApiKeyArrayOutput{})
	pulumi.RegisterOutputType(ApiKeyMapOutput{})
}
