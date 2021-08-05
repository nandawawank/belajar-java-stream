package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilterOperationTest {
    @Test
    void testFilter() {
        List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Nanda", "Wawan", "Kurniawan", "Nanda").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
