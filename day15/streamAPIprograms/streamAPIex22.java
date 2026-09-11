package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamAPIex22 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 20, 10, 30, 20, 40, 30, 50);

        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // System.out.println(frequency);
        List<Integer> result = numbers.stream()
                .filter(n -> frequency.get(n) > 1)
                .distinct()
                .toList();

        System.out.println(result);

    }
}
