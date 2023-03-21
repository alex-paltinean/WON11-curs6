package org.fasttrackit.homework7.adprovider;

public class Email implements AdProvider {

    @Override
    public void advertise(String text) {
        System.out.println("Sending email with subject: " + text);
    }
}
