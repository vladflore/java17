public class PatternMatchingExample {
    public static void main(String[] args) {
        Object o = "Hello World";
        if (o instanceof String) {
            String s = (String) o;
            System.out.println(s);
        }
        if (o instanceof String s) {
            System.out.println(s);
        }
    }
}