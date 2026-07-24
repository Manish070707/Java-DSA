/*
Problem:
Find the sum of the primary and secondary diagonals of a square matrix.

Example:

Input Matrix:

1   2   3
4   5   6
7   8   9

Primary Diagonal:
1 + 5 + 9 = 15

Secondary Diagonal:
3 + 5 + 7 = 15

Since 5 belongs to both diagonals, it should be counted only once.

Final Sum:
1 + 5 + 9 + 3 + 7 = 25

Logic:
1. Traverse the matrix using a single loop.
2. Add the primary diagonal element:
      matrix[i][i]
3. Add the secondary diagonal element:
      matrix[i][matrix.length - 1 - i]
4. Before adding the secondary diagonal element, check:
      if (i != matrix.length - 1 - i)
   This prevents the middle element of an odd-sized matrix
   from being counted twice.
5. Return the total diagonal sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/
package Arrays2D;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];    // here i==j for primary diagonal
            if(i!=matrix.length-1-i){  // here i!=j then calculate secondry diagonal sum kyunki i+j = n-1
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(diagonalSum(matrix));
    }
}
