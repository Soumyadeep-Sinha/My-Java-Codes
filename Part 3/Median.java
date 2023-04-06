import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double[] arr = new double[m+n];
        for(int i = 0; i < n ; i++){
            arr[i] = nums1[i];
        }
        for (int j = 0; j < m; j++) {
            arr[n + j] = nums2[j];
        }
        Arrays.sort(arr);
        int mid = arr.length / 2;
        if(arr.length%2 == 0){
            return (arr[mid] + arr[mid - 1])/2;
        }
        return arr[mid];
    }
}
