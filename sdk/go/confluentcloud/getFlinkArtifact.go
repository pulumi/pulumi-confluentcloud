// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-confluentcloud/sdk/v2/go/confluentcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
//
// `FlinkArtifact` describes a Flink Artifact data source.
//
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
//			exampleUsingId, err := confluentcloud.LookupFlinkArtifact(ctx, &confluentcloud.LookupFlinkArtifactArgs{
//				Id: pulumi.StringRef("lfa-abc123"),
//				Environment: confluentcloud.GetFlinkArtifactEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingId", exampleUsingId)
//			exampleUsingName, err := confluentcloud.LookupFlinkArtifact(ctx, &confluentcloud.LookupFlinkArtifactArgs{
//				DisplayName: pulumi.StringRef("my_artifact"),
//				Environment: confluentcloud.GetFlinkArtifactEnvironment{
//					Id: "env-xyz456",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("exampleUsingName", exampleUsingName)
//			return nil
//		})
//	}
//
// ```
func LookupFlinkArtifact(ctx *pulumi.Context, args *LookupFlinkArtifactArgs, opts ...pulumi.InvokeOption) (*LookupFlinkArtifactResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFlinkArtifactResult
	err := ctx.Invoke("confluentcloud:index/getFlinkArtifact:getFlinkArtifact", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlinkArtifact.
type LookupFlinkArtifactArgs struct {
	// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud string `pulumi:"cloud"`
	// A human-readable name for the Flink Artifact.
	DisplayName *string                     `pulumi:"displayName"`
	Environment GetFlinkArtifactEnvironment `pulumi:"environment"`
	// The ID of the Flink Artifact, for example, `lfa-abc123`.
	Id *string `pulumi:"id"`
	// The cloud service provider region, for example, `us-east-1`.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	Region string `pulumi:"region"`
}

// A collection of values returned by getFlinkArtifact.
type LookupFlinkArtifactResult struct {
	// (Required String) The API Version of the schema version of the Flink Artifact, for example, `fa/v2`.
	ApiVersion string `pulumi:"apiVersion"`
	// (Required String) Java class or alias for the Flink Artifact as provided by developer.
	Class string `pulumi:"class"`
	Cloud string `pulumi:"cloud"`
	// (Required String) Archive format of the Flink Artifact.
	ContentFormat string `pulumi:"contentFormat"`
	// (Required String) Description of the Flink Artifact.
	Description string                      `pulumi:"description"`
	DisplayName string                      `pulumi:"displayName"`
	Environment GetFlinkArtifactEnvironment `pulumi:"environment"`
	Id          string                      `pulumi:"id"`
	// (Required String) The kind of the Flink Artifact, for example, `FlinkArtifact`.
	Kind   string `pulumi:"kind"`
	Region string `pulumi:"region"`
	// (Required String) Runtime language of the Flink Artifact. The default runtime language is JAVA.
	RuntimeLanguage string                    `pulumi:"runtimeLanguage"`
	Versions        []GetFlinkArtifactVersion `pulumi:"versions"`
}

func LookupFlinkArtifactOutput(ctx *pulumi.Context, args LookupFlinkArtifactOutputArgs, opts ...pulumi.InvokeOption) LookupFlinkArtifactResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupFlinkArtifactResultOutput, error) {
			args := v.(LookupFlinkArtifactArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("confluentcloud:index/getFlinkArtifact:getFlinkArtifact", args, LookupFlinkArtifactResultOutput{}, options).(LookupFlinkArtifactResultOutput), nil
		}).(LookupFlinkArtifactResultOutput)
}

// A collection of arguments for invoking getFlinkArtifact.
type LookupFlinkArtifactOutputArgs struct {
	// The cloud service provider that hosts the region. Accepted values are: `AWS`, `AZURE`, and `GCP`.
	Cloud pulumi.StringInput `pulumi:"cloud"`
	// A human-readable name for the Flink Artifact.
	DisplayName pulumi.StringPtrInput            `pulumi:"displayName"`
	Environment GetFlinkArtifactEnvironmentInput `pulumi:"environment"`
	// The ID of the Flink Artifact, for example, `lfa-abc123`.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The cloud service provider region, for example, `us-east-1`.
	//
	// > **Note:** Exactly one from the `id` and `displayName` attributes must be specified.
	Region pulumi.StringInput `pulumi:"region"`
}

func (LookupFlinkArtifactOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlinkArtifactArgs)(nil)).Elem()
}

// A collection of values returned by getFlinkArtifact.
type LookupFlinkArtifactResultOutput struct{ *pulumi.OutputState }

func (LookupFlinkArtifactResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlinkArtifactResult)(nil)).Elem()
}

func (o LookupFlinkArtifactResultOutput) ToLookupFlinkArtifactResultOutput() LookupFlinkArtifactResultOutput {
	return o
}

func (o LookupFlinkArtifactResultOutput) ToLookupFlinkArtifactResultOutputWithContext(ctx context.Context) LookupFlinkArtifactResultOutput {
	return o
}

// (Required String) The API Version of the schema version of the Flink Artifact, for example, `fa/v2`.
func (o LookupFlinkArtifactResultOutput) ApiVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.ApiVersion }).(pulumi.StringOutput)
}

// (Required String) Java class or alias for the Flink Artifact as provided by developer.
func (o LookupFlinkArtifactResultOutput) Class() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.Class }).(pulumi.StringOutput)
}

func (o LookupFlinkArtifactResultOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.Cloud }).(pulumi.StringOutput)
}

// (Required String) Archive format of the Flink Artifact.
func (o LookupFlinkArtifactResultOutput) ContentFormat() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.ContentFormat }).(pulumi.StringOutput)
}

// (Required String) Description of the Flink Artifact.
func (o LookupFlinkArtifactResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupFlinkArtifactResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupFlinkArtifactResultOutput) Environment() GetFlinkArtifactEnvironmentOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) GetFlinkArtifactEnvironment { return v.Environment }).(GetFlinkArtifactEnvironmentOutput)
}

func (o LookupFlinkArtifactResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Required String) The kind of the Flink Artifact, for example, `FlinkArtifact`.
func (o LookupFlinkArtifactResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.Kind }).(pulumi.StringOutput)
}

func (o LookupFlinkArtifactResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Required String) Runtime language of the Flink Artifact. The default runtime language is JAVA.
func (o LookupFlinkArtifactResultOutput) RuntimeLanguage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) string { return v.RuntimeLanguage }).(pulumi.StringOutput)
}

func (o LookupFlinkArtifactResultOutput) Versions() GetFlinkArtifactVersionArrayOutput {
	return o.ApplyT(func(v LookupFlinkArtifactResult) []GetFlinkArtifactVersion { return v.Versions }).(GetFlinkArtifactVersionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFlinkArtifactResultOutput{})
}
