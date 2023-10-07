package 双指针.LeetCode;

class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0,right=1;
        while(right<nums.length){
            if(nums[right]==nums[left]){
                right++;
            }
            else{
                left++;
                nums[left]=nums[right];
                right++;
            }
        }
        return left+1;
    }
}