import java.util.Scanner;
public class FC_2_SI {
 public static void main(String[] args) {
  // Create a Scanner object for user input
  Scanner sc = new Scanner(System.in);

  // Input principle, rate and time
  System.out.print("Enter your principle amount: ");
  float p = sc.nextFloat();               

  System.out.print("Enter your rate of interest: ");
  float r = sc.nextFloat();

  System.out.print("Enter your time duration: ");
  float t = sc.nextFloat();

  // Calculate simple interest
  float si = (p*r*t)/100;

  System.out.println("Simple interest: " + si);

  // Close the scanner
  sc.close();
 }
}