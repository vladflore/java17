
import java.util.Arrays;

public class FilteringData {
    public static void main(String[] args) {
        Arrays.stream(new int[] { 0, 2, 4, 6, 8, 9, 10 })
                .dropWhile(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
