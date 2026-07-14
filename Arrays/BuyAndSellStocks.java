/*
Problem:
Find the maximum profit from buying and selling a stock once.

Example:
Input  : 7 1 2 8 6 4
Output : 7

Logic:
1. Initialize the buying price with the largest positive integer value.
2. Traverse the array from left to right.
3. If the current price is lower than the buying price, update it.
4. Otherwise, calculate the current profit.
5. Update the maximum profit if the current profit is greater.
6. Print the maximum profit.

Time Complexity : O(n)
Space Complexity: O(1)
*/

package Arrays;

public class BuyAndSellStocks{
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[] = {7,1,2,8,6,4};     // Time complexity of O(n)
        System.out.println(buyAndSellStocks(prices)); 
    }
}
