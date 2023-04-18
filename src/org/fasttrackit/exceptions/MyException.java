package org.fasttrackit.exceptions;

public class MyException extends Exception {

    private final int minValue;
    public MyException(String message, int minValue) {
        super(message);
        this.minValue = minValue;
    }

    public int getMinValue() {
        return minValue;
    }
}
