public class LC121_BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            if(price - minPrice > maxProfit){
                    maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        LC121_BestTimetoBuyandSellStock solution = new LC121_BestTimetoBuyandSellStock();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices)); 
    }
}
