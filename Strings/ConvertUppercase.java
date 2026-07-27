/*
Problem:
Capitalize the first letter of every word in a sentence.

Example:
Input  : hi, i am manish kumar
Output : Hi, I Am Manish Kumar

Logic:
1. Convert the first character to uppercase.
2. Traverse the string.
3. Whenever a space is found, capitalize the next character.
4. Append all characters to a StringBuilder.
5. Print the final string.

Time Complexity : O(n)
Space Complexity: O(n)
*/

package Strings;

public class ConvertUppercase {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) ==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "hi, i am manish kumar";
        System.out.println(toUppercase(str));
    }
}
