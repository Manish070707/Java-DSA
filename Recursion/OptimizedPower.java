/*
Problem:

Calculate a^n using Optimized Recursion (Exponentiation by Squaring).

Example:

Input  : a = 2, n = 50

Output : 1125899906842624

Logic:

1. If n == 0, return 1 as the base case.
2. Recursively calculate power for n/2.
3. Square the result of the half power.
4. If n is odd, multiply the result by a once more.
5. This reduces the number of recursive calls compared to simple recursion.

Time Complexity: O(log n)

Space Complexity: O(log n)
*/
package Recursion;
public class OptimizedPower{
    public static long optimized_Power(int a, int n){
        if(n==0){
            return 1;
        }
        long halfPower = optimized_Power(a, n/2);
        long halfPowerSq = halfPower * halfPower;
        if(n%2!=0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        System.out.println(optimized_Power(2, 50));
    }
}