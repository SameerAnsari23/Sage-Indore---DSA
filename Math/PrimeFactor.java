/*
Prime factor : Factor of number should be prime 

Question 4
i/p : 24
o/p : 2 2 2 3

*/

package Math;
import java.util.Scanner;

public class PrimeFactor {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);

 int n = sc.nextInt();

 for (int i = 2; i <= n; i++) {
  while (n % i == 0) {
   System.out.print(i + " ");
   n = n / i;
  }
 }

 sc.close();
 }
}
