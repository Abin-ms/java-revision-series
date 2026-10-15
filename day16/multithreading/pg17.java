package day16.multithreading;

public class pg17 {

    static int balance = 1000;

    public static void main(String[] args) {

        Runnable task1 = () -> {
            balance = balance + 500;
        };
        Runnable task2 = () -> {
            balance = balance + 300;
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(balance);
    }


}
