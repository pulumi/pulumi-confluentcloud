// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetSchemaRulesetDomainRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSchemaRulesetDomainRuleArgs Empty = new GetSchemaRulesetDomainRuleArgs();

    /**
     * (Optional String) An optional description.
     * 
     */
    @Import(name="doc", required=true)
    private Output<String> doc;

    /**
     * @return (Optional String) An optional description.
     * 
     */
    public Output<String> doc() {
        return this.doc;
    }

    /**
     * (Optional String) The body of the rule, which is optional.
     * 
     */
    @Import(name="expr", required=true)
    private Output<String> expr;

    /**
     * @return (Optional String) The body of the rule, which is optional.
     * 
     */
    public Output<String> expr() {
        return this.expr;
    }

    /**
     * (Optional String) Either `CONDITION` or `TRANSFORM`.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return (Optional String) Either `CONDITION` or `TRANSFORM`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * (Optional String) The mode of the rule.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return (Optional String) The mode of the rule.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * (Optional String) A user-defined name that can be used to reference the rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return (Optional String) A user-defined name that can be used to reference the rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    @Import(name="onFailure", required=true)
    private Output<String> onFailure;

    /**
     * @return (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    public Output<String> onFailure() {
        return this.onFailure;
    }

    /**
     * (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
     * 
     */
    @Import(name="onSuccess", required=true)
    private Output<String> onSuccess;

    /**
     * @return (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
     * 
     */
    public Output<String> onSuccess() {
        return this.onSuccess;
    }

    /**
     * (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
     * 
     */
    @Import(name="params", required=true)
    private Output<Map<String,String>> params;

    /**
     * @return (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
     * 
     */
    public Output<Map<String,String>> params() {
        return this.params;
    }

    /**
     * (Optional String List) The tags to which the rule applies, if any.
     * 
     */
    @Import(name="tags", required=true)
    private Output<List<String>> tags;

    /**
     * @return (Optional String List) The tags to which the rule applies, if any.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }

    /**
     * (Optional String) The type of rule, which invokes a specific rule executor, such as Google Common Expression Language (CEL) or JSONata.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return (Optional String) The type of rule, which invokes a specific rule executor, such as Google Common Expression Language (CEL) or JSONata.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GetSchemaRulesetDomainRuleArgs() {}

    private GetSchemaRulesetDomainRuleArgs(GetSchemaRulesetDomainRuleArgs $) {
        this.doc = $.doc;
        this.expr = $.expr;
        this.kind = $.kind;
        this.mode = $.mode;
        this.name = $.name;
        this.onFailure = $.onFailure;
        this.onSuccess = $.onSuccess;
        this.params = $.params;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSchemaRulesetDomainRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRulesetDomainRuleArgs $;

        public Builder() {
            $ = new GetSchemaRulesetDomainRuleArgs();
        }

        public Builder(GetSchemaRulesetDomainRuleArgs defaults) {
            $ = new GetSchemaRulesetDomainRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param doc (Optional String) An optional description.
         * 
         * @return builder
         * 
         */
        public Builder doc(Output<String> doc) {
            $.doc = doc;
            return this;
        }

        /**
         * @param doc (Optional String) An optional description.
         * 
         * @return builder
         * 
         */
        public Builder doc(String doc) {
            return doc(Output.of(doc));
        }

        /**
         * @param expr (Optional String) The body of the rule, which is optional.
         * 
         * @return builder
         * 
         */
        public Builder expr(Output<String> expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param expr (Optional String) The body of the rule, which is optional.
         * 
         * @return builder
         * 
         */
        public Builder expr(String expr) {
            return expr(Output.of(expr));
        }

        /**
         * @param kind (Optional String) Either `CONDITION` or `TRANSFORM`.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind (Optional String) Either `CONDITION` or `TRANSFORM`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param mode (Optional String) The mode of the rule.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode (Optional String) The mode of the rule.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name (Optional String) A user-defined name that can be used to reference the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Optional String) A user-defined name that can be used to reference the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onFailure (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(Output<String> onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        /**
         * @param onFailure (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(String onFailure) {
            return onFailure(Output.of(onFailure));
        }

        /**
         * @param onSuccess (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(Output<String> onSuccess) {
            $.onSuccess = onSuccess;
            return this;
        }

        /**
         * @param onSuccess (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(String onSuccess) {
            return onSuccess(Output.of(onSuccess));
        }

        /**
         * @param params (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
         * 
         * @return builder
         * 
         */
        public Builder params(Output<Map<String,String>> params) {
            $.params = params;
            return this;
        }

        /**
         * @param params (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
         * 
         * @return builder
         * 
         */
        public Builder params(Map<String,String> params) {
            return params(Output.of(params));
        }

        /**
         * @param tags (Optional String List) The tags to which the rule applies, if any.
         * 
         * @return builder
         * 
         */
        public Builder tags(Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags (Optional String List) The tags to which the rule applies, if any.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags (Optional String List) The tags to which the rule applies, if any.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type (Optional String) The type of rule, which invokes a specific rule executor, such as Google Common Expression Language (CEL) or JSONata.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Optional String) The type of rule, which invokes a specific rule executor, such as Google Common Expression Language (CEL) or JSONata.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetSchemaRulesetDomainRuleArgs build() {
            if ($.doc == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "doc");
            }
            if ($.expr == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "expr");
            }
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "kind");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "mode");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "name");
            }
            if ($.onFailure == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "onFailure");
            }
            if ($.onSuccess == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "onSuccess");
            }
            if ($.params == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "params");
            }
            if ($.tags == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "tags");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "type");
            }
            return $;
        }
    }

}