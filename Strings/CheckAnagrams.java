/*
Problem:
Check whether two strings are anagrams of each other.

Example:
Input  :
listen
silent

Output : listen and silent are anagram of each other.

Logic:
1. Check if both strings have the same length.
2. Convert both strings into character arrays.
3. Sort both character arrays.
4. Compare both sorted arrays.
5. If all characters match, they are anagrams.

Time Complexity : O(n log n)
Space Complexity: O(n)
*/
import java.util.*;
public class CheckAnagrams {
    public static void Anagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() == str2.length()){
            char[]str1charArray = str1.toCharArray();
            char[]str2charArray = str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.print(str1 + " " + "and" + " " + str2 + " " + "are anagram of each other");
            }else{
                System.out.print(str1 + " " +"and" + " " + str2 + " " +"are not anagram of each other");
            }
        }
         else{
                System.out.print(str1 + " " + "and" + " " + str2 + " " + "are not anagram of each other");
            }
    }
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "SILENT";
        Anagram(str1, str2);
    }
}
