/*

        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *

*/


package pattern;

public class Pattern14 {
 public static void main(String[] args) {

        int n = 5;

        // upper half
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int space = n - i; space >= 1; space--) {
                System.out.print("  ");
            }

            // stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {

            // spaces
            for (int space = n - i; space >= 1; space--) {
                System.out.print("  ");
            }

            // stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
