package day9;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(75);
        numbers.add(90);
        numbers.add(60);
        numbers.add(75);
        numbers.add(85);
        numbers.add(95);
        numbers.add(70);

        System.out.println("Initial set : " + numbers);
        System.out.println("Initial set : " + numbers.first());
        System.out.println("Largest element : " + numbers.last());
        System.out.println("lower than 75 : " + numbers.lower(75));
        System.out.println("higher than 75 : " + numbers.higher(75));
        System.out.println("using ceiling method : " + numbers.ceiling(76));
        System.out.println("using floor function : " + numbers.floor(76));

        if(numbers.remove(85)){
            System.out.println("85 is removed.");
        }
        else
            System.out.println("85 is not removed");

        System.out.println("Updated set : " + numbers);

        System.out.println("Iterating using enhanced for loop");
        for (Integer num : numbers) {
            System.out.print(num + "  ");
        }
        System.out.println("\nPrinting using Iterator");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "  ");
        }

    }
}
