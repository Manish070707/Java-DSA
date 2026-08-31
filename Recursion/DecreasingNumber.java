/*
Problem:

Print numbers from n to 1 using Recursion.

Example:

Input  : 10

Output : 10 9 8 7 6 5 4 3 2 1

Logic:

1. Print the current value of n.
2. Recursively call the function with n-1.
3. Continue until n becomes 1.
4. When n == 1, print 1 and return.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;
public class DecreasingNumber{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args){
        printDec(10);
    }
}