import java.util.Scanner;
public class FC_3_Even_Odd {
 public static void main(String[] arg) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number: ");
  int num = sc.nextInt();         // Read the number

  if (num % 2 == 0) {
   System.out.println(num + " is Even.");
  } else {
   System.out.println(num + " is Odd.");
  }

  sc.close();                     // Close the scanner
 }
}
