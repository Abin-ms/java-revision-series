package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        boolean result = numbers.stream()
                .anyMatch(n -> n > 25);

        boolean result2 = numbers.stream()
                .allMatch(n -> n > 5);

        boolean result3 = numbers.stream()
                .noneMatch(n -> n > 100);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
}
