// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object representing the summarization results of each document. */
@Fluent
public class AbstractiveSummarizationResultBase {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<AbstractiveSummaryDocumentResultWithDetectedLanguage> documents;

    /** Creates an instance of AbstractiveSummarizationResultBase class. */
    public AbstractiveSummarizationResultBase() {}

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<AbstractiveSummaryDocumentResultWithDetectedLanguage> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the AbstractiveSummarizationResultBase object itself.
     */
    public AbstractiveSummarizationResultBase setDocuments(
            List<AbstractiveSummaryDocumentResultWithDetectedLanguage> documents) {
        this.documents = documents;
        return this;
    }
}
