public class TwoDimArray {

    public static void main(String[] args) {
        int[][] aiM = new int[][]{{1, 2, 3, 4, 5}, {4, 5, 6}};


        for(int i = 0; i < aiM.length; ++i) {
            int total = 0;

            for(int j = 0; j < aiM[i].length; ++j) {
                total += aiM[i][j];
            }

            int avg = total / aiM[i].length;
            System.out.println(avg);
        }
    }
}
