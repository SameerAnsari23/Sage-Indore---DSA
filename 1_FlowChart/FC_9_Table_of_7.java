import java.util.Scanner;
public class FC_9_Table_of_7 {
 public static void main(String[] arg) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);
  
  // Input number
  System.out.print("Enter a number to display its table: ");
  int num = sc.nextInt();

  // Display multiplication table
  System.out.println("Table of " + num + " is:");
  for (int i = 1; i <= 10; i++) {
   System.out.println(num + " x " + i + " = " + (num * i));
  }

  // Close the scanner
  sc.close();
 }
}
