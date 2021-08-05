package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmpetyOrSingleStream() {
        // define empty stream
        Stream<String> emptyStream = Stream.empty();
        // start run flow data from stream
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        // define string stream
        Stream<String> singleStream = Stream.of("Nanda");
        // start run flow data stream
        singleStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> empetyOrNotStream = Stream.ofNullable(data);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Nanda", "Wawan", "Kurnawan");
        arrayStream.forEach(data -> System.out.println(data));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(System.out::println);

        String[] array = new String[] {
                "Nanda", "Wawan", "Kurniawan"
        };

        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Nanda", "Wawan", "Kurniawan");
        Stream<String> stringStream= collection.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        // this stream will print out Nanda Wawan K with infinita loop
        Stream<String> generate = Stream.generate(() -> "Nanda Wawan K");

        // this stream will print out value += value and contionues with infinite loop
        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
    }
}
