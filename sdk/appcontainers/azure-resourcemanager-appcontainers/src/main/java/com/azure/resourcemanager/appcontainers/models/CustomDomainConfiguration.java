// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Configuration properties for apps environment custom domain.
 */
@Fluent
public final class CustomDomainConfiguration implements JsonSerializable<CustomDomainConfiguration> {
    /*
     * Id used to verify domain name ownership
     */
    private String customDomainVerificationId;

    /*
     * Dns suffix for the environment domain
     */
    private String dnsSuffix;

    /*
     * PFX or PEM blob
     */
    private byte[] certificateValue;

    /*
     * Certificate password
     */
    private String certificatePassword;

    /*
     * Certificate expiration date.
     */
    private OffsetDateTime expirationDate;

    /*
     * Certificate thumbprint.
     */
    private String thumbprint;

    /*
     * Subject name of the certificate.
     */
    private String subjectName;

    /**
     * Creates an instance of CustomDomainConfiguration class.
     */
    public CustomDomainConfiguration() {
    }

    /**
     * Get the customDomainVerificationId property: Id used to verify domain name ownership.
     * 
     * @return the customDomainVerificationId value.
     */
    public String customDomainVerificationId() {
        return this.customDomainVerificationId;
    }

    /**
     * Get the dnsSuffix property: Dns suffix for the environment domain.
     * 
     * @return the dnsSuffix value.
     */
    public String dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Set the dnsSuffix property: Dns suffix for the environment domain.
     * 
     * @param dnsSuffix the dnsSuffix value to set.
     * @return the CustomDomainConfiguration object itself.
     */
    public CustomDomainConfiguration withDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    /**
     * Get the certificateValue property: PFX or PEM blob.
     * 
     * @return the certificateValue value.
     */
    public byte[] certificateValue() {
        return CoreUtils.clone(this.certificateValue);
    }

    /**
     * Set the certificateValue property: PFX or PEM blob.
     * 
     * @param certificateValue the certificateValue value to set.
     * @return the CustomDomainConfiguration object itself.
     */
    public CustomDomainConfiguration withCertificateValue(byte[] certificateValue) {
        this.certificateValue = CoreUtils.clone(certificateValue);
        return this;
    }

    /**
     * Get the certificatePassword property: Certificate password.
     * 
     * @return the certificatePassword value.
     */
    public String certificatePassword() {
        return this.certificatePassword;
    }

    /**
     * Set the certificatePassword property: Certificate password.
     * 
     * @param certificatePassword the certificatePassword value to set.
     * @return the CustomDomainConfiguration object itself.
     */
    public CustomDomainConfiguration withCertificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
        return this;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     * 
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the subjectName property: Subject name of the certificate.
     * 
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.subjectName;
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
        jsonWriter.writeStringField("dnsSuffix", this.dnsSuffix);
        jsonWriter.writeBinaryField("certificateValue", this.certificateValue);
        jsonWriter.writeStringField("certificatePassword", this.certificatePassword);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomainConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomainConfiguration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomDomainConfiguration.
     */
    public static CustomDomainConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomainConfiguration deserializedCustomDomainConfiguration = new CustomDomainConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("customDomainVerificationId".equals(fieldName)) {
                    deserializedCustomDomainConfiguration.customDomainVerificationId = reader.getString();
                } else if ("dnsSuffix".equals(fieldName)) {
                    deserializedCustomDomainConfiguration.dnsSuffix = reader.getString();
                } else if ("certificateValue".equals(fieldName)) {
                    deserializedCustomDomainConfiguration.certificateValue = reader.getBinary();
                } else if ("certificatePassword".equals(fieldName)) {
                    deserializedCustomDomainConfiguration.certificatePassword = reader.getString();
                } else if ("expirationDate".equals(fieldName)) {
                    deserializedCustomDomainConfiguration.expirationDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("thumbprint".equals(fieldName)) {
                    deserializedCustomDomainConfiguration.thumbprint = reader.getString();
                } else if ("subjectName".equals(fieldName)) {
                    deserializedCustomDomainConfiguration.subjectName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomainConfiguration;
        });
    }
}
