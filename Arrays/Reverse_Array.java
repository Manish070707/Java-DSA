/*
Problem:
Reverse an array using the Two Pointer Technique.

Example:
Input  : 2 4 8 10 16 18 64
Output : 64 18 16 10 8 4 2 

Logic:
1. Initialize two pointers: start = 0 and end = last index.
2. Swap the elements at start and end.
3. Increment start and decrement end.
4. Repeat until start is no longer less than end.

Time Complexity : O(n)
Space Complexity: O(1)
*/



package Arrays;

public class Reverse_Array {
    public static void reverseArray(int nums[]){
        int first = 0,last = nums.length-1;
        while(first<last){
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int nums[] = {2,4,8,10,16,18,64};
        reverseArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
