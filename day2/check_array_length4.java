public class check_array_length4 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6 };
        int i = 0;
        for (int item : num) {
            i = i + 1;
        }
        System.out.println("the size of the array is:" + i);
    }

}
