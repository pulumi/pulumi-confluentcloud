// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { ApiKeyArgs, ApiKeyState } from "./apiKey";
export type ApiKey = import("./apiKey").ApiKey;
export const ApiKey: typeof import("./apiKey").ApiKey = null as any;
utilities.lazyLoad(exports, ["ApiKey"], () => require("./apiKey"));

export { ClusterLinkArgs, ClusterLinkState } from "./clusterLink";
export type ClusterLink = import("./clusterLink").ClusterLink;
export const ClusterLink: typeof import("./clusterLink").ClusterLink = null as any;
utilities.lazyLoad(exports, ["ClusterLink"], () => require("./clusterLink"));

export { ConnectorArgs, ConnectorState } from "./connector";
export type Connector = import("./connector").Connector;
export const Connector: typeof import("./connector").Connector = null as any;
utilities.lazyLoad(exports, ["Connector"], () => require("./connector"));

export { EnvironmentArgs, EnvironmentState } from "./environment";
export type Environment = import("./environment").Environment;
export const Environment: typeof import("./environment").Environment = null as any;
utilities.lazyLoad(exports, ["Environment"], () => require("./environment"));

export { GetEnvironmentArgs, GetEnvironmentResult, GetEnvironmentOutputArgs } from "./getEnvironment";
export const getEnvironment: typeof import("./getEnvironment").getEnvironment = null as any;
export const getEnvironmentOutput: typeof import("./getEnvironment").getEnvironmentOutput = null as any;
utilities.lazyLoad(exports, ["getEnvironment","getEnvironmentOutput"], () => require("./getEnvironment"));

export { GetIdentityPoolArgs, GetIdentityPoolResult, GetIdentityPoolOutputArgs } from "./getIdentityPool";
export const getIdentityPool: typeof import("./getIdentityPool").getIdentityPool = null as any;
export const getIdentityPoolOutput: typeof import("./getIdentityPool").getIdentityPoolOutput = null as any;
utilities.lazyLoad(exports, ["getIdentityPool","getIdentityPoolOutput"], () => require("./getIdentityPool"));

export { GetIdentityProviderArgs, GetIdentityProviderResult, GetIdentityProviderOutputArgs } from "./getIdentityProvider";
export const getIdentityProvider: typeof import("./getIdentityProvider").getIdentityProvider = null as any;
export const getIdentityProviderOutput: typeof import("./getIdentityProvider").getIdentityProviderOutput = null as any;
utilities.lazyLoad(exports, ["getIdentityProvider","getIdentityProviderOutput"], () => require("./getIdentityProvider"));

export { GetInvitationArgs, GetInvitationResult, GetInvitationOutputArgs } from "./getInvitation";
export const getInvitation: typeof import("./getInvitation").getInvitation = null as any;
export const getInvitationOutput: typeof import("./getInvitation").getInvitationOutput = null as any;
utilities.lazyLoad(exports, ["getInvitation","getInvitationOutput"], () => require("./getInvitation"));

export { GetKafkaClientQuotaArgs, GetKafkaClientQuotaResult, GetKafkaClientQuotaOutputArgs } from "./getKafkaClientQuota";
export const getKafkaClientQuota: typeof import("./getKafkaClientQuota").getKafkaClientQuota = null as any;
export const getKafkaClientQuotaOutput: typeof import("./getKafkaClientQuota").getKafkaClientQuotaOutput = null as any;
utilities.lazyLoad(exports, ["getKafkaClientQuota","getKafkaClientQuotaOutput"], () => require("./getKafkaClientQuota"));

export { GetKafkaClusterArgs, GetKafkaClusterResult, GetKafkaClusterOutputArgs } from "./getKafkaCluster";
export const getKafkaCluster: typeof import("./getKafkaCluster").getKafkaCluster = null as any;
export const getKafkaClusterOutput: typeof import("./getKafkaCluster").getKafkaClusterOutput = null as any;
utilities.lazyLoad(exports, ["getKafkaCluster","getKafkaClusterOutput"], () => require("./getKafkaCluster"));

export { GetKafkaTopicArgs, GetKafkaTopicResult, GetKafkaTopicOutputArgs } from "./getKafkaTopic";
export const getKafkaTopic: typeof import("./getKafkaTopic").getKafkaTopic = null as any;
export const getKafkaTopicOutput: typeof import("./getKafkaTopic").getKafkaTopicOutput = null as any;
utilities.lazyLoad(exports, ["getKafkaTopic","getKafkaTopicOutput"], () => require("./getKafkaTopic"));

export { GetKsqlClusterArgs, GetKsqlClusterResult, GetKsqlClusterOutputArgs } from "./getKsqlCluster";
export const getKsqlCluster: typeof import("./getKsqlCluster").getKsqlCluster = null as any;
export const getKsqlClusterOutput: typeof import("./getKsqlCluster").getKsqlClusterOutput = null as any;
utilities.lazyLoad(exports, ["getKsqlCluster","getKsqlClusterOutput"], () => require("./getKsqlCluster"));

export { GetNetworkArgs, GetNetworkResult, GetNetworkOutputArgs } from "./getNetwork";
export const getNetwork: typeof import("./getNetwork").getNetwork = null as any;
export const getNetworkOutput: typeof import("./getNetwork").getNetworkOutput = null as any;
utilities.lazyLoad(exports, ["getNetwork","getNetworkOutput"], () => require("./getNetwork"));

export { GetOrganizationResult } from "./getOrganization";
export const getOrganization: typeof import("./getOrganization").getOrganization = null as any;
utilities.lazyLoad(exports, ["getOrganization"], () => require("./getOrganization"));

export { GetPeeringArgs, GetPeeringResult, GetPeeringOutputArgs } from "./getPeering";
export const getPeering: typeof import("./getPeering").getPeering = null as any;
export const getPeeringOutput: typeof import("./getPeering").getPeeringOutput = null as any;
utilities.lazyLoad(exports, ["getPeering","getPeeringOutput"], () => require("./getPeering"));

export { GetPrivateLinkAccessArgs, GetPrivateLinkAccessResult, GetPrivateLinkAccessOutputArgs } from "./getPrivateLinkAccess";
export const getPrivateLinkAccess: typeof import("./getPrivateLinkAccess").getPrivateLinkAccess = null as any;
export const getPrivateLinkAccessOutput: typeof import("./getPrivateLinkAccess").getPrivateLinkAccessOutput = null as any;
utilities.lazyLoad(exports, ["getPrivateLinkAccess","getPrivateLinkAccessOutput"], () => require("./getPrivateLinkAccess"));

export { GetRoleBindingArgs, GetRoleBindingResult, GetRoleBindingOutputArgs } from "./getRoleBinding";
export const getRoleBinding: typeof import("./getRoleBinding").getRoleBinding = null as any;
export const getRoleBindingOutput: typeof import("./getRoleBinding").getRoleBindingOutput = null as any;
utilities.lazyLoad(exports, ["getRoleBinding","getRoleBindingOutput"], () => require("./getRoleBinding"));

export { GetSchemaArgs, GetSchemaResult, GetSchemaOutputArgs } from "./getSchema";
export const getSchema: typeof import("./getSchema").getSchema = null as any;
export const getSchemaOutput: typeof import("./getSchema").getSchemaOutput = null as any;
utilities.lazyLoad(exports, ["getSchema","getSchemaOutput"], () => require("./getSchema"));

export { GetSchemaRegistryClusterArgs, GetSchemaRegistryClusterResult, GetSchemaRegistryClusterOutputArgs } from "./getSchemaRegistryCluster";
export const getSchemaRegistryCluster: typeof import("./getSchemaRegistryCluster").getSchemaRegistryCluster = null as any;
export const getSchemaRegistryClusterOutput: typeof import("./getSchemaRegistryCluster").getSchemaRegistryClusterOutput = null as any;
utilities.lazyLoad(exports, ["getSchemaRegistryCluster","getSchemaRegistryClusterOutput"], () => require("./getSchemaRegistryCluster"));

export { GetSchemaRegistryClusterConfigArgs, GetSchemaRegistryClusterConfigResult, GetSchemaRegistryClusterConfigOutputArgs } from "./getSchemaRegistryClusterConfig";
export const getSchemaRegistryClusterConfig: typeof import("./getSchemaRegistryClusterConfig").getSchemaRegistryClusterConfig = null as any;
export const getSchemaRegistryClusterConfigOutput: typeof import("./getSchemaRegistryClusterConfig").getSchemaRegistryClusterConfigOutput = null as any;
utilities.lazyLoad(exports, ["getSchemaRegistryClusterConfig","getSchemaRegistryClusterConfigOutput"], () => require("./getSchemaRegistryClusterConfig"));

export { GetSchemaRegistryClusterModeArgs, GetSchemaRegistryClusterModeResult, GetSchemaRegistryClusterModeOutputArgs } from "./getSchemaRegistryClusterMode";
export const getSchemaRegistryClusterMode: typeof import("./getSchemaRegistryClusterMode").getSchemaRegistryClusterMode = null as any;
export const getSchemaRegistryClusterModeOutput: typeof import("./getSchemaRegistryClusterMode").getSchemaRegistryClusterModeOutput = null as any;
utilities.lazyLoad(exports, ["getSchemaRegistryClusterMode","getSchemaRegistryClusterModeOutput"], () => require("./getSchemaRegistryClusterMode"));

export { GetSchemaRegistryRegionArgs, GetSchemaRegistryRegionResult, GetSchemaRegistryRegionOutputArgs } from "./getSchemaRegistryRegion";
export const getSchemaRegistryRegion: typeof import("./getSchemaRegistryRegion").getSchemaRegistryRegion = null as any;
export const getSchemaRegistryRegionOutput: typeof import("./getSchemaRegistryRegion").getSchemaRegistryRegionOutput = null as any;
utilities.lazyLoad(exports, ["getSchemaRegistryRegion","getSchemaRegistryRegionOutput"], () => require("./getSchemaRegistryRegion"));

export { GetServiceAccountArgs, GetServiceAccountResult, GetServiceAccountOutputArgs } from "./getServiceAccount";
export const getServiceAccount: typeof import("./getServiceAccount").getServiceAccount = null as any;
export const getServiceAccountOutput: typeof import("./getServiceAccount").getServiceAccountOutput = null as any;
utilities.lazyLoad(exports, ["getServiceAccount","getServiceAccountOutput"], () => require("./getServiceAccount"));

export { GetSubjectConfigArgs, GetSubjectConfigResult, GetSubjectConfigOutputArgs } from "./getSubjectConfig";
export const getSubjectConfig: typeof import("./getSubjectConfig").getSubjectConfig = null as any;
export const getSubjectConfigOutput: typeof import("./getSubjectConfig").getSubjectConfigOutput = null as any;
utilities.lazyLoad(exports, ["getSubjectConfig","getSubjectConfigOutput"], () => require("./getSubjectConfig"));

export { GetSubjectModeArgs, GetSubjectModeResult, GetSubjectModeOutputArgs } from "./getSubjectMode";
export const getSubjectMode: typeof import("./getSubjectMode").getSubjectMode = null as any;
export const getSubjectModeOutput: typeof import("./getSubjectMode").getSubjectModeOutput = null as any;
utilities.lazyLoad(exports, ["getSubjectMode","getSubjectModeOutput"], () => require("./getSubjectMode"));

export { GetTransitGatewayAttachmentArgs, GetTransitGatewayAttachmentResult, GetTransitGatewayAttachmentOutputArgs } from "./getTransitGatewayAttachment";
export const getTransitGatewayAttachment: typeof import("./getTransitGatewayAttachment").getTransitGatewayAttachment = null as any;
export const getTransitGatewayAttachmentOutput: typeof import("./getTransitGatewayAttachment").getTransitGatewayAttachmentOutput = null as any;
utilities.lazyLoad(exports, ["getTransitGatewayAttachment","getTransitGatewayAttachmentOutput"], () => require("./getTransitGatewayAttachment"));

export { GetUserArgs, GetUserResult, GetUserOutputArgs } from "./getUser";
export const getUser: typeof import("./getUser").getUser = null as any;
export const getUserOutput: typeof import("./getUser").getUserOutput = null as any;
utilities.lazyLoad(exports, ["getUser","getUserOutput"], () => require("./getUser"));

export { IdentityPoolArgs, IdentityPoolState } from "./identityPool";
export type IdentityPool = import("./identityPool").IdentityPool;
export const IdentityPool: typeof import("./identityPool").IdentityPool = null as any;
utilities.lazyLoad(exports, ["IdentityPool"], () => require("./identityPool"));

export { IdentityProviderArgs, IdentityProviderState } from "./identityProvider";
export type IdentityProvider = import("./identityProvider").IdentityProvider;
export const IdentityProvider: typeof import("./identityProvider").IdentityProvider = null as any;
utilities.lazyLoad(exports, ["IdentityProvider"], () => require("./identityProvider"));

export { InvitationArgs, InvitationState } from "./invitation";
export type Invitation = import("./invitation").Invitation;
export const Invitation: typeof import("./invitation").Invitation = null as any;
utilities.lazyLoad(exports, ["Invitation"], () => require("./invitation"));

export { KafkaAclArgs, KafkaAclState } from "./kafkaAcl";
export type KafkaAcl = import("./kafkaAcl").KafkaAcl;
export const KafkaAcl: typeof import("./kafkaAcl").KafkaAcl = null as any;
utilities.lazyLoad(exports, ["KafkaAcl"], () => require("./kafkaAcl"));

export { KafkaClientQuotaArgs, KafkaClientQuotaState } from "./kafkaClientQuota";
export type KafkaClientQuota = import("./kafkaClientQuota").KafkaClientQuota;
export const KafkaClientQuota: typeof import("./kafkaClientQuota").KafkaClientQuota = null as any;
utilities.lazyLoad(exports, ["KafkaClientQuota"], () => require("./kafkaClientQuota"));

export { KafkaClusterArgs, KafkaClusterState } from "./kafkaCluster";
export type KafkaCluster = import("./kafkaCluster").KafkaCluster;
export const KafkaCluster: typeof import("./kafkaCluster").KafkaCluster = null as any;
utilities.lazyLoad(exports, ["KafkaCluster"], () => require("./kafkaCluster"));

export { KafkaClusterConfigArgs, KafkaClusterConfigState } from "./kafkaClusterConfig";
export type KafkaClusterConfig = import("./kafkaClusterConfig").KafkaClusterConfig;
export const KafkaClusterConfig: typeof import("./kafkaClusterConfig").KafkaClusterConfig = null as any;
utilities.lazyLoad(exports, ["KafkaClusterConfig"], () => require("./kafkaClusterConfig"));

export { KafkaMirrorTopicArgs, KafkaMirrorTopicState } from "./kafkaMirrorTopic";
export type KafkaMirrorTopic = import("./kafkaMirrorTopic").KafkaMirrorTopic;
export const KafkaMirrorTopic: typeof import("./kafkaMirrorTopic").KafkaMirrorTopic = null as any;
utilities.lazyLoad(exports, ["KafkaMirrorTopic"], () => require("./kafkaMirrorTopic"));

export { KafkaTopicArgs, KafkaTopicState } from "./kafkaTopic";
export type KafkaTopic = import("./kafkaTopic").KafkaTopic;
export const KafkaTopic: typeof import("./kafkaTopic").KafkaTopic = null as any;
utilities.lazyLoad(exports, ["KafkaTopic"], () => require("./kafkaTopic"));

export { KsqlClusterArgs, KsqlClusterState } from "./ksqlCluster";
export type KsqlCluster = import("./ksqlCluster").KsqlCluster;
export const KsqlCluster: typeof import("./ksqlCluster").KsqlCluster = null as any;
utilities.lazyLoad(exports, ["KsqlCluster"], () => require("./ksqlCluster"));

export { NetworkArgs, NetworkState } from "./network";
export type Network = import("./network").Network;
export const Network: typeof import("./network").Network = null as any;
utilities.lazyLoad(exports, ["Network"], () => require("./network"));

export { PeeringArgs, PeeringState } from "./peering";
export type Peering = import("./peering").Peering;
export const Peering: typeof import("./peering").Peering = null as any;
utilities.lazyLoad(exports, ["Peering"], () => require("./peering"));

export { PrivateLinkAccessArgs, PrivateLinkAccessState } from "./privateLinkAccess";
export type PrivateLinkAccess = import("./privateLinkAccess").PrivateLinkAccess;
export const PrivateLinkAccess: typeof import("./privateLinkAccess").PrivateLinkAccess = null as any;
utilities.lazyLoad(exports, ["PrivateLinkAccess"], () => require("./privateLinkAccess"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { RoleBindingArgs, RoleBindingState } from "./roleBinding";
export type RoleBinding = import("./roleBinding").RoleBinding;
export const RoleBinding: typeof import("./roleBinding").RoleBinding = null as any;
utilities.lazyLoad(exports, ["RoleBinding"], () => require("./roleBinding"));

export { SchemaArgs, SchemaState } from "./schema";
export type Schema = import("./schema").Schema;
export const Schema: typeof import("./schema").Schema = null as any;
utilities.lazyLoad(exports, ["Schema"], () => require("./schema"));

export { SchemaRegistryClusterArgs, SchemaRegistryClusterState } from "./schemaRegistryCluster";
export type SchemaRegistryCluster = import("./schemaRegistryCluster").SchemaRegistryCluster;
export const SchemaRegistryCluster: typeof import("./schemaRegistryCluster").SchemaRegistryCluster = null as any;
utilities.lazyLoad(exports, ["SchemaRegistryCluster"], () => require("./schemaRegistryCluster"));

export { SchemaRegistryClusterConfigArgs, SchemaRegistryClusterConfigState } from "./schemaRegistryClusterConfig";
export type SchemaRegistryClusterConfig = import("./schemaRegistryClusterConfig").SchemaRegistryClusterConfig;
export const SchemaRegistryClusterConfig: typeof import("./schemaRegistryClusterConfig").SchemaRegistryClusterConfig = null as any;
utilities.lazyLoad(exports, ["SchemaRegistryClusterConfig"], () => require("./schemaRegistryClusterConfig"));

export { SchemaRegistryClusterModeArgs, SchemaRegistryClusterModeState } from "./schemaRegistryClusterMode";
export type SchemaRegistryClusterMode = import("./schemaRegistryClusterMode").SchemaRegistryClusterMode;
export const SchemaRegistryClusterMode: typeof import("./schemaRegistryClusterMode").SchemaRegistryClusterMode = null as any;
utilities.lazyLoad(exports, ["SchemaRegistryClusterMode"], () => require("./schemaRegistryClusterMode"));

export { ServiceAccountArgs, ServiceAccountState } from "./serviceAccount";
export type ServiceAccount = import("./serviceAccount").ServiceAccount;
export const ServiceAccount: typeof import("./serviceAccount").ServiceAccount = null as any;
utilities.lazyLoad(exports, ["ServiceAccount"], () => require("./serviceAccount"));

export { SubjectConfigArgs, SubjectConfigState } from "./subjectConfig";
export type SubjectConfig = import("./subjectConfig").SubjectConfig;
export const SubjectConfig: typeof import("./subjectConfig").SubjectConfig = null as any;
utilities.lazyLoad(exports, ["SubjectConfig"], () => require("./subjectConfig"));

export { SubjectModeArgs, SubjectModeState } from "./subjectMode";
export type SubjectMode = import("./subjectMode").SubjectMode;
export const SubjectMode: typeof import("./subjectMode").SubjectMode = null as any;
utilities.lazyLoad(exports, ["SubjectMode"], () => require("./subjectMode"));

export { TransitGatewayAttachmentArgs, TransitGatewayAttachmentState } from "./transitGatewayAttachment";
export type TransitGatewayAttachment = import("./transitGatewayAttachment").TransitGatewayAttachment;
export const TransitGatewayAttachment: typeof import("./transitGatewayAttachment").TransitGatewayAttachment = null as any;
utilities.lazyLoad(exports, ["TransitGatewayAttachment"], () => require("./transitGatewayAttachment"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "confluentcloud:index/apiKey:ApiKey":
                return new ApiKey(name, <any>undefined, { urn })
            case "confluentcloud:index/clusterLink:ClusterLink":
                return new ClusterLink(name, <any>undefined, { urn })
            case "confluentcloud:index/connector:Connector":
                return new Connector(name, <any>undefined, { urn })
            case "confluentcloud:index/environment:Environment":
                return new Environment(name, <any>undefined, { urn })
            case "confluentcloud:index/identityPool:IdentityPool":
                return new IdentityPool(name, <any>undefined, { urn })
            case "confluentcloud:index/identityProvider:IdentityProvider":
                return new IdentityProvider(name, <any>undefined, { urn })
            case "confluentcloud:index/invitation:Invitation":
                return new Invitation(name, <any>undefined, { urn })
            case "confluentcloud:index/kafkaAcl:KafkaAcl":
                return new KafkaAcl(name, <any>undefined, { urn })
            case "confluentcloud:index/kafkaClientQuota:KafkaClientQuota":
                return new KafkaClientQuota(name, <any>undefined, { urn })
            case "confluentcloud:index/kafkaCluster:KafkaCluster":
                return new KafkaCluster(name, <any>undefined, { urn })
            case "confluentcloud:index/kafkaClusterConfig:KafkaClusterConfig":
                return new KafkaClusterConfig(name, <any>undefined, { urn })
            case "confluentcloud:index/kafkaMirrorTopic:KafkaMirrorTopic":
                return new KafkaMirrorTopic(name, <any>undefined, { urn })
            case "confluentcloud:index/kafkaTopic:KafkaTopic":
                return new KafkaTopic(name, <any>undefined, { urn })
            case "confluentcloud:index/ksqlCluster:KsqlCluster":
                return new KsqlCluster(name, <any>undefined, { urn })
            case "confluentcloud:index/network:Network":
                return new Network(name, <any>undefined, { urn })
            case "confluentcloud:index/peering:Peering":
                return new Peering(name, <any>undefined, { urn })
            case "confluentcloud:index/privateLinkAccess:PrivateLinkAccess":
                return new PrivateLinkAccess(name, <any>undefined, { urn })
            case "confluentcloud:index/roleBinding:RoleBinding":
                return new RoleBinding(name, <any>undefined, { urn })
            case "confluentcloud:index/schema:Schema":
                return new Schema(name, <any>undefined, { urn })
            case "confluentcloud:index/schemaRegistryCluster:SchemaRegistryCluster":
                return new SchemaRegistryCluster(name, <any>undefined, { urn })
            case "confluentcloud:index/schemaRegistryClusterConfig:SchemaRegistryClusterConfig":
                return new SchemaRegistryClusterConfig(name, <any>undefined, { urn })
            case "confluentcloud:index/schemaRegistryClusterMode:SchemaRegistryClusterMode":
                return new SchemaRegistryClusterMode(name, <any>undefined, { urn })
            case "confluentcloud:index/serviceAccount:ServiceAccount":
                return new ServiceAccount(name, <any>undefined, { urn })
            case "confluentcloud:index/subjectConfig:SubjectConfig":
                return new SubjectConfig(name, <any>undefined, { urn })
            case "confluentcloud:index/subjectMode:SubjectMode":
                return new SubjectMode(name, <any>undefined, { urn })
            case "confluentcloud:index/transitGatewayAttachment:TransitGatewayAttachment":
                return new TransitGatewayAttachment(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("confluentcloud", "index/apiKey", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/clusterLink", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/connector", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/environment", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/identityPool", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/identityProvider", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/invitation", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/kafkaAcl", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/kafkaClientQuota", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/kafkaCluster", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/kafkaClusterConfig", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/kafkaMirrorTopic", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/kafkaTopic", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/ksqlCluster", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/network", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/peering", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/privateLinkAccess", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/roleBinding", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/schema", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/schemaRegistryCluster", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/schemaRegistryClusterConfig", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/schemaRegistryClusterMode", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/serviceAccount", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/subjectConfig", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/subjectMode", _module)
pulumi.runtime.registerResourceModule("confluentcloud", "index/transitGatewayAttachment", _module)
pulumi.runtime.registerResourcePackage("confluentcloud", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:confluentcloud") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
