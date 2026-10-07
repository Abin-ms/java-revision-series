package day16.multithreading;

public class pg7 {
    
    public static void main(String[] args){

        Runnable task1 = () -> {
            System.out.println("Task 1 is running");
            System.out.println("Current Thread : "+Thread.currentThread().getName());
        };
        Runnable task2 = () -> {
            System.out.println("Task 2 is running");
            System.out.println("Current thread : "+Thread.currentThread().getName());
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
