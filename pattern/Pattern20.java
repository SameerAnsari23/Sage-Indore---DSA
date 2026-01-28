package pattern;
import java.util.Scanner;
public class Pattern20 {
 public static void main(String[] arg) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Number daal: ");
   int n = sc.nextInt();

   int mid = n / 2;
   for(int row = 0; row < n; row++) {
    for (int col = 0; col < n; col++) {
     if (Math.abs(row - mid) + Math.abs(col - mid) == mid) {
      System.out.print("*");
     }
     else {
      System.out.print(" ");
     }
     
    }
    System.out.println();
   }

   sc.close();
 }
}
