// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.Day;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthOfYear;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionScheduleFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.YearlyRetentionSchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class YearlyRetentionScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        YearlyRetentionSchedule model = BinaryData.fromString(
            "{\"retentionScheduleFormatType\":\"Weekly\",\"monthsOfYear\":[\"October\",\"September\",\"October\"],\"retentionScheduleDaily\":{\"daysOfTheMonth\":[{\"date\":2140826215,\"isLast\":false},{\"date\":239575108,\"isLast\":true}]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Tuesday\",\"Saturday\",\"Tuesday\",\"Friday\"],\"weeksOfTheMonth\":[\"Third\",\"Invalid\",\"Last\"]},\"retentionTimes\":[\"2021-07-30T21:21:05Z\",\"2021-09-15T22:09:06Z\",\"2021-07-27T13:55:01Z\",\"2021-07-13T21:11:26Z\"],\"retentionDuration\":{\"count\":1248753250,\"durationType\":\"Weeks\"}}")
            .toObject(YearlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.WEEKLY, model.retentionScheduleFormatType());
        Assertions.assertEquals(MonthOfYear.OCTOBER, model.monthsOfYear().get(0));
        Assertions.assertEquals(2140826215, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.THIRD, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-30T21:21:05Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1248753250, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.retentionDuration().durationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        YearlyRetentionSchedule model
            = new YearlyRetentionSchedule().withRetentionScheduleFormatType(RetentionScheduleFormat.WEEKLY)
                .withMonthsOfYear(Arrays.asList(MonthOfYear.OCTOBER, MonthOfYear.SEPTEMBER, MonthOfYear.OCTOBER))
                .withRetentionScheduleDaily(new DailyRetentionFormat().withDaysOfTheMonth(Arrays.asList(
                    new Day().withDate(2140826215).withIsLast(false), new Day().withDate(239575108).withIsLast(true))))
                .withRetentionScheduleWeekly(new WeeklyRetentionFormat()
                    .withDaysOfTheWeek(
                        Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.SATURDAY, DayOfWeek.TUESDAY, DayOfWeek.FRIDAY))
                    .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.THIRD, WeekOfMonth.INVALID, WeekOfMonth.LAST)))
                .withRetentionTimes(Arrays.asList(OffsetDateTime.parse("2021-07-30T21:21:05Z"),
                    OffsetDateTime.parse("2021-09-15T22:09:06Z"), OffsetDateTime.parse("2021-07-27T13:55:01Z"),
                    OffsetDateTime.parse("2021-07-13T21:11:26Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(1248753250).withDurationType(RetentionDurationType.WEEKS));
        model = BinaryData.fromObject(model).toObject(YearlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.WEEKLY, model.retentionScheduleFormatType());
        Assertions.assertEquals(MonthOfYear.OCTOBER, model.monthsOfYear().get(0));
        Assertions.assertEquals(2140826215, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.THIRD, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-30T21:21:05Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(1248753250, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.retentionDuration().durationType());
    }
}
