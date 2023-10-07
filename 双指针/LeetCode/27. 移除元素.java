package 双指针.LeetCode;

class Solution {
    //双指针法    
    public int removeElement(int[] nums, int val) {
        int left=-1,right=0;
        for(;left< nums.length&&right<nums.length;)
        {
            //如果值不同就写入到nums中 然后指针后移
            if (nums[right] != val) {
                left++;//left默认值是0
                nums[left] = nums[right];
                right++;
            }
            //值相同就right后移 保留最后一个相同的元素
            else{
                right++;
            }
        }
        return left+1;
    }
}