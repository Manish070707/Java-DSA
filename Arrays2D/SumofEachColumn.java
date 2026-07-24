/*
Problem:
Find and print the sum of each column of a matrix.

Example:

Input Matrix:

1 2 3
4 5 6
7 8 9


Output:

Sum of Column 1 = 12
Sum of Column 2 = 15
Sum of Column 3 = 18


Logic:
1. Traverse the matrix column by column.
2. Initialize sum as 0 for every column.
3. Add all elements present in the current column.
4. Print the calculated sum for each column.

Time Complexity : O(n*m)
Space Complexity: O(1)
*/
package Arrays2D;

public class SumofEachColumn {
    public static void Sumofcolumn(int matrix[][]){
        int sum=0;
        int j=0;
        for(j=0;j<matrix[0].length;j++){
            sum=0;
            for(int i=0;i<matrix.length;i++){
               sum+=matrix[i][j];
            }
            System.out.print("Col " + (j+1) + " = " + sum);
            System.out.println();
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Sumofcolumn(matrix);
    }
}