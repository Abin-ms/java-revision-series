package day10;

import java.util.Comparator;
import java.util.TreeMap;

public class treemapdemoo {

    public static void main(String[] args) {

        Comparator<Student1> byMarksThenName = Comparator
                .comparingInt((Student1 s) -> s.marks)
                .thenComparing(s -> s.name);

        TreeMap<Student1, String> students = new TreeMap<>(byMarksThenName);

        students.put(new Student1(103, "John", 85), "Student 1");
        students.put(new Student1(101, "Abin", 92), "Student 2");
        students.put(new Student1(102, "Rahul", 85), "Student 3"); // Same marks as John -> sorted by name ("John"
                                                                   // before "Rahul")
        students.put(new Student1(104, "Alice", 85), "Student 4"); // Same marks as John/Rahul -> sorted by name
                                                                   // ("Alice" first)

        students.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}

class Student1 {

    int id;
    String name;
    int marks;

    Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks + '}';
    }
}