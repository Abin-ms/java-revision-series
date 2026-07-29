package day5;

class multiplecatche {
    public static void main(String[] args){
        try{
            int x = 10;
            int y = 2;
            int[] arr = {1,2,3,4};

            System.out.println(x/y);
            System.out.println(arr[5]);

        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }
    }
}
