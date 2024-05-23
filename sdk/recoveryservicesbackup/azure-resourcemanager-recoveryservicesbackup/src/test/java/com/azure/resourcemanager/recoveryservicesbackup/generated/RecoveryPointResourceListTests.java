// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.RecoveryPointResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointResourceList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RecoveryPointResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoveryPointResourceList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"hslkevleggzf\",\"location\":\"u\",\"tags\":{\"vmezy\":\"vfaxkffeiith\",\"burvjxxjnspy\":\"shxmzsbbzoggigrx\",\"udwtiukbl\":\"ptkoenkoukn\",\"o\":\"ngkpocipazy\"},\"id\":\"gukgjnpiucgygevq\",\"name\":\"ntypmrbpizcdrqj\",\"type\":\"dpydn\"},{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"xdeoejzic\",\"location\":\"ifsjttgzfbishcb\",\"tags\":{\"alpbuxwgipwhon\":\"jdeyeamdpha\",\"kix\":\"wkgshwa\",\"eputtmrywnuzoqf\":\"bin\",\"qvyxlwhzlsicoho\":\"iyqzrnk\"},\"id\":\"qnwvlrya\",\"name\":\"w\",\"type\":\"heun\"},{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"hgyxzkonoc\",\"location\":\"koklya\",\"tags\":{\"zf\":\"onuq\",\"vjektcxsenh\":\"beypewrmjmw\",\"rzpwvlqdqgbiq\":\"lrsf\",\"vf\":\"lihkaetcktvfc\"},\"id\":\"nkymuctqhjfbebrj\",\"name\":\"xerf\",\"type\":\"wutttxfvjrbi\"}],\"nextLink\":\"hxepcyvahfnlj\"}")
            .toObject(RecoveryPointResourceList.class);
        Assertions.assertEquals("hxepcyvahfnlj", model.nextLink());
        Assertions.assertEquals("u", model.value().get(0).location());
        Assertions.assertEquals("vfaxkffeiith", model.value().get(0).tags().get("vmezy"));
        Assertions.assertEquals("hslkevleggzf", model.value().get(0).etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoveryPointResourceList model = new RecoveryPointResourceList().withNextLink("hxepcyvahfnlj")
            .withValue(Arrays.asList(
                new RecoveryPointResourceInner().withLocation("u")
                    .withTags(mapOf("vmezy", "vfaxkffeiith", "burvjxxjnspy", "shxmzsbbzoggigrx", "udwtiukbl",
                        "ptkoenkoukn", "o", "ngkpocipazy"))
                    .withProperties(new RecoveryPoint())
                    .withEtag("hslkevleggzf"),
                new RecoveryPointResourceInner().withLocation("ifsjttgzfbishcb")
                    .withTags(mapOf("alpbuxwgipwhon", "jdeyeamdpha", "kix", "wkgshwa", "eputtmrywnuzoqf", "bin",
                        "qvyxlwhzlsicoho", "iyqzrnk"))
                    .withProperties(new RecoveryPoint())
                    .withEtag("xdeoejzic"),
                new RecoveryPointResourceInner().withLocation("koklya")
                    .withTags(mapOf("zf", "onuq", "vjektcxsenh", "beypewrmjmw", "rzpwvlqdqgbiq", "lrsf", "vf",
                        "lihkaetcktvfc"))
                    .withProperties(new RecoveryPoint())
                    .withEtag("hgyxzkonoc")));
        model = BinaryData.fromObject(model).toObject(RecoveryPointResourceList.class);
        Assertions.assertEquals("hxepcyvahfnlj", model.nextLink());
        Assertions.assertEquals("u", model.value().get(0).location());
        Assertions.assertEquals("vfaxkffeiith", model.value().get(0).tags().get("vmezy"));
        Assertions.assertEquals("hslkevleggzf", model.value().get(0).etag());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
