/*
Problem:

Calculate x^n using simple Recursion.

Example:

Input  : x = 2, n = 5

Output : 32

Logic:

1. If n == 0, return 1 as the base case.
2. Recursively calculate x^(n-1).
3. Multiply x with the result of the recursive call.
4. Continue until the exponent becomes 0.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class XtoThePower {
    public static long pow(int x, int n){
        if( n==0){
            return 1;
        }
        return x*pow(x, n-1);
    }
    public static void main(String[] args){
        System.out.println(pow(2, 5));
    }
}
