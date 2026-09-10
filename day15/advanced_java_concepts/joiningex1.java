package day15.advanced_java_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningex1 {
    public static void main(String[] args){
        List<String> names = Arrays.asList(
    "Abin", "Rahul", "John", "Alex", "David"
);

String result = names.stream()
.collect(Collectors.joining("-"));
System.out.println(result);
    }
}
