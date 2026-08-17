package day10;

import java.util.HashMap;
import java.util.Map;

public class hashmapdemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Abin");
        students.put(102, "Rahul");
        students.put(103, "Jibin");
        students.put(104, "Sulu");
        students.put(101, "Jhon");
        students.put(105, "Abin");


        System.out.println(students);

        System.out.println(students.get(102));
        System.out.println(students.remove(103));
        System.out.println("Students hasmap updated version : " + students);

        System.out.println("Students hasmap updated version : " + students.containsKey(101));
        System.out.println(students);
        System.out.println("hashmap have the value Rahul : " + students.containsValue("Rahul"));

        System.out.println("Total size of the hashmap : " + students.size());
           

        
        System.out.println(students);

        System.out.println(students.get(999));
    }
}
