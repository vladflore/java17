package tech.vladflore.java17;

public class PatternMatchingExample {

    public static void main(String[] args) {
        Object obj = "Hello World";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        }
        if (obj instanceof String s) {
            System.out.println(s);
        }
    }
}