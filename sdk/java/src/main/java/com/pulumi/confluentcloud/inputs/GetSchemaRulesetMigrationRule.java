// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaRulesetMigrationRule extends com.pulumi.resources.InvokeArgs {

    public static final GetSchemaRulesetMigrationRule Empty = new GetSchemaRulesetMigrationRule();

    /**
     * (Optional Boolean) The boolean flag to control whether the rule should be disabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Boolean disabled;

    /**
     * @return (Optional Boolean) The boolean flag to control whether the rule should be disabled.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * (Optional String) An optional description of the rule.
     * 
     */
    @Import(name="doc")
    private @Nullable String doc;

    /**
     * @return (Optional String) An optional description of the rule.
     * 
     */
    public Optional<String> doc() {
        return Optional.ofNullable(this.doc);
    }

    /**
     * (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    @Import(name="expr")
    private @Nullable String expr;

    /**
     * @return (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    public Optional<String> expr() {
        return Optional.ofNullable(this.expr);
    }

    /**
     * (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    @Import(name="mode", required=true)
    private String mode;

    /**
     * @return (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    public String mode() {
        return this.mode;
    }

    /**
     * (Required String) A user-defined name that can be used to reference the rule.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return (Required String) A user-defined name that can be used to reference the rule.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    @Import(name="onFailure")
    private @Nullable String onFailure;

    /**
     * @return (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    public Optional<String> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    /**
     * (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
     * 
     */
    @Import(name="onSuccess")
    private @Nullable String onSuccess;

    /**
     * @return (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
     * 
     */
    public Optional<String> onSuccess() {
        return Optional.ofNullable(this.onSuccess);
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
     * (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetSchemaRulesetMigrationRule() {}

    private GetSchemaRulesetMigrationRule(GetSchemaRulesetMigrationRule $) {
        this.disabled = $.disabled;
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
         * @param disabled (Optional Boolean) The boolean flag to control whether the rule should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Boolean disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param doc (Optional String) An optional description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder doc(@Nullable String doc) {
            $.doc = doc;
            return this;
        }

        /**
         * @param expr (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expr(@Nullable String expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param kind (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param mode (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param name (Required String) A user-defined name that can be used to reference the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param onFailure (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(@Nullable String onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        /**
         * @param onSuccess (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(@Nullable String onSuccess) {
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
         * @param type (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetSchemaRulesetMigrationRule build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "kind");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "mode");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetMigrationRule", "name");
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
