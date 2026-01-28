package pattern;
import java.util.Scanner;
public class Pattern13 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();

  // Upper half
  for (int row = 0; row < n; row++) {
   for(int col = 0; col <= row; col++) {
    System.out.print("*");
   }
   System.out.println();
  }

  // Lower half
  for (int row = n-1; row >= 1; row--) {
   for(int col = 0; col < row; col++) {
    System.out.print("*");
   }
   System.out.println();
  }
  sc.close();
 }

}
