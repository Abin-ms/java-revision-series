package day9;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(75);
        numbers.add(90);
        numbers.add(60);
        numbers.add(75);
        numbers.add(85);
        numbers.add(95);
        numbers.add(70);

        System.out.println("Initial set : "+numbers);
        numbers.first();
        numbers.last();
        
    }
}
