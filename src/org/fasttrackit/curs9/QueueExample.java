package org.fasttrackit.curs9;

import org.fasttrackit.homework.exercise2.Employee;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getPriority(), o2.getPriority());
            }
        });

        priorityQueue.add(new Employee("A", "B", 1));
        priorityQueue.add(new Employee("C", "D", 1));
        priorityQueue.add(new Employee("E", "F",0));

        Employee employee = priorityQueue.poll();
        System.out.println(employee);
    }
}
