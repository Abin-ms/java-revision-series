package day16.multithreading;

public class pg15 {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Worker started");
            try {

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return ;
            }
            System.out.println("Worker finished");
        };
        Thread t1 = new Thread(task);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        t1.interrupt();
    }
}
