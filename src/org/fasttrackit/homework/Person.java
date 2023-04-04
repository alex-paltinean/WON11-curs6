package org.fasttrackit.homework;

public class Person {
    private final String name;
    private final String position;
    private final int age;

    public Person(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }
}
