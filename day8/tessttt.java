//The inner implementation of HashSet is simulated in here , shows how hashcode() and equals() are used to avoid duplicated values in the set. 

package day8;

import java.util.HashSet;
import java.util.Iterator;

public class tessttt {
    public static void main(String[] args){

        HashSet <Student> students = new HashSet<>();

        students.add(new Student(101, "Abin"));
         students.add(new Student(101, "Abin"));

         System.out.println(students.size());

         Iterator <Student> stu = students.iterator();
         while (stu.hasNext()) {

            System.out.print(stu.next());
            
         }
         System.out.println(students);
    }
}
 class Student{
    int id;
    String name;

    Student(int id , String name){
        this.id = id;
        this.name = name;

    }
    @Override
public boolean equals(Object obj){

    if (this == obj) {
        return true;
        
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Student other = (Student) obj;

    return id == other.id && name.equals(other.name);

}

@Override
public int hashCode(){
    return java.util.Objects.hash(id,name);
}


}

