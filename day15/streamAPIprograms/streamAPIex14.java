package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamAPIex14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 11, 12, 13, 14, 15, 16, 17);

        Map<Integer, List<Integer>> result = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 3));

        System.out.println(result);
        
    }
}
