
package day10;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollisionDemo {

    public static void main(String[] args) {

        Map<Studentt, String> students = new HashMap<>();

        Studentt s1 = new Studentt(101, "Abin");
        Studentt s2 = new Studentt(102, "Rahul");

        students.put(s1, "Student One");
        students.put(s2, "Student Two");

        System.out.println(students);
        System.out.println(students.get(s1));
        System.out.println(students.get(s2));
    }
}

class Studentt {

    int id;
    String name;

    Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;   // deliberately forcing a collision
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Studentt))
            return false;

        Studentt other = (Studentt) obj;

        return this.id == other.id &&
               this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
               ", name='" + name + "'}";
    }
}