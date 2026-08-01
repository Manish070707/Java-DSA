/*
Problem:
Update the ith bit of a number.

Example:
Input  : n = 10, i = 2, newBit = 1
Output : 14

Logic:
1. First clear the ith bit.
2. Create a bitmask using the new bit.
3. Perform bitwise OR to update the ith bit.
4. Return the updated number.

Time Complexity: O(1)
Space Complexity: O(1)
*/
package BitManipulation;
public class UpdateIthBit {
     public static int ClearIth_Bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIth_Bit(int n, int i, int newBit){
        n = ClearIth_Bit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }

    public static void main(String[] args){
        System.out.print(updateIth_Bit(10, 2, 1));
    }
}


