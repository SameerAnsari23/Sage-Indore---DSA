import java.util.Scanner;
public class FC_7_Print_Counting {
 public static void main(String[] arg) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your number: ");
  int num = sc.nextInt();         // Read the number

  int i = 1;

  // Print counting from 1 to num
  while (i <= num) {
   System.out.print(i + " ");
   i = i+1;                       // Increment i
  }

  sc.close();                     // Close the scanner
 }
}
