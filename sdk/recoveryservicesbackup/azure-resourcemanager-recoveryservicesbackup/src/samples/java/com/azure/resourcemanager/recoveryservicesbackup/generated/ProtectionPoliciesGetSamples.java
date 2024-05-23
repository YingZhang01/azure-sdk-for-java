// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/**
 * Samples for ProtectionPolicies Get.
 */
public final class ProtectionPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-04-01/examples/AzureIaasVm/ProtectionPolicies_Get.json
     */
    /**
     * Sample code: Get Azure IaasVm Protection Policy Details.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getAzureIaasVmProtectionPolicyDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.protectionPolicies()
            .getWithResponse("NetSDKTestRsVault", "SwaggerTestRg", "testPolicy1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-04-01/examples/AzureIaasVm/V2Policy/v2-Get-Policy.json
     */
    /**
     * Sample code: Get Azure IaasVm Enhanced Protection Policy Details.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getAzureIaasVmEnhancedProtectionPolicyDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.protectionPolicies()
            .getWithResponse("NetSDKTestRsVault", "SwaggerTestRg", "v2-daily-sample", com.azure.core.util.Context.NONE);
    }
}
