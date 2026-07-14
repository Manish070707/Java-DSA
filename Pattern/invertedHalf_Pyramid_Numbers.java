
/*  1234567
    123456
    12345
    1234
    123
    12
    1*/

package Pattern;

public class invertedHalf_Pyramid_Numbers {
    public static void main(String[] args){
        int rows = 7;
        for(int i=1;i<=rows;i++){
            for(int num=1;num<=rows-i+1;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
