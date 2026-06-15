class Solution {
    public int maxProfit(int[] prices) {
            int maxi=0;
            int left=0;
            for(int right=0;right<prices.length;right++)
            {
                if(prices[right]>prices[left])
                {
                    maxi=Math.max(maxi,prices[right]-prices[left]);
                }
                else{
                while(right>left && prices[left]>=prices[right])
                {
                    left++;
                }
                }

            }
            return maxi;
    }
}
