package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 20, 30, 20, 50, 10, 30, 40);

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
