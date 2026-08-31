/*
Problem:

Remove duplicate characters from a string using Recursion.

Example:

Input  : "appnnacollege"

Output : apncolge

Logic:

1. Check each character of the string recursively.
2. Use a boolean array to track whether a character has already appeared.
3. If the character is already present, skip it.
4. Otherwise, mark it as visited and add it to the new string.
5. Continue until all characters are processed.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class RemoveDuplicates {
    public static void removeDuplicate(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args){
        
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
