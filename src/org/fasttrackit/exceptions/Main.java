package org.fasttrackit.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[3];
        try {
            int anImportantResult = doSomethingRisky(a);
            System.out.println(anImportantResult);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("oups!");
        }
        System.out.println("Printing something important");
    }

    private static int doSomethingRisky(int[] a) {
        System.out.println(a[4]);
        System.out.println("after exception in method");
        return a[4];
    }

    private static void doSomethingVisibleRisky(String path) throws FileNotFoundException {
        FileReader reader = new FileReader(path);
    }

    private static void doSomethingVisibleRisky2(String path) {
        try {
            FileReader reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }

    private static void doSomethingStupid() {
        String s = null;
        System.out.println(s.length());
    }
}
