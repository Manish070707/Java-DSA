/*
Problem:
Find the value of the ith bit of a number.

Example:
Input  : n = 10, i = 3
Output : 1

Logic:
1. Create a bitmask by left shifting 1 by i positions.
2. Perform bitwise AND between the number and bitmask.
3. If the result is 0, the ith bit is 0.
4. Otherwise, the ith bit is 1.

Time Complexity: O(1)
Space Complexity: O(1)
*/
package BitManipulation;
public class GetIthBit {
    public static int getIth_Bit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.print(getIth_Bit(10, 3));;
    }
}
