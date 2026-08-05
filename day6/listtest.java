package day6;

import java.util.*;
public class listtest {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("salt");
        list.add("tooth paste");
        list.add("sugar");
        list.add("tomato");
        System.out.println(list);

        list.add(2,"Milk");
        System.out.println(list);
        
        list.set(0,"Rice");
        System.out.println(list);

        list.remove("sugar");
        System.out.println("Final list "+list);

        System.out.println("Total number of elements in the list : "+list.size());

        if(list.contains("Eggs")){
                 System.out.println("Egg is in the list");
        }
        else{
            System.out.println("Egg is not present");
        }

        list.clear();
        System.out.println(list);

        

    }
}
