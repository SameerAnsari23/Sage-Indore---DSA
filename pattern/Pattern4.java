package pattern;

import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        for(int row = 0; row < num; row++) {            // iterate over rows
            for(int col = 0; col < num; col++) {        // iterate over columns

                // Print space or star based on the condition
                if(col < num - row - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();                       // move to next line
        }
        
        sc.close();
    }
}
