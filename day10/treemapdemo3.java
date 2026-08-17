package day10;
import java.util.Comparator;
import java.util.TreeMap;

public class treemapdemo3{

    public static void main(String[] args) {

        // Comparator<Student1> byName =
        // (s1, s2) -> s1.name.compareTo(s2.name);
        Comparator<Student1> byId = 
             (s1,s2) -> Integer.compare(s1.id, s2.id);

        TreeMap<Student1, String> students =
                new TreeMap<>(byId);

        students.put(new Student1(103, "John"), "Student 1");
        students.put(new Student1(101, "Abin"), "Student 2");
        students.put(new Student1(102, "Rahul"), "Student 3");

        System.out.println(students);
    }
}

class Student1 {

    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "'}";
    }
}