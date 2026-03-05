import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }

        Arrays.sort(merged);

        int size = merged.length;

        if (size % 2 == 1) {
            return merged[size / 2];
        } else {
            return (merged[size/2 - 1] + merged[size/2]) / 2.0;
        }
    }
}
