import java.util.Scanner;

public class array_copy2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int i;
        for (i = 0; i < size; i++) {
            System.out.println("Enter the value of:" + i);
            arr1[i] = input.nextInt();
        }
        System.out.println("The enterd array is:");
        for (i = 0; i < size; i++) {
            System.out.println(+arr1[i]);
        }

        int[] arr2 = new int[10];
        System.out.println("The array arr2 is:");
        for (i = 0; i < size; i++) {
            arr2[i] = arr1[i];

        }

        System.out.println("The swapped arr2 is:");
        for (i = 0; i < size; i++) {
            System.out.println(+arr2[i]);
        }
        input.close();
    }
}
