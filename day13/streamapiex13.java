package day13;

import java.util.Arrays;
import java.util.List;

public class streamapiex13 {
    public static void main(String[] args){
        List<Integer> numbers =
        Arrays.asList(5, 10, 15, 20);

        int sum = numbers.stream()
        .reduce(0 , (a,b) -> a + b);

        System.out.println(sum);
    }
}
