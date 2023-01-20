import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> unmatched = new ArrayList<>();
        List<Integer> matched = new ArrayList<>();
        List<Integer> arr01 = new ArrayList<>();
        List<Integer> arr02 = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            arr01.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr02.add(arr2[i]);
        }

        for (int i = 0; i < arr01.size(); i++) {
            if(!arr02.contains(arr01.get(i))){
                unmatched.add(arr01.get(i));
            }
            else {
                matched.add(arr01.get(i));
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            matched.add(arr2[i]);
        }
        Collections.sort(unmatched);
        Collections.sort(matched);

        matched.addAll(unmatched);
        int[] ans = matched.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}
