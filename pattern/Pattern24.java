/*
n = 5

        1 
      2 2 2
    3 3 3 3 3
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5


*/

package pattern;
import java.util.Scanner;
public class Pattern24 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();

  int cnt = 1;

  for(int row = 0; row < n; row++) {
   
   // Space
   for (int col = 0; col < n - row - 1; col++) {
    System.out.print("  ");
   }

   // Star
   for (int col = 0; col < 2 * row + 1; col++) {
    System.out.print( cnt + " ");
   }
   cnt = cnt + 1;

   System.out.println();
  }

  sc.close();
 }
}
