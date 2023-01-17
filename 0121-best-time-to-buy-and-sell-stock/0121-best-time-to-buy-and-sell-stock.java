class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int prvMax = prices[prices.length-1];

        for(int i=prices.length-2;i>=0;i--){
            maxProfit = maxProfit>(prvMax-prices[i])?maxProfit:(prvMax-prices[i]);
            prvMax = prvMax>prices[i]?prvMax:prices[i];
        }

        return maxProfit;
    }
}