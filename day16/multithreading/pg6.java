package day16.multithreading;

public class pg6 {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello from Lambda");
            System.out.println("Current Thread name :" + Thread.currentThread().getName());
        };

        Thread t1 = new Thread(task);
        t1.start();

    }
}
