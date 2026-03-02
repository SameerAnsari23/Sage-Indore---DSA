class Solution {
    public int maxSubArray(int[] nums) {
      // Brute Fore Approach
        // int maxi = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum = sum + nums[j];
        //         maxi = Math.max(maxi, sum);
        //     }
        // }

        // return maxi;



      // Optimized Approach
      int currSum = 0;
        int maxSum = nums[0];

        for (int n : nums) {
            currSum += n;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;   // reset if sum becomes negative
            }
        }

        return maxSum;
    }
}
