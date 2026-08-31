/*
Problem:

Find the sum of the first n natural numbers using Recursion.

Example:

Input  : 50

Output : 1275

Logic:

1. The sum of n numbers is n + sum(n-1).
2. Recursively calculate the sum of numbers from n-1 to 0.
3. Add the current number to the returned sum.
4. Base case: when n == 0, return 0.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class SumOfFirstNaturalNumbers {
    public static int SumofNumbers(int n){
        if(n==0){
            return 0;
        }
        int sum = n+SumofNumbers(n-1);
        return sum;
    }
    public static void main(String[] args){
        System.out.println(SumofNumbers(50));
    }
}
