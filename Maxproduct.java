package deep;

public class Maxproduct {
    public static void main(String[] args) {
        int[] nums = {3,7};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int max = 0;
        int ans = 0;
        ans = (nums[0] - 1) * (nums[1] - 1);
        max = ans;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length ; j++){
                if((nums[i] - 1) * (nums[j] - 1) > max){
                    max = (nums[i] - 1) * (nums[j] - 1);
                }
            }
        }
        return max;
    }

}
