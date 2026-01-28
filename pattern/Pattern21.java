package pattern;
import java.util.Scanner;

public class Pattern21 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  for(int row = 0; row < n; row++) {
   // Left Star
   for(int col = 0; col <= row; col++) {
    System.out.print("*");
   }
   
   // Space
   for(int col = 0; col < 2*(n-row) - 3; col++) {
    System.out.print(" ");
   }

   // Star
   for(int col = 0; col <= row; col++) {
    if(row == n-1 && col == n-1) {
     System.out.println();
    }
    else {
     System.out.print("*");
    }
   }

   // Next line
   System.out.println();
  }
  sc.close();
 } 
}
