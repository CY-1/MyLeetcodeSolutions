class Solution {
    public int findTargetSumWays(int[] nums, int S) {


        my(nums,S,0,0);
        return result;
    }
    int result=0;
    public void my(int[] nums,int target,int index,int current){
        if(index==nums.length&&current==target){
            this.result++;
            return;
        }
        if(index==nums.length){
            return;
        }
        my(nums,target,index+1,current+nums[index]);
        my(nums,target,index+1,current-nums[index]);
        
    }
}
