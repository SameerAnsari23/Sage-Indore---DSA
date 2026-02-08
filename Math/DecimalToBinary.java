/*
Question 7
i/p : 9
o/p : 1001

*/

package Math;
import java.util.Scanner;
public class DecimalToBinary {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Decimal Number: ");
  int n = sc.nextInt();

  String ans = "";                // For storing binary value
  while(n > 0) {
   int r = n % 2;                 // Remainder
   n = n / 2;                     // Store quiotient 
   ans = r + ans;                 // Store remainder from front in ans
  }

  System.out.println("Binary number of " + n + " is: " + ans);

  sc.close();
 }
}
