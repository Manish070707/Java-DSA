/*
Problem:
Find a raised to the power n using Fast Exponentiation.

Example:
Input  : a = 5, n = 3
Output : 125

Logic:
1. Initialize answer as 1.
2. While n is greater than 0:
   - If the last bit of n is 1, multiply answer by a.
   - Square the value of a.
   - Right shift n by one bit.
3. Return the final answer.

Time Complexity: O(log n)
Space Complexity: O(1)
*/
package BitManipulation;

public class FastExponentiation {
    public static int Fast_Exponentiation(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print(Fast_Exponentiation(5, 3));
    }
}
