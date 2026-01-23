package pattern;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int row = 0; row < n; row++) {
         // space
         for(int col = 0; col < 2*row; col++) {
          System.out.print(" ");
         }

         //star
         for(int col = 0; col < n - row; col ++) {
          System.out.print("*");
         }
         System.out.println();
        }
    }
}