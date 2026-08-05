package day8;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pqlist = new PriorityQueue<>();
        pqlist.add(40);
        pqlist.add(10);
        pqlist.add(60);
        pqlist.add(20);
        pqlist.add(50);
        pqlist.add(30);

        System.out.println(pqlist);

        System.out.println("Element with highest priority : " + pqlist.peek());

        pqlist.poll();
        pqlist.poll();
        System.out.println("Updated Priority queue : " + pqlist);

        pqlist.add(5);
        pqlist.add(70);
        System.out.println("Updated Queue : " + pqlist);

        while (!pqlist.isEmpty()) {
            System.out.print(pqlist.poll());
            System.out.print(",");

        }
    }
}
