/*
Problem:
Print all boundary elements of a given matrix.

Example:

Input Matrix:

1 2 3
4 5 6
7 8 9


Output:

1 2 3 6 9 8 7 4


Logic:
1. Print the first row from left to right.
2. Print the last column from top to bottom
   (excluding first element).
3. Print the last row from right to left
   (excluding last element).
4. Print the first column from bottom to top
   (excluding first and last element).
5. These four traversals together print the boundary elements.

Time Complexity : O(n*m)
Space Complexity: O(1)
*/

package Arrays2D;

public class PrintBoundaryElements {
    public static void Boundary_Elements(int matrix[][]){
        int startRow = 0, startCol = 0,EndRow = matrix.length-1, EndCol = matrix[0].length-1;
        for(int i=startCol;i<=EndCol;i++){
            System.out.print(matrix[startRow][i] + " ");
        }for(int j=startRow+1;j<=EndRow;j++){
            System.out.print(matrix[j][EndCol] + " ");
        }for(int j=EndCol-1;j>=startCol;j--){
            System.out.print(matrix[EndRow][j] + " ");
        }for(int j=EndRow-1;j>=startRow+1;j--){
            System.out.print(matrix[j][startRow] + " ");
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Boundary_Elements(matrix);
    }
}
