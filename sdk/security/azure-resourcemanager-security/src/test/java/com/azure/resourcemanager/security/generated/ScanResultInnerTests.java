// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ScanResultInner;
import com.azure.resourcemanager.security.models.Baseline;
import com.azure.resourcemanager.security.models.BaselineAdjustedResult;
import com.azure.resourcemanager.security.models.BenchmarkReference;
import com.azure.resourcemanager.security.models.QueryCheck;
import com.azure.resourcemanager.security.models.Remediation;
import com.azure.resourcemanager.security.models.RuleSeverity;
import com.azure.resourcemanager.security.models.RuleStatus;
import com.azure.resourcemanager.security.models.RuleType;
import com.azure.resourcemanager.security.models.ScanResultProperties;
import com.azure.resourcemanager.security.models.VaRule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScanResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScanResultInner model = BinaryData.fromString(
            "{\"properties\":{\"ruleId\":\"vezrypqlmfeo\",\"status\":\"Finding\",\"isTrimmed\":true,\"queryResults\":[[\"kobopgxed\",\"owepbqpcrfkb\",\"ccsnjvcdwxlpq\"]],\"remediation\":{\"description\":\"tn\",\"scripts\":[\"jsyingwfqatm\",\"dhtmdvypgikd\"],\"automated\":false,\"portalLink\":\"w\"},\"baselineAdjustedResult\":{\"baseline\":{\"expectedResults\":[[\"uzhlhkjoqrv\",\"qaatjinrv\",\"oupmfii\",\"fggjioolvr\"],[\"kvtkkg\"]],\"updatedTime\":\"2021-03-15T03:06:41Z\"},\"status\":\"Finding\",\"resultsNotInBaseline\":[[\"jayvblmhv\",\"zuhbxvvyhgsopb\",\"rqufegxuvwz\",\"bnhlmc\"],[\"p\"],[\"gitvg\",\"mhrixkwmyijejve\",\"rh\",\"pna\"]],\"resultsOnlyInBaseline\":[[\"ccbdre\",\"xhcexdrrvqahq\",\"ghtpw\",\"jnhyjsvf\"],[\"xzb\",\"voowvr\",\"mtg\"],[\"ppyostronzmyhgf\"],[\"nsxkmcwaekrrjr\",\"afxtsgum\",\"jglikkxwslolb\"]]},\"ruleMetadata\":{\"ruleId\":\"uzlm\",\"severity\":\"Medium\",\"category\":\"fktgplc\",\"ruleType\":\"PositiveList\",\"title\":\"xeznoi\",\"description\":\"rnjwmw\",\"rationale\":\"nbsazejjoqkag\",\"queryCheck\":{\"query\":\"xttaugzxnfaaz\",\"expectedResult\":[[\"n\",\"dm\"],[\"j\",\"lwuenvrkp\"]],\"columnNames\":[\"aibrebqaaysjkixq\",\"nqttezl\",\"fffiak\",\"jpqqmted\"]},\"benchmarkReferences\":[{\"benchmark\":\"jihy\",\"reference\":\"zphv\"}]}},\"id\":\"auyqncygupkv\",\"name\":\"p\",\"type\":\"dscwxqupevzhf\"}")
            .toObject(ScanResultInner.class);
        Assertions.assertEquals("vezrypqlmfeo", model.properties().ruleId());
        Assertions.assertEquals(RuleStatus.FINDING, model.properties().status());
        Assertions.assertEquals(true, model.properties().isTrimmed());
        Assertions.assertEquals("kobopgxed", model.properties().queryResults().get(0).get(0));
        Assertions.assertEquals("tn", model.properties().remediation().description());
        Assertions.assertEquals("jsyingwfqatm", model.properties().remediation().scripts().get(0));
        Assertions.assertEquals(false, model.properties().remediation().automated());
        Assertions.assertEquals("w", model.properties().remediation().portalLink());
        Assertions.assertEquals("uzhlhkjoqrv",
            model.properties().baselineAdjustedResult().baseline().expectedResults().get(0).get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-15T03:06:41Z"),
            model.properties().baselineAdjustedResult().baseline().updatedTime());
        Assertions.assertEquals(RuleStatus.FINDING, model.properties().baselineAdjustedResult().status());
        Assertions.assertEquals("jayvblmhv",
            model.properties().baselineAdjustedResult().resultsNotInBaseline().get(0).get(0));
        Assertions.assertEquals("ccbdre",
            model.properties().baselineAdjustedResult().resultsOnlyInBaseline().get(0).get(0));
        Assertions.assertEquals("uzlm", model.properties().ruleMetadata().ruleId());
        Assertions.assertEquals(RuleSeverity.MEDIUM, model.properties().ruleMetadata().severity());
        Assertions.assertEquals("fktgplc", model.properties().ruleMetadata().category());
        Assertions.assertEquals(RuleType.POSITIVE_LIST, model.properties().ruleMetadata().ruleType());
        Assertions.assertEquals("xeznoi", model.properties().ruleMetadata().title());
        Assertions.assertEquals("rnjwmw", model.properties().ruleMetadata().description());
        Assertions.assertEquals("nbsazejjoqkag", model.properties().ruleMetadata().rationale());
        Assertions.assertEquals("xttaugzxnfaaz", model.properties().ruleMetadata().queryCheck().query());
        Assertions.assertEquals("n", model.properties().ruleMetadata().queryCheck().expectedResult().get(0).get(0));
        Assertions.assertEquals("aibrebqaaysjkixq",
            model.properties().ruleMetadata().queryCheck().columnNames().get(0));
        Assertions.assertEquals("jihy", model.properties().ruleMetadata().benchmarkReferences().get(0).benchmark());
        Assertions.assertEquals("zphv", model.properties().ruleMetadata().benchmarkReferences().get(0).reference());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScanResultInner model = new ScanResultInner().withProperties(new ScanResultProperties()
            .withRuleId("vezrypqlmfeo")
            .withStatus(RuleStatus.FINDING)
            .withIsTrimmed(true)
            .withQueryResults(Arrays.asList(Arrays.asList("kobopgxed", "owepbqpcrfkb", "ccsnjvcdwxlpq")))
            .withRemediation(new Remediation().withDescription("tn")
                .withScripts(Arrays.asList("jsyingwfqatm", "dhtmdvypgikd"))
                .withAutomated(false)
                .withPortalLink("w"))
            .withBaselineAdjustedResult(new BaselineAdjustedResult()
                .withBaseline(new Baseline()
                    .withExpectedResults(Arrays.asList(
                        Arrays.asList("uzhlhkjoqrv", "qaatjinrv", "oupmfii", "fggjioolvr"), Arrays.asList("kvtkkg")))
                    .withUpdatedTime(OffsetDateTime.parse("2021-03-15T03:06:41Z")))
                .withStatus(RuleStatus.FINDING)
                .withResultsNotInBaseline(
                    Arrays.asList(Arrays.asList("jayvblmhv", "zuhbxvvyhgsopb", "rqufegxuvwz", "bnhlmc"),
                        Arrays.asList("p"), Arrays.asList("gitvg", "mhrixkwmyijejve", "rh", "pna")))
                .withResultsOnlyInBaseline(Arrays.asList(Arrays.asList("ccbdre", "xhcexdrrvqahq", "ghtpw", "jnhyjsvf"),
                    Arrays.asList("xzb", "voowvr", "mtg"), Arrays.asList("ppyostronzmyhgf"),
                    Arrays.asList("nsxkmcwaekrrjr", "afxtsgum", "jglikkxwslolb"))))
            .withRuleMetadata(new VaRule().withRuleId("uzlm")
                .withSeverity(RuleSeverity.MEDIUM)
                .withCategory("fktgplc")
                .withRuleType(RuleType.POSITIVE_LIST)
                .withTitle("xeznoi")
                .withDescription("rnjwmw")
                .withRationale("nbsazejjoqkag")
                .withQueryCheck(new QueryCheck().withQuery("xttaugzxnfaaz")
                    .withExpectedResult(Arrays.asList(Arrays.asList("n", "dm"), Arrays.asList("j", "lwuenvrkp")))
                    .withColumnNames(Arrays.asList("aibrebqaaysjkixq", "nqttezl", "fffiak", "jpqqmted")))
                .withBenchmarkReferences(
                    Arrays.asList(new BenchmarkReference().withBenchmark("jihy").withReference("zphv")))));
        model = BinaryData.fromObject(model).toObject(ScanResultInner.class);
        Assertions.assertEquals("vezrypqlmfeo", model.properties().ruleId());
        Assertions.assertEquals(RuleStatus.FINDING, model.properties().status());
        Assertions.assertEquals(true, model.properties().isTrimmed());
        Assertions.assertEquals("kobopgxed", model.properties().queryResults().get(0).get(0));
        Assertions.assertEquals("tn", model.properties().remediation().description());
        Assertions.assertEquals("jsyingwfqatm", model.properties().remediation().scripts().get(0));
        Assertions.assertEquals(false, model.properties().remediation().automated());
        Assertions.assertEquals("w", model.properties().remediation().portalLink());
        Assertions.assertEquals("uzhlhkjoqrv",
            model.properties().baselineAdjustedResult().baseline().expectedResults().get(0).get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-15T03:06:41Z"),
            model.properties().baselineAdjustedResult().baseline().updatedTime());
        Assertions.assertEquals(RuleStatus.FINDING, model.properties().baselineAdjustedResult().status());
        Assertions.assertEquals("jayvblmhv",
            model.properties().baselineAdjustedResult().resultsNotInBaseline().get(0).get(0));
        Assertions.assertEquals("ccbdre",
            model.properties().baselineAdjustedResult().resultsOnlyInBaseline().get(0).get(0));
        Assertions.assertEquals("uzlm", model.properties().ruleMetadata().ruleId());
        Assertions.assertEquals(RuleSeverity.MEDIUM, model.properties().ruleMetadata().severity());
        Assertions.assertEquals("fktgplc", model.properties().ruleMetadata().category());
        Assertions.assertEquals(RuleType.POSITIVE_LIST, model.properties().ruleMetadata().ruleType());
        Assertions.assertEquals("xeznoi", model.properties().ruleMetadata().title());
        Assertions.assertEquals("rnjwmw", model.properties().ruleMetadata().description());
        Assertions.assertEquals("nbsazejjoqkag", model.properties().ruleMetadata().rationale());
        Assertions.assertEquals("xttaugzxnfaaz", model.properties().ruleMetadata().queryCheck().query());
        Assertions.assertEquals("n", model.properties().ruleMetadata().queryCheck().expectedResult().get(0).get(0));
        Assertions.assertEquals("aibrebqaaysjkixq",
            model.properties().ruleMetadata().queryCheck().columnNames().get(0));
        Assertions.assertEquals("jihy", model.properties().ruleMetadata().benchmarkReferences().get(0).benchmark());
        Assertions.assertEquals("zphv", model.properties().ruleMetadata().benchmarkReferences().get(0).reference());
    }
}
