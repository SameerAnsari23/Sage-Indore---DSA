public class FC_11_Print_Even_1_to_100 {
 public static void main(String[] arg) {
  System.out.println("Even numbers from 1 to 100 are:");

  for (int i = 1; i <= 100; i++) {
   // Check if the number is even
   if (i % 2 == 0) {
    System.out.println(i);      // Print the even number
   }
  }
  
 }
}
