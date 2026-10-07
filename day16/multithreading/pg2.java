package day16.multithreading;

public class pg2 {

    public static void main(String[] args) {
        System.out.println("Hello from main thread");

        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("Hello from new thread");
                System.out.println("Current thread :" + Thread.currentThread().getName());
            }
        };

        t1.start();
    }
}
