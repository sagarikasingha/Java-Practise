/*
 Given an m x n matrix, return all elements of the matrix in spiral
order.
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3},{4, 5,  6},{7, 8,  9}};//test case 1
        // int [][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};//test case2
        solution(matrix);
    }

    private static void solution(int[][] matrix) {
        int length=matrix[0].length; //columns
        int depth=matrix.length;      //rows
       // int[] result=new int[depth*length];
        for(int i=0;i<depth/2+1;i++){
            for(int j=i;j<depth;j++){ 
                right(matrix,i,j,length);
                length--;
                down(matrix,i,j,depth,length);
                depth--;
                left(matrix,i,j,length,depth);
                length--;
                up(matrix,i,j,depth);
                depth--;
               // System.out.println("length"+length+" " +depth);
                if(length==1 && depth==1){
                    System.out.print(matrix[matrix.length/2][matrix.length/2]);
                }
            } 
           
        }
    }

    private static void up(int[][] matrix, int i, int j, int depth) {
        for(int k=depth-1;k>j;k--){
            System.out.print(matrix[k][j]+" ");
           }
    }

    private static void left(int[][] matrix, int i, int j, int length,int depth) {
        for(int k=length-1;k>=i;k--){
            System.out.print(matrix[depth][k]+" ");
           }
    }

    private static void down(int[][] matrix, int i, int j, int depth,int length) {
        for(int  k=j+1;k<depth;k++){
            System.out.print(matrix[k][length]+" ");
           }
    }

    private static void right(int[][] matrix, int i, int j, int length) {
       for(int  k=i;k<length;k++){
        System.out.print(matrix[i][k]+" ");
       }
    }

//--------AI Solution 
// private static void solution(int[][] matrix) {
//     int length = matrix[0].length; // columns
//     int depth = matrix.length; // rows
//     for (int i = 0; i < depth / 2 + 1; i++) {
//         for (int j = i; j < length - i; j++) { // right
//             System.out.print(matrix[i][j] + " ");
//         }
//         for (int j = i + 1; j < depth - i; j++) { // down
//             System.out.print(matrix[j][length - i - 1] + " ");
//         }
//         for (int j = length - i - 2; j >= i && (depth - i - 1 != i); j--) { // left
//             System.out.print(matrix[depth - i - 1][j] + " ");
//         }
//         for (int j = depth - i - 2; j > i && (length - i - 1 != i); j--) { // up
//             System.out.print(matrix[j][i] + " ");
//         }
//     }
// }



}
