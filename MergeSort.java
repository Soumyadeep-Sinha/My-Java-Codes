import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    public static int[] mergesort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] first, int[] second){
        int[] combine = new int[first.length + second.length];
        int i = 0; // for first
        int j = 0; // for second
        int k = 0; // for third

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                combine[k] = first[i];
                i++;
            }else{
                combine[k] = second[j];
                j++;
            }
            k++;
        }

        // put extra elements at the back

        while (i < first.length){
            combine[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            combine[k] = second[j];
            j++;
            k++;
        }

        return combine;
    }
}
