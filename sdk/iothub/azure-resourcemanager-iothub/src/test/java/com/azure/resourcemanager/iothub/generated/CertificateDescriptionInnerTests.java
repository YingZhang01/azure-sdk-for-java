// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.fluent.models.CertificateDescriptionInner;
import com.azure.resourcemanager.iothub.models.CertificateProperties;
import org.junit.jupiter.api.Assertions;

public final class CertificateDescriptionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateDescriptionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"subject\":\"hqmibzyhwit\",\"expiry\":\"Tue, 19 Jan 2021 20:22:32"
                        + " GMT\",\"thumbprint\":\"yynpcdpumnzgmwz\",\"isVerified\":false,\"created\":\"Tue, 29 Dec"
                        + " 2020 02:38:39 GMT\",\"updated\":\"Sat, 13 Nov 2021 04:07:40"
                        + " GMT\",\"certificate\":\"orgjhxbldt\"},\"etag\":\"wrlkdmtn\",\"id\":\"vokotllxdyh\",\"name\":\"syocogjltdtbnnha\",\"type\":\"oocrkvcikhnv\"}")
                .toObject(CertificateDescriptionInner.class);
        Assertions.assertEquals(false, model.properties().isVerified());
        Assertions.assertEquals("orgjhxbldt", model.properties().certificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateDescriptionInner model =
            new CertificateDescriptionInner()
                .withProperties(new CertificateProperties().withIsVerified(false).withCertificate("orgjhxbldt"));
        model = BinaryData.fromObject(model).toObject(CertificateDescriptionInner.class);
        Assertions.assertEquals(false, model.properties().isVerified());
        Assertions.assertEquals("orgjhxbldt", model.properties().certificate());
    }
}
