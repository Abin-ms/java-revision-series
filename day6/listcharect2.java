//second characterstic of list interface : it allows duplicate values (set will not allow duplicate values)

package day6;

import java.util.*;

public class listcharect2 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("apple");

        System.out.println(list);
    }
}
