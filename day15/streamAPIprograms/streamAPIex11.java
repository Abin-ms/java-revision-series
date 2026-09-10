package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class streamAPIex11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Abin", "Rahul", "Alex", "Sam");

        Optional<String> result = names.stream()
                .filter(name -> name.length() > 4)
                .findFirst();

        System.out.println(result);
    }
}
