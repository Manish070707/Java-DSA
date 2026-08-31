/*
Problem:

Find the first occurrence of a key in an array using Recursion.

Example:

Input  : {8, 3, 6, 9, 5, 10, 2, 5, 3}
Key    : 3

Output : 1

Logic:

1. Start searching from index 0.
2. Compare the current element with the key.
3. If the key is found, immediately return the current index.
4. Otherwise, recursively search the next index.
5. Return -1 if the key is not found in the array.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class FirstOccurance {
    public static int firstOccurance(int arr[], int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurance(arr, 3, 0));
    }
}
