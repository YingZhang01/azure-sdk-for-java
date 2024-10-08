// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Edge Device properties.
 */
@Fluent
public class EdgeDeviceProperties implements JsonSerializable<EdgeDeviceProperties> {
    /*
     * Device Configuration
     */
    private DeviceConfiguration deviceConfiguration;

    /*
     * Provisioning state of edgeDevice resource
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of EdgeDeviceProperties class.
     */
    public EdgeDeviceProperties() {
    }

    /**
     * Get the deviceConfiguration property: Device Configuration.
     * 
     * @return the deviceConfiguration value.
     */
    public DeviceConfiguration deviceConfiguration() {
        return this.deviceConfiguration;
    }

    /**
     * Set the deviceConfiguration property: Device Configuration.
     * 
     * @param deviceConfiguration the deviceConfiguration value to set.
     * @return the EdgeDeviceProperties object itself.
     */
    public EdgeDeviceProperties withDeviceConfiguration(DeviceConfiguration deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of edgeDevice resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of edgeDevice resource.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the EdgeDeviceProperties object itself.
     */
    EdgeDeviceProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deviceConfiguration() != null) {
            deviceConfiguration().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("deviceConfiguration", this.deviceConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EdgeDeviceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EdgeDeviceProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the EdgeDeviceProperties.
     */
    public static EdgeDeviceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EdgeDeviceProperties deserializedEdgeDeviceProperties = new EdgeDeviceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deviceConfiguration".equals(fieldName)) {
                    deserializedEdgeDeviceProperties.deviceConfiguration = DeviceConfiguration.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedEdgeDeviceProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEdgeDeviceProperties;
        });
    }
}
