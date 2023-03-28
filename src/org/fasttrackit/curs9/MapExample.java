package org.fasttrackit.curs9;

import org.fasttrackit.homework.exercise2.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Employee, List<Integer>> salaries = new HashMap<>();

        Employee e1 = new Employee("A", "B");
        Employee e2 = new Employee("C", "D");
        salaries.put(e1, new ArrayList<>());
        salaries.put(e2, new ArrayList<>());

        salaries.get(e1).add(1800);
        salaries.get(e2).add(1500);

        salaries.get(e1).add(300);

        salaries.put(e1, new ArrayList<>());
        salaries.remove(e1);

        System.out.println(salaries);
    }
}
