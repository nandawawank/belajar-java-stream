package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testPeek() {
        List.of("Nanda", "Wawan", "Kurniawan").stream()
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println("After upper case " + name))
                .forEach(System.out::println);
    }
}
