//list characterstics three : every element in the list has index and we can fetch add modify the element with the referrence of the index.
package day6;

import java.util.*;
public class listcahrect3 {
    public static void main(String[] args){
         List<String> list = new ArrayList<>();

         list.add("apple");
         list.add("bat");
         list.add("cat");
         list.add("dog");

         System.out.println(list.get(3));
    }
    
}
