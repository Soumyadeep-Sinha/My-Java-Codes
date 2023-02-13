public class OptimalDivision {
    public static void main(String[] args) {
        int[] nums = {1000,100,10,2};
        System.out.println(optimalDivision(nums));
    }

    public static String optimalDivision(int[] nums) {
        String ans = "";

        if(nums.length == 1){
            return ans + nums[0];
        }

        if(nums.length == 2){
            return ans + nums[0] + "/" + nums[1];
        }

        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                ans += nums[i] + "/" + "(";
            }
            else if(i == nums.length - 1){
                ans += nums[i];
            }
            else{
                ans += nums[i] + "/";
            }
        }
        ans += ")";

        return ans;
    }
}
