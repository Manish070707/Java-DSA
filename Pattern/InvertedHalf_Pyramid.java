
//       *
//      **
//     ***
//    ****
//   *****
//  ******
// *******

package Pattern;

public class InvertedHalf_Pyramid {
    public static void main(String[] args){
        int rows = 7;
        for(int i = 1;i<=rows;i++){
            for(int space = rows-1;space>=i;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}