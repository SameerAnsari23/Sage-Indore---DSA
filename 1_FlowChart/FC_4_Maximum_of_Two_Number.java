import java.util.Scanner;
public class FC_4_Maximum_of_Two_Number {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();           // Read first number

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();           // Read second number

        if (num1 > num2) { 
            System.out.println("Maximum number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
        
        sc.close();                        // Close the scanner
    }
}