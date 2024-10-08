// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class IntegrationRuntimesListByFactoryMockTests {
    @Test
    public void testListByFactory() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"sumzfvrakpqlltoi\",\"\":{\"bsbhaqsu\":\"dataeoibehrholjjxi\",\"euj\":\"datawdcgdkwwulj\",\"nhmnswlf\":\"datasxrsxbofmvau\"}},\"name\":\"kildl\",\"type\":\"tviwvej\",\"etag\":\"zk\",\"id\":\"dpssklm\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<IntegrationRuntimeResource> response
            = manager.integrationRuntimes().listByFactory("yabglsarfmjsch", "xudrom", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dpssklm", response.iterator().next().id());
        Assertions.assertEquals("sumzfvrakpqlltoi", response.iterator().next().properties().description());
    }
}
