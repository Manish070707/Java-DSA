/*
Problem:
Compress a string by replacing repeated characters with their count.

Example:
Input  : aaabbccccdd
Output : a3b2c4d2

Logic:
1. Traverse the string.
2. Count consecutive repeated characters.
3. Append the character.
4. If the count is greater than 1, append the count.
5. Print the compressed string.

Time Complexity : O(n)
Space Complexity: O(n)
*/
package Strings;

public class StringCompression {
    public static String Compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "aaabbcccdd";
        System.out.println(Compression(str));
    }
}
