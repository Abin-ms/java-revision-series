package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPIex5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
