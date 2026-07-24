/*
Problem:
Find and print the sum of each row of a matrix.

Example:

Input Matrix:

1 2 3
4 5 6
7 8 9


Output:

Sum of Row 1 = 6
Sum of Row 2 = 15
Sum of Row 3 = 24


Logic:
1. Traverse the matrix row by row.
2. Initialize sum as 0 for every row.
3. Add all elements present in the current row.
4. Print the calculated sum for each row.

Time Complexity : O(n*m)
Space Complexity: O(1)
*/

package Arrays2D;

public class SumOfEachRow {
    public static void Sumofrow(int matrix[][]){
        int sum=0;
        int j=0;
        for(int i=0;i<matrix.length;i++){
            sum=0;
            for(j=0;j<matrix[0].length;j++){
               sum+=matrix[i][j];
            }
            System.out.print("Row " + (i+1) + " = " + sum);
            System.out.println();
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Sumofrow(matrix);
    }
}