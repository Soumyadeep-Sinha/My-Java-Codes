import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[nums2.length-1]){
                    ans[i] = -1;
                }
                if(nums1[i] == nums2[j] && j != nums2.length-1){
                    int max = findmax(nums2, j, nums2.length);
                    ans[i] = max;
                }
            }
        }
        return ans;
    }

    public static int findmax(int[] arr, int start, int end){
        int i = start+1;
        while(i < arr.length){
            if(arr[i] < arr[start]){
                i++;
            }else{
                return arr[i];
            }
        }
        return -1;
    }
}
