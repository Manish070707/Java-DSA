/*
Problem:
Convert uppercase English letters to lowercase using Bit Manipulation.

Example:
Input  : A B C
Output : a b c

Logic:
1. Traverse all uppercase letters from A to Z.
2. Perform bitwise OR with space character (' ').
3. The uppercase letter becomes lowercase.
4. Print the converted character.

Time Complexity: O(26)
Space Complexity: O(1)
*/
package BitManipulation;

public class ConvertUpperToLower {
    public static void main(String[] args){
        for(char ch = 'A';ch<='Z';ch++){
            System.out.print((char)(ch | ' '));
        }
    }
}
