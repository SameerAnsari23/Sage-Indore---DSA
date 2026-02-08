/*
Prime Number: A number which is divisble by 1 or itself
Question 1
i/p : 13
o/p : Prime Number

*/

package Math;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. for checking Prime: ");
        int n = sc.nextInt();
        
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a Prime number");
        else
            System.out.println(n + " is not a Prime number");


      sc.close();
    }
}
