/*
Problem:
Find the lexicographically largest string from an array.

Example:
Input: {"apple", "banana", "mango"}
Output: mango

Logic:
1. Assume the first string is the largest.
2. Traverse the array.
3. Compare the current largest string with each string using compareTo().
4. If compareTo() returns a negative value, it means the current string is
   lexicographically larger, so update the largest string.
5. After traversing the array, print the largest string.

Time Complexity: O(n × m)

Where:
n = Number of strings
m = Average length of each string

Space Complexity: O(1)
*/
package Strings;

public class LargestString {
    public static void main(String[] args){
        String fruits[] = {"apple","banana","mango"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.print(largest);
    }
}
