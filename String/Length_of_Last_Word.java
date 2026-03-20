class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') i--;

        int e = i;

        // move to start of last word
        while (i >= 0 && s.charAt(i) != ' ') i--;

        return e - i;
    }
}
