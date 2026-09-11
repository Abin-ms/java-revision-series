package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class streamAPIex19 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                10, 50, 30, 80, 60, 80, 40);

        Optional<Integer> result = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(result);
    }
}
