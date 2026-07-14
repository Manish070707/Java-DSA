/*
Problem:
Sort the given array in ascending order using the Counting Sort algorithm.

Example:
Input  : 1 4 1 3 2 4 3 7
Output : 1 1 2 3 3 4 4 7

Logic:
1. Find the largest element in the array.
2. Create a count array of size (largest element + 1).
3. Count the frequency of each element and store it in the count array.
4. Traverse the count array from index 0 to the last index.
5. Place each element into the original array according to its frequency.
6. Repeat until all frequencies become zero and the array is sorted.

Time Complexity: O(n + k)

Where:
n = Number of elements
k = Largest element in the array

Space Complexity: O(k)
*/


package Arrays;
import java.util.*;
public class CountingSort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printNums(int nums[]){
            for(int j=0;j<nums.length;j++){
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printNums(arr);

    }
}
