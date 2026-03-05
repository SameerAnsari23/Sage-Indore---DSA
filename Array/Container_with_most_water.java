class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int s = 0, e = n - 1;
        int maxArea = 0;

        while (s < e) {
            int w = (e - s);
            int h = Math.min(height[s], height[e]);
            int a = w * h;

            maxArea = Math.max(maxArea, a);

            if (height[s] < height[e]) {
                s++;
            } else {
                e--;
            }
        }
        return maxArea;
    }
}
