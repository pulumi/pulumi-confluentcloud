// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetSchemaRulesetMigrationRule extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRulesetMigrationRule Empty = new GetSchemaRulesetMigrationRule();

    /**
     * (Optional String) An optional description.
     * 
     */
    @Import(name="doc", required=true)
    private String doc;

    /**
     * @return (Optional String) An optional description.
     * 
     */
    public String doc() {
        return this.doc;
    }

    /**
     * (Optional String) The body of the rule, which is optional.
     * 
     */
    @Import(name="expr", required=true)
    private String expr;

    /**
     * @return (Optional String) The body of the rule, which is optional.
     * 
     */
    public String expr() {
        return this.expr;
    }

    /**
     * (Optional String) Either `CONDITION` or `TRANSFORM`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return (Optional String) Either `CONDITION` or `TRANSFORM`.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * (Optional String) The mode of the rule.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    /**
     * @return (Optional String) The mode of the rule.
     * 
     */
    public String mode() {
        return this.mode;
    }

    /**
     * (Optional String) A user-defined name that can be used to reference the rule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return (Optional String) A user-defined name that can be used to reference the rule.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    @Import(name="onFailure", required=true)
    private String onFailure;

    /**
     * @return (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    public String onFailure() {
        return this.onFailure;
    }

    /**
     * (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
     * 
     */
    @Import(name="onSuccess", required=true)
    private String onSuccess;

    /**
     * @return (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
     * 
     */
    public String onSuccess() {
        return this.onSuccess;
    }

    /**
     * (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
     * 
     */
    @Import(name="params", required=true)
    private Map<String,String> params;

    /**
     * @return (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
     * 
     */
    public Map<String,String> params() {
        return this.params;
    }

    /**
     * (Optional String List) The tags to which the rule applies, if any.
     * 
     */
    @Import(name="tags", required=true)
    private List<String> tags;

    /**
     * @return (Optional String List) The tags to which the rule applies, if any.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * (Optional String) The type of rule, which invokes a specific rule executor, such as Google Common Expression Language (CEL) or JSONata.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return (Optional String) The type of rule, which invokes a specific rule executor, such as Google Common Expression Language (CEL) or JSONata.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetSchemaRulesetMigrationRule() {}

    private GetSchemaRulesetMigrationRule(GetSchemaRulesetMigrationRule $) {
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
    public static Builder builder(GetSchemaRulesetMigrationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSchemaRulesetMigrationRule $;

        public Builder() {
            $ = new GetSchemaRulesetMigrationRule();
        }

        public Builder(GetSchemaRulesetMigrationRule defaults) {
            $ = new GetSchemaRulesetMigrationRule(Objects.requireNonNull(defaults));
        }

        /**
         * @param doc (Optional String) An optional description.
         * 
         * @return builder
         * 
         */
        public Builder doc(String doc) {
            $.doc = doc;
            return this;
        }

        /**
         * @param expr (Optional String) The body of the rule, which is optional.
         * 
         * @return builder
         * 
         */
        public Builder expr(String expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param kind (Optional String) Either `CONDITION` or `TRANSFORM`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param mode (Optional String) The mode of the rule.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param name (Optional String) A user-defined name that can be used to reference the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param onFailure (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type ERROR is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, as mentioned above.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(String onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        /**
         * @param onSuccess (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type NONE is used. For UPDOWN and WRITEREAD rules, one can specify two actions separated by commas, such as “NONE,ERROR” for a WRITEREAD rule. In this case NONE applies to WRITE and ERROR applies to READ.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(String onSuccess) {
            $.onSuccess = onSuccess;
            return this;
        }

        /**
         * @param params (Optional Configuration Block) A set of static parameters for the rule, which is optional. These are key-value pairs that are passed to the rule.
         * 
         * @return builder
         * 
         */
        public Builder params(Map<String,String> params) {
            $.params = params;
            return this;
        }

        /**
         * @param tags (Optional String List) The tags to which the rule applies, if any.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            $.tags = tags;
            return this;
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
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetSchemaRulesetMigrationRule build() {
            if ($.doc == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "doc");
            }
            if ($.expr == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "expr");
            }
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "kind");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "mode");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "name");
            }
            if ($.onFailure == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "onFailure");
            }
            if ($.onSuccess == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "onSuccess");
            }
            if ($.params == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "params");
            }
            if ($.tags == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "tags");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "type");
            }
            return $;
        }
    }

}