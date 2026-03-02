package Array;
import java.util.Scanner;
public class basic {
 public static void main(String[] args) {
  // Declaration of array
  int[] even = new int[6];

  // insertion of element in array
  // even[0] = 2;
  // even[1] = 4;
  // even[2] = 6;
  // even[3] = 8;
  // even[4] = 10;

  // System.out.println(even[0]);
  // System.out.println(even[3]);
  // System.out.println(even[4]);
  // System.out.println(even[5]);

  // Traverse
  // for(int i = 0; i < 7; i++) {
  //  System.out.println(even[i]);
  // }


  // input
  // Scanner sc = new Scanner(System.in);
  // System.out.println("Enter a even number: ");
  
  // for(int i = 0; i < 6; i++) {
  //  even[i] = sc.nextInt();
  // }

  // Print the array
  // for(int i = 0; i < 6; i++) {
  //  System.out.println(even[i]);
  // }


  // Declaration + initialization
  int[] odd = {1, 3, 5, 7, 9};
  System.out.println(odd.length);
  for (int i = 0; i < odd.length; i++) {
     System.out.println(odd[i]);
  }

  // sc.close();
 }
}
