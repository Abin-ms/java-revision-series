package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamAPIex15 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(
    10, 15, 20, 25, 30, 35, 40
);

Map<Boolean,List<Integer>> result = numbers.stream()
.collect(Collectors.partitioningBy(n -> n % 2 == 0));

System.out.println(result);

   }
}
