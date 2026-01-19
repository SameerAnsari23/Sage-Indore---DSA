import java.util.Scanner;
public class Print_Counting {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your number: ");
  int num = sc.nextInt();

  int i = 1;
  while (i <= num) {
   System.out.print(i + " ");
   i = i+1;
  }

  sc.close();
 }
}
