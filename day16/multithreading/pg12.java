package day16.multithreading;

public class pg12 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Worker A started ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Worker A finished");
        };
        Runnable task2 = () -> {
            System.out.println("Worker B started");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Worker B finished");
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
