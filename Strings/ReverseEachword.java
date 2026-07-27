/*
Problem:
Reverse every word in a sentence.

Example:
Input  : I Love Java
Output : I evoL avaJ

Logic:
1. Traverse the string.
2. Store one word in a StringBuilder.
3. When a space is found, reverse and print the word.
4. Clear the StringBuilder.
5. Reverse and print the last word.

Time Complexity : O(n)
Space Complexity: O(n)
*/
package Strings;

public class ReverseEachword {
    public static void main(String[] args){
        String str = "I Love Java";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }else{
                System.out.print(sb.reverse());
                System.out.print(" ");
                sb.setLength(0);
            }
        }
        System.out.print(sb.reverse());
    }
}
