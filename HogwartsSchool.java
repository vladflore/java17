import java.util.stream.Stream;

public class HogwartsSchool {
    public static void main(String[] args) {
        Stream.of(new Gryffindor(), new Hafflepuff(), new Ravenclaw(), new Slytherin())
                .map(HogwartsSchool::printDetails).forEach(System.out::println);
    }

    static String printDetails(HogwartsHouse house) {
        return switch (house) {
            case Gryffindor gryffindor -> gryffindor.details();
            case Hafflepuff hafflepuff -> hafflepuff.details();
            case Ravenclaw ravenclaw -> ravenclaw.details();
            case Slytherin slytherin -> slytherin.details();
        };
    }
}
