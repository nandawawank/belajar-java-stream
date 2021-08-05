package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream<Object> stream = Stream.builder()
                .add("Nanda").add("Wawan").add("Kurniawan").build();

        stream.forEach(System.out::println);
    }
}
