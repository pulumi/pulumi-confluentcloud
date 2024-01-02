// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.confluentcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomConnectorPluginArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomConnectorPluginArgs Empty = new CustomConnectorPluginArgs();

    /**
     * The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
     * 
     */
    @Import(name="connectorClass", required=true)
    private Output<String> connectorClass;

    /**
     * @return The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
     * 
     */
    public Output<String> connectorClass() {
        return this.connectorClass;
    }

    /**
     * The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
     * 
     */
    @Import(name="connectorType", required=true)
    private Output<String> connectorType;

    /**
     * @return The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
     * 
     */
    public Output<String> connectorType() {
        return this.connectorType;
    }

    /**
     * The description of the Custom Connector Plugin.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Custom Connector Plugin.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the Custom Connector Plugin.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The name of the Custom Connector Plugin.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The documentation link of the Custom Connector Plugin.
     * 
     */
    @Import(name="documentationLink")
    private @Nullable Output<String> documentationLink;

    /**
     * @return The documentation link of the Custom Connector Plugin.
     * 
     */
    public Optional<Output<String>> documentationLink() {
        return Optional.ofNullable(this.documentationLink);
    }

    /**
     * The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
     * 
     */
    @Import(name="filename", required=true)
    private Output<String> filename;

    /**
     * @return The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
     * 
     */
    public Output<String> filename() {
        return this.filename;
    }

    /**
     * The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
     * 
     */
    @Import(name="sensitiveConfigProperties")
    private @Nullable Output<List<String>> sensitiveConfigProperties;

    /**
     * @return The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
     * 
     */
    public Optional<Output<List<String>>> sensitiveConfigProperties() {
        return Optional.ofNullable(this.sensitiveConfigProperties);
    }

    private CustomConnectorPluginArgs() {}

    private CustomConnectorPluginArgs(CustomConnectorPluginArgs $) {
        this.connectorClass = $.connectorClass;
        this.connectorType = $.connectorType;
        this.description = $.description;
        this.displayName = $.displayName;
        this.documentationLink = $.documentationLink;
        this.filename = $.filename;
        this.sensitiveConfigProperties = $.sensitiveConfigProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomConnectorPluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomConnectorPluginArgs $;

        public Builder() {
            $ = new CustomConnectorPluginArgs();
        }

        public Builder(CustomConnectorPluginArgs defaults) {
            $ = new CustomConnectorPluginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectorClass The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
         * 
         * @return builder
         * 
         */
        public Builder connectorClass(Output<String> connectorClass) {
            $.connectorClass = connectorClass;
            return this;
        }

        /**
         * @param connectorClass The Java class or alias for the connector. You can get the connector class from the connector documentation provided by the developer.
         * 
         * @return builder
         * 
         */
        public Builder connectorClass(String connectorClass) {
            return connectorClass(Output.of(connectorClass));
        }

        /**
         * @param connectorType The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(Output<String> connectorType) {
            $.connectorType = connectorType;
            return this;
        }

        /**
         * @param connectorType The type of the Custom Connector Plugin. Accepted values are: `SOURCE`, `SINK`.
         * 
         * @return builder
         * 
         */
        public Builder connectorType(String connectorType) {
            return connectorType(Output.of(connectorType));
        }

        /**
         * @param description The description of the Custom Connector Plugin.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Custom Connector Plugin.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The name of the Custom Connector Plugin.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The name of the Custom Connector Plugin.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param documentationLink The documentation link of the Custom Connector Plugin.
         * 
         * @return builder
         * 
         */
        public Builder documentationLink(@Nullable Output<String> documentationLink) {
            $.documentationLink = documentationLink;
            return this;
        }

        /**
         * @param documentationLink The documentation link of the Custom Connector Plugin.
         * 
         * @return builder
         * 
         */
        public Builder documentationLink(String documentationLink) {
            return documentationLink(Output.of(documentationLink));
        }

        /**
         * @param filename The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
         * 
         * @return builder
         * 
         */
        public Builder filename(Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename The path to the Custom Connector Plugin archive to be uploaded. Accepted archive formats are: `.jar`, `.zip`.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        /**
         * @param sensitiveConfigProperties The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveConfigProperties(@Nullable Output<List<String>> sensitiveConfigProperties) {
            $.sensitiveConfigProperties = sensitiveConfigProperties;
            return this;
        }

        /**
         * @param sensitiveConfigProperties The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveConfigProperties(List<String> sensitiveConfigProperties) {
            return sensitiveConfigProperties(Output.of(sensitiveConfigProperties));
        }

        /**
         * @param sensitiveConfigProperties The list of sensitive properties. A sensitive property is a connector configuration property that must be hidden after a user enters the property value when setting up the connector, for example, passwords, keys, and tokens. Refer to the developer documentation and add all required and optional sensitive properties that a user could potentially configure for the connector. Marking a property as sensitive ensures that these fields are handled appropriately within the Confluent infrastructure. This includes masking fields, for example in exception logging, and encrypting field values in the underlying data store. You must identify all sensitive properties. Failure to identify sensitive properties can result in the sensitive property value being stored in plain text rather than in encrypted format. Only add connector-specific sensitive properties. Kafka keys, passwords, and service account information should not be entered here.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveConfigProperties(String... sensitiveConfigProperties) {
            return sensitiveConfigProperties(List.of(sensitiveConfigProperties));
        }

        public CustomConnectorPluginArgs build() {
            if ($.connectorClass == null) {
                throw new MissingRequiredPropertyException("CustomConnectorPluginArgs", "connectorClass");
            }
            if ($.connectorType == null) {
                throw new MissingRequiredPropertyException("CustomConnectorPluginArgs", "connectorType");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("CustomConnectorPluginArgs", "displayName");
            }
            if ($.filename == null) {
                throw new MissingRequiredPropertyException("CustomConnectorPluginArgs", "filename");
            }
            return $;
        }
    }

}
