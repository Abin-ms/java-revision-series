package day15.streamAPIprograms;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamAPIex20 {

    public static void main(String[] args) {

        String word = "swiss";

        Map<String, Long> frequency = word.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        Optional<String> result = word.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .filter(c -> frequency.get(c) == 1)
                .findFirst();

        System.out.println(result);
    }
}