package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    void testLimit() {
        List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .takeWhile(name -> name.length() > 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .dropWhile(name -> name.length() < 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .findAny();

        optional.ifPresent(name -> System.out.println(name));
    }

    @Test
    void testFindFist() {
        Optional<String> optional = List.of("Nanda", "Wawan", "Kurniawan", "Desy", "Koreatul", "Aini").stream()
                .findFirst();

        optional.ifPresent(System.out::println);
    }
}
