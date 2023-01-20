public class ElementSumDigitSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));

    }
    public static int differenceOfSum(int[] nums) {
        int elementsum = 0;
        int i = 0;
        while(i < nums.length){
            elementsum += nums[i];
            i++;
        }

        int digitsum = 0;

        int j = 0;
        while(j < nums.length){

            while(nums[j] != 0){
                int remainder = nums[j] % 10;
                digitsum += remainder;
                nums[j] = nums[j] / 10;
            }

            j++;
        }

        return Math.abs(elementsum - digitsum);
    }
}
