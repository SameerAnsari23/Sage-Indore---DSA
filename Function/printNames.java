package Function;
import java.util.Scanner;
public class printNames {

 public static void printName(String name) {
  System.out.println(name);
 }

 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your name: ");
  String name = sc.next();

  printName(name);

  System.out.println("Hello");

  sc.close();
 }
}
