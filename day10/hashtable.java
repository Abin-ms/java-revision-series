package day10;

import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(101, "Abin");
        table.put(102, "Rahul");
        table.put(103, "Jibin");

        System.out.println(table);

        System.out.println(table.get(102));

        table.remove(103);

        System.out.println(table);
        table.put(null, "Test");

    }
}
