class Solution {
    public int[] freq(String a) {
      int[] arr = new int[26];
      for (char ch : a.toCharArray()) {
        arr[ch - 'a']++;
      }
      return arr;
    }
    public boolean isAnagram(String s, String t) {
        return java.util.Arrays.equals(freq(s), freq(t));
    }
}
