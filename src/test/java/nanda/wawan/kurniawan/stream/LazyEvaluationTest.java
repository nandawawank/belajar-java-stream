package nanda.wawan.kurniawan.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {
    @Test
    void testIntermedietOperation() {
        List<String> names = List.of("Nanda", "Wawan", "Kurniawan");
        Stream<String> upper = names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to Upper Case");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Nanda", "Wawan", "Kurniawan");
        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to Mr");
                    return "Mr " + name;
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Upper Case");
                    return upper.toUpperCase();
                })
                .forEach(upper -> {
                    System.out.println(upper);
                });
    }
}
