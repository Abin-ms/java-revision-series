import java.util.Arrays;

public class array_copy3 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1, 2, arr2, 4, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
