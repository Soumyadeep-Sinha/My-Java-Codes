import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class RelativeSortArray2 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> common = new ArrayList<>();
        ArrayList<Integer> uncommon = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j] == arr2[i]){
                    common.add(arr1[j]);
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    flag = true;
                }
            }
            if(!flag){
                uncommon.add(arr1[i]);
            }
        }

        Collections.sort(uncommon);
        int[] ans= new int[arr1.length];

        for (int i = 0; i < common.size(); i++) {
            ans[i] = common.get(i);
        }
        for (int i = 0; i < uncommon.size() ; i++) {
            ans[common.size() + i] = uncommon.get(i);
        }

        return ans;
    }
}
