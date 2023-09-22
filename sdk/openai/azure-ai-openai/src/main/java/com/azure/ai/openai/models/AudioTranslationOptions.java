// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration information for an audio translation request. */
@Fluent
public final class AudioTranslationOptions {

    /*
     * The audio data to translate. This must be the binary content of a file in one of the supported media formats:
     * flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, webm.
     */
    @Generated
    @JsonProperty(value = "file")
    private byte[] file;

    /*
     * The requested format of the translation response data, which will influence the content and detail of the
     * result.
     */
    @Generated
    @JsonProperty(value = "response_format")
    private AudioTranslationFormat responseFormat;

    /*
     * An optional hint to guide the model's style or continue from a prior audio segment. The written language of the
     * prompt should match the primary spoken language of the audio data.
     */
    @Generated
    @JsonProperty(value = "prompt")
    private String prompt;

    /*
     * The sampling temperature, between 0 and 1.
     * Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused
     * and deterministic.
     * If set to 0, the model will use log probability to automatically increase the temperature until certain
     * thresholds are hit.
     */
    @Generated
    @JsonProperty(value = "temperature")
    private Double temperature;

    /*
     * The model to use for this translation request.
     */
    @Generated
    @JsonProperty(value = "model")
    private String model;

    /**
     * Creates an instance of AudioTranslationOptions class.
     *
     * @param file the file value to set.
     */
    @Generated
    @JsonCreator
    public AudioTranslationOptions(@JsonProperty(value = "file") byte[] file) {
        this.file = file;
    }

    /**
     * Get the file property: The audio data to translate. This must be the binary content of a file in one of the
     * supported media formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, webm.
     *
     * @return the file value.
     */
    @Generated
    public byte[] getFile() {
        return CoreUtils.clone(this.file);
    }

    /**
     * Get the responseFormat property: The requested format of the translation response data, which will influence the
     * content and detail of the result.
     *
     * @return the responseFormat value.
     */
    @Generated
    public AudioTranslationFormat getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * Get the prompt property: An optional hint to guide the model's style or continue from a prior audio segment. The
     * written language of the prompt should match the primary spoken language of the audio data.
     *
     * @return the prompt value.
     */
    @Generated
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * Set the prompt property: An optional hint to guide the model's style or continue from a prior audio segment. The
     * written language of the prompt should match the primary spoken language of the audio data.
     *
     * @param prompt the prompt value to set.
     * @return the AudioTranslationOptions object itself.
     */
    @Generated
    public AudioTranslationOptions setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * Get the temperature property: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the
     * output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the
     * model will use log probability to automatically increase the temperature until certain thresholds are hit.
     *
     * @return the temperature value.
     */
    @Generated
    public Double getTemperature() {
        return this.temperature;
    }

    /**
     * Set the temperature property: The sampling temperature, between 0 and 1. Higher values like 0.8 will make the
     * output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the
     * model will use log probability to automatically increase the temperature until certain thresholds are hit.
     *
     * @param temperature the temperature value to set.
     * @return the AudioTranslationOptions object itself.
     */
    @Generated
    public AudioTranslationOptions setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Get the model property: The model to use for this translation request.
     *
     * @return the model value.
     */
    @Generated
    public String getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model to use for this translation request.
     *
     * @param model the model value to set.
     * @return the AudioTranslationOptions object itself.
     */
    @Generated
    public AudioTranslationOptions setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * Set the responseFormat property: The requested format of the translation response data, which will influence the
     * content and detail of the result.
     *
     * @param responseFormat the responseFormat value to set.
     * @return the AudioTranslationOptions object itself.
     */
    @Generated
    public AudioTranslationOptions setResponseFormat(AudioTranslationFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }
}
