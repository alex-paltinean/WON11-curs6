package org.fasttrackit.curs10.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ObjectsFromFile {
    public static void main(String[] args) throws IOException {
        List<Person> people = readPersons("files/persons.data");
//        for (Person person : people) {
//            if (person.getAge() > 10) {
//                System.out.println(person.getName() + " " + person.getPosition());
//            }
//        }
        writeReport(people);
    }

    private static void writeReport(List<Person> persons) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/report.data"));
        for (Person person : persons) {
            writer.write(person.getName() + " has age " + person.getAge() + " with position " + person.getPosition());
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }

    private static List<Person> readPersons(String filePath) throws FileNotFoundException {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            persons.add(getPersonFromLine(persons, line));
        }
        return persons;
    }

    private static Person getPersonFromLine(List<Person> persons, String line) {
        String[] tokens = line.split(Pattern.quote("|"));
        return new Person(tokens[0],
                tokens.length >= 2 ? Integer.parseInt(tokens[1].replaceAll("[^(0-9)]", "")) : 18,
                tokens.length >= 3 ? tokens[2] : "no job");
    }
}
