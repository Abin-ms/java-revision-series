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

        System.out.println(students);
    }
}
