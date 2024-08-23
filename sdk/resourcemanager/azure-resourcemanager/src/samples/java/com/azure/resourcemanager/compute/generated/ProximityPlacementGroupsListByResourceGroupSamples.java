// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for ProximityPlacementGroups ListByResourceGroup.
 */
public final class ProximityPlacementGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * proximityPlacementGroupExamples/ProximityPlacementGroup_ListByResourceGroup.json
     */
    /**
     * Sample code: List proximity placement group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listProximityPlacementGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getProximityPlacementGroups()
            .listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
