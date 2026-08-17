package day10.map_traversal;

import java.util.HashMap;
import java.util.Map;

public class keyysett {
    public static void main(String[] args) {
        Map<Integer, String> stud = new HashMap<>();

        stud.put(101, "Abin");
        stud.put(102, "Jibin");
        stud.put(103, "Sisu");
        stud.put(104, "sulu");
        stud.put(105, "Blaa");

        System.out.println(stud);
        System.out.println(stud.keySet());
        System.out.println(stud.values());
        System.out.println(stud.entrySet());

        System.out.println("keySet() using for loop");
        for (Integer id : stud.keySet()) {
            System.out.print(id + " ");
        }
        System.out.println("\nvalues() using for loop.");
        for (String name : stud.values()) {
            System.out.print(name + " ");
        }

        System.out.println("\nenntrySet() using for loop");
        for (Map.Entry<Integer, String> entry : stud.entrySet()) {
            System.out.println("id : " + entry.getKey() + ", value :" + entry.getValue());
        }

        stud.forEach((id, name) -> {
            if (id > 102) {
                System.out.println("Student ID = " + id + " | Student Name = " + name);

            }
        });
    }
}
