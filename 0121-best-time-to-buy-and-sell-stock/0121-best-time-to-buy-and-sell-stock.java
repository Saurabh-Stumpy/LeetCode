class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int prvMax = prices[prices.length-1];

        for(int i=prices.length-2;i>=0;i--){
            maxProfit = Math.max(maxProfit,prvMax-prices[i]);
            prvMax = Math.max(prvMax,prices[i]);
        }

        return maxProfit;
    }
}