package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 18, 21, 30, 33, 40);

        numbers.stream()
                .filter(n -> n > 20 && n % 2 == 0)
                .forEach(n -> System.out.println(n));

    }
}
