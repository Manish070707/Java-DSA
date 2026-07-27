/*
Problem:
Convert uppercase letters to lowercase and lowercase letters to uppercase.

Example:
Input  : JaVa
Output : jAvA

Logic:
1. Traverse the string.
2. If the character is uppercase, convert it to lowercase.
3. If the character is lowercase, convert it to uppercase.
4. Append the converted character.
5. Print the final string.

Time Complexity : O(n)
Space Complexity: O(n)
*/



package Strings;

public class ToggleCase {
    public static void main(String[] args){
        String str = "JaVa";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char Ch = Character.toLowerCase(ch);
                sb.append(Ch);
            }else if(ch >= 'a' && ch <= 'z'){
                char Ch = Character.toUpperCase(ch);
                sb.append(Ch);
            }
        }
        System.out.println(sb);
    }
}
