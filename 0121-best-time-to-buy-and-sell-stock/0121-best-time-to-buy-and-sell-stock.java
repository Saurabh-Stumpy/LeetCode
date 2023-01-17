class Solution {
    public int maxProfit(int[] prices) {
        int[] rHigh = new int[prices.length];
        rHigh[rHigh.length-1] = prices[prices.length-1];
        
        for(int i=prices.length-2;i>=0;i--){
            rHigh[i] = Math.max(rHigh[i+1],prices[i]);
        }
        
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            maxProfit = Math.max(maxProfit,(rHigh[i]-prices[i]));
        }
        
        return maxProfit;
    }
}