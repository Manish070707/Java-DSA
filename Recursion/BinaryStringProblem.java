/*
Problem:

Generate all binary strings of length n without consecutive 1s.

Example:

Input  : n = 3

Output :
000
001
010
100
101

Logic:

1. At every position, we can always add 0.
2. We can add 1 only when the previous character is 0.
3. Recursively reduce n by 1 after adding each character.
4. When n becomes 0, print the generated binary string.

Time Complexity: O(2^n)

Space Complexity: O(n)
*/
package Recursion;

public class BinaryStringProblem {
    public static void withoutConsOnes(int n , int lastPlace , String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        withoutConsOnes(n-1, 0, str+"0");
        if(lastPlace == 0){
            withoutConsOnes(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args){
        withoutConsOnes(3, 0, "");
    }
}
