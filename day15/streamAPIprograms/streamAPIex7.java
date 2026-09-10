package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamAPIex7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                45, 12, 89, 34, 67, 23);

        Optional<Integer> result = numbers.stream()
                .reduce((a, b) -> a < b ? a : b);

        System.out.println(result);
    }
}
