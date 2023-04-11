package org.fasttrackit.maps;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();
        Map<String, Integer> nameToAgeTree = new TreeMap<>();
//        nameToAge.put("Alex", 31);
//        nameToAge.put("John", 20);
//        nameToAge.put("Alex", 40);
        for (int i = 0; i < 20000000; i++) {
            nameToAge.put("Name" + i, i);
            nameToAgeTree.put("Name" + i, i);
        }

        long time1, time2;

        System.out.println(nameToAge);
        long start = System.currentTimeMillis();
        Set<String> keySet = nameToAge.keySet();
        for (String key : keySet) {
            System.out.println(nameToAge.get(key));
        }
        time1 = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        Set<Map.Entry<String, Integer>> entries = nameToAgeTree.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getValue());
        }
        time2 = System.currentTimeMillis() - start;

        System.out.println("Execution time in millis: " + time1);
        System.out.println("Execution time in millis: " + time2);


        Map<String, List<Integer>> studentGrades = new HashMap<>();
        addGradeForStudent(studentGrades, "John", 10);
        addGradeForStudent(studentGrades, "John", 9);
    }

    private static void addGradeForStudent(Map<String, List<Integer>> studentGrades, String name, int grade) {
        if (!studentGrades.containsKey(name)) {
            studentGrades.put(name, new ArrayList<>());
        }
        studentGrades.get(name).add(grade);
    }

    private static void addGradeForStudent2(Map<String, List<Integer>> studentGrades, String name, int grade) {
        studentGrades.putIfAbsent(name, new ArrayList<>());
        studentGrades.get(name).add(grade);
    }
}
