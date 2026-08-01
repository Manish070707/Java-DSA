/*
Problem:
Clear the ith bit of a number.

Example:
Input  : n = 10, i = 2
Output : 10

Logic:
1. Create a bitmask by left shifting 1 by i positions.
2. Take the complement of the bitmask.
3. Perform bitwise AND between the number and bitmask.
4. The ith bit becomes 0.

Time Complexity: O(1)
Space Complexity: O(1)
*/
package BitManipulation;

public class ClearIthBit {
    public static int ClearIth_Bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args){
        System.out.print(ClearIth_Bit(10, 2));
    }
}

