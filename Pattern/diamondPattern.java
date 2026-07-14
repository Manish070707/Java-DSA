
/*  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

   Logic:
1. Print the upper pyramid.
2. Print the lower inverted pyramid.
3. Start the lower pyramid from (rows - 1) to avoid repeating the middle row.
*/

package Pattern;
public class diamondPattern {
    public static void main(String[] args){
        int rows = 5;
        for(int i=1;i<=rows;i++){
            for(int space = rows-1;space>=i;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
            System.out.print("*");
        }
        System.out.println();
        }
        for(int i=rows-1;i>=1;i--){
            for(int space=rows-1;space>=i;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=2*i-1;star++){
            System.out.print("*");
        }
        System.out.println();
        }
        }
    }

