class Solution {
    public int pivotIndex(int[] nums) {
        int ls = 0;

        // Sum nikalo
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // Right sum nikalo
        // int rs = sum - nums[0];

        for (int i = 0; i < nums.length; i++) {
            int rs = sum - ls - nums[i];
            if (ls == rs) {
                return i;
            }
            ls = ls + nums[i];
            // rs = rs - nums[i+1];
        }

        return -1;

    }
}
