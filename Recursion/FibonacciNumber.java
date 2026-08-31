/*
Problem:

Find the nth Fibonacci number using Recursion.

Example:

Input  : 9

Output : 34

Logic:

1. If n is 0 or 1, return n as the base case.
2. Recursively calculate fibonacci(n-1).
3. Recursively calculate fibonacci(n-2).
4. Add both results to get the nth Fibonacci number.

Time Complexity: O(2^n)

Space Complexity: O(n)
*/
package Recursion;

public class FibonacciNumber {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibonacci = fibonacci(n-1)+fibonacci(n-2);
        return fibonacci;
    }
    public static void main(String[] args){
        System.out.println(fibonacci(9));
    }
}
