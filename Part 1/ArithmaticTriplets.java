public class ArithmaticTriplets {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0};
        int diff = 0;
        System.out.println(arithmeticTriplets(nums,diff));
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if(i < j && j < k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
