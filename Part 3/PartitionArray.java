import java.util.ArrayList;
import java.util.Arrays;

public class PartitionArray {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> smol = new ArrayList<>();
        ArrayList<Integer> eqal = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == pivot){
                eqal.add(nums[i]);
            }
            if(nums[i] < pivot){
                smol.add(nums[i]);
            }
            if(nums[i] > pivot){
                big.add(nums[i]);
            }
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < smol.size(); i++) {
            ans[i] = smol.get(i);
        }
        for (int i = 0; i < eqal.size(); i++) {
            ans[smol.size()+i] = eqal.get(i);
        }
        for (int i = 0; i < big.size(); i++) {
            ans[smol.size()+eqal.size()+i] = big.get(i);
        }

        return ans;
    }
}
