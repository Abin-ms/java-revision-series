package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPIex10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Abin", "Rahul", "Alex", "Sam");

        List<String> result = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
