/*
Fibbonacci number : 0 1 1 2 3 5 8 13 21 ...
Question 2
i/p : 6
o/p : 5

*/

package Math;

import java.util.Scanner;
public class Fibbonacci {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number: ");
  int n = sc.nextInt();

  int cur = 0, a = 0, b = 1;
  for(int i = 1; i < n; i++) {
   cur = a + b;                  // Find current number by sum of last two previous digit
   a = b;                        // update the value of a by b
   b = cur;                      // update the value of b by current
  }

  System.out.println("Fibbonacci number is: " + cur);
  
  sc.close();
 } 
}
