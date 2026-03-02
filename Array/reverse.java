package Array;

public class reverse {

 public static void reverseArray(int[] arr) {
  int i = 0, j = arr.length - 1;

  while (i < j) {
   int temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
   i++;
   j--;
  }

  for(int k = 0; k < arr.length; k++) {
   System.out.print(arr[k] + " ");
  }
 }
 public static void main(String[] args) {
  int[] arr = {2, 4, 9, -1, 7, 0, 8};
  
  reverseArray(arr);

  
 }
}
