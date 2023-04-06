import java.util.ArrayList;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2}, nums2 = {2,3}, nums3 = {3};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!arr.contains(nums1[i])){
                arr.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!arr.contains(nums2[i])){
                arr.add(nums2[i]);
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            if (!arr.contains(nums3[i])){
                arr.add(nums3[i]);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int count = 0;
            if(checkpresence(nums1, arr.get(i))){
                count++;
            }
            if(checkpresence(nums2, arr.get(i))){
                count++;
            }
            if(checkpresence(nums3, arr.get(i))){
                count++;
            }
            if(count >= 2){
                ans.add(arr.get(i));
            }
        }

        return ans;
    }

    public static boolean checkpresence(int[] arr, int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                return true;
            }
        }
        return false;
    }
}
