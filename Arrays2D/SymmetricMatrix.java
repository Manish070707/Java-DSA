/*
Problem:
Check whether a given matrix is Symmetric Matrix or not.

A matrix is symmetric if it is equal to its transpose.

Example:

Input Matrix:

1 2 3
2 4 5
3 5 6

Output:

Symmetric Matrix


Logic:
1. Compare each element with its corresponding transpose element.
2. Check whether matrix[i][j] == matrix[j][i].
3. Only upper triangle elements are checked because
   lower triangle values are repeated.
4. If all elements are equal, the matrix is symmetric.

Time Complexity : O(n²)
Space Complexity: O(1)
*/

package Arrays2D;

public class SymmetricMatrix {
    public static boolean checkSymmetric(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                if(matrix[i][j]==matrix[j][i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{2,4,5},{3,5,6}};
        checkSymmetric(matrix);
        if(checkSymmetric(matrix)){
            System.out.print("Symmetric Matrix");
        }else{
            System.out.print("Asymmetric Matrix");
        }
    }
}
