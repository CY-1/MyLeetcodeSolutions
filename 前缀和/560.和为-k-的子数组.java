package 数组.前缀和;
/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为 K 的子数组
 */

import java.util.Arrays;

// @lc code=start

import java.util.HashMap;
import java.util.LinkedList;
//todo 待优化
class Solution {
    public static void main(String[] args) {
        new Solution().subarraySum(new int[] { -1, -1, -1 }, 0);
    }

    public int subarraySum(int[] nums, int k) {
        int result = 0;
        // key is prefixsum，value is 前缀和
        HashMap<Integer, LinkedList<Integer>> map = new HashMap();
        // 先遍历一边数组找到所有的前缀和存到map中
        int[] prefixsum = new int[nums.length + 1];
        prefixsum[0] = 0;
        //由于值可能为负数 所有prefixsum用list集合
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        map.put(0, linkedList);
        for (int i = 0; i < nums.length; i++) {
            prefixsum[i + 1] = prefixsum[i] + nums[i];
            LinkedList<Integer> orDefault = map.getOrDefault(prefixsum[i + 1], new LinkedList<Integer>());
            orDefault.add(i + 1);
            map.put(prefixsum[i + 1], orDefault);
        }
        // 开始便利前缀和数组
        for (int i = 0; i <= nums.length; i++) {
            // 以i为end找到begin的位置
            if (map.containsKey(prefixsum[i] - k)) {
                LinkedList<Integer> linkedList2 = map.get(prefixsum[i] - k);
                Integer[] array = linkedList2.toArray(new Integer[linkedList2.size()]);
                int binarySearch = Arrays.binarySearch(array, 0, array.length, i);
                // 由于i是end 而begin<end 所以用二分查找优化速度
                if (binarySearch > 0) {
                    // binarySearch下标之前的值都小于end
                    result = result + binarySearch;
                }
                else if (binarySearch == 0) {
                    // 等于0表示list中值都大于等于end
                    continue;
                }
                else {
                    //应该是有(Math.abs(binarySearch) - 1)个值小于end
                    binarySearch = Math.abs(binarySearch) - 1;
                    result = result + binarySearch;
                }
            }
        }
        return result;
    }

}
// @lc code=end

