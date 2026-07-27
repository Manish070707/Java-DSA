/*
Problem:
Count the total number of vowels in a string.

Example:
Input  : Programming
Output : Total Vowels = 3

Logic:
1. Traverse the string.
2. Check whether the current character is a vowel.
3. Increase the counter if it is a vowel.
4. Print the total count.

Time Complexity : O(n)
Space Complexity: O(1)
*/
package Strings;
import java.util.*;

public class countVowels {
    public static int Count_lowercaseVowels(String str){
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.print("Enter the String : ");
        String str = new Scanner(System.in).nextLine();
        System.out.println(Count_lowercaseVowels(str));
    }
}
