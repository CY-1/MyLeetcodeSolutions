package DP;
/*
 * @lc app=leetcode.cn id=1027 lang=java
 *
 * [1027] 最长等差数列
 */

// @lc code=start
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[][] f = new int[n][1001];
        // f[i][j] 表示以nums[i] 结尾且公差为 j 的等差数列的最大长度
        for (int i = 1; i < n; ++i) {
            for (int k = 0; k < i; ++k) {
                int j = nums[i] - nums[k] + 500;// 因为nums[i]是0-500 所以公差最小-500到500 加上500 就变成 0-1000
                // 那么公差 j=nums[i]−nums[k]+500，此时有f[i][j]=max(f[i][j],f[k][j]+1)
                f[i][j] = Math.max(f[i][j], f[k][j] + 1);
                ans = Math.max(ans, f[i][j]);
            }
        }
        return ans + 1;
    }
}

// @lc code=end
