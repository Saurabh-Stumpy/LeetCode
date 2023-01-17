class Solution {
    public int maxProfit(int[] prices) {
        int[] rHigh = new int[prices.length];
        rHigh[rHigh.length-1] = prices[prices.length-1];
        int maxProfit = 0;
        for(int i=prices.length-2;i>=0;i--){
            rHigh[i] = Math.max(rHigh[i+1],prices[i]);
            maxProfit = Math.max(maxProfit,(rHigh[i+1]-prices[i+1]));
        }
        maxProfit = Math.max(maxProfit,(rHigh[0]-prices[0]));
        return maxProfit;
    }
}