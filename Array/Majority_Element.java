class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0, cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                ans = nums[i];
            }
            if (nums[i] == ans) {
                cnt++;
            }else {
                cnt--;
            }
        }
        return ans;
    }
}
