package day16.multithreading;

public class pg8 {
    public static void main(String[] args){

        Runnable task1 = () -> {

            System.out.println("Task Started");
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Task finished");

        };
        

        Thread t1 = new Thread(task1);
        t1.start();


    }
}
