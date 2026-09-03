package day14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class optionalex5 {
    public static void main(String[] args){
        
         List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

         Optional<Integer> result = numbers.stream()
         .filter(n -> n > 100)
         .findFirst();
         
         int value = result.orElseThrow(() -> new RuntimeException("No number greater than 100"));

         System.out.println(value);

    }
}
