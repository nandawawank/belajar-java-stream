package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {
    @Test
    void testAnyMatch() {
        boolean anyMatch = List.of(1,2,4,5,6,7,8,9,10,11).stream().anyMatch(number -> number > 10);

        System.out.println(anyMatch);
    }

    @Test
    void testAllMatch() {
        boolean allMatch = List.of(1,2,3,4,5,6,7,8,9,10).stream().allMatch(number -> number > 10);

        System.out.println(allMatch);
    }

    @Test
    void testNoneMatch() {
        boolean noneMatch = List.of(1,2,3,4,5,6,7,8,9,11).stream().noneMatch(number -> number > 10);

        System.out.println(noneMatch);
    }
}
