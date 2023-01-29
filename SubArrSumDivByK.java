public class SubArrSumDivByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(nums, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if((nums[i] + nums[j]) / k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
