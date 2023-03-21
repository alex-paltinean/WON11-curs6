package org.fasttrackit.homework7.animal;

public class Cat implements Animal {
    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String talk() {
        return "miau";
    }

    @Override
    public String eat() {
        return "cat-eating";
    }

    public String purr() {
        return "rrrr";
    }
}
