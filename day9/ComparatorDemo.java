package day9;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {

         Comparator<Student> byName = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }

        
    };
    // Comparator<Student> byId = new Comparator<Student>() {
            
    //         @Override
    //         public int compare(Student s1 , Student s2) {
    //             return s1.id.compareTo(s2.id);
    //         }
    //     };

        TreeSet<Student> students = new TreeSet<>(byName);
        students.add(new Student(103, "John"));
        students.add(new Student(101, "Abin"));
        students.add(new Student(102, "Rahul"));
        students.add(new Student(103, "Jibi"));
        students.add(new Student(104, "Abin"));

        System.out.println(students);
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
     @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "'}";
    }
   
}
