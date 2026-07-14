/*
Problem:
Sort the given array in ascending order using the Insertion Sort algorithm.

Example:
Input  : 5 4 1 3 2
Output : 1 2 3 4 5

Logic:
1. Assume the first element is already sorted.
2. Pick the next element (current element) from the unsorted part.
3. Compare the current element with the elements in the sorted part.
4. Shift all larger elements one position to the right.
5. Insert the current element into its correct position.
6. Repeat the process until all elements are sorted.

Time Complexity:  O(n²)
Space Complexity: O(1)
*/
package Arrays;

public class InsertionSort {
    public static void Insertion_Sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            while(prev>=0 && nums[prev]>curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    }
    public static void printNums(int nums[]){
            for(int j=0;j<nums.length;j++){
                System.out.print(nums[j] + " ");
            }
            System.out.println();
        }
    public static void main(String[] args){
        int nums[] = {5,4,1,3,2};
        Insertion_Sort(nums);
        printNums(nums);
    }
    
}
