package day15.advanced_java_concepts;

import java.util.Arrays;
import java.util.List;

public class flatmapex2 {
    public static void main(String[] args){
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)); 

                
                numbers.stream()
                .flatMap(list -> list.stream())
                .filter( n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
