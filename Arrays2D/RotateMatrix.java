/*
Problem:
Rotate a square matrix by 90° clockwise.

Example:

Input Matrix:

1 2 3
4 5 6
7 8 9

Output Matrix:

7 4 1
8 5 2
9 6 3

Logic:
1. Transpose the matrix by swapping matrix[i][j] with matrix[j][i].
2. Reverse every row using the two-pointer technique.
3. Print the rotated matrix.

Time Complexity : O(n²)
Space Complexity: O(1)
*/

package Arrays2D;

public class RotateMatrix {
    public static void Rotate_Matrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    for(int i=0;i<matrix.length;i++){
            int start =0,end=matrix[0].length-1;
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
        }
    }
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Rotate_Matrix(matrix);
    }
}
