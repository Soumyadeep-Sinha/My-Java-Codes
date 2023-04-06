import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
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
        int size = even.size() + odd.size();

        ArrayList<Integer> merge = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            merge.add(0);
        }

        int e = 0;
        int o = 0;
        int k = 0;
        while(e < even.size() && o < odd.size() && k < merge.size()){
            merge.set(k, even.get(e));
            merge.set(k+1, odd.get(o));
             k += 2;
             e++;
             o++;
        }

        System.out.println(merge);


        int[] ans = new int[size];

        for (int i = 0; i < merge.size(); i++) {
            ans[i] = merge.get(i);
        }

        return ans;
    }
}
