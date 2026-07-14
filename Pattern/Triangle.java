
// 1
// 01
// 101
// 0101
// 10101

package Pattern;

public class Triangle {
    public static void main(String[] args){
        int rows=5; 
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){  // if cell no is even then print 1
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
