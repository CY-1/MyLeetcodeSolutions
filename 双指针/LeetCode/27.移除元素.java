/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    // 快慢指针 left指向要放入的位置 right扫描数组
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            // 不放入
            if (nums[right] == val) {
                continue;
            } else {
                // 放入 并且left右移
                nums[left++] = nums[right];
            }
        }
        return left;
    }
}
// @lc code=end
