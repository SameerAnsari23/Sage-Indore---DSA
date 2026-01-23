package pattern;

import java.util.Scanner;

public class Pattern2 {
 public static void main(String[] arg) {
 Scanner sc = new Scanner(System.in);
  System.out.print("Kitne star print krne hai: ");
  int num = sc.nextInt();

  // row per iterate krne ke liye 
  for(int row = 0; row < num; row++) {

   // coloumn per iterate krne ke liye 
   for(int col = 0; col <= row; col++) {
   System.out.print("* ");
   }
    
   System.out.println();
  }
  sc.close();
 }
}
