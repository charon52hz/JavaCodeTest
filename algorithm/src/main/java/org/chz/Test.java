package org.chz;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        System.out.println(new Solution().findMedianSortedArrays(nums1,nums2));
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        boolean flag = ((m + n) % 2) == 0;
        int point1 = 0, point2 = 0;
        int remNum1 = 0, remNum2 = 0;
        for (int i = 0; i <= (n + m) / 2; i++) {
            remNum2 = remNum1;
            if (point1 < n && (point2 >= m || nums1[point1] < nums2[point2])) {
                remNum1 = nums1[point1++];
            } else {
                remNum1 = nums2[point2++];
            }

        }
        if (flag) {return (remNum1 + remNum2) / 2.0;}
        return remNum1 * 1.0;
    }
}

