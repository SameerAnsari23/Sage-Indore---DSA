/*
n = 5

        1 
      1 2 1
    1 2 3 2 1 
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1


*/


package pattern;
import java.util.Scanner;
public class Pattern27 {
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
    System.out.print(col + 1 + " ");
   }
   
   // decreasing star
   for(int col = row; col >= 1; col--){
    System.out.print(col + " ");
   }

   System.out.println();
  }

  sc.close();
 }
}
