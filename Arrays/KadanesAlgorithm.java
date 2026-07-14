/*
Problem:
Find the maximum sum of a contiguous subarray using Kadane's Algorithm.

Example:
Input  : -2 -3 4 -1 -2 1 5 -3
Output : our max subarray sum is : 7

Logic:
1. Initialize currentSum = 0 and maxSum = Integer.MIN_VALUE.
2. Traverse the array.
3. Add the current element to currentSum.
4. Update maxSum if currentSum is greater.
5. If currentSum becomes negative, reset it to 0.
6. Print the maximum subarray sum.

Time Complexity : O(n)
Space Complexity: O(1)
*/


package Arrays;
public class KadanesAlgorithm{
    public static void kadanes(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<nums.length;i++){
            cs = cs+nums[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }
    public static void main(String[] args){
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(nums);
    }
}

// ye bhi maxSubarray find krne ka code hai lekin iski time complexity sabse kam hoti hai