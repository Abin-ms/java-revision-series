
package day10;

import java.util.Comparator;
import java.util.TreeSet;

public class comparatordemo2 {
    public static void main(String[] args) {
        Comparator<Student> byMarksThenName = Comparator.comparingInt((Student s) -> s.marks)
                .thenComparing(s -> s.name);

        TreeSet<Student> bymarkthnname = new TreeSet<>(byMarksThenName);

        Student s1 = new Student(102, "Abin", 40);
        Student s2 = new Student(103, "Jibin", 44);
        Student s3 = new Student(101, "Sulu", 45);
        Student s4 = new Student(101, "Sisu", 40);
        Student s5 = new Student(101, "kala", 41);

        bymarkthnname.add(s1);
        bymarkthnname.add(s2);
        bymarkthnname.add(s3);
        bymarkthnname.add(s4);
        bymarkthnname.add(s5);

        System.out.println("comparing by marks then name : " + bymarkthnname);

    }
}

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "', marks" + marks + "}";
    }

}
