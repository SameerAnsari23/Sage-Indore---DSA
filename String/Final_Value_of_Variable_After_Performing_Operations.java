class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int cnt = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return cnt;
    }
}
