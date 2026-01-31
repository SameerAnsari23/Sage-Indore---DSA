/*
n = 7

* * *   * * * 
* *       * *
*           *

*           *
* *       * *
* * *   * * *

*/


package pattern;
import java.util.Scanner;;
public class Pattern17 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Please enter the number: ");
  int n = sc.nextInt();

  int mid = n/2;

  for (int row = 0; row < mid; row++) {
   // Star
   for (int col = 0; col < mid - row; col++) {
    System.out.print("* ");
   }

   // Space
   for (int col = 0; col < 2*row + 1; col++) {
    System.out.print("  ");
   }

   // star
   for (int col = 0; col < mid - row; col++) {
    System.out.print("* ");
   }
   System.out.println();

  }
  
  System.out.println();
  
  // Lower half
  for (int row = mid-1; row >= 0; row--) {
   // Star
   for (int col = 0; col < n/2 - row; col++) {
    System.out.print("* ");
   }

   // Space
   for (int col = 0; col < 2*row + 1; col++) {
    System.out.print("  ");
   }

   // star
   for (int col = 0; col < mid - row; col++) {
    System.out.print("* ");
   }
   System.out.println();

  }
  sc.close();
 }
}
