package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Bucket {
    private List<String> fruits;

    public Bucket() {
        fruits = new ArrayList<>();
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        return new HashSet<>(fruits);
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int counter = 0;
        for (String fruit : fruits) {
            counter++;
        }
        return counter;
    }


}
