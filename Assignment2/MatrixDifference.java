public class MatrixDifference {


    public static int[][][] consecutiveDifference(int[][][] M) {
        int k = M.length;
        int m = M[0].length;
        int n = M[0][0].length;
        int[][][] diff = new int[k - 1][m][n];

        for (int i = 1; i < k; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    diff[i - 1][j][l] = M[i][j][l] - M[i - 1][j][l];
                }
            }
        }
        return diff;
    }

    
    public static int[][][] correspondingDifference(int[][][] M1, int[][][] M2) {
        int k = M1.length;
        int m = M1[0].length;
        int n = M1[0][0].length;
        int[][][] diff = new int[k][m][n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < n; l++) {
                    diff[i][j][l] = M1[i][j][l] - M2[i][j][l];
                }
            }
        }
        return diff;
    }

    
    public static void print3DMatrix(int[][][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Slice " + i + ":");
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
     
        int[][][] M1 = {
            { {1, 2}, {3, 4} },
            { {4, 5}, {6, 7} },
            { {7, 8}, {9, 10} }
        };

        int[][][] M2 = {
            { {0, 1}, {2, 3} },
            { {2, 3}, {4, 5} },
            { {3, 4}, {5, 6} }
        };

      
        int[][][] diffM1 = consecutiveDifference(M1);
        int[][][] diffM2 = consecutiveDifference(M2);
        int[][][] diffM1M2 = correspondingDifference(M1, M2);

   
        System.out.println("Difference between consecutive slices in M1:");
        print3DMatrix(diffM1);

        System.out.println("\nDifference between consecutive slices in M2:");
        print3DMatrix(diffM2);

        System.out.println("\nDifference between corresponding slices in M1 and M2:");
        print3DMatrix(diffM1M2);
    }
}
