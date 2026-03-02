class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
      
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if ( nums[j] < nums[mini]) {
                    mini = j;
                }
            }

            // swap
            int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }
        return nums;
    }
}
