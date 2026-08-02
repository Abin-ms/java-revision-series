package day6;

import java.util.*;

public class forloop1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Delhi");
        list.add("Mumbai");
        list.add("Chennai");
        list.add("Kochi");
        list.add("Banglore");
        
        System.out.println("Printing using normal loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("printing using 'for each' for loop");
        for(String lis : list){
            System.out.println(lis);
        }

        System.out.println("Printing using iterator");
    }
}
