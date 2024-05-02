/*
 You are given an n x n 2D matrix representing an image, rotate the
image by 90 degrees (clockwise).
You have to rotate the image in place, which means you have to
modify the input 2D matrix directly. DO NOT allocate another 2D
matrix and do the rotation.
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */
public class RotateImage {
    public static void main(String[] args) {
        int[][] image = {{1, 2, 3}, {4,  5, 6}, {7,  8, 9}};
        rotateImage(image);
    }

    private static void rotateImage(int[][] image) {
        int [][] temp = new int[image.length][image[0].length];
        //-------------anticlockwise------------------------
        for (int i=0;i<image.length;i++) {
            for (int j=0;j<image[0].length;j++){
                temp[i][j] = image[j][image[0].length-1-i];
            }
        }
        for (int i=0;i<image.length;i++) {
            for (int j=0;j<image[0].length;j++){
                System.out.print(temp[i][j]+" ");
            }System.out.println();
        }
    //---------upside down---------------------------
    int [][] temp2 = new int[image.length][image[0].length];
    for (int i=0;i<image.length;i++) {
        for (int j=0;j<image[0].length;j++){
            temp2[i][j] = image[image[0].length-1-i][j];
        }
    }
    for (int i=0;i<image.length;i++) {
        for (int j=0;j<image[0].length;j++){
            System.out.print(temp2[i][j]+" ");
        }System.out.println();
    }
//not solved yet
    int [][] temp3 = new int[image.length][image[0].length];
    for (int i=0;i<image.length;i++) {
        for (int j=image[0].length-1;j>=0;j--){
            temp3[i][j] = image[i][j];
        }
    }
    for (int i=0;i<image.length;i++) {
        for (int j=0;j<image[0].length;j++){
            System.out.print(temp2[i][j]+" ");
        }System.out.println();
    }
    }
}
