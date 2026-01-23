import java.util.Scanner;
public class FC_13_Reverse_Number {
 public static void main(String[] arg) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number to reverse: ");
  int num = sc.nextInt();

  int reversed = 0;
  
  // Reverse the number
  while (num != 0) {
   int digit = num % 10;               // Get the last digit
   reversed = reversed * 10 + digit;   // Append digit to reversed number
   num /= 10;                          // Remove the last digit from num
  }

  System.out.println("Reversed Number: " + reversed);

  // Close the scanner
  sc.close();
 }
}
