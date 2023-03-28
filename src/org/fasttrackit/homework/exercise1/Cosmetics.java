package org.fasttrackit.homework.exercise1;

public class Cosmetics extends Product {
    private String color = "red";
    private double weight;

    public Cosmetics() {
        super("cosmetic");
    }

    public Cosmetics(String name) {
        super(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
