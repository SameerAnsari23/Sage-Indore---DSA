package pattern;

import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Kitne star print krne hai: ");
        int num = sc.nextInt();

        for(int row = 0; row < num; row++) {              // row per iterate krne ke liye
           for(int col = 0; col < num - row; col++) {     // coloumn per iterate krne ke liye
               System.out.print("* ");
           }
           System.out.println();                          // move to next line
        }
        
        sc.close();
    }
}
