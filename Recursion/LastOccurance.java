/*
Problem:

Find the last occurrence of a key in an array using Recursion.

Example:

Input  : {8, 3, 6, 9, 5, 10, 2, 5, 3}
Key    : 5

Output : 7

Logic:

1. Recursively search the array until the last index.
2. Start checking elements while returning from the recursion.
3. If a matching element is found and no later occurrence exists, return its index.
4. Otherwise, return the occurrence found later in the array.
5. Return -1 if the key does not exist.

Time Complexity: O(n)

Space Complexity: O(n)
*/
package Recursion;

public class LastOccurance {
    public static int lastOccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        if(arr[i] != key){
            return  isFound;
        }
        return isFound;
    }
    public static void main(String[] args){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
