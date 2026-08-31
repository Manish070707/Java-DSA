/*
Problem:

Print numbers from 1 to n using Recursion.

Example:

Input  : 10

Output : 1 2 3 4 5 6 7 8 9 10

Logic:

1. Recursively call the function with n-1.
2. The recursive calls continue until n becomes 1.
3. Print the current number while returning from the recursion.
4. Because printing happens after the recursive call, numbers appear in increasing order.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class IncreasingNumber {
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        printInc(10);
    }
}
