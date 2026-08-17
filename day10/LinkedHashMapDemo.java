package day10;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> Students = new LinkedHashMap<>();

        Students.put(103, "John");
        Students.put(101, "Abin");
        Students.put(102, "Rahul");
        Students.put(104, "Jibin");

        Students.put(102, "New Rahul");

        System.out.println(Students);
        Students.remove(101);
        Students.put(101, "New Abin");

        System.out.println(Students);
    }
}
