/*
Problem:
Count the total number of words in a sentence.

Example:
Input  : I Love Java Programming
Output : Words = 4

Logic:
1. Initialize count as 0.
2. Traverse the string.
3. If the current character is not a space and
   (it is the first character or the previous character is a space),
   increase the word count.
4. Print the total number of words.

Time Complexity : O(n)
Space Complexity: O(1)
*/
package Strings;

public class CountWords {
    public static void main(String[] args){
        String str = "I Love Java Programming";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' ' && (i==0 || str.charAt(i-1) == ' ')){
                count++;
            }
        }
        System.out.print(count);
    }
}
