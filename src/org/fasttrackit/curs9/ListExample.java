package org.fasttrackit.curs9;

import org.fasttrackit.homework.exercise2.Employee;
import org.fasttrackit.homework.exercise2.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Person> linkedPeople = new LinkedList<>();

        listMethods(linkedPeople);

    }

    private static void listMethods(List<Person> people) {
        people.add(new Employee("Elon", "Musk"));
        people.add(new Employee("Steve", "Jobs"));
        people.add(new Employee("Steve", "Jobs"));
        people.add(new Employee("Steve", "Jobs"));
        people.add(new Employee("Steve", "Jobs"));

        for(Person employee:people){
            System.out.println(employee.getFirstName());
        }

        System.out.println(people.get(1));
        System.out.println(people.get(1));

        people.add(1, new Employee("Bill", "Gates"));
        System.out.println(people.get(1));
        System.out.println(people.get(2));

        people.remove(0);
        System.out.println(people.get(0));

        System.out.println(people.size());
    }
}
