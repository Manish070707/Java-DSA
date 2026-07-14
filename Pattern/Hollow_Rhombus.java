/*
      *******
     *     *
    *     *
   *     *
  *     *
 *     *
*******

Logic:
1. Print leading spaces to form the rhombus shape.
2. Print stars only on the boundary.
3. Print spaces inside the rhombus.
4. Repeat for all rows.
*/

package Pattern;
public class Hollow_Rhombus {
    public static void main(String[] args){
        int rows = 7;
        for(int i=1;i<=rows;i++){
            for(int space=rows-1;space>=i;space--){     // Spaces
                System.out.print(" ");
            }
            for(int star = 1;star<=rows;star++){      // hollow rectangle -> stars
            if(i==1||i==rows||star==1||star==rows){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
