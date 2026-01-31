package Math;

public class swap {
 public static void main(String[] arg) {
  int a = 1, b = 10;

  a = a + b;
  b = a - b;
  a = a - b;

  System.out.println("The value of a, after swapping: "+ a);
  System.out.println("The value of b, after swapping: "+ b);
 }
}
