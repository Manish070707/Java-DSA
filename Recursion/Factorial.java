/*
Problem:

Calculate the factorial of a number using Recursion.

Example:

Input  : 5

Output : 120

Logic:

1. The factorial of n is n * factorial(n-1).
2. Recursively calculate the factorial of n-1.
3. The base case is n == 0, where factorial is 1.
4. Multiply the returned values while the recursion stack is unwinding.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fact = n*fact(n-1);
        return fact;
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}
