public class array_copy {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        for (int a : arr1) {
            System.out.println(a + ",");
        }
        int[] arr2 = arr1;
        for (int b : arr2) {
            System.out.println(b);
        }
    }
}
// have to check the note.md this method has some drawbacks and it is stated on
// the note.md
