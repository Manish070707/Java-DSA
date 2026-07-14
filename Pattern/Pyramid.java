/*
Pattern:

    *
   ***
  *****
 *******
*********
*/

package Pattern;
public class Pyramid {                                              
    public static void main(String[] args){
        int rows = 5;
        for(int i=1;i<=rows;i++){                      // Outer loop -> Rows
            for(int space=rows-1;space>=i;space--){     // First Inner Loop -> Print Spaces
                System.out.print(" ");
            }
           for(int star=1;star<=2*i-1;star++){              // Second Inner Loop print(2*i-1) stars
            System.out.print("*");
           }
           System.out.println();
        }
    }
}                                           






