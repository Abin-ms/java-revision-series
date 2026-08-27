package day14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalex1solution {
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(10,20,25,30);

        Optional<Integer> result = Optional.of(35);
        System.out.println(result.isPresent());
        System.out.println(numbers);
        
    }
}
