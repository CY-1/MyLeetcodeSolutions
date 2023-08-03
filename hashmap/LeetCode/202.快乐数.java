package hashmap.LeetCode;
/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        if (n == 1)
            return true;
            // 用一个map记录下来 如果有循环那肯定不会是快乐数 没有循环就继续
        while (map.get((n = work(n))) == null) {
            if (n == 1)
                return true;
            map.put(n, true);
        }
        return false;
    }
// 一个正整数，每一次将该数替换为它每个位置上的数字的平方和
    public int work(int n) {
        int result = 0;
        while (n != 0) {
            result += (n % 10) * (n % 10);
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution().isHappy(2);
    }
}
// @lc code=end
