package day8;

import java.util.HashSet;

public class hashsetexample2 {
    public static void main(String[] args){
        HashSet <String> language = new HashSet<>();

        language.add("C");
        language.add("C++");
        language.add("Java");
        language.add("Python");

        System.out.println("Hashset : "+language);

        HashSet <String> language2 = new HashSet<>();
        language2.add("GO");
        //using addAll() method.
        language2.addAll(language);

        System.out.println("The copied new hashset : "+language2);

    }
}
