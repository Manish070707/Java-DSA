
/*  1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15

Logic:
1. Print rows one by one.
2. Start the number from 1.
3. Increase the number after every print.
4. Continue until all rows are completed.
*/

package Pattern;
public class floyds_Triangle {
    public static void main(String[] args){
        int rows = 5,count=1;
        for(int i=1;i<=rows;i++){
            // how many times will counter be printed
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
