package day11.generics;

public class genericex2 {
    public static void main(String[] args){


        String[] names = {"Abin", "Jibin", "Sulu"};
        Integer[] numbers = {10, 20, 30};

         printArray(names);
         printArray(numbers);
        

    }

    public static <T> void printArray(T[] array){
    for(T ar : array){
        System.out.print(ar+" ");
    }
    System.out.println();
}
}
