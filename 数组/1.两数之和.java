package 数组;
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.Arrays;
// 
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j&&nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }

        }
        return result;
    }
}
// @lc code=end

