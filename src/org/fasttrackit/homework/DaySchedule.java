package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private final DayOfTheWeek day;
    private final List<String> activities = new ArrayList<>();

    public DaySchedule(DayOfTheWeek day) {
        this.day = day;
    }

    public DaySchedule(DayOfTheWeek day, String activity) {
        this.day = day;
        this.activities.add(activity);
    }

    public DayOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public void removeActivity(String activity) {
        activities.remove(activity);
    }
}
