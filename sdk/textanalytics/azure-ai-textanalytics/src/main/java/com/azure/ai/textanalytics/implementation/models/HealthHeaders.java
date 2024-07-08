// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/** The HealthHeaders model. */
@Fluent
public final class HealthHeaders implements JsonSerializable<HealthHeaders> {
    /*
     * The Operation-Location property.
     */
    private String operationLocation;

    /**
     * Get the operationLocation property: The Operation-Location property.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the HealthHeaders object itself.
     */
    public HealthHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("Operation-Location", this.operationLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthHeaders from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthHeaders if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HealthHeaders.
     */
    public static HealthHeaders fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HealthHeaders deserializedHealthHeaders = new HealthHeaders();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("Operation-Location".equals(fieldName)) {
                    deserializedHealthHeaders.operationLocation = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedHealthHeaders;
        });
    }
}
