// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ApiIssueComment Get. */
public final class ApiIssueCommentGetSamples {
    /*
     * operationId: ApiIssueComment_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetApiIssueComment
     */
    /**
     * Sample code: ApiManagementGetApiIssueComment.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetApiIssueComment(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiIssueComments()
            .getWithResponse(
                "rg1",
                "apimService1",
                "57d2ef278aa04f0888cba3f3",
                "57d2ef278aa04f0ad01d6cdc",
                "599e29ab193c3c0bd0b3e2fb",
                Context.NONE);
    }
}
