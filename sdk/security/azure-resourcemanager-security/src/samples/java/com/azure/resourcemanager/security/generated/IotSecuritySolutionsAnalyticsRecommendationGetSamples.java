// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for IotSecuritySolutionsAnalyticsRecommendation Get.
 */
public final class IotSecuritySolutionsAnalyticsRecommendationGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2019-08-01/examples/IoTSecuritySolutionsAnalytics/GetIoTSecuritySolutionsSecurityRecommendation.json
     */
    /**
     * Sample code: Get the aggregated security analytics recommendation of yours IoT Security solution.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getTheAggregatedSecurityAnalyticsRecommendationOfYoursIoTSecuritySolution(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.iotSecuritySolutionsAnalyticsRecommendations()
            .getWithResponse("IoTEdgeResources", "default", "OpenPortsOnDevice", com.azure.core.util.Context.NONE);
    }
}
