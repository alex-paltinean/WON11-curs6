package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;

public class DailyPlanner {
    private final List<DaySchedule> daySchedules = new ArrayList<>();

    public void addActivity(DayOfTheWeek day, String activity) {
        validateActivity(activity);
        DaySchedule daySchedule = getOrCreateDaySchedule(day);
        daySchedule.addActivity(activity);
    }

    public void removeActivity(DayOfTheWeek day, String activity) {
        validateActivity(activity);
        DaySchedule daySchedule = getOrCreateDaySchedule(day);
        daySchedule.removeActivity(activity);
    }

    private DaySchedule getOrCreateDaySchedule(DayOfTheWeek day) {
        for (DaySchedule daySchedule : daySchedules) {
            if (daySchedule.getDay() == day) {
                return daySchedule;
            }
        }
        return new DaySchedule(day);
    }

    private static void validateActivity(String activity) {
        if (activity == null || activity.isEmpty() || activity.length() > 15) {
            throw new NoActivityException();
        }
    }
    //getActivities(day) : List<String>
    //
    //endPlanning(): Map<Day, List<String>> - returns a map from day to the list of activities for that day. If there's a day without activities throw a custom CHECKED exception : NoActivitiesForDayException
}
