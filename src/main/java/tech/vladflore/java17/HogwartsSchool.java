package tech.vladflore.java17;

import java.util.stream.Stream;

public class HogwartsSchool {

    public static void main(String[] args) {
        Stream.of(new Gryffindor(), new Hafflepuff(), new Ravenclaw(), new Slytherin())
            .map(HogwartsSchool::buildDetails).forEach(System.out::println);
    }

    static String buildDetails(HogwartsHouse house) {
        return switch (house) {
            case Gryffindor gryffindor -> gryffindor.details();
            case Hafflepuff hafflepuff -> hafflepuff.details();
            case Ravenclaw ravenclaw -> ravenclaw.details();
            case Slytherin slytherin -> slytherin.details();
            case null -> "not a house";
        };
    }
}
