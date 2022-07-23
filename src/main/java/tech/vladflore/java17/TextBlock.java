package tech.vladflore.java17;

public class TextBlock {
    public static void main(String[] args) {
        var content = """
            {
                "key1":"value1",
                "key2":"value2",
            }""";
        System.out.println(content);

        var sameContent = "{\n" +
                "    \"key1\":\"value1\",\n" +
                "    \"key2\":\"value2\",\n" +
                "}";
        System.out.println(sameContent);
        System.out.println(content.equals(sameContent));

        System.out.printf("""
                name: %s
                profession: %s%n""", "Vlad", "Software Engineer");
        System.out.println("---");
    }
}
