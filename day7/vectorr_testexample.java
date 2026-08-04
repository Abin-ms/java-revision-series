package day7;

import java.util.Arrays;
import java.util.Vector;

public class vectorr_testexample {
    public static void main(String[] args){
        Vector<String> list = new Vector<>(Arrays.asList("Java","Python","C++","Javascript","GO"));

        System.out.print("initial printing : "+list);

        list.add(2,"Kotlin");

        System.out.print("\nprinting after adding kotlin into 2 nd position : "+list);

        int valueOFGo = list.indexOf("GO");

        list.set(valueOFGo, "Rust");

        System.out.println("\nPrinting after replacing GO"+list);

        list.remove("Python");

        
    }
}
