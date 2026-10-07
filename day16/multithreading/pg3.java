package day16.multithreading;

public class pg3 {

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println(
                        "Inside run()" +
                                Thread.currentThread().getName());

            }

        };

        System.out.println("Before start():" + Thread.currentThread().getName());
        t1.start();
        System.out.println("After start() :" + Thread.currentThread().getName());
    }
}
