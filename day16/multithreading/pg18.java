package day16.multithreading;

public class pg18 {
    static int balance = 1000;

    static synchronized void deposit(int amount) {
        balance = balance + amount;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            deposit(500);
        });
        Thread t2 = new Thread(() -> {
            deposit(300);
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("final balance : " + balance);

    }
}
