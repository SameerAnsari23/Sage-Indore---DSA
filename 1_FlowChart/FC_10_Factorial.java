import java.util.Scanner;
public class FC_10_Factorial {
 public static void main(String[] arg) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);

  // Input number
  System.out.print("Enter a number to find its factorial: ");
  int num = sc.nextInt();

  int factorial = 1;

  // Calculate factorial
  for (int i = 1; i <= num; i++) {
   factorial *= i;
  }

  System.out.println("Factorial of " + num + " is: " + factorial);

  // Close the scanner
  sc.close();
 }
}
