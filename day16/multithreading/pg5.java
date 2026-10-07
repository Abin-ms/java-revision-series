//first Runnable program
package day16.multithreading;

public class pg5 {
    public static void main(String[] args){

        Runnable task = new Runnable() {
            public void run(){
                System.out.println("Hello from Runnable");
                System.out.println("Current Thread :"+Thread.currentThread().getName());

            }
        };
        Thread t1 = new Thread(task);
        t1.start();
    }
    
}
