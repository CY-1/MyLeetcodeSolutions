package 双指针.LeetCode;
// 双指针
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int index = 0;
        int i1 = 0, i2 = 0;
        //抽取出较小的放入nums1
        for (; i1 < m && i2 < n;) {
            if (nums1[i1] >= nums2[i2]) {
                result[index++] = nums2[i2++];
            } else {
                result[index++] = nums1[i1++];
            }
        }
        //把剩下的放进来
        for (; i1 < m; i1++) {
            result[index++] = nums1[i1];
        }
        for (; i2 < n; i2++) {
            result[index++] = nums2[i2];
        }
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }
}