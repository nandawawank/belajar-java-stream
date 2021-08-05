package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {
    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9)
                .collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));

        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9)
                .collect(Collectors.groupingBy(number -> number < 4 ? "Kecil" : "Besar"));

        System.out.println(collect);
    }

    @Test
    void testPartitionBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1,2,3,4,5,6,7,8,9)
                .collect(Collectors.partitioningBy(number -> number < 4));

        System.out.println(collect);
    }
}
