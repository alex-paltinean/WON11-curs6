package org.fasttrackit.curs10.files;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        readNumbers();
    }

    private static void readWithBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void readNumbers() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        while (scanner.hasNext()) {
            String x = scanner.nextLine().replaceAll("[^0-9]","");
            int intVar = Integer.parseInt(x);
            System.out.println(intVar);
        }
    }

    private static void readFullFile() throws FileNotFoundException {
        Scanner s = new Scanner(new File("files", "content.txt"));
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    private static void readOneLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
    }
}
