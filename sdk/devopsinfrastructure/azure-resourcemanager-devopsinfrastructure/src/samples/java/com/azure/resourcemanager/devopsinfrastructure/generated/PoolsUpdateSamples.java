// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.resourcemanager.devopsinfrastructure.models.Pool;

/**
 * Samples for Pools Update.
 */
public final class PoolsUpdateSamples {
    /*
     * x-ms-original-file: 2024-04-04-preview/UpdatePool.json
     */
    /**
     * Sample code: Pools_Update.
     * 
     * @param manager Entry point to DevOpsInfrastructureManager.
     */
    public static void poolsUpdate(com.azure.resourcemanager.devopsinfrastructure.DevOpsInfrastructureManager manager) {
        Pool resource
            = manager.pools().getByResourceGroupWithResponse("rg", "pool", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
