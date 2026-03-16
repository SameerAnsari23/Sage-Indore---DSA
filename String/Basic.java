package String;
import java.util.Scanner;
public class basic {
 public static void main(String[] args) {
  // Declaration of string
  String s;

  // Initialization
  s = "Hello World";

  // Print the string
  System.out.println(s);

  // Declaration and initialization in one line
  String s1 = "Pavani";

  // Print the string
  System.out.println(s1);

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a string:");
  String s2 = sc.nextLine();
  System.out.println(s2);

 // Copying a string;
  String s3 = s2;
  System.out.println(s3);

  // Updating a string
  s1 = "Pavani is good";
  System.out.println(s1);

  // Length of a string
  System.out.println(s1.length());
  
  // System.out.println(s1[0]); // error: cannot use [] to access characters in a string
  System.out.println(s1.charAt(4));
  System.out.println(s1.charAt(5));

  // Concatenation of strings
  String s4 = s1 + " " + s2;
  System.out.println(s4);

  // Substring
  String s5 = s1.substring(2, 6); // "Pav"
  System.out.println(s5);

  // equals method
  String s6 = "Pavni is good";
  System.out.println(s1.equals(s6)); // false

  // Lexicographical comparison
  String a = "applee";
  String b = "apples";
  String c = "zebra";
  System.out.println(a.compareTo(b)); // negative value because "apple" is less than
  System.out.println(a.compareTo(c)); // negative value because "apple" is less than
  System.out.println(c.compareTo(a)); // positive value because "zebra" is greater than

  String s7 = "123";
  int n = Integer.parseInt(s7);
  System.out.println(n); // 123

  sc.close();
 }
}
