import java.util.Arrays;

public class SortBy1Bits {
    public static void main(String[] args) {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }

    public static int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(count1s(arr[j]) < count1s(arr[j-1])){
                    swap(arr,j,j-1);
                }
                if(count1s(arr[j]) == count1s(arr[j-1]) && arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
        return arr;
    }

    public static int count1s(int n){
        String str = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
