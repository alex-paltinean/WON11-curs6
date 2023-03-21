package org.fasttrackit.homework7.animal;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "dog-walking";
    }

    @Override
    public String talk() {
        return "ham-ham";
    }

    @Override
    public String eat() {
        return "dog-eating";
    }
}
