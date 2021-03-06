package tech.vladflore.java17;

import java.util.stream.Stream;

public class SwitchExample {

    public static void main(String[] args) {
        Stream.of(House.values()).map(SwitchExample::founder).forEach(System.out::println);
        Stream.of(House.values()).map(SwitchExample::founder1).forEach(System.out::println);
        Stream.of(House.values()).map(SwitchExample::founder2).forEach(System.out::println);
        System.out.println(founder2(null));
    }

    static String founder(House house) {
        var founder = "unknown";
        if (house == null) {
            return founder;
        }
        switch (house) {
            case GRYFFINDOR:
                founder = "Godric Gryffindor";
                break;
            case HAFFLEPUFF:
                founder = "Helga Hufflepuff";
                break;
            case RAVENCLAW:
                founder = "Rowena Ravenclaw";
                break;
            case SLYTHERIN:
                founder = "Salazar Slytherin";
                break;
        }
        return founder;
    }

    static String founder1(House house) {
        if (house == null) {
            return "unknown";
        }
        switch (house) {
            case GRYFFINDOR:
                return "Godric Gryffindor";
            case HAFFLEPUFF:
                return "Helga Hufflepuff";
            case RAVENCLAW:
                return "Rowena Ravenclaw";
            case SLYTHERIN:
                return "Salazar Slytherin";
        }
        return "unknown";
    }

    static String founder2(House house) {
        return switch (house) {
            case GRYFFINDOR -> "Godric Gryffindor";
            case HAFFLEPUFF -> "Helga Hufflepuff";
            case RAVENCLAW -> "Rowena Ravenclaw";
            case SLYTHERIN -> "Salazar Slytherin";
            case null -> "not a house";
        };
    }
}

