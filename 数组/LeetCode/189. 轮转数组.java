package 数组.LeetCode;

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] ints = Arrays.copyOf(nums, nums.length);
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
            nums[index]=ints[i];
            index++;
        }
        for(int i=0;i< ints.length-k;i++){
            nums[index]=ints[i];
            index++;
        }
//        System.out.println("123");
    }
}