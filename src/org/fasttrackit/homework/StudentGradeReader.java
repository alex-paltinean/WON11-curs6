package org.fasttrackit.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeReader {

    private final String path;

    public StudentGradeReader(String path) {
        this.path = path;
    }

    public List<StudentGrade> readStudents() throws FileNotFoundException {
        List<StudentGrade> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            studentGrades.add(fromLine(line));
        }
        return studentGrades;
    }

    private StudentGrade fromLine(String line) {
        String[] tokens = line.split("\\|");
        String[] names = tokens[0].split(" ");
        return new StudentGrade(names[0], tokens[1], Integer.parseInt(tokens[2]));
    }

}
