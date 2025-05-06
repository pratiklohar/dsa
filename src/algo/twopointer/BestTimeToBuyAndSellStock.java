package algo.twopointer;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[buy] > prices[i]) {
                buy = i;
            } else {
                int profit = prices[i] - prices[buy];
                if (profit > maxProfit) {
                    maxProfit = prices[i] - prices[buy];
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(stock.maxProfit(prices)); // Output: 5
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(stock.maxProfit(prices2)); // Output: 0
    }
}
