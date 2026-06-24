

public class Stock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Sabse kam buying price track karo
            if (price < minPrice) {
                minPrice = price;
            }

            // Current day par sell karne ka profit calculate karo
            int profit = price - minPrice;

            // Maximum profit update karo
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
} 
  
