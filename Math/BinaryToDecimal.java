/*
Question 6
i/p : 1001
o/p : 9

*/

package Math;
import java.util.Scanner;
public class BinaryToDecimal {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a Binary Number: ");
  int n = sc.nextInt();

  int i = 0, d = 0;
  while (n > 0) {
   int r = n % 10;                          // Find Remainder
   d = d + r * (int)Math.pow(2, i);      // Calculation for decimal 
   i++;                                    // Increase power 
   n = n / 10;                             // Store quiotient 
  }

  System.out.println("Decimal number of " + n + " is: " + d);

  sc.close();
 }
}
