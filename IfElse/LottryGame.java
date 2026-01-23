import java.util.Scanner;
public class LottryGame {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a no.: ");
  int num = sc.nextInt();

  // Determine the prize based on the number range
  if(num >= 300 && num <= 460) {
   System.out.println("The prize is MacBook");
  }
  else if (num >= 200 && num <= 280) {
   System.out.println("The prize is kurkure");
  }
  else if(num >= 1100 && num <= 1500) {
   System.out.println("The prize is Cycle");
  }
  else if(num > 50 && num <= 80) {
   System.out.println("The prize is Bike");
  }
  else {
   System.out.println("Better luck next time");
  }
  
  sc.close();
 }
}
