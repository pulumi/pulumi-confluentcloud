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

// ## Import
//
// You can import a Flink statement by using the Flink Statement name, for example:
//
//	Option #1: Manage multiple Flink Compute Pools in the same Terraform workspace
//
//	$ export IMPORT_ORGANIZATION_ID="<organization_id>"
//
//	$ export IMPORT_ENVIRONMENT_ID="<environment_id>"
//
//	$ export IMPORT_FLINK_COMPUTE_POOL_ID="<flink_compute_pool_id>"
//
//	$ export IMPORT_FLINK_API_KEY="<flink_api_key>"
//
//	$ export IMPORT_FLINK_API_SECRET="<flink_api_secret>"
//
//	$ export IMPORT_FLINK_REST_ENDPOINT="<flink_rest_endpoint>"
//
//	$ export IMPORT_FLINK_PRINCIPAL_ID="<flink_rest_endpoint>"
//
// ```sh
// $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
// ```
//
//	Option #2: Manage a single Flink Compute Pool in the same Terraform workspace
//
// ```sh
// $ pulumi import confluentcloud:index/flinkStatement:FlinkStatement example cfeab4fe-b62c-49bd-9e99-51cc98c77a67
// ```
//
//	!> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
type FlinkStatement struct {
	pulumi.CustomResourceState

	ComputePool FlinkStatementComputePoolOutput `pulumi:"computePool"`
	// The Cluster API Credentials.
	Credentials  FlinkStatementCredentialsPtrOutput `pulumi:"credentials"`
	Environment  FlinkStatementEnvironmentOutput    `pulumi:"environment"`
	Organization FlinkStatementOrganizationOutput   `pulumi:"organization"`
	Principal    FlinkStatementPrincipalOutput      `pulumi:"principal"`
	// The custom topic settings to set:
	Properties pulumi.StringMapOutput `pulumi:"properties"`
	// The REST endpoint of the Flink Compute Pool, for example, `https://flink.us-east-1.aws.confluent.cloud`).
	RestEndpoint pulumi.StringPtrOutput `pulumi:"restEndpoint"`
	// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
	Statement pulumi.StringOutput `pulumi:"statement"`
	// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
	StatementName pulumi.StringOutput `pulumi:"statementName"`
	// Indicates whether the statement should be stopped.
	Stopped pulumi.BoolPtrOutput `pulumi:"stopped"`
}

// NewFlinkStatement registers a new resource with the given unique name, arguments, and options.
func NewFlinkStatement(ctx *pulumi.Context,
	name string, args *FlinkStatementArgs, opts ...pulumi.ResourceOption) (*FlinkStatement, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Statement == nil {
		return nil, errors.New("invalid value for required argument 'Statement'")
	}
	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(FlinkStatementCredentialsPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FlinkStatement
	err := ctx.RegisterResource("confluentcloud:index/flinkStatement:FlinkStatement", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFlinkStatement gets an existing FlinkStatement resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFlinkStatement(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FlinkStatementState, opts ...pulumi.ResourceOption) (*FlinkStatement, error) {
	var resource FlinkStatement
	err := ctx.ReadResource("confluentcloud:index/flinkStatement:FlinkStatement", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FlinkStatement resources.
type flinkStatementState struct {
	ComputePool *FlinkStatementComputePool `pulumi:"computePool"`
	// The Cluster API Credentials.
	Credentials  *FlinkStatementCredentials  `pulumi:"credentials"`
	Environment  *FlinkStatementEnvironment  `pulumi:"environment"`
	Organization *FlinkStatementOrganization `pulumi:"organization"`
	Principal    *FlinkStatementPrincipal    `pulumi:"principal"`
	// The custom topic settings to set:
	Properties map[string]string `pulumi:"properties"`
	// The REST endpoint of the Flink Compute Pool, for example, `https://flink.us-east-1.aws.confluent.cloud`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
	Statement *string `pulumi:"statement"`
	// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
	StatementName *string `pulumi:"statementName"`
	// Indicates whether the statement should be stopped.
	Stopped *bool `pulumi:"stopped"`
}

type FlinkStatementState struct {
	ComputePool FlinkStatementComputePoolPtrInput
	// The Cluster API Credentials.
	Credentials  FlinkStatementCredentialsPtrInput
	Environment  FlinkStatementEnvironmentPtrInput
	Organization FlinkStatementOrganizationPtrInput
	Principal    FlinkStatementPrincipalPtrInput
	// The custom topic settings to set:
	Properties pulumi.StringMapInput
	// The REST endpoint of the Flink Compute Pool, for example, `https://flink.us-east-1.aws.confluent.cloud`).
	RestEndpoint pulumi.StringPtrInput
	// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
	Statement pulumi.StringPtrInput
	// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
	StatementName pulumi.StringPtrInput
	// Indicates whether the statement should be stopped.
	Stopped pulumi.BoolPtrInput
}

func (FlinkStatementState) ElementType() reflect.Type {
	return reflect.TypeOf((*flinkStatementState)(nil)).Elem()
}

type flinkStatementArgs struct {
	ComputePool *FlinkStatementComputePool `pulumi:"computePool"`
	// The Cluster API Credentials.
	Credentials  *FlinkStatementCredentials  `pulumi:"credentials"`
	Environment  *FlinkStatementEnvironment  `pulumi:"environment"`
	Organization *FlinkStatementOrganization `pulumi:"organization"`
	Principal    *FlinkStatementPrincipal    `pulumi:"principal"`
	// The custom topic settings to set:
	Properties map[string]string `pulumi:"properties"`
	// The REST endpoint of the Flink Compute Pool, for example, `https://flink.us-east-1.aws.confluent.cloud`).
	RestEndpoint *string `pulumi:"restEndpoint"`
	// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
	Statement string `pulumi:"statement"`
	// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
	StatementName *string `pulumi:"statementName"`
	// Indicates whether the statement should be stopped.
	Stopped *bool `pulumi:"stopped"`
}

// The set of arguments for constructing a FlinkStatement resource.
type FlinkStatementArgs struct {
	ComputePool FlinkStatementComputePoolPtrInput
	// The Cluster API Credentials.
	Credentials  FlinkStatementCredentialsPtrInput
	Environment  FlinkStatementEnvironmentPtrInput
	Organization FlinkStatementOrganizationPtrInput
	Principal    FlinkStatementPrincipalPtrInput
	// The custom topic settings to set:
	Properties pulumi.StringMapInput
	// The REST endpoint of the Flink Compute Pool, for example, `https://flink.us-east-1.aws.confluent.cloud`).
	RestEndpoint pulumi.StringPtrInput
	// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
	Statement pulumi.StringInput
	// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
	StatementName pulumi.StringPtrInput
	// Indicates whether the statement should be stopped.
	Stopped pulumi.BoolPtrInput
}

func (FlinkStatementArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*flinkStatementArgs)(nil)).Elem()
}

type FlinkStatementInput interface {
	pulumi.Input

	ToFlinkStatementOutput() FlinkStatementOutput
	ToFlinkStatementOutputWithContext(ctx context.Context) FlinkStatementOutput
}

func (*FlinkStatement) ElementType() reflect.Type {
	return reflect.TypeOf((**FlinkStatement)(nil)).Elem()
}

func (i *FlinkStatement) ToFlinkStatementOutput() FlinkStatementOutput {
	return i.ToFlinkStatementOutputWithContext(context.Background())
}

func (i *FlinkStatement) ToFlinkStatementOutputWithContext(ctx context.Context) FlinkStatementOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkStatementOutput)
}

// FlinkStatementArrayInput is an input type that accepts FlinkStatementArray and FlinkStatementArrayOutput values.
// You can construct a concrete instance of `FlinkStatementArrayInput` via:
//
//	FlinkStatementArray{ FlinkStatementArgs{...} }
type FlinkStatementArrayInput interface {
	pulumi.Input

	ToFlinkStatementArrayOutput() FlinkStatementArrayOutput
	ToFlinkStatementArrayOutputWithContext(context.Context) FlinkStatementArrayOutput
}

type FlinkStatementArray []FlinkStatementInput

func (FlinkStatementArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlinkStatement)(nil)).Elem()
}

func (i FlinkStatementArray) ToFlinkStatementArrayOutput() FlinkStatementArrayOutput {
	return i.ToFlinkStatementArrayOutputWithContext(context.Background())
}

func (i FlinkStatementArray) ToFlinkStatementArrayOutputWithContext(ctx context.Context) FlinkStatementArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkStatementArrayOutput)
}

// FlinkStatementMapInput is an input type that accepts FlinkStatementMap and FlinkStatementMapOutput values.
// You can construct a concrete instance of `FlinkStatementMapInput` via:
//
//	FlinkStatementMap{ "key": FlinkStatementArgs{...} }
type FlinkStatementMapInput interface {
	pulumi.Input

	ToFlinkStatementMapOutput() FlinkStatementMapOutput
	ToFlinkStatementMapOutputWithContext(context.Context) FlinkStatementMapOutput
}

type FlinkStatementMap map[string]FlinkStatementInput

func (FlinkStatementMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlinkStatement)(nil)).Elem()
}

func (i FlinkStatementMap) ToFlinkStatementMapOutput() FlinkStatementMapOutput {
	return i.ToFlinkStatementMapOutputWithContext(context.Background())
}

func (i FlinkStatementMap) ToFlinkStatementMapOutputWithContext(ctx context.Context) FlinkStatementMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlinkStatementMapOutput)
}

type FlinkStatementOutput struct{ *pulumi.OutputState }

func (FlinkStatementOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FlinkStatement)(nil)).Elem()
}

func (o FlinkStatementOutput) ToFlinkStatementOutput() FlinkStatementOutput {
	return o
}

func (o FlinkStatementOutput) ToFlinkStatementOutputWithContext(ctx context.Context) FlinkStatementOutput {
	return o
}

func (o FlinkStatementOutput) ComputePool() FlinkStatementComputePoolOutput {
	return o.ApplyT(func(v *FlinkStatement) FlinkStatementComputePoolOutput { return v.ComputePool }).(FlinkStatementComputePoolOutput)
}

// The Cluster API Credentials.
func (o FlinkStatementOutput) Credentials() FlinkStatementCredentialsPtrOutput {
	return o.ApplyT(func(v *FlinkStatement) FlinkStatementCredentialsPtrOutput { return v.Credentials }).(FlinkStatementCredentialsPtrOutput)
}

func (o FlinkStatementOutput) Environment() FlinkStatementEnvironmentOutput {
	return o.ApplyT(func(v *FlinkStatement) FlinkStatementEnvironmentOutput { return v.Environment }).(FlinkStatementEnvironmentOutput)
}

func (o FlinkStatementOutput) Organization() FlinkStatementOrganizationOutput {
	return o.ApplyT(func(v *FlinkStatement) FlinkStatementOrganizationOutput { return v.Organization }).(FlinkStatementOrganizationOutput)
}

func (o FlinkStatementOutput) Principal() FlinkStatementPrincipalOutput {
	return o.ApplyT(func(v *FlinkStatement) FlinkStatementPrincipalOutput { return v.Principal }).(FlinkStatementPrincipalOutput)
}

// The custom topic settings to set:
func (o FlinkStatementOutput) Properties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FlinkStatement) pulumi.StringMapOutput { return v.Properties }).(pulumi.StringMapOutput)
}

// The REST endpoint of the Flink Compute Pool, for example, `https://flink.us-east-1.aws.confluent.cloud`).
func (o FlinkStatementOutput) RestEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FlinkStatement) pulumi.StringPtrOutput { return v.RestEndpoint }).(pulumi.StringPtrOutput)
}

// The raw SQL text statement, for example, `SELECT CURRENT_TIMESTAMP;`.
func (o FlinkStatementOutput) Statement() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkStatement) pulumi.StringOutput { return v.Statement }).(pulumi.StringOutput)
}

// The ID of the Flink Statement, for example, `cfeab4fe-b62c-49bd-9e99-51cc98c77a67`.
func (o FlinkStatementOutput) StatementName() pulumi.StringOutput {
	return o.ApplyT(func(v *FlinkStatement) pulumi.StringOutput { return v.StatementName }).(pulumi.StringOutput)
}

// Indicates whether the statement should be stopped.
func (o FlinkStatementOutput) Stopped() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FlinkStatement) pulumi.BoolPtrOutput { return v.Stopped }).(pulumi.BoolPtrOutput)
}

type FlinkStatementArrayOutput struct{ *pulumi.OutputState }

func (FlinkStatementArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlinkStatement)(nil)).Elem()
}

func (o FlinkStatementArrayOutput) ToFlinkStatementArrayOutput() FlinkStatementArrayOutput {
	return o
}

func (o FlinkStatementArrayOutput) ToFlinkStatementArrayOutputWithContext(ctx context.Context) FlinkStatementArrayOutput {
	return o
}

func (o FlinkStatementArrayOutput) Index(i pulumi.IntInput) FlinkStatementOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FlinkStatement {
		return vs[0].([]*FlinkStatement)[vs[1].(int)]
	}).(FlinkStatementOutput)
}

type FlinkStatementMapOutput struct{ *pulumi.OutputState }

func (FlinkStatementMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlinkStatement)(nil)).Elem()
}

func (o FlinkStatementMapOutput) ToFlinkStatementMapOutput() FlinkStatementMapOutput {
	return o
}

func (o FlinkStatementMapOutput) ToFlinkStatementMapOutputWithContext(ctx context.Context) FlinkStatementMapOutput {
	return o
}

func (o FlinkStatementMapOutput) MapIndex(k pulumi.StringInput) FlinkStatementOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FlinkStatement {
		return vs[0].(map[string]*FlinkStatement)[vs[1].(string)]
	}).(FlinkStatementOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkStatementInput)(nil)).Elem(), &FlinkStatement{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkStatementArrayInput)(nil)).Elem(), FlinkStatementArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlinkStatementMapInput)(nil)).Elem(), FlinkStatementMap{})
	pulumi.RegisterOutputType(FlinkStatementOutput{})
	pulumi.RegisterOutputType(FlinkStatementArrayOutput{})
	pulumi.RegisterOutputType(FlinkStatementMapOutput{})
}
