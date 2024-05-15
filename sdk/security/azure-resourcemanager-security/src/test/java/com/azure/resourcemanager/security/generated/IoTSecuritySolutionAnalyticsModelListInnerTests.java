// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelInner;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionAnalyticsModelListInner;
import com.azure.resourcemanager.security.models.IoTSecurityAlertedDevice;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceAlert;
import com.azure.resourcemanager.security.models.IoTSecurityDeviceRecommendation;
import java.util.Arrays;

public final class IoTSecuritySolutionAnalyticsModelListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecuritySolutionAnalyticsModelListInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"metrics\":{\"high\":1905784856339728309,\"medium\":861961081471240230,\"low\":6664164718456368498},\"unhealthyDeviceCount\":8990299385142231806,\"devicesMetrics\":[{\"date\":\"2021-10-06T20:56:23Z\",\"devicesMetrics\":{}},{\"date\":\"2021-04-28T20:38:18Z\",\"devicesMetrics\":{}},{\"date\":\"2021-12-10T06:33:21Z\",\"devicesMetrics\":{}},{\"date\":\"2021-11-21T22:11:07Z\",\"devicesMetrics\":{}}],\"topAlertedDevices\":[{\"deviceId\":\"xqpswok\",\"alertsCount\":4599387358534954392}],\"mostPrevalentDeviceAlerts\":[{\"alertDisplayName\":\"dhbemzqkzszu\",\"reportedSeverity\":\"Low\",\"alertsCount\":4666972978332386288},{\"alertDisplayName\":\"xhl\",\"reportedSeverity\":\"Informational\",\"alertsCount\":8272094111872110807},{\"alertDisplayName\":\"rmnzhr\",\"reportedSeverity\":\"High\",\"alertsCount\":58823566911013083},{\"alertDisplayName\":\"vpqcb\",\"reportedSeverity\":\"High\",\"alertsCount\":3982074763372331569}],\"mostPrevalentDeviceRecommendations\":[{\"recommendationDisplayName\":\"qqgvriibakcla\",\"reportedSeverity\":\"Informational\",\"devicesCount\":3143348238303983526},{\"recommendationDisplayName\":\"usx\",\"reportedSeverity\":\"High\",\"devicesCount\":7507011288314024656},{\"recommendationDisplayName\":\"gmwohqfzizvu\",\"reportedSeverity\":\"Informational\",\"devicesCount\":5429285928052285759},{\"recommendationDisplayName\":\"thnwpzte\",\"reportedSeverity\":\"Low\",\"devicesCount\":3649264392762822171}]},\"id\":\"biattgplucfotan\",\"name\":\"c\",\"type\":\"hnykz\"},{\"properties\":{\"metrics\":{\"high\":4429427229457258180,\"medium\":9124019314942912809,\"low\":5939046112950913510},\"unhealthyDeviceCount\":269125076406012792,\"devicesMetrics\":[{\"date\":\"2021-10-20T07:22:43Z\",\"devicesMetrics\":{}},{\"date\":\"2021-02-04T14:21:53Z\",\"devicesMetrics\":{}}],\"topAlertedDevices\":[{\"deviceId\":\"dtcvcl\",\"alertsCount\":4792041905462044883},{\"deviceId\":\"k\",\"alertsCount\":1260989656124162695},{\"deviceId\":\"uiyjib\",\"alertsCount\":3757673134893495779}],\"mostPrevalentDeviceAlerts\":[{\"alertDisplayName\":\"neiknpg\",\"reportedSeverity\":\"Medium\",\"alertsCount\":6338199315031268608},{\"alertDisplayName\":\"hibtozipqwjedmur\",\"reportedSeverity\":\"Informational\",\"alertsCount\":8995447880359540461}],\"mostPrevalentDeviceRecommendations\":[{\"recommendationDisplayName\":\"vqylkmqpzoyhl\",\"reportedSeverity\":\"High\",\"devicesCount\":6390757044817255540},{\"recommendationDisplayName\":\"loxoebqin\",\"reportedSeverity\":\"Low\",\"devicesCount\":5603890376381404628},{\"recommendationDisplayName\":\"ujqlafcbahh\",\"reportedSeverity\":\"Low\",\"devicesCount\":3207483054269322394},{\"recommendationDisplayName\":\"yjwpfilkmkkh\",\"reportedSeverity\":\"Medium\",\"devicesCount\":8554239593202348910}]},\"id\":\"viauogphua\",\"name\":\"tvt\",\"type\":\"ukyefchnmnahmnxh\"}],\"nextLink\":\"jqirwrw\"}")
            .toObject(IoTSecuritySolutionAnalyticsModelListInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecuritySolutionAnalyticsModelListInner model
            = new IoTSecuritySolutionAnalyticsModelListInner().withValue(Arrays.asList(
                new IoTSecuritySolutionAnalyticsModelInner()
                    .withTopAlertedDevices(Arrays.asList(new IoTSecurityAlertedDevice()))
                    .withMostPrevalentDeviceAlerts(Arrays.asList(new IoTSecurityDeviceAlert(),
                        new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert()))
                    .withMostPrevalentDeviceRecommendations(
                        Arrays.asList(new IoTSecurityDeviceRecommendation(), new IoTSecurityDeviceRecommendation(),
                            new IoTSecurityDeviceRecommendation(), new IoTSecurityDeviceRecommendation())),
                new IoTSecuritySolutionAnalyticsModelInner()
                    .withTopAlertedDevices(Arrays.asList(new IoTSecurityAlertedDevice(), new IoTSecurityAlertedDevice(),
                        new IoTSecurityAlertedDevice()))
                    .withMostPrevalentDeviceAlerts(
                        Arrays.asList(new IoTSecurityDeviceAlert(), new IoTSecurityDeviceAlert()))
                    .withMostPrevalentDeviceRecommendations(
                        Arrays.asList(new IoTSecurityDeviceRecommendation(), new IoTSecurityDeviceRecommendation(),
                            new IoTSecurityDeviceRecommendation(), new IoTSecurityDeviceRecommendation()))));
        model = BinaryData.fromObject(model).toObject(IoTSecuritySolutionAnalyticsModelListInner.class);
    }
}
