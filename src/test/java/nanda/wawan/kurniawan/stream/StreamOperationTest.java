package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void testStreamOperation() {
        List<String> names = List.of("Nanda", "Wawan", "Kurniawan");

        Stream<String> streamName = names.stream();
        Stream<String> streamUpper = streamName.map(name -> name.toUpperCase());

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
