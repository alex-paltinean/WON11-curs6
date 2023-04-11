package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private final List<StudentGrade> studentGrades;

    public Classroom(List<StudentGrade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> result = new ArrayList<>();
        boolean found = false;
        for (StudentGrade grade : studentGrades) {
            if (grade.getDiscipline().equals(discipline)) {
                found = true;
                result.add(grade.getGrade());
            } else {
                System.out.println("");
            }
        }
        if (!found) {
            System.out.println("No grade was found");
        }
        return result;
    }

    public StudentGrade getMaxGrade() {
        int maxGrade = Integer.MIN_VALUE;
        StudentGrade maxStudentGrade = null;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getGrade() >= maxGrade) {
                maxGrade = studentGrade.getGrade();
                maxStudentGrade = studentGrade;
            }
        }
        return maxStudentGrade;
    }


    public StudentGrade getMaxGrade2() {
        Integer maxGrade = null;
        StudentGrade maxStudentGrade = null;
        for (StudentGrade studentGrade : studentGrades) {
            if (maxGrade == null || studentGrade.getGrade() >= maxGrade) {
                maxGrade = studentGrade.getGrade();
                maxStudentGrade = studentGrade;
            }
        }
        return maxStudentGrade;
    }

    public Integer getAverageGrade(String discipline) {
        long sumOfGrades = 0;
        int numberOfGrades = 0;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                sumOfGrades += studentGrade.getGrade();
                numberOfGrades++;
            }
        }
        if (numberOfGrades == 0) {
            return 0;
        }
        return (int) sumOfGrades / numberOfGrades;
    }

    public static void main(String[] args) {
        System.out.println(0 / 0);
    }

}
