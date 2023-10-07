package DP.股票;

class Solution {
    public int maxProfit(int[] prices) {
        int result=0;
        int[] minPrice=new int[prices.length];
        minPrice[0] = prices[0];
        //基于当天的过去最小值
        for (int i = 1; i < prices.length; i++) {
            minPrice[i] = Math.min(prices[i], minPrice[i - 1]);
        }
        //判断每天能赚的最多的
        for(int i=1;i<prices.length;i++){
            result=Math.max(result,prices[i]-minPrice[i]);
        }
        return result;
    }
}
