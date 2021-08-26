// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.TemplateName;

/** Samples for EmailTemplate Delete. */
public final class EmailTemplateDeleteSamples {
    /*
     * operationId: EmailTemplate_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteTemplate
     */
    /**
     * Sample code: ApiManagementDeleteTemplate.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteTemplate(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .emailTemplates()
            .deleteWithResponse("rg1", "apimService1", TemplateName.NEW_ISSUE_NOTIFICATION_MESSAGE, "*", Context.NONE);
    }
}
