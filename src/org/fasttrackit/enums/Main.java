package org.fasttrackit.enums;

import java.util.Scanner;

import static org.fasttrackit.enums.CardinalPoints.*;

public class Main {
    public static void main(String[] args) {
        CardinalPoints west = WEST;
//        System.out.println(west.getSymbol());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a cardinal point: ");
        String line = scanner.nextLine();
        CardinalPoints cardinalPoints = fromName(line);
        if (cardinalPoints != null) {
            System.out.println("It's symbol is: " + cardinalPoints.getSymbol());
        }

        System.out.print("Enter a cardinal symbol: ");
        CardinalPoints fromSymbol = fromSymbol(scanner.nextLine());
        if (fromSymbol != null) {
            System.out.println("The cardinal point is: " + fromSymbol.name());
        }

        System.out.print("Enter a cardinal symbol: ");
        fromSymbol = fromSymbol(scanner.nextLine());
        if (fromSymbol != null) {
            if (fromSymbol == NORTH) {
                System.out.println("Hurry!");
            }
            System.out.println("You need to go " + fromSymbol.toDirection());
        }
    }
}
