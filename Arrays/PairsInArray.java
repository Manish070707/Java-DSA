/*
Problem:
Print all possible pairs of elements in an array.

Example:
Input  : 2 4 6 8 10
Output : (2,4)(2,6)(2,8)(2,10)
         (4,6)(4,8)(4,10)
         (6,8)(6,10)
         (8,10)
         total pairs = 10

Logic:
1. Traverse the array using the first loop.
2. Use the second loop starting from the next element.
3. Print the current pair.
4. Repeat until all pairs are printed.

Time Complexity : O(n²)
Space Complexity: O(1)
*/


package Arrays;

public class PairsInArray{
    public static void printPairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
                }
                System.out.println();
            }
            System.out.println("total pairs = " + tp);
        }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
