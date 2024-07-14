import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndUpperCase {

    public static List<String> sortAndUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Mary", "John", "Anna");
        List<String> sortedUpperCaseNames = sortAndUpperCase(names);
        sortedUpperCaseNames.forEach(System.out::println);
    }
}