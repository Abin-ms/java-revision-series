package day7;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistex {
    public static void main(String[] args) {
        LinkedList<String> movies = new LinkedList<>();

        movies.add("Interstellar");
        movies.add("Incendies");
        movies.add("Arrival");
        movies.add("Kill bill");
        movies.add("Pulp Fiction");

        System.out.println("Inital Print");
        Iterator<String> itr = movies.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
        }

        System.out.println("Adding one element at the first");
        movies.addFirst("Thanmathra");

        for (int i = 0; i < movies.size(); i++) {
            System.out.print(movies.get(i) + ",");
        }

        System.out.println("\nAdding an element at the end");
        movies.addLast("Thaniavarthanm");

        for (String movie : movies) {
            System.out.print(movie + ",");
        }

        System.out.println("First movie is : " + movies.getFirst() + "\nLast movie is : " + movies.getLast());

        System.out.println("\nRemoving the first movie");
        movies.removeFirst();
        System.out.println("Removed the first element");

        System.out.println("Removing the last movie");
        movies.removeLast();
        System.out.println("Removed the last element");

        System.out.println("Printing using a for-each loop");
        for (String movie : movies) {
            System.out.print(movie + ",");
        }

        System.out.println("\nTotal number of movies is : " + movies.size());
    }
}
