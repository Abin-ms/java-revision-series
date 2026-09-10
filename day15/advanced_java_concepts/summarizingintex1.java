package day15.advanced_java_concepts;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class summarizingintex1 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50, 60);

        IntSummaryStatistics status = numbers.stream()
        .collect(Collectors.summarizingInt(n -> n));


        // printing all in one go. 
        // System.out.println(status);

        //printing each one seperately.
        System.out.println("Count = "+status.getCount());
        System.out.println("Sum = "+status.getSum());
        System.out.println("Min value = "+status.getMin());
        System.out.println("Max value = "+status.getMax());
        System.out.println("Average = "+status.getAverage());
    }
}
