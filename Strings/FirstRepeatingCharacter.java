/*
Problem:
Find the first repeating character in a string.

Example:
Input  : abcbbaef
Output : a

Logic:
1. Traverse each character of the string.
2. Compare it with all the following characters.
3. If the same character is found again:
      - Print that character.
      - Stop the program immediately.
4. If no repeating character exists, print an appropriate message.

Time Complexity : O(n²)
Space Complexity: O(1)
*/

package Strings;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {

        String str = "abcbbaef";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("First Repeating Character = " + str.charAt(i));
                    return;
                }

            }

        }

        System.out.println("No Repeating Character");
    }
}