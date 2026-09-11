package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class streamAPIex23 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 15, 20, 25, 30, 35, 40);

        OptionalDouble result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .average();

        System.out.println(result);

    }
}
