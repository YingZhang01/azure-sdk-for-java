// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.GovernanceRule;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GovernanceRulesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"tenantId\":\"ebqnnfy\",\"displayName\":\"tkqowsd\",\"description\":\"hczygpmg\",\"remediationTimeframe\":\"culojh\",\"isGracePeriod\":true,\"rulePriority\":1485072442,\"isDisabled\":true,\"ruleType\":\"Integrated\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[\"ymotuz\",\"ybwjmtftc\"],\"conditionSets\":[\"datalnirupkq\",\"datastpaqpibjgbvswm\",\"datahfxrt\"],\"includeMemberScopes\":true,\"ownerSource\":{\"type\":\"Manually\",\"value\":\"nn\"},\"governanceEmailNotification\":{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":false},\"metadata\":{\"createdBy\":\"alectcxsfmbz\",\"createdOn\":\"2021-08-13T10:58:55Z\",\"updatedBy\":\"ynbkdnnyufxuzms\",\"updatedOn\":\"2021-07-03T09:04:47Z\"}},\"id\":\"qrbrnxhjtlxf\",\"name\":\"kjkxaravww\",\"type\":\"asnjeglht\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<GovernanceRule> response
            = manager.governanceRules().list("iywhubymfpop", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("tkqowsd", response.iterator().next().displayName());
        Assertions.assertEquals("hczygpmg", response.iterator().next().description());
        Assertions.assertEquals("culojh", response.iterator().next().remediationTimeframe());
        Assertions.assertEquals(true, response.iterator().next().isGracePeriod());
        Assertions.assertEquals(1485072442, response.iterator().next().rulePriority());
        Assertions.assertEquals(true, response.iterator().next().isDisabled());
        Assertions.assertEquals(GovernanceRuleType.INTEGRATED, response.iterator().next().ruleType());
        Assertions.assertEquals(GovernanceRuleSourceResourceType.ASSESSMENTS,
            response.iterator().next().sourceResourceType());
        Assertions.assertEquals("ymotuz", response.iterator().next().excludedScopes().get(0));
        Assertions.assertEquals(true, response.iterator().next().includeMemberScopes());
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.MANUALLY,
            response.iterator().next().ownerSource().type());
        Assertions.assertEquals("nn", response.iterator().next().ownerSource().value());
        Assertions.assertEquals(true,
            response.iterator().next().governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false,
            response.iterator().next().governanceEmailNotification().disableOwnerEmailNotification());
    }
}
