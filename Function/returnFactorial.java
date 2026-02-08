package Function;

public class returnFactorial {

 public static int printFactorial(int n) {

  int factorial = 1;

  // Calculate factorial
  for (int i = 1; i <= n; i++) {
   factorial *= i;
  }

  return factorial;
 }
 public static void main(String[] arg) {
  int n = 6;

  printFactorial(n);
  System.out.println(printFactorial(n));
 }
}
