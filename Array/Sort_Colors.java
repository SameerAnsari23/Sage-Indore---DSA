class Solution {
    public void sortColors(int[] nums) {
        int s = 0, e = nums.length - 1, mid = 0;

        while (mid <= e) {
            if (nums[mid] == 0) {
                swap(nums[mid], nums[s]);
                mid++;
                s++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums[mid], nums[e]);
                e--;
            }
        }
    }
}
