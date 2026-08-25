package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 40, 10, 25, 5, 30);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println(max);

        int min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        System.out.println(min);
    }
}
