/*
Problem:

Find all occurrences of a given key in an array using Recursion.

Example:

Input  : {3, 2, 4, 5, 6, 2, 7, 2, 2}
Key    : 2

Output : 1 5 7 8

Logic:

1. Start checking the array from index 0.
2. Compare the current element with the key.
3. If the element matches the key, print its index.
4. Recursively move to the next index.
5. Stop when the index reaches the length of the array.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class FindKey {
    public static void allOccurrances(int arr[] , int key , int i){
        if(i==arr.length){
            return;
        }
        if(key == arr[i]){
            System.out.print(i+ " ");
        }allOccurrances(arr, key, i+1);
    }
    public static void main(String[] args){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        allOccurrances(arr, key, 0);
    }
}
