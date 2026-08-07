package day9;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> sett = new LinkedHashSet<>();

        sett.add("Interstellar");
        sett.add("Inception");
        sett.add("The Dark Knight");
        sett.add("Interstellar");
        sett.add("Tenet");

        System.out.println(sett);

        System.out.println("Total number of movies : " + sett.size());
        if (sett.contains("Tenet")) {
            System.out.println("Tenet is present in the list.");
        }

        System.out.println("Inception removed : " + sett.remove("Inception"));

        System.out.println("Updated set : " + sett);

        System.out.println("Printing using enhanced for loop : ");
        for (String se : sett) {
            System.out.print(se + ", ");
        }

        System.out.println("Printing using iterator");
        Iterator<String> itr = sett.iterator();

        while (itr.hasNext()) {

            System.out.print(itr.next() + " ,");

        }

    }
}
