/*
Problem:
Count the number of set bits (1's) in a binary representation.

Example:
Input  : 15
Output : 4

Logic:
1. Traverse until the number becomes 0.
2. Check the last bit using bitwise AND with 1.
3. If the last bit is 1, increment the count.
4. Right shift the number by one position.
5. Return the total count.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

package BitManipulation;
public class CountSetBits {
    public static int Count_SetOfBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.print(Count_SetOfBits(15));
    }
}
