/*
Problem:
Count the frequency of a given character in a string.

Example:
Input  :
String    = banana
Character = a

Output :
Frequency = 3

Logic:
1. Initialize a counter as 0.
2. Traverse the string character by character.
3. Compare each character with the given character.
4. If both are equal, increment the counter.
5. Print the frequency.

Time Complexity : O(n)
Space Complexity: O(1)
*/

package Strings;

public class CountFrequency {
    public static void main(String[] args) {

        String str = "banana";
        char ch = 'a';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + count);
    }
}