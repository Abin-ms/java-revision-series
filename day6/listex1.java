//first characterstic of list : maintains insertion order ; the list will be exactly in the order of insertion.

package day6;

import java.util.*;
import java.util.ArrayList;

public class listex1 {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Ball");
        list.add("cat");
        list.add("Dog");

        System.out.println(list);
    }
    
}
