public class threedarr {
    public static void main(String[] args) {

        int[][][] arra = { {
                { 1, -2, 3 },
                { -4, -5, 6, 9 },
                { 7 }
        } };
        for (int i = 0; i < arra.length; i++) {
            for (int j = 0; j < arra[i].length; j++) {
                for (int k = 0; k < arra[i][j].length; k++) {
                    System.out.println(arra[i][j][k]);
                }
            }
        }
    }
}
