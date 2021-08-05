package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {
    @Test
    void testCreate() {
        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(1,2,3,4,5,6);
        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
    }

    @Test
    void testOperation() {
        IntStream intStream = IntStream.range(1, 20);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(System.out::println);

       IntStream.range(1, 10)
               .mapToObj(number -> "Number : " + number)
               .forEach(System.out::println);
    }
}
