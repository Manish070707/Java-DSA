/*
Problem:
Search an element in a sorted array using Binary Search.

Example:
Input  : 2 4 6 8 10 12 14 16
Key    : 10
Output : index for key is : 4

Logic:
1. Initialize two pointers: start = 0 and end = last index.
2. Find the middle element using mid = start + (end - start) / 2.
3. If the middle element is equal to the key, return its index.
4. If the key is smaller than the middle element, search in the left half.
5. Otherwise, search in the right half.
6. Repeat until the element is found or start becomes greater than end.

Time Complexity : O(log n)
Space Complexity: O(1)
*/



package Arrays;

public class Binary_Search {
    public static int binarySearch(int nums[], int key){
       int start = 0,end = nums.length-1;
       while(start<=end){
        int mid = start+(end-start)/2;
        if(nums[mid] == key){       // key Found at index 
            return mid;
        }else if(nums[mid]<key){    // Search on the Right side
            start = mid+1;
        }else{                      // Search on the Left side
            end = mid-1;
        }
       }
       return -1; 
    }
    public static void main(String[] args){
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        System.out.println("index for key is : " + binarySearch(nums,key));
    }
}
