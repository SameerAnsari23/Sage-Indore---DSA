/* 

        *
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *

*/

package pattern;
import java.util.Scanner;
public class Pattern11 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();

  for(int row = 0; row < n; row++) {
   
   // Space
   for (int col = 0; col < n - row - 1; col++) {
    System.out.print(' ');
   }

   // Star
   for (int col = 0; col < 2 * row + 1; col++) {
    if(col % 2 == 0) {
      System.out.print("*");
    }
    else {
      System.out.print(" ");
    }
   }

   System.out.println();
  }

  sc.close();
 }
}
 