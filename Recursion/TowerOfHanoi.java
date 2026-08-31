/*
Problem:

Solve the Tower of Hanoi problem using Recursion.

Example:

Input  : n = 3

Output :
transfer disk 1 from A to C
transfer disk 2 from A to B
transfer disk 1 from C to B
transfer disk 3 from A to C
transfer disk 1 from B to A
transfer disk 2 from B to C
transfer disk 1 from A to C

Logic:

1. Move n-1 disks from source to helper.
2. Move the largest disk from source to destination.
3. Move n-1 disks from helper to destination.
4. Repeat recursively until only one disk remains.

Time Complexity: O(2^n)

Space Complexity: O(n)
*/
package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n , String src , String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest); 
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args){
        towerOfHanoi(3, "A", "B", "C");
    }
} 
