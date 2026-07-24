/*
Problem:
Print the elements of a matrix in Zig-Zag Traversal order.

Example:

Input Matrix:

1 2 3
4 5 6
7 8 9

Output:

1 2 3
6 5 4
7 8 9


Logic:
1. Traverse the matrix row wise.
2. For even rows, print elements from left to right.
3. For odd rows, print elements from right to left.
4. Change traversal direction after every row.

Time Complexity : O(n*m)
Space Complexity: O(1)
*/

package Arrays2D;

public class PrintZigZagElements {
    public static void ZigZag(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix.length;j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            else{
                for(int j=matrix[0].length-1;j>=0;j--){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        ZigZag(matrix);
    }
}
