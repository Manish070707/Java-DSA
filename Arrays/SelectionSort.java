/*
Problem:
Sort the given array in ascending order using the Selection Sort algorithm.

Example:
Input  : 5 4 1 3 2
Output : 1 2 3 4 5

Logic:
1. Assume the first unsorted element as the minimum element.
2. Traverse the remaining unsorted part of the array to find the actual minimum element.
3. Swap the minimum element with the first unsorted element.
4. Move the boundary of the sorted and unsorted parts by one position.
5. Repeat the process until the entire array is sorted.

Time Complexity:  O(n²)
Space Complexity: O(1)
*/


package Arrays;

public class SelectionSort {
    public static void selectionSort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[j] < nums[smallest]){
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
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
        selectionSort(nums);
        printNums(nums);
    }
}
