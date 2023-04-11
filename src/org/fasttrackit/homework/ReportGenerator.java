package org.fasttrackit.homework;

import java.util.List;

public class ReportGenerator {
    private final Classroom classroom;

    public ReportGenerator(List<StudentGrade> studentGrade) {
        this.classroom = new Classroom(studentGrade);
    }

    public void generateReport() {
        StudentGrade maxGrade = classroom.getMaxGrade();
        System.out.println("Cea mai mare nota:  " + maxGrade.getName() + " " + maxGrade.getGrade());
        System.out.println("Nota medie: "+classroom.getAverageGrade("Mathematics"));
        System.out.println("Cea mai mica nota: <studentul cu cea mai mica nota> <nota>");
    }
}
