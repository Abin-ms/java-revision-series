package day7;

import java.util.Arrays;
import java.util.Vector;

public class vectorr_testexample {
    public static void main(String[] args){
        Vector<String> list = new Vector<>(Arrays.asList("Java","Python","C++","Javascript","GO"));

        System.out.println(list);

        list.add(2,"Kotlin");
        
    }
}
