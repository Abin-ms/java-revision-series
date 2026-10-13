package day16.multithreading;

class cooking implements Runnable {
    private String task;

    cooking(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is being prepared by " + Thread.currentThread().getName());
    }
}

public class usingRunnableinterfacae {
    public static void main(String[] args) {

        Thread t1 = new Thread(new cooking("Soup"));
        Thread t2 = new Thread(new cooking("Pizza"));
        Thread t3 = new Thread(new cooking("Burger"));

        t1.setName("Cheff 1");
        t2.setName("Cheff 2");
        t3.setName("Cheff 3");

        t1.start();
        t2.start();
        t3.start();

    }
}
