// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.resourcemanager.compute.models.SshEncryptionTypes;
import com.azure.resourcemanager.compute.models.SshGenerateKeyPairInputParameters;

/**
 * Samples for SshPublicKeys GenerateKeyPair.
 */
public final class SshPublicKeysGenerateKeyPairSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * sshPublicKeyExamples/SshPublicKey_GenerateKeyPair_EncryptionWithRSA.json
     */
    /**
     * Sample code: Generate an SSH key pair with RSA encryption.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void generateAnSSHKeyPairWithRSAEncryption(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSshPublicKeys()
            .generateKeyPairWithResponse("myResourceGroup", "mySshPublicKeyName",
                new SshGenerateKeyPairInputParameters().withEncryptionType(SshEncryptionTypes.RSA),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * sshPublicKeyExamples/SshPublicKey_GenerateKeyPair.json
     */
    /**
     * Sample code: Generate an SSH key pair.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void generateAnSSHKeyPair(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSshPublicKeys()
            .generateKeyPairWithResponse("myResourceGroup", "mySshPublicKeyName", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2024-07-01/examples/
     * sshPublicKeyExamples/SshPublicKey_GenerateKeyPair_EncryptionWithEd25519.json
     */
    /**
     * Sample code: Generate an SSH key pair with Ed25519 encryption.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void generateAnSSHKeyPairWithEd25519Encryption(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getSshPublicKeys()
            .generateKeyPairWithResponse("myResourceGroup", "mySshPublicKeyName",
                new SshGenerateKeyPairInputParameters().withEncryptionType(SshEncryptionTypes.ED25519),
                com.azure.core.util.Context.NONE);
    }
}
