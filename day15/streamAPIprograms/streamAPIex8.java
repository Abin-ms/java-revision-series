package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamAPIex8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 15, 20, 25, 30, 35, 40);

        Optional<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce((a, b) -> a + b);

        System.out.println(result);
    }
}
