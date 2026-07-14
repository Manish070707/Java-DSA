/*
Problem:
Print all possible subarrays of an array.

Example:
Input  : 8 10 12 14
Output :    8 
            8 10 
            8 10 12 
            8 10 12 14 

            10 
            10 12 
            10 12 14 

            12 
            12 14 

            14 

            total Subarray : 10

Logic:
1. Select the starting index of the subarray.
2. Select the ending index of the subarray.
3. Print all elements between the start and end indices.
4. Repeat until all subarrays are printed.

Time Complexity : O(n³)
Space Complexity: O(1)
*/  
package Arrays;

public class Subarray {
    public static void printSubarray(int nums[]){
        int ts = 0;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Subarray : " + ts);
    }
    public static void main(String[] args){
        int nums[] = {8,10,12,14};
        printSubarray(nums);
    }
}
