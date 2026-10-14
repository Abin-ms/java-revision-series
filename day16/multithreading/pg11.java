package day16.multithreading;

public class pg11 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            System.out.println("Worker started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Worker finished");
        };

        Thread t1 = new Thread(task1);
        t1.start();
        try {
            t1.join();

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main finished");
    }
}
