package org.fasttrackit.enums;

public enum CardinalPoints {
    NORTH("N"), SOUTH("S"), WEST("W"), EAST("E"), NORTH_WEST("NW");

    private final String symbol;

    CardinalPoints(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String toDirection(){
        return switch (this){
            case NORTH -> "UP";
            case SOUTH -> "DOWN";
            case EAST -> "RIGHT";
            case WEST -> "LEFT";
            case NORTH_WEST -> "UP-LEFT";
        };
    }

    public static CardinalPoints fromName(String name) {
        CardinalPoints[] values = CardinalPoints.values();
        for (CardinalPoints cardinalPoint : values) {
            if (cardinalPoint.name().equals(name.toUpperCase())) {
                return cardinalPoint;
            }
        }
        return null;
    }

    public static CardinalPoints fromSymbol(String symbol) {
        CardinalPoints[] values = CardinalPoints.values();
        for (CardinalPoints cardinalPoint : values) {
            if (cardinalPoint.symbol.equals(symbol)) {
                return cardinalPoint;
            }
        }
        return null;
    }


}
