/*
    *****
    *   *
    *   *
    *****


Logic:
1. Print stars on the first and last rows.
2. Print stars on the first and last columns.
3. Print spaces inside the rectangle.
4. Repeat for all rows.
*/

package Pattern;

public class HollowRectangle {
    public static void main(String[] args){
        int rows = 4,cols = 5;
        for(int i = 1;i<=rows;i++){
            // column 
            for(int j=1;j<=cols;j++){
                // cell (i,j)
                if(i==1||i==rows||j==1||j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
