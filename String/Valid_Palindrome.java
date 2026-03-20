class Solution {
    public boolean isPalindrome(String s) {

        int st = 0;
        int e = s.length() - 1;

        while (st <= e) {

            if (!Character.isLetterOrDigit(s.charAt(st))) {
                st++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(e))) {
                e--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(st)) != 
                Character.toLowerCase(s.charAt(e))) {
                return false;
            } else {
                st++;
                e--;
            }
        }

        return true;
    }
}
