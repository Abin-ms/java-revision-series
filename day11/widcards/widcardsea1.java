package day11.widcards;

import java.util.*;

public class widcardsea1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abin", "Jibin", "Sulu");

        List<Integer> numbers = Arrays.asList(10, 20, 30);
        display(numbers);
        display(names);
    }

    public static void display(List<?> list) {
        System.out.println(list);
    }
}
