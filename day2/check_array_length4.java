public class check_array_length4 {
    public static void main(String[] args) {
        int[] num = { 22, 23, 31, 41, 53, 1 };
        int i = 0;
        int a = 1;
        for (int item : num) {
            
            System.out.println( "item no - " +a+ ": "+item);
            a = a+1;
            i = i + 1;
        }
        System.out.println("the size of the array is:" + i);
    }

}
