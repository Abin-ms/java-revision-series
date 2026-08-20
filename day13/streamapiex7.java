package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        long count = numbers.stream()
                .filter(n -> n > 20)
                .count();
        System.out.println(count);
    }
}
