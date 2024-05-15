// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleProperties;
import com.azure.resourcemanager.security.models.GovernanceRuleEmailNotification;
import com.azure.resourcemanager.security.models.GovernanceRuleMetadata;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSource;
import com.azure.resourcemanager.security.models.GovernanceRuleOwnerSourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleSourceResourceType;
import com.azure.resourcemanager.security.models.GovernanceRuleType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GovernanceRulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceRuleProperties model = BinaryData.fromString(
            "{\"tenantId\":\"qlcvydy\",\"displayName\":\"atdooaojkniod\",\"description\":\"oebwnujhemms\",\"remediationTimeframe\":\"dkcrodt\",\"isGracePeriod\":true,\"rulePriority\":321367930,\"isDisabled\":true,\"ruleType\":\"Integrated\",\"sourceResourceType\":\"Assessments\",\"excludedScopes\":[\"kacjvefkdlfo\",\"kggkfpa\"],\"conditionSets\":[\"dataowpulpq\"],\"includeMemberScopes\":true,\"ownerSource\":{\"type\":\"ByTag\",\"value\":\"xkqjnsjervt\"},\"governanceEmailNotification\":{\"disableManagerEmailNotification\":true,\"disableOwnerEmailNotification\":false},\"metadata\":{\"createdBy\":\"uem\",\"createdOn\":\"2021-06-09T02:50:50Z\",\"updatedBy\":\"kfzbeyvpnqicvi\",\"updatedOn\":\"2021-04-02T23:33:39Z\"}}")
            .toObject(GovernanceRuleProperties.class);
        Assertions.assertEquals("atdooaojkniod", model.displayName());
        Assertions.assertEquals("oebwnujhemms", model.description());
        Assertions.assertEquals("dkcrodt", model.remediationTimeframe());
        Assertions.assertEquals(true, model.isGracePeriod());
        Assertions.assertEquals(321367930, model.rulePriority());
        Assertions.assertEquals(true, model.isDisabled());
        Assertions.assertEquals(GovernanceRuleType.INTEGRATED, model.ruleType());
        Assertions.assertEquals(GovernanceRuleSourceResourceType.ASSESSMENTS, model.sourceResourceType());
        Assertions.assertEquals("kacjvefkdlfo", model.excludedScopes().get(0));
        Assertions.assertEquals(true, model.includeMemberScopes());
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.BY_TAG, model.ownerSource().type());
        Assertions.assertEquals("xkqjnsjervt", model.ownerSource().value());
        Assertions.assertEquals(true, model.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableOwnerEmailNotification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceRuleProperties model = new GovernanceRuleProperties().withDisplayName("atdooaojkniod")
            .withDescription("oebwnujhemms")
            .withRemediationTimeframe("dkcrodt")
            .withIsGracePeriod(true)
            .withRulePriority(321367930)
            .withIsDisabled(true)
            .withRuleType(GovernanceRuleType.INTEGRATED)
            .withSourceResourceType(GovernanceRuleSourceResourceType.ASSESSMENTS)
            .withExcludedScopes(Arrays.asList("kacjvefkdlfo", "kggkfpa"))
            .withConditionSets(Arrays.asList("dataowpulpq"))
            .withIncludeMemberScopes(true)
            .withOwnerSource(
                new GovernanceRuleOwnerSource().withType(GovernanceRuleOwnerSourceType.BY_TAG).withValue("xkqjnsjervt"))
            .withGovernanceEmailNotification(
                new GovernanceRuleEmailNotification().withDisableManagerEmailNotification(true)
                    .withDisableOwnerEmailNotification(false))
            .withMetadata(new GovernanceRuleMetadata());
        model = BinaryData.fromObject(model).toObject(GovernanceRuleProperties.class);
        Assertions.assertEquals("atdooaojkniod", model.displayName());
        Assertions.assertEquals("oebwnujhemms", model.description());
        Assertions.assertEquals("dkcrodt", model.remediationTimeframe());
        Assertions.assertEquals(true, model.isGracePeriod());
        Assertions.assertEquals(321367930, model.rulePriority());
        Assertions.assertEquals(true, model.isDisabled());
        Assertions.assertEquals(GovernanceRuleType.INTEGRATED, model.ruleType());
        Assertions.assertEquals(GovernanceRuleSourceResourceType.ASSESSMENTS, model.sourceResourceType());
        Assertions.assertEquals("kacjvefkdlfo", model.excludedScopes().get(0));
        Assertions.assertEquals(true, model.includeMemberScopes());
        Assertions.assertEquals(GovernanceRuleOwnerSourceType.BY_TAG, model.ownerSource().type());
        Assertions.assertEquals("xkqjnsjervt", model.ownerSource().value());
        Assertions.assertEquals(true, model.governanceEmailNotification().disableManagerEmailNotification());
        Assertions.assertEquals(false, model.governanceEmailNotification().disableOwnerEmailNotification());
    }
}
