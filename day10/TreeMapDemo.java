package day10;

import java.util.TreeMap;


public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "John");
        students.put(101, "Abin");
        students.put(102, "Rahul");
        students.put(105, "Jibin");
        students.put(104, "Sulu");

        System.out.println(students);

        System.out.println("First key: " + students.firstKey());
        System.out.println("Last key: " + students.lastKey());

        System.out.println("Lower than 103: " + students.lowerKey(103));
        System.out.println("Higher than 103: " + students.higherKey(103));

        System.out.println("Ceiling of 103: " + students.ceilingKey(103));
        System.out.println("Floor of 103: " + students.floorKey(103));
    }
}
