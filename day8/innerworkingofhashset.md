This actually shows the test case where the hashset finds dupicate value .

---
Student s1 = new Student(101, "Abin");
Student s2 = new Student(101, "Abin");

System.out.println(s1.equals(s2));

System.out.println(s1.hashCode() == s2.hashCode());

HashSet<Student> set = new HashSet<>();

set.add(s1);
set.add(s2);

System.out.println(set.size());
---
Here's what happens internally : 

s1
 ↓
hashCode()
 ↓
Bucket 5
 ↓
Store

s2
 ↓
hashCode()
 ↓
Bucket 5
 ↓
equals(s1)?
 ↓
true
 ↓
Duplicate
 ↓
Don't store


----


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
@Override
public String toString() {
    return "Student{id=" + id +
           ", name='" + name + "'}";
}

}


--- 
This is the actual flow of  the above code : 

    
Student

↓

hashCode()

↓

Bucket 4

↓

Another Student

↓

hashCode()

↓

Bucket 4

↓

equals()

↓

Same Student?

↓

YES

↓

Don't Insert