/*
    *****
   *****
  *****
 *****
*****


Logic:
1. Print leading spaces in each row.
2. Print a fixed number of stars.
3. Repeat for all rows.
4. This creates a solid rhombus shape.
*/

package Pattern;

public class Solid_Rhombus {
    public static void main(String[] args){
        int rows = 5;
        for(int i=1;i<=rows;i++){
            // Spaces
            for(int space=1;space<=rows-i;space++){
                System.out.print(" ");
            }
            // Stars
            for(int star=rows;star>=1;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
