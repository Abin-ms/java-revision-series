package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPIex12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Abin", "Rahul", "Alex", "Sam");

        String result = names.stream()
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
