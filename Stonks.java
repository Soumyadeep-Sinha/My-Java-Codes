package deep;

public class Stonks {
    public static void main(String[] args) {
        int[] prices = {7};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length == 1 || prices.length == 0){
            return 0;
        }
        int max = prices[1] - prices[0];
        for(int i = 0 ; i < prices.length ; i++){
            for(int j = i+1 ; j < prices.length ; j++){
                if(prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                }
            }
        }
        if(max <= 0){
            return 0;
        }else{
            return max;
        }
    }
}
