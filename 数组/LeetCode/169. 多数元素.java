package 数组.LeetCode;

class Solution {
    //肯定是排序后一半的位置
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
