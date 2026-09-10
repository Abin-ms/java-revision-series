package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPIex4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 25, 30, 45, 50, 60, 75);

                long result = numbers.stream()
                .filter(n -> n >40)
                .count();
                System.out.println(result);
        // IntSummaryStatistics result = numbers.stream()
        //         .filter(n -> n > 40)
        //         .collect(Collectors.summarizingInt(n -> n));
        // System.out.println(result.getCount());
    }
}
