package org.fasttrackit.homework7.student;

public class Student {
    private String name;
    private int grade;

    public static int gradeSum = 0;
    public static int numberOfStudents = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        Student.numberOfStudents++;
        Student.gradeSum += grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
