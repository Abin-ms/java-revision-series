package day16.multithreading;

public class pg16 {
    public static void main(String[] args){
        Runnable task = () ->{
            System.out.println("Worker started");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Worker was interuppted");
                // Thread.currentThread().interrupt(); this will make the boolean result true.
                System.out.println(Thread.currentThread().isInterrupted());
            }
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
