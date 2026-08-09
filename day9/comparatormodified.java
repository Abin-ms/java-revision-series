package day9;

import java.util.Comparator;
import java.util.TreeSet;

public class comparatormodified {
    public static void main(String[] args) {

        Comparator<Student> byName = (s1, s2) -> s1.name.compareTo(s2.name);

        Comparator<Student> byId = (s1, s2) -> Integer.compare(s1.id, s2.id);

        Comparator<Student> byNameDescending = byName.reversed();

        TreeSet<Student> studentsByName = new TreeSet<>(byName);
        TreeSet<Student> studentsById = new TreeSet<>(byId);
        TreeSet<Student> studentsBydescName = new TreeSet<>(byNameDescending);

        Student s1 = new Student(102, "Abin");
        Student s2 = new Student(103, "Jibin");
        Student s3 = new Student(101, "Sulu");

        studentsByName.add(s1);
        studentsByName.add(s2);
        studentsByName.add(s3);

        studentsById.add(s1);
        studentsById.add(s2);
        studentsById.add(s3);

        studentsBydescName.add(s1);
        studentsBydescName.add(s2);
        studentsBydescName.add(s3);

        System.out.println("By name\n" + studentsByName);
        System.out.println("By id : \n" + studentsById);
        System.out.println("By name descending : \n" + studentsBydescName);

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
