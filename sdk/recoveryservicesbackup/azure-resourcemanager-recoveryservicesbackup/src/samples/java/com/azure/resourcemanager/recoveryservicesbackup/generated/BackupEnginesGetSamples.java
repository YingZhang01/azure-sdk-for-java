// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

/**
 * Samples for BackupEngines Get.
 */
public final class BackupEnginesGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-04-01/examples/Dpm/BackupEngines_Get.json
     */
    /**
     * Sample code: Get Dpm/AzureBackupServer/Lajolla Backup Engine Details.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getDpmAzureBackupServerLajollaBackupEngineDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupEngines()
            .getWithResponse("testVault", "testRG", "testServer", null, null, com.azure.core.util.Context.NONE);
    }
}
