package day6;
import java.util.*;
public class iteratorex {
    public static void main(String[] args){
         List<String> li = new ArrayList<>();

        li.add("apple");
        li.add("ball");
        li.add("bat");
        li.add("cat");
        li.add("dog");
        Iterator<String> lt =  li.iterator();

        while(lt.hasNext()){
            System.out.println(lt.next());
        }

    } 
}
