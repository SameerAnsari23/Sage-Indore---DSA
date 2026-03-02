package Array;
public class Maximum {

 public static void maximum(int[] arr) {
  int maxi = arr[0];

  for (int i = 0; i < arr.length; i++) {
   // compare
   if (arr[i] > maxi) {
    maxi = arr[i];
   }
  }

  System.out.println(maxi);
 }
 
 public static void main(String[] args) {
  int[] arr = {1, 45, -1, 0, 90, 3};

  maximum(arr);
 }
}
