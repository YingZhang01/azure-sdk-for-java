// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.AuthenticationType;
import com.azure.resourcemanager.iothub.models.ImportDevicesRequest;
import com.azure.resourcemanager.iothub.models.ManagedIdentity;
import org.junit.jupiter.api.Assertions;

public final class ImportDevicesRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImportDevicesRequest model =
            BinaryData
                .fromString(
                    "{\"inputBlobContainerUri\":\"ejrjxgciqibrho\",\"outputBlobContainerUri\":\"xsdqrhzoymibmrqy\",\"inputBlobName\":\"ahwfluszdtmhrk\",\"outputBlobName\":\"fyyvoq\",\"authenticationType\":\"identityBased\",\"identity\":{\"userAssignedIdentity\":\"xpbtgiwbwo\"},\"includeConfigurations\":false,\"configurationsBlobName\":\"shrtdtkcnqxwb\"}")
                .toObject(ImportDevicesRequest.class);
        Assertions.assertEquals("ejrjxgciqibrho", model.inputBlobContainerUri());
        Assertions.assertEquals("xsdqrhzoymibmrqy", model.outputBlobContainerUri());
        Assertions.assertEquals("ahwfluszdtmhrk", model.inputBlobName());
        Assertions.assertEquals("fyyvoq", model.outputBlobName());
        Assertions.assertEquals(AuthenticationType.IDENTITY_BASED, model.authenticationType());
        Assertions.assertEquals("xpbtgiwbwo", model.identity().userAssignedIdentity());
        Assertions.assertEquals(false, model.includeConfigurations());
        Assertions.assertEquals("shrtdtkcnqxwb", model.configurationsBlobName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImportDevicesRequest model =
            new ImportDevicesRequest()
                .withInputBlobContainerUri("ejrjxgciqibrho")
                .withOutputBlobContainerUri("xsdqrhzoymibmrqy")
                .withInputBlobName("ahwfluszdtmhrk")
                .withOutputBlobName("fyyvoq")
                .withAuthenticationType(AuthenticationType.IDENTITY_BASED)
                .withIdentity(new ManagedIdentity().withUserAssignedIdentity("xpbtgiwbwo"))
                .withIncludeConfigurations(false)
                .withConfigurationsBlobName("shrtdtkcnqxwb");
        model = BinaryData.fromObject(model).toObject(ImportDevicesRequest.class);
        Assertions.assertEquals("ejrjxgciqibrho", model.inputBlobContainerUri());
        Assertions.assertEquals("xsdqrhzoymibmrqy", model.outputBlobContainerUri());
        Assertions.assertEquals("ahwfluszdtmhrk", model.inputBlobName());
        Assertions.assertEquals("fyyvoq", model.outputBlobName());
        Assertions.assertEquals(AuthenticationType.IDENTITY_BASED, model.authenticationType());
        Assertions.assertEquals("xpbtgiwbwo", model.identity().userAssignedIdentity());
        Assertions.assertEquals(false, model.includeConfigurations());
        Assertions.assertEquals("shrtdtkcnqxwb", model.configurationsBlobName());
    }
}
