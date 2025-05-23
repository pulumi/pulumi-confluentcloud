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


public final class SchemaRulesetMigrationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaRulesetMigrationRuleArgs Empty = new SchemaRulesetMigrationRuleArgs();

    /**
     * The boolean flag to control whether the rule should be disabled. Defaults to `false`.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return The boolean flag to control whether the rule should be disabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * An optional description of the rule. Defaults to &#34;&#34;.
     * 
     */
    @Import(name="doc")
    private @Nullable Output<String> doc;

    /**
     * @return An optional description of the rule. Defaults to &#34;&#34;.
     * 
     */
    public Optional<Output<String>> doc() {
        return Optional.ofNullable(this.doc);
    }

    /**
     * The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    @Import(name="expr")
    private @Nullable Output<String> expr;

    /**
     * @return The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
     * 
     */
    public Optional<Output<String>> expr() {
        return Optional.ofNullable(this.expr);
    }

    /**
     * The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
     * 
     */
    @Import(name="onFailure")
    private @Nullable Output<String> onFailure;

    /**
     * @return An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
     * 
     */
    public Optional<Output<String>> onFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    /**
     * An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
     * 
     */
    @Import(name="onSuccess")
    private @Nullable Output<String> onSuccess;

    /**
     * @return An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
     * 
     */
    public Optional<Output<String>> onSuccess() {
        return Optional.ofNullable(this.onSuccess);
    }

    @Import(name="params")
    private @Nullable Output<Map<String,String>> params;

    public Optional<Output<Map<String,String>>> params() {
        return Optional.ofNullable(this.params);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SchemaRulesetMigrationRuleArgs() {}

    private SchemaRulesetMigrationRuleArgs(SchemaRulesetMigrationRuleArgs $) {
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
    public static Builder builder(SchemaRulesetMigrationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaRulesetMigrationRuleArgs $;

        public Builder() {
            $ = new SchemaRulesetMigrationRuleArgs();
        }

        public Builder(SchemaRulesetMigrationRuleArgs defaults) {
            $ = new SchemaRulesetMigrationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled The boolean flag to control whether the rule should be disabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled The boolean flag to control whether the rule should be disabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param doc An optional description of the rule. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder doc(@Nullable Output<String> doc) {
            $.doc = doc;
            return this;
        }

        /**
         * @param doc An optional description of the rule. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder doc(String doc) {
            return doc(Output.of(doc));
        }

        /**
         * @param expr The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expr(@Nullable Output<String> expr) {
            $.expr = expr;
            return this;
        }

        /**
         * @param expr The rule body. Data quality and transformation rules use `CEL` language expressions, data migration rules use `JSONata` expressions. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expr(String expr) {
            return expr(Output.of(expr));
        }

        /**
         * @param kind The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the rule. Accepted values are `CONDITION` and `TRANSFORM`. `CONDITION` - validate the value of a field, `TRANSFORM` - transform the value of a field. Data quality rules use `CONDITION` kind, data transformation, encryption and migration rules use `TRANSFORM` kind.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param mode The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode of the rule. Accepted values are `UPGRADE`, `DOWNGRADE`, `UPDOWN`, `WRITE`, `READ`, and `WRITEREAD`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onFailure An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(@Nullable Output<String> onFailure) {
            $.onFailure = onFailure;
            return this;
        }

        /**
         * @param onFailure An optional action to execute if the rule fails, otherwise the built-in action type `ERROR` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, as mentioned above. Defaults to `ERROR,ERROR`.
         * 
         * @return builder
         * 
         */
        public Builder onFailure(String onFailure) {
            return onFailure(Output.of(onFailure));
        }

        /**
         * @param onSuccess An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(@Nullable Output<String> onSuccess) {
            $.onSuccess = onSuccess;
            return this;
        }

        /**
         * @param onSuccess An optional action to execute if the rule succeeds, otherwise the built-in action type `NONE` is used. For `UPDOWN` and `WRITEREAD` rules, one can specify two actions separated by commas, such as `NONE,ERROR` for a `WRITEREAD` rule. In this case `NONE` applies to `WRITE` and `ERROR` applies to `READ`. Defaults to `NONE,NONE`.
         * 
         * @return builder
         * 
         */
        public Builder onSuccess(String onSuccess) {
            return onSuccess(Output.of(onSuccess));
        }

        public Builder params(@Nullable Output<Map<String,String>> params) {
            $.params = params;
            return this;
        }

        public Builder params(Map<String,String> params) {
            return params(Output.of(params));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of rule, which invokes a specific rule executor that that will run the rule. Google Common Expression Language (`CEL`) is used for data quality and transformation rules, Confluent `ENCRYPT` is used for data encryption rules, and `JSONata` is used for migration rules.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SchemaRulesetMigrationRuleArgs build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("SchemaRulesetMigrationRuleArgs", "kind");
            }
            if ($.mode == null) {
                throw new MissingRequiredPropertyException("SchemaRulesetMigrationRuleArgs", "mode");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("SchemaRulesetMigrationRuleArgs", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("SchemaRulesetMigrationRuleArgs", "type");
            }
            return $;
        }
    }

}
