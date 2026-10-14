package day16.multithreading;

public class pg13 {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("\nStarting Execution\n");
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("\nEnding execution\n");
        };

        Thread t1 = new Thread(task);
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();

        }
        System.out.println(t1.getState());
    }
}
