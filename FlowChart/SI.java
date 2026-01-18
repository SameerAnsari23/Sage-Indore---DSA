import java.util.Scanner;
public class SI {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter your principle amount: ");
  float p = sc.nextFloat();

  System.out.print("Enter your rate of interest: ");
  float r = sc.nextFloat();

  System.out.print("Enter your time duration: ");
  float t = sc.nextFloat();

  float si = (p*r*t)/100;

  System.out.println("Simple interest: " + si);

  sc.close();
 }
}