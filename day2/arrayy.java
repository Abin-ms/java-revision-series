import java.util.Scanner;

public class arrayy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrr;
        arrr = new int[20];
        int i;
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int a;
        for (i = 0; i < size; i++) {
            a = i + 1;
            System.out.printf("enter the " + a, "th element");
            arrr[i] = input.nextInt();
        }
        System.out.println("Elements of the array are");
        for (i = 0; i < size; i++) {
            System.out.println(arrr[i]);

        }

        input.close();
    }
}
