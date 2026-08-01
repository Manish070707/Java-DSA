/*
Problem:
Swap two numbers without using a third variable.

Example:
Input  : 43 54
Output : 54 43

Logic:
1. Perform XOR between both numbers.
2. Update the second number using XOR.
3. Update the first number using XOR.
4. Both numbers get swapped.

Time Complexity: O(1)
Space Complexity: O(1)
*/

package BitManipulation;

public class SwapUsingXOR {
    public static void main(String[] args){
        int num1 = 43, num2 = 54;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.print(num1  +  " "  + num2);
    }
}
