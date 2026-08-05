package day8;

import java.util.LinkedList;
import java.util.Queue;

public class queueex1 {
    public static void main(String[] args){
        Queue<String> qlist = new LinkedList<>();
        
        qlist.add("Abin");
        qlist.add("Rahul");
        qlist.add("John");
        qlist.add("Peter");
        qlist.add("Steve");

        System.out.println("First customer : "+qlist.peek());
        qlist.poll();
        qlist.poll();
        System.out.println("Removed two customers using poll()");
        System.out.println("Updated queue : " +qlist);

        qlist.offer("David");
        System.out.println("The updated queue : "+qlist);

        System.out.println("Size of the queue is : "+qlist.size());

        while (qlist.size()!=0) {
            System.out.println(qlist.poll());
        }


    }
}
