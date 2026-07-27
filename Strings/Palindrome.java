/*
Problem:
Check whether a string is a palindrome.

Example:
Input  : racecar
Output : Palindrome

Logic:
1. Compare the first and last characters.
2. Move towards the center.
3. If any pair does not match, it is not a palindrome.
4. Otherwise, it is a palindrome.

Time Complexity : O(n)
Space Complexity: O(1)
*/



package Strings;

public class Palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "racecar";
        System.out.print(isPalindrome(str));
     }
}
