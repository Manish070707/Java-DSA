/*
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

Logic:
1. Print leading spaces to align the pyramid.
2. Print numbers in increasing order for each row.
3. Print numbers according to the required pattern.
4. Repeat for all rows.
*/

package Pattern;

public class Number_Pyramid {
    public static void main(String[] args){
        int rows = 5;
        for(int i=1;i<=rows;i++){
            for(int space=rows-1;space>=i;space--){
                System.out.print(" ");
            }
            for(int num=1;num<=i;num++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
