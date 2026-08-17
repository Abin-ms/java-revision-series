package day10;

import java.util.TreeMap;

public class TreemapDemo2 {
    public static void main(String[] args) {
        TreeMap<Studenttt, String> students = new TreeMap<>();

        students.put(new Studenttt(103, "John"), "Student 1");
        students.put(new Studenttt(101, "Abin"), "Student 2");
        students.put(new Studenttt(102, "Rahul"), "Student 3");

        System.out.println(students);

    }
}

class Studenttt implements Comparable<Studenttt> {
    int id;
    String name;

    Studenttt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Studenttt other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "'}";
    }
}