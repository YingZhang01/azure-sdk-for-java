// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for Compliances List.
 */
public final class CompliancesListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2017-08-01-preview/examples/Compliances/GetCompliances_example.json
     */
    /**
     * Sample code: Get security compliance data over time.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityComplianceDataOverTime(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.compliances()
            .list("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", com.azure.core.util.Context.NONE);
    }
}
