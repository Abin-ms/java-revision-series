package day11.widcards;

import java.util.*;

public class uppboundex {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        List<Double> decimals = Arrays.asList(10.5, 20.5, 30.5);

        displayNumbers(numbers);
        displayNumbers(decimals);

    }

    public static void displayNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
        System.out.println();
        // list.add(100);
    }
}
