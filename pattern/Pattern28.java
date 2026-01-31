/*
n = 5

        1 
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5


*/

package pattern;
import java.util.Scanner;
public class Pattern28 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int n = sc.nextInt();

  for(int row = 0; row < n; row++) {
   
   // Space
   for (int col = 0; col < n - row - 1; col++) {
    System.out.print("  ");
   }

   // Increasing Star
   for (int col = 0; col <= row ; col++) {
    System.out.print(row + col + 1 + " ");
   }
   
   // decreasing star
   for(int col = row; col >= 1; col--){
    System.out.print(row + col + " ");
   }

   System.out.println();
  }

  sc.close();
 }
}