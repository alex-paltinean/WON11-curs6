package org.fasttrackit.homework7.adprovider;

public class Facebook implements AdProvider {
    @Override
    public void advertise(String text) {
        System.out.println("Posting " + text + " on facebook");
    }
}
