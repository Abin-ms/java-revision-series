package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamAPIex18 {
    public static void main(String[] args) {

        List<List<String>> names = Arrays.asList(
                Arrays.asList("Abin", "Rahul"),
                Arrays.asList("Alex", "Sam"),
                Arrays.asList("David", "John"));

        List<String> result = names.stream()
                .flatMap(list -> list.stream())
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
