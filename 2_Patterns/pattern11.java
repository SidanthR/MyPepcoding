/* 
pattern12
5
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15
*/
import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1; // for printing digits instead of *

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if( j <= i ) {
                    System.out.print( val + "\t");
                    val++;
                }
                else
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
}