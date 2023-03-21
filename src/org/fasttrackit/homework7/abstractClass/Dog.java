package org.fasttrackit.homework7.abstractClass;

public class Dog extends Animal{
    @Override
    public String talk() {
        return "ham-ham";
    }

    @Override
    public String walk() {
        return "dog-walking";
    }
}
