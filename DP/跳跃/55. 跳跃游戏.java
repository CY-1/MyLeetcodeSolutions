class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1)return true;
        boolean[] flag=new boolean[nums.length];
        Arrays.fill(flag,false);
        flag[0]=nums[0]!=0;
        for(int i=0;i<nums.length;i++){
            if(flag[i]==false)return false;
            for(int j=i+1;j<=nums[i]+i&&j<nums.length;j++){
                flag[j]=true;
            }
        }
        return flag[flag.length-1];
    }
}