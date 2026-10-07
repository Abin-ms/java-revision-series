package day16.multithreading;

public class pg4 {
    
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("T1 :"+Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread(){

            public void run(){
                System.out.println("T2 :"+Thread.currentThread().getName());
            }
        };
        t1.start();
        t2.run();
    }

}
