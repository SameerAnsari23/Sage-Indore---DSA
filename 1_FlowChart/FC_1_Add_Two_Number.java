import java.util.Scanner;
public class FC_1_Add_Two_Number {
 public static void main(String[] args) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter first number: ");
  int a = sc.nextInt();        // Read first number

  System.out.print("Enter second number: ");
  int b = sc.nextInt();        // Read second number

  int sum = a + b;             // Calculate sum

  System.out.println("Sum of two number: " + sum);

  sc.close();                  // Close the scanner
 }
}