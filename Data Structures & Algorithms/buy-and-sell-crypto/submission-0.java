class Solution {
    public int maxProfit(int[] prices) {

        int minSoFar = prices[0];

        int maxProfit = 0;

        for(int price : prices) {
            minSoFar = Math.min(minSoFar, price);
            var profit = price - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
        
    }
}
