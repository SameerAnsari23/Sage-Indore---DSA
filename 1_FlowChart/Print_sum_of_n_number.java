import java.util.Scanner;
public class Print_sum_of_n_number {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your number: ");
  int num = sc.nextInt();

  int i = 1;
  int sum = 0;
  while (i <= num) {
   sum = sum + i;
   i = i + 1;
  }
  System.out.println("Sum is: " + sum);
  sc.close();
 }
}
