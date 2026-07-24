/*
Problem:
Multiply two matrices and print the resultant matrix.

Example:

Input Matrix A:

1 2
3 4


Input Matrix B:

5 6
7 8


Output Matrix:

19 22
43 50


Logic:
1. Check whether multiplication is possible or not.
   (Columns of first matrix must be equal to rows of second matrix)
2. Create a result matrix with rows of first matrix
   and columns of second matrix.
3. Multiply each row of first matrix with each column of second matrix.
4. Store the sum of multiplication in the result matrix.
5. Print the resultant matrix.

Time Complexity : O(n*m*p)
Space Complexity: O(n*p)
*/
package Arrays2D;

public class MatrixMultiplication {
    public static void multiplication(int A[][] , int B[][]){
        int row1 = A.length, col1 = A[0].length;
        int row2 = B.length, col2 = B[0].length;
        if(col1!=row1){
            System.out.print("Multiplication is Not Possible!");
        }
        int result[][] = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int A[][] = {{1,2},{3,4}};
        int B[][] = {{5,6},{7,8}};
        multiplication(A, B);
    }
}
