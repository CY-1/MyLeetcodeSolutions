class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=cost[0];
        dp[1]=cost[1];
        
        for(int i=2;i<cost.length;i++){
            for(int j=1;j<=2;j++){
                dp[i]=Math.min(dp[i-j]+cost[i],dp[i]);
            }
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);

    }
}
