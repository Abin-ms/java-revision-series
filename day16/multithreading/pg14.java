package day16.multithreading;

public class pg14 {

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }

        };

        Thread t1 = new Thread(task);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        try {
            t1.join();
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(t1.isAlive());

    }
}
