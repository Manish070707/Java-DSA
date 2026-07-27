/*
Problem:
Extract a substring from a given string.

Example:
Input  : HelloWorld

Start = 0
End = 5

Output : Hello

Logic:
1. Traverse the string from the start index.
2. Continue until the end index.
3. Append every character into a StringBuilder.
4. Print the substring.

Time Complexity : O(n)
Space Complexity: O(n)
*/
package Strings;

public class Substring {
    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args){
        String str = "HelloWorld";
        System.out.print(substring(str, 0, 5));
    }
}
