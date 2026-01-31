/*
n = 5

1
2 * 2
3 * 3 * 3        
4 * 4 * 4 * 4    
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4    
3 * 3 * 3        
2 * 2
1


*/



package pattern;
import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half (1 to n)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        // Lower half (n-1 to 1)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
