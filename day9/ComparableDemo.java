package day9;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> Students = new TreeSet<>();

        Students.add(new Student(103, "Jhon"));
        Students.add(new Student(101, "Abin"));
        Students.add(new Student(102, "Rahul"));

        System.out.println(Students);

    }
}

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);

    }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "'}";
    }
}
