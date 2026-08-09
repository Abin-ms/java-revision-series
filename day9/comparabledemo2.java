package day9;

public class comparabledemo2 {
    public static void main(String[] args) {

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
    public String compareTo(Student other) {

        return String.compare(this.name, other, name);
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
                ", name='" + name + "'}";
    }

}
