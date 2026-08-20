package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35);

        numbers.stream()
                .filter(n -> n > 15)
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));
    }
}
