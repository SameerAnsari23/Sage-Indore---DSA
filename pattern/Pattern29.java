/*
n = 5

        1 
      2 0 2
    3 0 0 0 3
  4 0 0 0 0 0 4
5 0 0 0 0 0 0 0 5


*/

package pattern;
import java.util.Scanner;

public class Pattern29 {
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
    if (col == 0) {                        // Starting col is equal to no. of row
     System.out.print(row + 1 + " ");
    }
    else {
     System.out.print(0 + " ");
    }
   }
   
   // decreasing star
   for(int col = row; col >= 1; col--){
    if (col == 1) {                        // Ending col is equal to no. of row
     System.out.print(row + 1 + " ");
    }
    else {
     System.out.print(0 + " ");
    }
   }

   System.out.println();
  }

  sc.close();
 }
}