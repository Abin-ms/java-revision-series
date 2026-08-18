
package day11;

import java.util.*;

public class genericcollectionex1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Abin");
        names.add("Jibin");
        names.add("Sulu");

        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        printCollection(names);
        printCollection(numbers);
    }

    public static <T> void printCollection(Collection<T> collection) {

        for (T item : collection) {
            System.out.println(item);
        }
    }
}