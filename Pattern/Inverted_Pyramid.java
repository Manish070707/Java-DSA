 /*   
    
    *********
     *******
      *****
       ***
        *

Logic:
1. Print leading spaces in each row.
2. Decrease the number of stars in every row.
3. Print (2 * currentRow - 1) stars in reverse order.
4. Continue until one star remains.
*/
package Pattern;
public class Inverted_Pyramid {
    public static void main(String[] args){
        int rows = 5;
        for(int i=1;i<=rows;i++){                      // Outer loop -> Rows
            for(int space=1;space<i;space++){     // First Inner Loop -> Print Spaces
                System.out.print(" ");
            }
            for(int j=1;j<=2*(rows-i+1)-1;j++){              // Second Inner Loop print 2*(rows-i+1)-1 stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
