/*
GCD = HCF
Question 3
i/p : a = 24,  b = 36
o/p : 12

*/

package Math;
import java.util.Scanner;
public class gcd {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter first number: ");
  int a = sc.nextInt();

  System.out.print("Enter second number: ");
  int b = sc.nextInt();
  
  int gcd = 1;
  for (int i = 1; i <= Math.min(a,b); i++) {
   if (a % i == 0 && b % i == 0) {                  // Check both number is divisble by a number
    gcd = i;                                        // if yes so store the number in ans
   }
  }

  System.out.println("Greatest Common Divisor is: " + gcd);

  sc.close();
 }
}
