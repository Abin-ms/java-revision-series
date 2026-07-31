package day6;

import java.util.*;
public class arraylistextest {
    public static void main(String[] args){
        List<String> students = new ArrayList<>();

        students.add("scott");
        students.add("Jack");
        students.add("Rose");
        students.add("WIck");
        students.add("Stark");
        students.add("Peter");
        students.add("Sam");
        students.add("Nat");
        students.add("Steve");

        System.out.println(students);

        students.add(3,"Hawk");
        System.out.println(students);

        students.set(7, "suku");
        System.out.println(students);

        students.remove(2);
        System.out.println(students);

        students.remove("Sam");
        System.out.println(students);

        for(int i=1;i<=students.size();i++){
           System.out.println(students.get(i));
        }
        if(students.contains("Rahul")){
        System.out.println("Rahul is present in the list");
        }
        else{
            System.out.println("Rahul is not present in the list");
        }
    }
    
    

}
