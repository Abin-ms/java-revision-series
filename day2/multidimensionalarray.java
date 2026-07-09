public class multidimensionalarray {
    public static void main(String[] args) {
        int[][] arrayy = { { 1, 2 }, { 3, 4, 5 } };

        System.out.println(arrayy[1][2]);
        for (int i = 0; i < arrayy.length; i++) {
            for (int j = 0; j < arrayy[i].length; j++) {
                System.out.println(arrayy[i][j]);
            }

        }
    }

}
