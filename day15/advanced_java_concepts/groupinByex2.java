package day15.advanced_java_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupinByex2 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10,12,34,55);

        // Map<Integer,List<Integer>> result = numbers.stream()
        // .collect(Collectors.groupingBy(n -> n % 2));

        Map<Boolean,List<Integer>> result = numbers.stream()
        .collect(Collectors.groupingBy(n -> n % 2 == 0));


        System.out.println(result);
    }
}
