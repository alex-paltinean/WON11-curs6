package org.fasttrackit.curs9;

import com.sun.source.tree.Tree;
import org.fasttrackit.homework.exercise2.Employee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        Set<Employee> employees1 = new TreeSet<>();

        setMethods(employees1);
    }

    private static void setMethods(Set<Employee> employees) {
        Employee e1 = new Employee("A", "B");
        Employee e2 = new Employee("B", "C");
        employees.add(e1);
        employees.add(e2);
        employees.add(e2);
        employees.add(e2);
        employees.add(e2);
        employees.add(e2);
        Employee e3 = new Employee("A", "B");
        employees.add(e3);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            System.out.println(e);
        }
    }
}
