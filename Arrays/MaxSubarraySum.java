
/*
Problem:
Find the maximum subarray sum using the Brute Force approach.

Example:
Input  : 8 10 12 14 16
Output : max sum = 60

Logic:
1. Generate all possible subarrays using three nested loops.
2. Calculate the sum of each subarray.
3. Compare the current sum with the maximum sum.
4. Update the maximum sum if needed.
5. Print the maximum subarray sum.

Time Complexity : O(n³)
Space Complexity: O(1)
*/

package Arrays;
public class MaxSubarraySum {
    public static void maxSubarraySum(int nums[]){
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                }
                System.out.print(currSum + " ");
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println();
        System.out.print("max sum = " + maxSum);
    }
    public static void main(String[] args){
        int nums[] = {8,10,12,14,16};
        maxSubarraySum(nums);
    }
}

// ab iski time Complexity kam krne ke liye hum ise prefix array ka sum calculate krke solve kr sakte hai 
