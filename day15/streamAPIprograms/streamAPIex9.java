package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

public class streamAPIex9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Abin", "Rahul", "Alex", "Sam", "David", "John");

        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(name -> System.out.println(name));
    }
}
