
/*
Problem:
Clear all bits from index i to j.

Example:
Input  : n = 10, i = 2, j = 4
Output : 2

Logic:
1. Create the left bitmask by shifting all 1's by (j + 1).
2. Create the right bitmask containing the last i bits.
3. Combine both bitmasks using bitwise OR.
4. Perform bitwise AND with the number.
5. Bits from i to j become 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/

package BitManipulation;

public class ClearRangeofBits {
    public static int ClearBitsinRange(int n,int i, int j){
        int a = ((~0)<<j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args){
        System.out.print(ClearBitsinRange(10,2,4));
    }
}
