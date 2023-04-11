package org.fasttrackit.records;

public class SimpleObject {
    private int a;

    public SimpleObject(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "SimpleObject{" +
                "a=" + a +
                '}';
    }
}
