import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Names {

    public static String formatNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "Mary", "John", "Anna");
        String formattedNames = formatNames(names);
        System.out.println(formattedNames);
    }
}
