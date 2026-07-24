/*
Problem:
Find the transpose of a given matrix.

Example:

Input Matrix:

1 2 3
4 5 6
7 8 9

Transpose Matrix:

1 4 7
2 5 8
3 6 9

Logic:
1. Create a new matrix with rows and columns interchanged.
2. Traverse the original matrix.
3. Copy each element using:
      transpose[col][row] = matrix[row][col]
4. Print the transpose matrix.

Time Complexity: O(rows × columns)
Space Complexity: O(rows × columns)
*/
package Arrays2D;
public class TransposeMatrix {
    public static void Transpose_Matrix(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int row=0;row<matrix.length;row++){
            for(int col = 0;col<matrix[0].length;col++){
                transpose[col][row] = matrix[row][col];
            }
        }
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Transpose_Matrix(matrix);
    }
}
