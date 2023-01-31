public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {2};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int pind = 0;

        while(pind <= nums.length-1){
            if(fundsum(nums, 0, pind-1) == fundsum(nums, pind+1, nums.length-1)){
                if(pind - 1 == -1){
                    return 0;
                }
                return pind;
            }
            pind++;
        }
        return -1;
    }

    public static int fundsum(int[] nums, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
