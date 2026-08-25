package day13;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streamapiex9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40);

        Set<Integer> result = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(result);

    }
}
//huhhh
//kiruhhhhuu