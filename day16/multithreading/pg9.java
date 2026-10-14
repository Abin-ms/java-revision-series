package day16.multithreading;

public class pg9 {

    public static void main(String[] args) {

        Runnable task1 = () -> {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Task 1 - count : " + i);
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable task2 = () -> {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Task 2 - count : "+i);
                try {
                    Thread.sleep(1000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();

    }

}
