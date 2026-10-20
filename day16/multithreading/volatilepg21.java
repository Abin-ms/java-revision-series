package day16.multithreading;

class demo {
    static volatile boolean running = true;
}

class Thread1 extends Thread {

    public void run() {
        while (demo.running) {
            System.out.println("The worker is running.");
        }
        System.out.println("The worker finished execution.");
    }
}

public class volatilepg21 {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        demo.running = false;

    }

}
