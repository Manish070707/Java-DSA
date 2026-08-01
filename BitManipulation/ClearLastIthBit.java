/*
Problem:
Clear the last i bits of a number.

Example:
Input  : n = 15, i = 2
Output : 12

Logic:
1. Create a bitmask by left shifting all 1's by i positions.
2. Perform bitwise AND between the number and bitmask.
3. The last i bits become 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/
package BitManipulation;

public class ClearLastIthBit {
    public static int ClearLast_IthBit(int n, int i){
        int bitMask = ~(0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args){
        System.out.print(ClearLast_IthBit(15, 2));
    }
}
