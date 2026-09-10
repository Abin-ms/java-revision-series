package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

public class streampgm2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 20, 33, 40, 15, 8);

        numbers.stream()
                .filter(n -> n > 15)
                .forEach(n -> System.out.println(n));
    }
}
