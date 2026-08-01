/*
Problem:
Check whether a number is a power of 2.

Example:
Input  : 16
Output : true

Logic:
1. A power of 2 has only one set bit.
2. Perform (n & (n - 1)).
3. If the result is 0, the number is a power of 2.

Time Complexity: O(1)
Space Complexity: O(1)
*/
package BitManipulation;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args){
        System.out.print(isPowerOfTwo(16));
    }
}
