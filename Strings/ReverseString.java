/*
Problem:
Reverse a string.

Example:
Input  : Programming
Output : gnimmargorP

Logic:
1. Traverse the string from the last character.
2. Append every character into a StringBuilder.
3. Print the reversed string.

Time Complexity : O(n)
Space Complexity: O(n)
*/

package Strings;

public class ReverseString {
    public static void main(String[] args){
        String str = "Manish    ";
        StringBuilder sb = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.print(sb);
    }
}
