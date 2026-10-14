package day16.multithreading;

public class pg10 {
    public static void main(String[] args) {
        Runnable task1 = () -> {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Current Thread : " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Exception occured" + e);
                }
            }

        };
        Runnable task2 = () -> {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Current Thread : " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Exception occured" + e);
                }
            }

        };

        Thread t1 = new Thread(task1);
        t1.setName("Worker A");
        Thread t2 = new Thread(task2);
        t2.setName("Worker B");
        t1.start();
        t2.start();

    }

}
