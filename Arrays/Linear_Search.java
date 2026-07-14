
/*
Problem:
Search an element in an array using Linear Search.

Example:
Input  : 2 4 6 8 10 12 14 16 
Key    : 10
Output : Key is at index : 4

Logic:
1. Traverse the array from the first element.
2. Compare each element with the key.
3. If the key is found, return its index.
4. If the loop ends without finding the key, return -1.

Time Complexity : O(n)
Space Complexity: O(1)
*/

package Arrays;
import java.util.*;
public class Linear_Search {
    public static int linearSearch(int nums[], int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = linearSearch(nums,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
        System.out.println("Key is at index : " + index);
        }
    }
}
