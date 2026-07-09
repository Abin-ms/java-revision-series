public class fourr {
    public static void main(String[] args) {
        int[][][][] arraa = { { {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 },
                { 7, 8 }
        } } };
        for (int i = 0; i < arraa.length; i++) {
            for (int j = 0; j < arraa[i].length; j++) {
                for (int k = 0; k < arraa[i][j].length; k++) {
                    for (int x = 0; x < arraa[i][j][k].length; x++) {
                        System.out.println(arraa[i][j][k][x]);
                    }
                }
            }
        }
    }
}
