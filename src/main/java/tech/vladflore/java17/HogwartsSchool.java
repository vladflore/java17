package tech.vladflore.java17;

import java.util.stream.Stream;

public class HogwartsSchool {

    public static void main(String[] args) {
        Stream.of(new Gryffindor(), new Hafflepuff(), new Ravenclaw(), new Slytherin(), null)
            .map(HogwartsSchool::buildDetails).forEach(System.out::println);
    }

    static String buildDetails(Object house) {
        return switch (house) {
            case Gryffindor gryffindor -> {
                var details = gryffindor.details();
                yield details.concat("students: Harry, Hermione, Ron");
            }
            case Hafflepuff hafflepuff -> hafflepuff.details();
            case Ravenclaw ravenclaw -> ravenclaw.details();
            case Slytherin slytherin -> slytherin.details();
            case default, null -> "not a house";
        };
    }
}
