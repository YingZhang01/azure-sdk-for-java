// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.Context;

/** Samples for Vaults List. */
public final class VaultsListSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2022-04-01/examples/ListBySubscriptionIds.json
     */
    /**
     * Sample code: List of Recovery Services Resources in SubscriptionId.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void listOfRecoveryServicesResourcesInSubscriptionId(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.vaults().list(Context.NONE);
    }
}
