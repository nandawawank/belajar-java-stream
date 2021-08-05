package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testStreamPipeline() {
        List<String> names = List.of("Nanda", "Wawan", "Kurniawan");
        names.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr " + upper)
                .forEach(System.out::println);

    }
}
