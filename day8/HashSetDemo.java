package day8;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> lang = new HashSet<>();

        lang.add("Java");
        lang.add("SQL");
        lang.add("Spring Boot");
        lang.add("React");
        lang.add("Java");
        lang.add("SQL");
        System.out.println("The Initial set : " + lang);
        System.out.println("Total number of course : "+lang.size());

        // Iterator <String> itr = lang.iterator();

        // while (itr.hasNext()) {
        // if (itr.next().equals("React")) {
        // System.out.println("React is present in the set.");
        // }
        // else{
        // System.out.println("React is not present in the set");
        // }
        // }
        System.out.println("react is present: " + lang.contains("React"));

        System.out.println("SQl is removed : " + lang.remove("SQL"));
        System.out.println("Iterating using enhanced for loop");
        for (String lan : lang) {
            System.out.print(lan + " ");

        }

        System.out.println("Iterating using iterator");
        Iterator<String> itr = lang.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");

        }

    }
}
