package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        numbers.stream()
                .skip(2)
                .limit(3)
                .forEach(n -> System.out.println(n));
    }
}
