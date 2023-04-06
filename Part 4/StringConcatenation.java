public class StringConcatenation {
    public static void main(String[] args) {
        String[] nums = {"777","7","77","77","777","7","77","77","777","7","77","77",};
        String target = "7777";
        System.out.println(numOfPairs(nums,target));
    }

    public static int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && (nums[i] + nums[j]).equals(target)){
                    count++;
                }
            }
        }
        return count;
    }
}
