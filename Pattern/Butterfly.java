
/*  *        *
    **      **
    ***    ***
    ****  ****
    **********
    **********
    ****  ****
    ***    ***
    **      **
    *        *



Logic:
1. Print the upper half of the butterfly.
2. Print stars on both sides.
3. Print spaces in the middle.
4. Print the lower half by reversing the upper half.
*/

package Pattern;

public class Butterfly {
    public static void main(String[] args){
        int rows=5;
        // First half
        for(int i=1;i<=rows;i++){
            // stars  -> i
            for(int star =1;star<=i;star++){
                System.out.print("*");
            }
            // Space-> 2*(rows-i)
            for(int space=1;space<=2*(rows-i);space++){
                System.out.print(" ");
            }
            // Stars -> i
            for(int star =1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        // For 2nd Half
        for(int i=rows;i>=1;i--){
            // stars  -> i
            for(int star =1;star<=i;star++){
                System.out.print("*");
            }
            // Space-> 2*(rows-i)
            for(int space=1;space<=2*(rows-i);space++){
                System.out.print(" ");
            }
            // Stars -> i
            for(int star =1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
