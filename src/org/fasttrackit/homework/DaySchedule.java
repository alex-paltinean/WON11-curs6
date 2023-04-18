package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaySchedule {
    private final Map<DayOfWeek, List<String>> activities = new HashMap<>();

    public void addActivity(DayOfWeek dayOfWeek, String activity) {
        activities.putIfAbsent(dayOfWeek, new ArrayList<>());
        activities.get(dayOfWeek).add(activity);
    }

    public void removeActivity(DayOfWeek dayOfWeek, String activity) {
        if (!activities.containsKey(dayOfWeek)) {
            System.out.println("No activities for this day");
            return;
        }
        List<String> dayActivities = activities.get(dayOfWeek);
        if (!dayActivities.contains(activity)) {
            System.out.println("This day doesn't have this activity");
            return;
        }
        dayActivities.remove(activity);
    }

    public void sickLeave(DayOfWeek dayOfWeek) {
        activities.put(dayOfWeek, null);
    }
}
