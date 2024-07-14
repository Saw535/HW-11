import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ZipStreams {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.toList();
        List<T> secondList = second.toList();
        int minSize = Math.min(firstList.size(), secondList.size());

        return IntStream.range(0, minSize)
                .boxed()
                .flatMap(i -> Stream.of(firstList.get(i), secondList.get(i)));
    }

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4);
        Stream<Integer> stream2 = Stream.of(5, 6, 7);

        Stream<Integer> zippedStream = zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}
