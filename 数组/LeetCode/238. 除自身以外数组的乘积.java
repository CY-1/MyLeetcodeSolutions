class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 用左右乘积数组
        // left表示 i的左边的乘积
        // right表示 i的右边的乘积
        //
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];
        // left的第一个和right的最后一个特殊处理
        right[right.length - 1] = nums[nums.length - 1];
        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }
        // 计算机左右乘积即可避免除法
        result[0] = right[1];
        result[result.length - 1] = left[left.length - 2];
        for (int i = 1; i < result.length - 1; i++) {
            result[i] = left[i - 1] * right[i + 1];
        }
        return result;
    }
}