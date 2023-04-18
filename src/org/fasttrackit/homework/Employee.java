package org.fasttrackit.homework;

public class Employee extends Person{
    private final String company;
    private final Integer salary;

    public Employee(String name, Integer age, String hairColour, String company, Integer salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }
}
