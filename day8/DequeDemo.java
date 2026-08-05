package day8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args){
        Deque <String> tasks = new ArrayDeque<>();

        tasks.addFirst("SQL");
        tasks.addLast("Spring ");   
        tasks.addFirst("Java");
        tasks.addLast("React");

        System.out.println(tasks);
        System.out.println("first task is : "+tasks.getFirst());
        System.out.println("Last task is : "+tasks.getLast());

        System.out.println("Removing one element from the front : "+tasks.pollFirst());
        System.out.println("Removing one element from the rear : "+tasks.pollLast());
        System.out.println("Updated queue : "+tasks);

        tasks.push("Docker");
        System.out.println("removed element : "+tasks.poll()+"from the queue");
        


    }
}
