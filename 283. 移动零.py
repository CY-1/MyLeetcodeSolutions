class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<1)return;
        int flag=nums[0]==0?1:0;//当前下标应该和i+flag下标
        for(int i=0;i<nums.length-flag;i++){
            if(nums[i+flag]==0){
                flag++;
                if(i>=nums.length-flag){
                    break;
                }
                i--;
                continue;

            }
            nums[i]=nums[i+flag];

        }
        for(int i=nums.length-flag;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
