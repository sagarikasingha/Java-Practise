/*
 Given an m x n integer matrix, if an element is 0, set its entire row
and column to 0's. You must do it in place.
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
---------------------------------visual represntation---------
Input: matrix = [[1,1,1],
                 [1,0,1],
                 [1,1,1]]
Output: [[1,0,1],
         [0,0,0],
         [1,0,1]]

 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        // int[][] matrix= {{1,1,1},{1,0,1},{1,1,1}}; //test case 1
        // int[][] result=solution(matrix);

        int[][] matrix2 = { { 1, 1, 1 }, { 0, 1, 1 }, { 1, 1, 1 } }; // test case 2
        int[][] result = solution(matrix2);

        // printing result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] matrix) {
        boolean flag = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix = setRowColZeros(matrix, i, j);
                    flag = true;
                    break;// to exit inner loop
                }
            }
            if (flag) { // to exit outer loop
                break;
            }
        }
        return matrix;
    }

    private static int[][] setRowColZeros(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row == i || col == j) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
