// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Outputs
{

    [OutputType]
    public sealed class GetKsqlClusterCredentialIdentityResult
    {
        /// <summary>
        /// The ID of the Environment that the ksqlDB cluster belongs to, for example, `env-xyz456`.
        /// 
        /// &gt; **Note:** Exactly one from the `id` and `display_name` attributes must be specified.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetKsqlClusterCredentialIdentityResult(string id)
        {
            Id = id;
        }
    }
}
