package day7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class vectorr_testexample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>(Arrays.asList("Java", "Python", "C++", "Javascript", "GO"));

        System.out.print("initial printing : " + list);

        list.add(2, "Kotlin");

        System.out.print("\nprinting after adding kotlin into 2 nd position : " + list);

        int valueOFGo = list.indexOf("GO");

        list.set(valueOFGo, "Rust");

        System.out.println("\nPrinting after replacing GO" + list);

        list.remove("Python");

        System.out.println("Python is removed : " + list);

        System.out.println("Printing using normal for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("printing using enhanced for loop : ");
        for (String li : list) {
            System.out.println(li);
        }

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        System.out.println("printing the first element : " + list.firstElement());

        System.out.println("printing the last element" + list.lastElement());

        System.out.println("Total number of elements is : " + list.size());

        while (itr.hasNext()) {
            if (itr.next().equals("Java")) {
                System.out.println("Yes,java is in the list.");
            } else {
                System.out.println("Java is not in the list");
            }

        }

    }
}
