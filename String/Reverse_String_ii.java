class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; i += 2*k) {
            int l = i;
            int r = Math.min(i + k - 1, n - 1);
            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        String str = new String(arr);
        return str;
    }
}
