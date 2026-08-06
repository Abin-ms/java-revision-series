package day8;

import java.util.HashSet;
import java.util.Iterator;

public class iteratinghtroughhashset {
    public static void main(String[] args) {
        HashSet<String> sett = new HashSet<>();

        sett.add("aa");
        sett.add("bb");
        sett.add("cc");
        sett.add("dd");

        System.out.println("Printing the hashset normaly : " + sett);

        Iterator<String> itr = sett.iterator();

        while (itr.hasNext()) {

            System.out.print(itr.next());

            System.out.print(",");

        }

    }
}
