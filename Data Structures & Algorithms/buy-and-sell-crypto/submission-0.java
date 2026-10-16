class Solution {
    public int maxProfit(int[] prices) {
        //lowest price... 10, sum=10-()
        //max sum
        int base = Integer.MAX_VALUE;
        int sum=0;
        int day_value = 0;

        for(int i=0;i<prices.length;i++) {
            if(prices[i]<base) {
                base=prices[i];
            }
            int interim_price=prices[i]-base;
            if(interim_price>sum) {
                sum=interim_price;
            }

        }
        return sum;
    }
}
