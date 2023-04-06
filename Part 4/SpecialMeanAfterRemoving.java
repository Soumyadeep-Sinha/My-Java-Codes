import java.util.Arrays;

public class SpecialMeanAfterRemoving {
    public static void main(String[] args) {
        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        System.out.println(trimMean(arr));
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int length = (int)(0.05 * arr.length);
        int start = length;
        int end = arr.length - 1 - length;
        return getmean(arr,start,end);
    }

    public static double getmean(int[] arr, int start, int end){
        double sum = 0;
        int size = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
            size++;
        }

        return sum / size;
    }
}
