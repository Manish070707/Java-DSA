/*
Problem:
Print all the elements of a matrix in Spiral Order.

Example:
Input:
1  2  3  4
5  6  7  8
9 10 11 12
13 14 15 16

Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

Logic:
1. Initialize four boundaries:
   - startRow
   - endRow
   - startCol
   - endCol
2. Print the top row from left to right.
3. Print the right column from top to bottom.
4. Print the bottom row from right to left.
5. Print the left column from bottom to top.
6. Shrink all four boundaries.
7. Repeat until all layers are traversed.

Time Complexity : O(rows × cols)
Space Complexity: O(1)
*/



package Arrays2D;
import java.util.*;
public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0,startCol=0,endRow=matrix.length-1,endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            for(int i=endCol-1;i>startCol;i--){
                if(startRow == endRow){
                    return;
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            for(int i=endRow;i>=startRow+1;i--){
                if(startCol == endCol){
                    return;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
}
