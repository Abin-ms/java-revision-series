package day13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class streamapiex4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 20, 40, 10, 30);

        numbers.stream()
                .sorted()
                .forEach(n -> System.out.println(n));

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));
    }
}
