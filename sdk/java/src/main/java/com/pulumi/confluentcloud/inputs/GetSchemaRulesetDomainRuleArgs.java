// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchemaRulesetDomainRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSchemaRulesetDomainRuleArgs Empty = new GetSchemaRulesetDomainRuleArgs();

    /**
     * (Optional Boolean) The boolean flag to control whether the rule should be disabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return (Optional Boolean) The boolean flag to control whether the rule should be disabled.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * (Optional String) An optional description of the rule.
     * 
     */
    @Import(name="doc")
    private @Nullable Output<String> doc;

    /**
     * @return (Optional String) An optional description of the rule.
     * 
     */
    public Optional<Output<String>> doc() {
        return Optional.ofNullable(this.doc);
    }

    /**
     * (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    @Import(name="expr")
    private @Nullable Output<String> expr;

    /**
     * @return (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    public Optional<Output<String>> expr() {
        return Optional.ofNullable(this.expr);
    }

    /**
     * (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * (Required String) A user-defined name that can be used to reference the rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return (Required String) A user-defined name that can be used to reference the rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    @Import(name="onFailure")
    private @Nullable Output<String> onFailure;

    /**
     * @return (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
     * 
     */
    public Optional<Output<String>> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    /**
     * (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
     * 
     */
    @Import(name="onSuccess")
    private @Nullable Output<String> onSuccess;

    /**
     * @return (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
     * 
     */
    public Optional<Output<String>> onSuccess() {
        return Optional.ofNullable(this.onSuccess);
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
     * (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GetSchemaRulesetDomainRuleArgs() {}

    private GetSchemaRulesetDomainRuleArgs(GetSchemaRulesetDomainRuleArgs $) {
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
         * @param disabled (Optional Boolean) The boolean flag to control whether the rule should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled (Optional Boolean) The boolean flag to control whether the rule should be disabled.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param doc (Optional String) An optional description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder doc(@Nullable Output<String> doc) {
            $.doc = doc;
            return this;
        }

        /**
         * @param doc (Optional String) An optional description of the rule.
         * 
         * @return builder
         * 
         */
        public Builder doc(String doc) {
            return doc(Output.of(doc));
        }

        /**
         * @param expr (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expr(@Nullable Output<String> expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param expr (Optional String) The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expr(String expr) {
            return expr(Output.of(expr));
        }

        /**
         * @param kind (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind (Required String) The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param mode (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode (Required String) The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name (Required String) A user-defined name that can be used to reference the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Required String) A user-defined name that can be used to reference the rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onFailure (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(@Nullable Output<String> onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        /**
         * @param onFailure (Optional String) An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(String onFailure) {
            return onFailure(Output.of(onFailure));
        }

        /**
         * @param onSuccess (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(@Nullable Output<String> onSuccess) {
            $.onSuccess = onSuccess;
            return this;
        }

        /**
         * @param onSuccess (Optional String) An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`.
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
         * @param type (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Required String) The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetSchemaRulesetDomainRuleArgs build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "kind");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "mode");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetSchemaRulesetDomainRuleArgs", "name");
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
