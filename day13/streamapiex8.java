// collect() usage example
package day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamapiex8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
