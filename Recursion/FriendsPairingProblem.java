/*
Problem:

Find the number of ways n friends can remain single or pair with another friend.

Example:

Input  : 4

Output : 10

Logic:

1. A friend can either remain single or form a pair.
2. If one friend remains single, solve for n-1 friends.
3. If a friend forms a pair, they can pair with n-1 other friends.
4. Recursively solve for the remaining n-2 friends.
5. Add both possibilities to get the total number of ways.

Time Complexity: O(2^n)

Space Complexity: O(n)
*/
package Recursion;
public class FriendsPairingProblem{
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1 = friendsPairing(n-1);
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;
        int totalWays = fnm1+pairWays;
        return totalWays;
    }
    public static void main(String[] args){
        System.out.println(friendsPairing(4));
    }
}