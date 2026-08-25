package day13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamapiex10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        Optional<Integer> result = numbers.stream()
                .filter(n -> n > 20) 
                .findFirst();

        System.out.println(result);
    }
}
