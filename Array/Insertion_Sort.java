class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for(int i = 1; i < n; i++) {
            
            int k = i;

                while (k > 0 && (nums[k-1] > nums[k])) {
                    int temp = nums[k-1];
                    nums[k - 1] = nums[k];
                    nums[k] = temp;
                    k--;
                } 
        }

        return nums;
    }
}
