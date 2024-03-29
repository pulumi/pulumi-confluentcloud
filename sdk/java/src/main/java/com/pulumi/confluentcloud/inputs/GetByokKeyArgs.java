// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetByokKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetByokKeyArgs Empty = new GetByokKeyArgs();

    /**
     * The ID of the BYOK key, for example, `cck-abcde`.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the BYOK key, for example, `cck-abcde`.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetByokKeyArgs() {}

    private GetByokKeyArgs(GetByokKeyArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetByokKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetByokKeyArgs $;

        public Builder() {
            $ = new GetByokKeyArgs();
        }

        public Builder(GetByokKeyArgs defaults) {
            $ = new GetByokKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the BYOK key, for example, `cck-abcde`.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the BYOK key, for example, `cck-abcde`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetByokKeyArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetByokKeyArgs", "id");
            }
            return $;
        }
    }

}
