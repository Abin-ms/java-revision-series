//comparing using the "id"(intger value) you can see the last value  -Students.add(new Student(103, "Jibi"));- it is a different object but is not added to the Treeset because we are comparing based on the id , which finds the last value as duplicate, lets compare it using the string value in another pgm


package day9;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> Students = new TreeSet<>();

        Students.add(new Student(103, "Jhon"));
        Students.add(new Student(101, "Abin"));
        Students.add(new Student(102, "Rahul"));
        Students.add(new Student(103, "Jibi"));

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
