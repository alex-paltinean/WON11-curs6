package org.fasttrackit.curs10.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = String.format("Ana are %d de mere. %s", 20, "Mersioare");

        //oricare dintre caractere
        System.out.println(text.replaceAll("[am]", "*"));

        //oricare dintre caracterele ce nu se afla intre paranteze
        System.out.println(text.replaceAll("[^am]", "*"));

        // orice caracter din range ASCII
        System.out.println(text.replaceAll("[0-9]", "*"));
        System.out.println(text.replaceAll("[a-zA-Z]", "*"));

        // oricare caracter dintre cele enumerate
        System.out.println(text.replaceAll("(1|2)", "*"));

        // oricare caracter
        System.out.println(text.replaceAll(".", "*"));

        // orice punct
        System.out.println(text.replaceAll("\\.", "*"));

        // orice cifra
        System.out.println(text.replaceAll("\\d", "*"));

        // un cuvant care incepe cu m si se termina cu e
        System.out.println(text.replaceAll("\\bm\\w*e\\b", "*"));

        System.out.println(Pattern.matches("A.*", text));
        System.out.println(Pattern.matches("A.*", "A"));
        System.out.println(Pattern.matches("A.+", "A"));

        varArgs("test", 2);
        varArgs("secondTest", 2, 5, 6);
        List<Integer> integers = Arrays.asList(1, 2, 4, 5);
        List<String> strings = Arrays.asList("a", "b", "c");
    }

    private static void varArgs(String firstParam, Integer... numbers) {
        for (Integer i : numbers) {
            System.out.println(firstParam + i);
        }
    }
}
