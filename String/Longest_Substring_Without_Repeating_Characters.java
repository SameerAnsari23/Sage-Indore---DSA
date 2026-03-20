class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int l = 0, maxlen = 0;

        for (int r = 0; r < s.length(); r++) {
            l = Math.max(l, last[s.charAt(r)]);
            maxlen = Math.max(maxlen, r - l + 1);
            last[s.charAt(r)] = r + 1;
        }

        return maxlen;
    }
}
