package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPIpgm2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
