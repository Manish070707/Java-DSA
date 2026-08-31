/*
Problem:

Find the length of a string using Recursion.

Example:

Input  : "abcde"

Output : 5

Logic:

1. Check whether the string is empty.
2. If the string length is 0, return 0.
3. Remove the first character using substring(1).
4. Recursively calculate the length of the remaining string.
5. Add 1 for the removed character.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class PrintSubstring {
    public static int printSubstring(String str){
        if(str.length() == 0){
            return 0;
        }
        return printSubstring(str.substring(1))+1;
    }
    public static void main(String[] args){
        String str = "abcde";
        System.out.println(printSubstring(str));

    }
}
