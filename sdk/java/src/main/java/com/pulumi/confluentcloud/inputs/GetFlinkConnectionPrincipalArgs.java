// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFlinkConnectionPrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFlinkConnectionPrincipalArgs Empty = new GetFlinkConnectionPrincipalArgs();

    /**
     * The ID of the Principal the Flink Connection runs as, for example, `sa-abc123`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Principal the Flink Connection runs as, for example, `sa-abc123`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetFlinkConnectionPrincipalArgs() {}

    private GetFlinkConnectionPrincipalArgs(GetFlinkConnectionPrincipalArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlinkConnectionPrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlinkConnectionPrincipalArgs $;

        public Builder() {
            $ = new GetFlinkConnectionPrincipalArgs();
        }

        public Builder(GetFlinkConnectionPrincipalArgs defaults) {
            $ = new GetFlinkConnectionPrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Principal the Flink Connection runs as, for example, `sa-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Principal the Flink Connection runs as, for example, `sa-abc123`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetFlinkConnectionPrincipalArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetFlinkConnectionPrincipalArgs", "id");
            }
            return $;
        }
    }

}
