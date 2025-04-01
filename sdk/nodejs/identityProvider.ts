// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * [![General Availability](https://img.shields.io/badge/Lifecycle%20Stage-General%20Availability-%2345c6e8)](https://docs.confluent.io/cloud/current/api.html#section/Versioning/API-Lifecycle-Policy)
 *
 * `confluentcloud.IdentityProvider` provides an Identity Provider resource that enables creating, editing, and deleting identity providers on Confluent Cloud.
 *
 * ## Example Usage
 *
 * ### Example Identity Provider: Azure AD
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const azure = new confluentcloud.IdentityProvider("azure", {
 *     displayName: "My OIDC Provider: Azure AD",
 *     description: "My description",
 *     issuer: "https://login.microsoftonline.com/{tenant_id}/v2.0",
 *     jwksUri: "https://login.microsoftonline.com/common/discovery/v2.0/keys",
 * });
 * ```
 *
 * ### Example Identity Provider: Okta
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as confluentcloud from "@pulumi/confluentcloud";
 *
 * const okta = new confluentcloud.IdentityProvider("okta", {
 *     displayName: "My OIDC Provider: Okta",
 *     description: "My description",
 *     issuer: "https://mycompany.okta.com/oauth2/default",
 *     jwksUri: "https://mycompany.okta.com/oauth2/default/v1/keys",
 * });
 * ```
 *
 * ## External Documentation
 *
 * * [Authenticating with OAuth](https://docs.confluent.io/cloud/current/access-management/authenticate/oauth/overview.html).
 *
 * ## Import
 *
 * You can import an Identity Provider by using Identity Provider ID, for example:
 *
 * $ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>"
 *
 * $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
 *
 * ```sh
 * $ pulumi import confluentcloud:index/identityProvider:IdentityProvider example op-abc123
 * ```
 *
 * !> **Warning:** Do not forget to delete terminal command history afterwards for security purposes.
 */
export class IdentityProvider extends pulumi.CustomResource {
    /**
     * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IdentityProviderState, opts?: pulumi.CustomResourceOptions): IdentityProvider {
        return new IdentityProvider(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'confluentcloud:index/identityProvider:IdentityProvider';

    /**
     * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IdentityProvider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IdentityProvider.__pulumiType;
    }

    /**
     * A description for the Identity Provider.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * A human-readable name for the Identity Provider.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1). This appears in audit log records.
     *
     * > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     *
     * > **Note:** If the client specifies mapping to one identity pool ID, the identity claim configured with that pool will be used instead.
     */
    public readonly identityClaim!: pulumi.Output<string | undefined>;
    /**
     * A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     */
    public readonly issuer!: pulumi.Output<string>;
    /**
     * A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     */
    public readonly jwksUri!: pulumi.Output<string>;

    /**
     * Create a IdentityProvider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IdentityProviderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IdentityProviderArgs | IdentityProviderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IdentityProviderState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["identityClaim"] = state ? state.identityClaim : undefined;
            resourceInputs["issuer"] = state ? state.issuer : undefined;
            resourceInputs["jwksUri"] = state ? state.jwksUri : undefined;
        } else {
            const args = argsOrState as IdentityProviderArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.issuer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'issuer'");
            }
            if ((!args || args.jwksUri === undefined) && !opts.urn) {
                throw new Error("Missing required property 'jwksUri'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["identityClaim"] = args ? args.identityClaim : undefined;
            resourceInputs["issuer"] = args ? args.issuer : undefined;
            resourceInputs["jwksUri"] = args ? args.jwksUri : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IdentityProvider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IdentityProvider resources.
 */
export interface IdentityProviderState {
    /**
     * A description for the Identity Provider.
     */
    description?: pulumi.Input<string>;
    /**
     * A human-readable name for the Identity Provider.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1). This appears in audit log records.
     *
     * > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     *
     * > **Note:** If the client specifies mapping to one identity pool ID, the identity claim configured with that pool will be used instead.
     */
    identityClaim?: pulumi.Input<string>;
    /**
     * A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     */
    issuer?: pulumi.Input<string>;
    /**
     * A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     */
    jwksUri?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IdentityProvider resource.
 */
export interface IdentityProviderArgs {
    /**
     * A description for the Identity Provider.
     */
    description: pulumi.Input<string>;
    /**
     * A human-readable name for the Identity Provider.
     */
    displayName: pulumi.Input<string>;
    /**
     * The JSON Web Token (JWT) claim to extract the authenticating identity to Confluent resources from [Registered Claim Names](https://datatracker.ietf.org/doc/html/rfc7519#section-4.1). This appears in audit log records.
     *
     * > **Note:** When using Azure AD identity provider, you can find your Azure Tenant ID in the [Azure Portal under Azure Active Directory](https://portal.azure.com/#blade/Microsoft_AAD_IAM/ActiveDirectoryMenuBlade/Overview). Must be a valid **32 character UUID string**.
     *
     * > **Note:** If the client specifies mapping to one identity pool ID, the identity claim configured with that pool will be used instead.
     */
    identityClaim?: pulumi.Input<string>;
    /**
     * A publicly reachable issuer URI for the Identity Provider. The unique issuer URI string represents the entity for issuing tokens.
     */
    issuer: pulumi.Input<string>;
    /**
     * A publicly reachable JSON Web Key Set (JWKS) URI for the Identity Provider. A JSON Web Key Set (JWKS) provides a set of keys containing the public keys used to verify any JSON Web Token (JWT) issued by your OAuth 2.0 identity provider.
     */
    jwksUri: pulumi.Input<string>;
}
