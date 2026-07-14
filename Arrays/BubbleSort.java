/*
Problem:
sort the given array in ascending order using Bubble Sort.

Example:
Input  : 5 4 1 3 2
Output : 1 2 3 4 5

Logic:
1. First outer loop will be start from turn 0 to less than array Length;
2. Second Inner loop will be start from 0 to less than array length-1-turns.
3. compare each pair of adjacent elements.
4. If the left element is greater than the right element, swap them.
5. Repeat the process for the array remaining unsorted part of the array.
6. Continue until the array becomes completely sorted.

Time Complexity : O(n²)
Space Complexity: O(1)
*/
package Arrays;
public class BubbleSort{
    public static void bubbleSort(int nums[]){
            for(int turn=0;turn<nums.length-1;turn++){
                for(int i=0;i<nums.length-1-turn;i++){
                    if(nums[i]>nums[i+1]){
                        int temp = nums[i];
                        nums[i] = nums[i+1];
                        nums[i+1] = temp;
                    }
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
        int nums[] = {5,4,1,3,2};
        bubbleSort(nums);
        printNums(nums);
    }
}