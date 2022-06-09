import java.util.*;
import java.util.stream.Stream;

public class StreamMain {
    private static List numbersList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    private static Stream<Integer> stream = numbersList.stream();

    public static void main(String[] args) {
        stream.filter(x -> x > 0);
        stream.filter(x -> x % 2 == 0);
        stream.sorted(Comparator.naturalOrder());
        stream.forEach(System.out::println);
    }
}
