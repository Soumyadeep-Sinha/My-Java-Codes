import java.util.Arrays;

public class SpecialDiscount {
    public static void main(String[] args) {
        int[] prices = {8,7,4,2,8,1,7,7,10,1};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }

    public static int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        int discount = 0;
        for (int i = 0; i < prices.length-1; i++) {
            int j = i + 1;
            while(j < prices.length){
                if(prices[j] <= prices[i]){
                    discount = prices[j];
                    break;
                }
                j++;
                discount = 0;
            }
            ans[i] = prices[i] - discount;
        }
        ans[ans.length-1] = prices[prices.length-1];
        
        return ans;
    }
}
