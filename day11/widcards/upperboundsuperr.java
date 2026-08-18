package day11.widcards;

import java.util.ArrayList;
import java.util.List;

public class upperboundsuperr {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        addNumbers(integers);
        addNumbers(numbers);
        addNumbers(objects);
    }

    public static void addNumbers(List<? super Integer> list) {
      
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        // Integer value = list.get(0);
        Object value = list.get(0);
        System.out.println(value);
    }
}
