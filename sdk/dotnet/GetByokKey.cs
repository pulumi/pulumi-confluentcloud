// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud
{
    public static class GetByokKey
    {
        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.ByokKey` describes a BYOK Key data source.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var azureKey = ConfluentCloud.GetByokKey.Invoke(new()
        ///     {
        ///         Id = "cck-abcde",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["byok"] = azureKey,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetByokKeyResult> InvokeAsync(GetByokKeyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetByokKeyResult>("confluentcloud:index/getByokKey:getByokKey", args ?? new GetByokKeyArgs(), options.WithDefaults());

        /// <summary>
        /// [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
        /// 
        /// `confluentcloud.ByokKey` describes a BYOK Key data source.
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ConfluentCloud = Pulumi.ConfluentCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var azureKey = ConfluentCloud.GetByokKey.Invoke(new()
        ///     {
        ///         Id = "cck-abcde",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["byok"] = azureKey,
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetByokKeyResult> Invoke(GetByokKeyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetByokKeyResult>("confluentcloud:index/getByokKey:getByokKey", args ?? new GetByokKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetByokKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the BYOK key, for example, `cck-abcde`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetByokKeyArgs()
        {
        }
        public static new GetByokKeyArgs Empty => new GetByokKeyArgs();
    }

    public sealed class GetByokKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the BYOK key, for example, `cck-abcde`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetByokKeyInvokeArgs()
        {
        }
        public static new GetByokKeyInvokeArgs Empty => new GetByokKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetByokKeyResult
    {
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetByokKeyAwResult> Aws;
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetByokKeyAzureResult> Azures;
        /// <summary>
        /// (Optional Configuration Block) supports the following:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetByokKeyGcpResult> Gcps;
        /// <summary>
        /// (Required String) The ID of the BYOK key, for example, `cck-abcde`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetByokKeyResult(
            ImmutableArray<Outputs.GetByokKeyAwResult> aws,

            ImmutableArray<Outputs.GetByokKeyAzureResult> azures,

            ImmutableArray<Outputs.GetByokKeyGcpResult> gcps,

            string id)
        {
            Aws = aws;
            Azures = azures;
            Gcps = gcps;
            Id = id;
        }
    }
}
