/*
Pascal Triangle
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
1  5  10 10 5 1
...

Question 5
i/p : 5
o/p : 
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1

*/


package Math;
import java.util.Scanner;
public class PascalTriangle {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number of row: ");
  int n = sc.nextInt();

  for (int row = 0; row < n; row++) {
   int ans = 1;
   for (int col = 0; col <= row; col++) {
    System.out.print(ans + " ");
    ans = ans * (row - col) / (col + 1);
   }
   System.out.println();
  }

  sc.close();
 }
}
