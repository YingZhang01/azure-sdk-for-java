// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AnalyzeTextJobStatistics model.
 */
@Fluent
public class AnalyzeTextJobStatistics implements JsonSerializable<AnalyzeTextJobStatistics> {
    /*
     * if showStats=true was specified in the request this field will contain information about the request payload.
     */
    private RequestStatistics statistics;

    /**
     * Creates an instance of AnalyzeTextJobStatistics class.
     */
    public AnalyzeTextJobStatistics() {
    }

    /**
     * Get the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     * 
     * @return the statistics value.
     */
    public RequestStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     * 
     * @param statistics the statistics value to set.
     * @return the AnalyzeTextJobStatistics object itself.
     */
    public AnalyzeTextJobStatistics setStatistics(RequestStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("statistics", this.statistics);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalyzeTextJobStatistics from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalyzeTextJobStatistics if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AnalyzeTextJobStatistics.
     */
    public static AnalyzeTextJobStatistics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnalyzeTextJobStatistics deserializedAnalyzeTextJobStatistics = new AnalyzeTextJobStatistics();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("statistics".equals(fieldName)) {
                    deserializedAnalyzeTextJobStatistics.statistics = RequestStatistics.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnalyzeTextJobStatistics;
        });
    }
}
