package tech.vladflore.java17;

public class RecordExample {

    public static void main(String[] args) {
        var harry = new HogwartsStudent("Harry Potter", House.GRYFFINDOR);
        System.out.println(harry.identify());
        System.out.println(harry.name());
        System.out.println(harry.house());
        harry.performSpell();
    }
}
