import java.util.ArrayList;

public class DistinctIntegersAfterReverse {
    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(!res.contains(nums[i])){
                res.add(nums[i]);
            }
            if(!res.contains(revrese(nums[i]))){
                res.add(revrese(nums[i]));
            }
        }

        return res.size();
    }
    public static int len(int number) {
        return (int)(Math.log10(number)) + 1;
    }

    public static int revrese(int number) {
        if (number % 10 == number) {
            return number;
        }

        int last = number % 10;
        int remaining = number / 10;
        int l = len(remaining);
        return last * (int)Math.pow(10, l) + revrese(remaining);
    }
}
