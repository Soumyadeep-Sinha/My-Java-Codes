import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j] && !arr.contains(nums1[i])){
                    arr.add(nums1[i]);
                }
            }
        }

        int[] ans = new int[arr.size()];
        for(int i = 0 ; i < arr.size() ; i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }
}
