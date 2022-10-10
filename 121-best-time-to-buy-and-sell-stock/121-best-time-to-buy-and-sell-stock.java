class Solution {
    public int maxProfit(int[] prices) {
        int maxValue = 0, minValue = Integer.MAX_VALUE;

        for(int price : prices){
            minValue = Math.min(minValue, price);
            maxValue = Math.max(maxValue, price - minValue);
        }

        return maxValue;
        
    }
}