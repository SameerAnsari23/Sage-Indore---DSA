/*
n = 5

5 4 3 2 * 
5 4 3 * 1
5 4 * 2 1 
5 * 3 2 1
* 4 3 2 1


*/

package pattern;
import java.util.Scanner;

public class Pattern31 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();

  for (int row = 0; row < n; row++) {
   int cnt = n;

   for (int col = 0; col < n; col++) {
     if (col == n - row - 1) {
      System.out.print("* ");
     }
     else {
      System.out.print(cnt + " ");
     }

     cnt = cnt - 1;
   }

   System.out.println();
  }
  
  sc.close();
 }
}
