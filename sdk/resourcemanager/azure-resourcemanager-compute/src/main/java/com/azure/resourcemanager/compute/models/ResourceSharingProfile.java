// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ResourceSharingProfile model.
 */
@Fluent
public final class ResourceSharingProfile implements JsonSerializable<ResourceSharingProfile> {
    /*
     * Specifies an array of subscription resource IDs that capacity reservation group is shared with. **Note:** Minimum
     * api-version: 2023-09-01. Please refer to https://aka.ms/computereservationsharing for more details.
     */
    private List<SubResource> subscriptionIds;

    /**
     * Creates an instance of ResourceSharingProfile class.
     */
    public ResourceSharingProfile() {
    }

    /**
     * Get the subscriptionIds property: Specifies an array of subscription resource IDs that capacity reservation group
     * is shared with. **Note:** Minimum api-version: 2023-09-01. Please refer to
     * https://aka.ms/computereservationsharing for more details.
     * 
     * @return the subscriptionIds value.
     */
    public List<SubResource> subscriptionIds() {
        return this.subscriptionIds;
    }

    /**
     * Set the subscriptionIds property: Specifies an array of subscription resource IDs that capacity reservation group
     * is shared with. **Note:** Minimum api-version: 2023-09-01. Please refer to
     * https://aka.ms/computereservationsharing for more details.
     * 
     * @param subscriptionIds the subscriptionIds value to set.
     * @return the ResourceSharingProfile object itself.
     */
    public ResourceSharingProfile withSubscriptionIds(List<SubResource> subscriptionIds) {
        this.subscriptionIds = subscriptionIds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("subscriptionIds", this.subscriptionIds,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceSharingProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSharingProfile if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceSharingProfile.
     */
    public static ResourceSharingProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSharingProfile deserializedResourceSharingProfile = new ResourceSharingProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subscriptionIds".equals(fieldName)) {
                    List<SubResource> subscriptionIds = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedResourceSharingProfile.subscriptionIds = subscriptionIds;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSharingProfile;
        });
    }
}
