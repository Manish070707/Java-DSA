/*
Problem:
Check whether a given matrix is an Identity Matrix or not.

Example:

Input Matrix:

1 0 0
0 1 0
0 0 1

Output:

Identity Matrix


Logic:
1. First check whether the matrix is square or not.
2. Traverse all elements of the matrix.
3. If row index and column index are same (i == j),
   the element should be 1.
4. For non-diagonal elements (i != j),
   the element should be 0.
5. If all conditions satisfy, the matrix is an Identity Matrix.

Time Complexity : O(n²)
Space Complexity: O(1)
*/

package Arrays2D;

public class IdentityMatrix {
    public static boolean Identity_Matrix(int matrix[][]){
        if(matrix.length != matrix[0].length){
            return false;
        }for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j && matrix[i][j]!=1){
                    return false;
                }if(i!=j && matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int matrix[][] = {{1,0,0},{0,1,0},{0,0,1}};
        Identity_Matrix(matrix);
        if(Identity_Matrix(matrix)){
            System.out.print("Identity Matrix");
        }else{
            System.out.print("Not Identity Matrix");
        }
    }
}
