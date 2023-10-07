class Solution {
    public int jump(int[] nums) {
        int[] memo=new int[nums.length];
        Arrays.fill(memo,memo.length);
        memo[0]=0;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]+j>=i){
                    memo[i]=Math.min(memo[i],memo[j]+1);
                }
            }
        }
        return memo[memo.length-1];
    }
}