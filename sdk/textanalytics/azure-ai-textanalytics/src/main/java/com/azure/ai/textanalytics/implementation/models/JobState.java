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
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The JobState model.
 */
@Fluent
public class JobState implements JsonSerializable<JobState> {
    /*
     * The displayName property.
     */
    private String displayName;

    /*
     * The createdDateTime property.
     */
    private OffsetDateTime createdDateTime;

    /*
     * The expirationDateTime property.
     */
    private OffsetDateTime expirationDateTime;

    /*
     * The jobId property.
     */
    private String jobId;

    /*
     * The lastUpdatedDateTime property.
     */
    private OffsetDateTime lastUpdatedDateTime;

    /*
     * The status property.
     */
    private State status;

    /*
     * The errors property.
     */
    private List<Error> errors;

    /*
     * The nextLink property.
     */
    private String nextLink;

    /**
     * Creates an instance of JobState class.
     */
    public JobState() {
    }

    /**
     * Get the displayName property: The displayName property.
     * 
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     * 
     * @param displayName the displayName value to set.
     * @return the JobState object itself.
     */
    public JobState setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the createdDateTime property: The createdDateTime property.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The createdDateTime property.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the JobState object itself.
     */
    public JobState setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the expirationDateTime property: The expirationDateTime property.
     * 
     * @return the expirationDateTime value.
     */
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: The expirationDateTime property.
     * 
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the JobState object itself.
     */
    public JobState setExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the jobId property: The jobId property.
     * 
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: The jobId property.
     * 
     * @param jobId the jobId value to set.
     * @return the JobState object itself.
     */
    public JobState setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: The lastUpdatedDateTime property.
     * 
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Set the lastUpdatedDateTime property: The lastUpdatedDateTime property.
     * 
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @return the JobState object itself.
     */
    public JobState setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    public State getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     * 
     * @param status the status value to set.
     * @return the JobState object itself.
     */
    public JobState setStatus(State status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errors property: The errors property.
     * 
     * @return the errors value.
     */
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors property.
     * 
     * @param errors the errors value to set.
     * @return the JobState object itself.
     */
    public JobState setErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     * 
     * @param nextLink the nextLink value to set.
     * @return the JobState object itself.
     */
    public JobState setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeStringField("jobId", this.jobId);
        jsonWriter.writeStringField("lastUpdatedDateTime",
            this.lastUpdatedDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdatedDateTime));
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("expirationDateTime",
            this.expirationDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expirationDateTime));
        jsonWriter.writeArrayField("errors", this.errors, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobState if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JobState.
     */
    public static JobState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobState deserializedJobState = new JobState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdDateTime".equals(fieldName)) {
                    deserializedJobState.createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("jobId".equals(fieldName)) {
                    deserializedJobState.jobId = reader.getString();
                } else if ("lastUpdatedDateTime".equals(fieldName)) {
                    deserializedJobState.lastUpdatedDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("status".equals(fieldName)) {
                    deserializedJobState.status = State.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedJobState.displayName = reader.getString();
                } else if ("expirationDateTime".equals(fieldName)) {
                    deserializedJobState.expirationDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("errors".equals(fieldName)) {
                    List<Error> errors = reader.readArray(reader1 -> Error.fromJson(reader1));
                    deserializedJobState.errors = errors;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedJobState.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobState;
        });
    }
}
