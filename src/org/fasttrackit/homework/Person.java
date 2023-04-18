package org.fasttrackit.homework;

public class Person {
    private final String name;
    private final Integer age;
    private final String hairColour;

    public Person(String name, Integer age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }
}
