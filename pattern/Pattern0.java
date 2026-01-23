package pattern;
import java.util.Scanner;
public class Pattern0 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Kitne star print krne hai: ");
  int num = sc.nextInt();

   // coloumn per iterate krne ke liye 
   for(int col = 0; col < num; col++) {
   System.out.print("* ");
   }

  sc.close(); 
 }
}
