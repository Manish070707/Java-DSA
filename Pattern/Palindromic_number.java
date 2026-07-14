/*
    1
   212
  32123
 4321234
543212345


Logic:
1. Print leading spaces.
2. Print numbers in decreasing order.
3. Print numbers in increasing order.
4. Repeat for all rows to form a palindrome.
*/

package Pattern;

public class Palindromic_number {
    public static void main(String[] args){
        int rows = 5;
        for(int i=1;i<=rows;i++){98
            for(int space=rows-1;space>=i;space--){
                System.out.print(" ");
            }
            
            // Descending Order Pattern for left side
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            // Asscending Order Pattern for Right side

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
