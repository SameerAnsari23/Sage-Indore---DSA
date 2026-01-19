import java.util.Scanner;
public class GradeSystem {
 public static void main(String [] arg) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter your marks, convert marks into grade: ");
  float marks = sc.nextFloat();

  if(marks >= 91 && marks <= 100) {
   System.out.println("Your Grade is A");
  }
  else if(marks >= 81) {
   System.out.println("Your grade is B");
  }
  else if(marks >= 71) {
   System.out.println("Your grade is C");
  }
  else if(marks >= 61) {
   System.out.println("Your grade is D");
  }
  else if(marks >= 51) {
   System.out.println("Your grade is E");
  }
  else {
   System.out.println("Your are Fail");
  }
  sc.close();
 }
}
