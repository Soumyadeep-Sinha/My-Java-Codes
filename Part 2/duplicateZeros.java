import java.util.ArrayList;
import java.util.Arrays;

public class duplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(arr)));
    }

    public static int[] duplicateZeros(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < newarr.length; i++) {
            if(arr[i] == 0){
                newarr[i] = 0;
                newarr[i+1] = 0;
                i++;
            }
            newarr[i] = arr[i];
        }

        return newarr;
    }
}
