package day11.widcards;

import java.util.Arrays;
import java.util.List;

public class wildcaerdex2 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Abin", "Jibin", "Sulu");

        List<Integer> numbers = Arrays.asList(10, 20, 30);
        display(numbers);
        display(names);
    }
    public static void display(List<?> list){
        for(Object value : list){
            System.out.println(value);
        }
        System.out.println();

    }
}
