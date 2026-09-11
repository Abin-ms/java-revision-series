package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamAPIex21 {
    public static void main(String[] args){

           List<Integer> numbers = Arrays.asList(
    10, 20, 10, 30, 20, 10, 40
);

Map<Integer,Long> result = numbers.stream()
.sorted()
.collect(Collectors.groupingBy(n -> n , Collectors.counting()))
;
  System.out.println(result);
    }
}
