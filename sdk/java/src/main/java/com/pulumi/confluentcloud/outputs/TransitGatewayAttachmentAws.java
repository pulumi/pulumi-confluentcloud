// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TransitGatewayAttachmentAws {
    /**
     * @return The Amazon Resource Name (ARN) of the Resource Access Manager (RAM) Resource Share of the transit gateway your Confluent Cloud network attaches to.
     * 
     */
    private String ramResourceShareArn;
    /**
     * @return List of destination routes for traffic from Confluent VPC to customer VPC via Transit Gateway.
     * 
     */
    private List<String> routes;
    /**
     * @return (Required String) The ID of the AWS Transit Gateway VPC Attachment that attaches Confluent VPC to Transit Gateway.
     * 
     */
    private @Nullable String transitGatewayAttachmentId;
    /**
     * @return The ID of the AWS Transit Gateway that you want Confluent CLoud to be attached to. Must start with `tgw-`.
     * 
     */
    private String transitGatewayId;

    private TransitGatewayAttachmentAws() {}
    /**
     * @return The Amazon Resource Name (ARN) of the Resource Access Manager (RAM) Resource Share of the transit gateway your Confluent Cloud network attaches to.
     * 
     */
    public String ramResourceShareArn() {
        return this.ramResourceShareArn;
    }
    /**
     * @return List of destination routes for traffic from Confluent VPC to customer VPC via Transit Gateway.
     * 
     */
    public List<String> routes() {
        return this.routes;
    }
    /**
     * @return (Required String) The ID of the AWS Transit Gateway VPC Attachment that attaches Confluent VPC to Transit Gateway.
     * 
     */
    public Optional<String> transitGatewayAttachmentId() {
        return Optional.ofNullable(this.transitGatewayAttachmentId);
    }
    /**
     * @return The ID of the AWS Transit Gateway that you want Confluent CLoud to be attached to. Must start with `tgw-`.
     * 
     */
    public String transitGatewayId() {
        return this.transitGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayAttachmentAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ramResourceShareArn;
        private List<String> routes;
        private @Nullable String transitGatewayAttachmentId;
        private String transitGatewayId;
        public Builder() {}
        public Builder(TransitGatewayAttachmentAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ramResourceShareArn = defaults.ramResourceShareArn;
    	      this.routes = defaults.routes;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        @CustomType.Setter
        public Builder ramResourceShareArn(String ramResourceShareArn) {
            this.ramResourceShareArn = Objects.requireNonNull(ramResourceShareArn);
            return this;
        }
        @CustomType.Setter
        public Builder routes(List<String> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public Builder routes(String... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder transitGatewayAttachmentId(@Nullable String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }
        public TransitGatewayAttachmentAws build() {
            final var o = new TransitGatewayAttachmentAws();
            o.ramResourceShareArn = ramResourceShareArn;
            o.routes = routes;
            o.transitGatewayAttachmentId = transitGatewayAttachmentId;
            o.transitGatewayId = transitGatewayId;
            return o;
        }
    }
}
