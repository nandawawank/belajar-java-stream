package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reserveComparator = Comparator.reverseOrder();

        List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .sorted(reserveComparator)
                .forEach(System.out::println);
    }
}
