// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.ai.textanalytics.models.HealthcareEntityRelationType;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Every relation is an entity graph of a certain relationType, where all entities are connected and have specific roles
 * within the relation context.
 */
@Fluent
public final class HealthcareRelation implements JsonSerializable<HealthcareRelation> {
    /*
     * Type of relation. Examples include: `DosageOfMedication` or 'FrequencyOfMedication', etc.
     */
    private HealthcareEntityRelationType relationType;

    /*
     * Confidence score between 0 and 1 of the extracted relation.
     */
    private Double confidenceScore;

    /*
     * The entities in the relation.
     */
    private List<HealthcareRelationEntity> entities;

    /**
     * Creates an instance of HealthcareRelation class.
     */
    public HealthcareRelation() {
    }

    /**
     * Get the relationType property: Type of relation. Examples include: `DosageOfMedication` or
     * 'FrequencyOfMedication', etc.
     * 
     * @return the relationType value.
     */
    public HealthcareEntityRelationType getRelationType() {
        return this.relationType;
    }

    /**
     * Set the relationType property: Type of relation. Examples include: `DosageOfMedication` or
     * 'FrequencyOfMedication', etc.
     * 
     * @param relationType the relationType value to set.
     * @return the HealthcareRelation object itself.
     */
    public HealthcareRelation setRelationType(HealthcareEntityRelationType relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * Get the confidenceScore property: Confidence score between 0 and 1 of the extracted relation.
     * 
     * @return the confidenceScore value.
     */
    public Double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Set the confidenceScore property: Confidence score between 0 and 1 of the extracted relation.
     * 
     * @param confidenceScore the confidenceScore value to set.
     * @return the HealthcareRelation object itself.
     */
    public HealthcareRelation setConfidenceScore(Double confidenceScore) {
        this.confidenceScore = confidenceScore;
        return this;
    }

    /**
     * Get the entities property: The entities in the relation.
     * 
     * @return the entities value.
     */
    public List<HealthcareRelationEntity> getEntities() {
        return this.entities;
    }

    /**
     * Set the entities property: The entities in the relation.
     * 
     * @param entities the entities value to set.
     * @return the HealthcareRelation object itself.
     */
    public HealthcareRelation setEntities(List<HealthcareRelationEntity> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("relationType", this.relationType == null ? null : this.relationType.toString());
        jsonWriter.writeArrayField("entities", this.entities, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("confidenceScore", this.confidenceScore);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HealthcareRelation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HealthcareRelation if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the HealthcareRelation.
     */
    public static HealthcareRelation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HealthcareRelation deserializedHealthcareRelation = new HealthcareRelation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("relationType".equals(fieldName)) {
                    deserializedHealthcareRelation.relationType
                        = HealthcareEntityRelationType.fromString(reader.getString());
                } else if ("entities".equals(fieldName)) {
                    List<HealthcareRelationEntity> entities
                        = reader.readArray(reader1 -> HealthcareRelationEntity.fromJson(reader1));
                    deserializedHealthcareRelation.entities = entities;
                } else if ("confidenceScore".equals(fieldName)) {
                    deserializedHealthcareRelation.confidenceScore = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHealthcareRelation;
        });
    }
}
