/*
Problem:
Search a given key in a row-wise and column-wise sorted matrix
using the Staircase Search Algorithm.

Example:

Input Matrix:

10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50

Key = 33

Output:
Found key at (3,1)

Logic:
1. Start from the top-right corner of the matrix.
2. Compare the current element with the key.
3. If both are equal, return true.
4. If the key is smaller than the current element,
   move one column to the left.
5. If the key is greater than the current element,
   move one row down.
6. Repeat until the key is found or the indices go out of bounds.

Time Complexity: O(rows + columns)
Space Complexity: O(1)
*/


package Arrays2D;

public class StaircaseSearch {
    public static boolean Staircase_search(int matrix[][] , int key){
        int row = 0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + ","+col+")");
                return true; 
            }else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        Staircase_search(matrix, key);
    }
}
