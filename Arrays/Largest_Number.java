
/*
Problem:
Find the largest & smallest element in an array.

Example:
Input  : 1 2 3 20 5 6 10
Output : largest value is : 20   
         Smallest value is : 1

Logic:
1. Initialize max with the smallest possible integer value and min with the largest possible integer value.
2. Traverse the array using a loop.
3. If the current element is greater than largest, update largest.
4. If the current element is less than smallest, update smallest.
4. Print the largest element.

Time Complexity : O(n)
Space Complexity: O(1)
*/


package Arrays;

public class Largest_Number {
    public static int largestNumber(int nums[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }if(smallest>nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,20,5,6,10};
        System.out.println("largest value is : " + largestNumber(nums));
    }
}
