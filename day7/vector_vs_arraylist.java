package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class vector_vs_arraylist {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("abin","jibin"));

        System.out.print(list);
        List<String> list2 = new ArrayList<>();

        list2.add("hellloo");
        list2.remove(0);
        System.out.println(list2);
        // list2.add("hellloo");
        // list2.remove(0);
        // System.out.println(list2);  Here multiple threads can access same file or resource but there is no thread safety.That is ArrayList is not Synchronized.
       // But vector list is Synchronized and Thread safe.

        
    }
}
