package pattern;
import java.util.Scanner;
public class Pattern10 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print(" Give me a number: ");
  int n = sc.nextInt();

  for(int row = 0; row < n; row++) {
   // Space
   for (int col = 0; col < row; col++) {
    System.out.print(" ");
   }

   // Star
   for(int col = 0; col < 2*(n - row) - 1; col++) {
    System.out.print("*");
   }

   // next line
   System.out.println();
  }

  sc.close();
 }
 
}
