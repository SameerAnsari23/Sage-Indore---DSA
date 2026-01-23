import java.util.Scanner;
public class LottryGame2 {
 public static void main(String[] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a no.: ");
  int num = sc.nextInt();

  if (num >= 300 && num <= 460) {
   System.out.println("The prize is MacBook");
   if (num >= 300 && num <= 380) {
    System.out.println("Model: M1 Mac");
   } else {
    System.out.println("Model: M2 Mac");
   }
  } 

  else if (num >= 200 && num <= 280) {
   System.out.println("The prize is kurkure");
   if(num >= 200 && num <= 280) {
      System.out.println("Chilli Kurkure");
   }
   else {
    System.out.println("Onion Kurkure");
   }
  } 
  
  else if (num >= 1100 && num <= 1500) {
   System.out.println("The prize is Cycle");
   if(num >= 1100 && num <= 1300) {
      System.out.println("Avon Cycle");
   }
   else {
    System.out.println("Hero Cycle");
   }
  } 
  
  else if (num > 50 && num <= 80) {
   System.out.println("The prize is Bike");
   if(num >= 50 && num <= 65) {
      System.out.println("Bullet");
   }
   else {
    System.out.println("Rajdoot");
   }
  } 

  else {
   System.out.println("Better luck next time");
  }
  sc.close();
 }
}
