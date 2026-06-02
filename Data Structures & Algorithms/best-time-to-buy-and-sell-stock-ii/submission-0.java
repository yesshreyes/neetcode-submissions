class Solution {
    public int maxProfit(int[] prices) {
        int curr = 0;
        int max=0;
        for (int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                    curr+=prices[i+1]-prices[i];
            }
        }
        return curr;
    }
}