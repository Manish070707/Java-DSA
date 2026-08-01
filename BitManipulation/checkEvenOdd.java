/*
Problem:
Check whether a number is even or odd using Bit Manipulation.

Example:
Input  : 4
Output : Even Number

Logic:
1. Create a bitmask with value 1.
2. Perform bitwise AND between the number and bitmask.
3. If the result is 0, the last bit is 0, so the number is even.
4. Otherwise, the last bit is 1, so the number is odd.

Time Complexity: O(1)
Space Complexity: O(1)
*/
package BitManipulation;
public class checkEvenOdd{
    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) ==0){
            System.out.print("Even number");
        }else{
            System.out.print("Odd Number");
        }
    }
    public static void main(String[] args){
        int n = 4;
        OddOrEven(n);
    }
}