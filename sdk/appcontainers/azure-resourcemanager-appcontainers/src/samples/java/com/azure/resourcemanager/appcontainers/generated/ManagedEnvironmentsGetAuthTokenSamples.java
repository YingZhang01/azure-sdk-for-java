// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ManagedEnvironments GetAuthToken.
 */
public final class ManagedEnvironmentsGetAuthTokenSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/stable/2024-03-01/examples/ManagedEnvironments_GetAuthToken.json
     */
    /**
     * Sample code: Get Managed Environment Auth Token.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        getManagedEnvironmentAuthToken(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironments().getAuthTokenWithResponse("rg", "testenv", com.azure.core.util.Context.NONE);
    }
}
