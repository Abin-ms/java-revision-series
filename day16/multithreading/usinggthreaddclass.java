package day16.multithreading;

class cookingFood extends Thread {
    private String task;

    cookingFood(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + "is being prepared by" + Thread.currentThread().getName());
    }
}

public class usinggthreaddclass {
    public static void main(String[] args) {

        Thread t1 = new cookingFood("Pasta");
        Thread t2 = new cookingFood("salad");
        Thread t3 = new cookingFood("Desert");
        Thread t4 = new cookingFood("Rice");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
