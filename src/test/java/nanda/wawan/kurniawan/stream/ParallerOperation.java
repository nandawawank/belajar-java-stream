package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ParallerOperation {
    @Test
    void testSequential() {
        Stream.of(1,2,3,4,5,6,7,8,9)
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
    }

    @Test
    void testPrallel() {
        Stream.of(1,2,3,4,5,6,7,8,9)
                .parallel()
                .forEach(number -> {
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                });
    }
}
