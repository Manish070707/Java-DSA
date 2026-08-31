/*
Problem:

Print the digits of a number in words using Recursion.

Example:

Input  : 2006

Output : Two Zero Zero Six

Logic:

1. Extract the last digit using number % 10.
2. Recursively process number / 10 to reach the first digit.
3. Print the digit in words while returning from the recursion.
4. Use an array to map each digit from 0 to 9 to its word.

Time Complexity: O(d)

Space Complexity: O(d)

Where d is the number of digits.
*/
package Recursion;

public class PrintDigits {
    public static void printDigits(int number){
        String digits[] = {"Zero" , "One", "Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(number==0){
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void  main(String[] args){
        printDigits(2006);

    }
}
