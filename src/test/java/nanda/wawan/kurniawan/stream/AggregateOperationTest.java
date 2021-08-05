package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {
    @Test
    void testMax() {
        List.of("Nanda", "Wawan", "Kurniawan").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Nanda", "Wawan", "Kurniawan").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Nanda", "Wawan", "Kurniawan").stream()
                .count();

        System.out.println(count);
    }

    @Test
    void testSum() {
        int sum = List.of(1,2,3,4,5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(sum);
    }
}
