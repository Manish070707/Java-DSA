/*
Problem:
Find the maximum subarray sum using the Prefix Sum technique.

Example:
Input  : 8 10 12 14 16
Output : max Subarray sum = 60

Logic:
1. Create a prefix sum array.
2. Traverse all possible subarrays using two loops.
3. Calculate each subarray sum using the prefix sum array.
4. Compare the current sum with the maximum sum.
5. Update the maximum sum if required.
6. Print the maximum subarray sum.

Time Complexity : O(n²)
Space Complexity: O(n)
*/
package Arrays;
public class MaxSubarray {
    public static void maxSubarraySum(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0] ; 
        for (int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+nums[i]; 
        }
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                    int end = j;
                    int currSum = 0;
                    currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                    System.out.print(currSum + " ");
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println();
        System.out.print("max Subarray sum = " + maxSum);
    }
    public static void main(String[] args){
        int nums[] = {8,10,12,14,16};
        maxSubarraySum(nums);
    }
}

