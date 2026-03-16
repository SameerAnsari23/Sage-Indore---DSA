class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int idx = -1;

        // Step 1: Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse entire array
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find next greater element
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }

        // Step 4: Reverse remaining part
        reverse(nums, idx + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
