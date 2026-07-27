/*
Problem:
Find the shortest distance after following a path.

Example:
Input  : WNEENESENNN
Output : Shortest Distance = 5.0

Logic:
1. Initialize x and y coordinates as 0.
2. Traverse the string.
3. Update x and y according to the direction.
4. Calculate the shortest distance using:
      √(x² + y²)
5. Print the distance.

Time Complexity : O(n)
Space Complexity: O(1)
*/

package Strings;

public class ShortestPath {
    public static float Shortest_Path(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
           char dir = path.charAt(i);
           if(dir == 'S'){
            y--;
           } else if(dir == 'N'){
            y++;
           }else if(dir == 'E'){
            x++;
           }else{
            x--;
           }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.print(Shortest_Path(path));
    }
}
