/*
n = 5

        * * * * * 
      * * * *     
    * * *
  * *
*
  * *
    * * *
      * * * *     
        * * * * * 

*/


package pattern;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        // Upper half
        for (int row = 0; row < n; row++) {
         // space
         for(int col = 0; col < n - row - 1; col++) {
          System.out.print("  ");
         }

         //star
         for(int col = 0; col < n - row; col ++) {
          System.out.print("* ");
         }
         System.out.println();
        }

        // Lower half
        for (int row = n - 2; row >= 0; row--) {
         // space
         for(int col = 0; col < n - row -1; col++) {
          System.out.print("  ");
         }

         //star
         for(int col = 0; col < n - row; col ++) {
          System.out.print("* ");
         }
         System.out.println();
        }
    }
}
