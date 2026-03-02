import java.util.Scanner;

public class basic {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of rows:");
  int rows = sc.nextInt();
  System.out.println("Enter the number of columns:");
  int cols = sc.nextInt();

  // Declaration of array
  int[][] arr = new int[rows][cols];

  
  System.out.println("Enter the elements:");
  for (int row = 0; row < rows; row++) {
   for (int col = 0; col < cols; col++) {
    arr[row][col] = sc.nextInt();
   }
  }
  System.out.println();

  System.out.println("The array is:");
  for (int row = 0; row < rows; row++) {
   for (int col = 0; col < cols; col++) {
    System.out.print(arr[row][col] + " ");
   }
   System.out.println();
  }

  sc.close();
 }
}
