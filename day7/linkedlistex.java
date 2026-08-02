package day7;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistex {
    public static void main(String[] args){
        LinkedList<String> movies = new LinkedList<>();

        movies.add("Interstellar");
        movies.add("Incendies");
        movies.add("Arrival");
        movies.add("Kill bill");
        movies.add("Pulp Fiction");

        System.out.println("Inital Print");
        Iterator<String> itr = movies.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Adding one element at the first");
        movies.addFirst("Thanmathra");
    }
}
