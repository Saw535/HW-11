import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedNumbers {

    public static String sortedNumbers(String[] arr) {
        String combined = Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .collect(Collectors.joining(", "));

        return Arrays.stream(combined.split(", "))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String sortedNumbers = sortedNumbers(arr);
        System.out.println(sortedNumbers);
    }
}