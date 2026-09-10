package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class advanedstreampracticeproblem {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 45, 50, 60, 75, 80);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        Optional<Integer> summ = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a + b);

        System.out.println("Sum of even numbers : " + summ);

        Optional<Integer> result2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a > b ? a : b);

        System.out.println("Maximum even number in the list is : " + result2);
    }
}
