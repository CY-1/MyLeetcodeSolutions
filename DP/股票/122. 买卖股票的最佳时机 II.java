package DP.股票;

class Solution {
    //memo[i] 第i天能赚到的最多的钱
    //memo[0]=0
    //memo[i]=max(memo[过去某天],memo[过去某天]+price[i]-prices[过去某天])
    public int maxProfit(int[] prices) {

        int[] memo=new int[prices.length];
        for(int i=0;i< prices.length;i++){
            for(int j=0;j< i;j++){
                memo[i]=Math.max(memo[j],memo[j]+ prices[i]-prices[j]);
            }
        }
        return memo[memo.length-1];
    }
}
