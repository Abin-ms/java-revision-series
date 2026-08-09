package day9;

import java.util.TreeSet;

public class comparabledemo2 {

    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(103, "John"));
        students.add(new Student(101, "Abin"));
        students.add(new Student(102, "Rahul"));
        students.add(new Student(103, "Jibi"));
        students.add(new Student(105, "Abin"));

        System.out.println(students);
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
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "'}";
    }
}