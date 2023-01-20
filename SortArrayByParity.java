import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                even.add(nums[i]);
            }else if(nums[i] % 2 != 0){
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        ArrayList<Integer> merge = new ArrayList<>();
        merge.addAll(even);
        merge.addAll(odd);

        int size = even.size() + odd.size();
        int[] ans = new int[size];

        for (int i = 0; i < merge.size(); i++) {
            ans[i] = merge.get(i);
        }

        return ans;
    }
}
