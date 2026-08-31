/*
Problem:

Find the number of ways to tile a 2 x n board using 2 x 1 tiles.

Example:

Input  : 4

Output : 5

Logic:

1. A tile can be placed vertically, reducing the remaining size by 1.
2. Two tiles can be placed horizontally, reducing the remaining size by 2.
3. Recursively calculate both possibilities.
4. Add both results to get the total number of ways.
5. Base cases: n == 0 or n == 1 return 1.

Time Complexity: O(2^n)

Space Complexity: O(n)
*/
package Recursion;
public class TilingProblem {
    public static int TotalWay(int n){
        if(n==0 || n==1){
            return 1;
        }
        int verticalTiles = TotalWay(n-1);
        int horizontalTiles = TotalWay(n-2);
        int totalWay = verticalTiles+horizontalTiles;
        return totalWay;
    }
    public static void main(String[] args){
        System.out.println(TotalWay(4));
    }
}
