package day15.advanced_java_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingByex1 {
    public static void main(String[] args){
        List<String> names = Arrays.asList(
        "Abin", "Rahul", "Alex", "Sam", "David"
);

Map<Integer,List<String> > result = names.stream()
.collect(Collectors.groupingBy( name -> name.length()));

System.out.println(result);
    }
}
