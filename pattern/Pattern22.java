/*
n = 5

* * * * * * * * *  
* * * *   * * * *
* * *       * * *
* *           * *
*               *

*/

package pattern;
import java.util.Scanner;

public class Pattern22 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  for(int row = n-1; row >= 0; row--) {
   // Left Star
   for(int col = 0; col <= row; col++) {
    System.out.print("* ");
   }
   
   // Space
   for(int col = 0; col < 2*(n-row) - 3; col++) {
    System.out.print("  ");
   }

   // Star
   for(int col = 0; col <= row; col++) {
    if(row == n-1 && col == n-1) {
     System.out.print(" ");
    }
    else {
     System.out.print("* ");
    }
   }

   // Next line
   System.out.println();
  }
  sc.close();
 } 
}
