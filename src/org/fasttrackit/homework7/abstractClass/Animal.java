package org.fasttrackit.homework7.abstractClass;

public abstract class Animal {
    private int weight;
    private int numberOfLegs;

    public abstract String talk();

    public abstract String walk();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfLegs() {
        System.out.println(talk());
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
