/*
n = 10

                  0
                9 0 9 
              8 9 0 9 8
            7 8 9 0 9 8 7
          6 7 8 9 0 9 8 7 6
        5 6 7 8 9 0 9 8 7 6 5
      4 5 6 7 8 9 0 9 8 7 6 5 4
    3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1


*/

package pattern;
import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        for (int i = 0; i < n; i++) {

            // leading spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print("  ");
            }

            // FIRST ROW → only 0
            if (i == 0) {
                System.out.println("0");
                continue;
            }

            // left increasing numbers
            for (int num = n - i; num <= n - 1; num++) {
                System.out.print(num + " ");
            }

            // center 0
            System.out.print("0 ");

            // right decreasing numbers
            for (int num = n - 1; num >= n - i; num--) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
