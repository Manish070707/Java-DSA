/*
Problem:
Calculate the total amount of trapped rainwater between the bars.

Example:
Input  : 4 2 0 6 3 2 5
Output : 11

Logic:
1. Create leftMax and rightMax arrays.
2. Store the maximum height from the left side for each index.
3. Store the maximum height from the right side for each index.
4. For each index, find the water level using:
   waterLevel = min(leftMax, rightMax)
5. Trapped water at each index:
   trappedWater = waterLevel - height
6. Add the trapped water of all indices.
7. Print the total trapped rainwater.

Time Complexity : O(n)
Space Complexity: O(n)
*/


package Arrays;
public class Trapping_Rainwater{
    public static int trappedRainwater(int height[]){
        // Calculate left max boundry -> Array

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // Calculate Right max boundry -> Array

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        // Loop

        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            // waterLevel = min(leftmax bound, rightmax bound)

           int  waterLevel = Math.min(leftMax[i], rightMax[i]);

           //trapped water = waterLevel - height[i]

            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}