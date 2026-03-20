class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int n = s.length() - 1;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return sum;
    }
}
