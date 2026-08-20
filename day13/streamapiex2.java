package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex2 {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
        
        numbers.stream()
                .map(n -> n * 2)
                .forEach( n -> System.out.println(n));

    }
}
