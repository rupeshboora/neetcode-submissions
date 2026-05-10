class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int i=0;
        for(int j=1;j<prices.length;j++){
            max = Math.max(max, prices[j] - prices[i]);
            if(prices[j]<prices[i])
            {
                i=j;
            }

        }
        return max;
    }
}
