package Math;
public class TypeCasting {
 public static void main(String[] args) {

  // Implicit TypeCasting
  int a = 7;
  double b = a;
  System.out.println(a);
  System.out.println(b);    // 10.0

  char ch = 'A';
  int d = ch;
  // ch = d;
  System.out.println(d);
  
  
  // Explicit Function
  int c = (int) b;
  System.out.println(c);

  double e = 8.2902;
  System.out.println(e);
  int f = (int) e;
  System.out.println(f );
 }
}
