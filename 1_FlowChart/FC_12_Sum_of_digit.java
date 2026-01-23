import java.util.Scanner;
public class FC_12_Sum_of_digit {
 public static void main(String[] arg) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number: ");
  int num = sc.nextInt();            // Read the number

  int sum = 0;

  // Calculate sum of digits
  while (num > 0) {
   int digit = num % 10;            // Get the last digit
   sum = sum + digit;               // Add digit to sum
   num = num / 10;                  // Remove the last digit from num
  }
  
  // Print the sum of digits
  System.out.println("Sum is: " + sum);

  sc.close();                       // Close the scanner
 }
}
