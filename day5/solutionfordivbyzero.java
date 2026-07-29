package day5;

class solutionfordivbyzero {
    public static void main(String[] args){
        try{
            int x = 10;
            int y = 0;
            System.out.println(x/y);
        }
        catch (ArithmeticException e){
            System.out.println("Exception occured solve the bug");
        }

        System.out.println("Even an exception has occured the pgm has not terminated cause we have handled the exception using try and catch block");
    }
}
