package day14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalex4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        System.out.println(numbers);

        // Optional<Integer> result = numbers.stream()
        // .filter(n -> n > 20)
        // .finFirst();

        Optional<Integer> result = numbers.stream()
                .filter(n -> n > 100)
                .findFirst();

        System.out.println(result.orElse(-1));

    }
}
