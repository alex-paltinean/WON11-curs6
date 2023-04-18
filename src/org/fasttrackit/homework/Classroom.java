package org.fasttrackit.homework;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private final Map<String, Integer> studentGrades;

    public Classroom() {
        studentGrades = new HashMap<>();
    }

    public Classroom(Map<String, Integer> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public void addStudentGrade(String student, Integer grade) {
        studentGrades.put(student, grade);
    }

    public void printAllStudents() {
        System.out.println(studentGrades);
    }

    public String getStudentWithMaxGrade() {
        String result = null;
        Integer maxGrade = null;
        for (Map.Entry<String, Integer> studentGrade : studentGrades.entrySet()) {
            if (maxGrade == null || studentGrade.getValue() > maxGrade) {
                maxGrade = studentGrade.getValue();
                result = studentGrade.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudentGrade("John", 10);
        classroom.addStudentGrade("Max", 8);
        classroom.printAllStudents();

        System.out.println(classroom.getStudentWithMaxGrade());
    }

}
