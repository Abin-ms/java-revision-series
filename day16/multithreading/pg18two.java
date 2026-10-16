package day16.multithreading;

class gg {
    static int balance = 1000;

    static synchronized void deposit(int amount) {
        balance = balance + amount;
    }

    static class Thread1 extends Thread {
        public void run() {
            gg.deposit(500);
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            gg.deposit(300);

        }
    }

}

public class pg18two {
    public static void main(String[] args) {

        gg.Thread1 t1 = new gg.Thread1();
        gg.Thread2 t2 = new gg.Thread2();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("final Balance : "+gg.balance);

    }
}
