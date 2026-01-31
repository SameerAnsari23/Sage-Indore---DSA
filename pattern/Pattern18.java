/*
n = 7

      * 
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *

  
*/


package pattern;
import java.util.Scanner;
public class Pattern18 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();

  int mid = n/2 + 1;
  // Upper Half
  for(int row = 0; row < mid; row++) {
   
   // Space
   for (int col = 0; col < mid - row - 1; col++) {
    System.out.print("  ");
   }

   // Star
   for (int col = 0; col < 2 * row + 1; col++) {
    System.out.print("* ");
   }

   System.out.println();
  }

  // Lower Half
  for(int row = 1; row < mid; row++) {
   // Space
   for (int col = 0; col < row; col++) {
    System.out.print("  ");
   }

   // Star
   for(int col = 0; col < 2*(mid - row) - 1; col++) {
    System.out.print("* ");
   }

   // next line
   System.out.println();
  }

  sc.close();
 }
}
