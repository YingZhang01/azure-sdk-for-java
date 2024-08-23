// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for RestorePointCollections GetByResourceGroup.
 */
public final class RestorePointCollectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * restorePointExamples/RestorePointCollection_Get_WithContainedRestorePoints.json
     */
    /**
     * Sample code: Get a restore point collection, including the restore points contained in the restore point
     * collection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getARestorePointCollectionIncludingTheRestorePointsContainedInTheRestorePointCollection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getRestorePointCollections()
            .getByResourceGroupWithResponse("myResourceGroup", "rpcName", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * restorePointExamples/RestorePointCollection_Get.json
     */
    /**
     * Sample code: Get a restore point collection (but not the restore points contained in the restore point
     * collection).
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getARestorePointCollectionButNotTheRestorePointsContainedInTheRestorePointCollection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getRestorePointCollections()
            .getByResourceGroupWithResponse("myResourceGroup", "myRpc", null, com.azure.core.util.Context.NONE);
    }
}
