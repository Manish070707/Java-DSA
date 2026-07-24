/*
Problem:
Print the elements of a matrix in Wave Traversal order.

Example:

Input Matrix:

1 2 3
4 5 6
7 8 9

Output:

1 4 7 8 5 2 3 6 9


Logic:
1. Traverse the matrix column wise.
2. For even columns, traverse from top to bottom.
3. For odd columns, traverse from bottom to top.
4. Print elements according to the wave pattern.

Time Complexity : O(n*m)
Space Complexity: O(1)
*/

package Arrays2D;

public class PrintWaveTraversal {
    public static void WaveElements(int matrix[][]){
            for(int j=0;j<matrix[0].length;j++){
                if(j %2 == 0){
                    for(int i=0;i<matrix.length;i++){
                        System.out.print(matrix[i][j] + " ");
                    }
                System.out.println();
            }
            else{
                for(int i=matrix.length-1;i>=0;i--){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        WaveElements(matrix);
    }
    
}
