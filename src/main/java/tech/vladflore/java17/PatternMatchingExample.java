package tech.vladflore.java17;

public class PatternMatchingExample {

    public static void main(String[] args) {
        Object obj = "Hello World";
        if (obj instanceof String) {
            String s = (String) obj;
            // do something with s
        }
        if (obj instanceof String s) {
            // do something with s
        }
    }
}