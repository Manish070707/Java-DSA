/*
Problem:

Check whether an array is sorted in ascending order using Recursion.

Example:

Input  : {1, 2, 3, 4, 5}

Output : true

Logic:

1. Compare the current element with the next element.
2. If arr[i] > arr[i+1], the array is not sorted, so return false.
3. Otherwise, recursively check the next index.
4. If the recursion reaches the last element, return true.

Time Complexity: O(n)

Space Complexity: O(n)
*/

package Recursion;
public class ArrayIsSorted{
    public static boolean isSorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}